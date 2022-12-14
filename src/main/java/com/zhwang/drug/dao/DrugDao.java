package com.zhwang.drug.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.zhwang.drug.entity.Drug;
import org.apache.ibatis.annotations.Param;

import com.zhwang.drug.entity.DrugANDDrugCategory;

/**
 * 药品，持久层，接口
 */
public interface DrugDao {

    /**
     * 查询药品里面所有的id以及药品名字
     *
     * @return
     */
    List<Drug> findUidName();

    /**
     * 根据条形码查询数据
     *
     * @param barCode
     * @return
     */
    Drug findByBarCode(String barCode);

    /**
     * 添加药品
     *
     * @param drug
     * @return
     */
    Integer insertDrug(Drug drug);

    /**
     * 查询药品数据（关联查询）药品类别表
     *
     * @return
     */
    List<DrugANDDrugCategory> selectDrug(Map<String, Object> map);

    /**
     * 查询药品数量
     *
     * @param map
     * @return
     */
    long selectCountDrug(Map<String, Object> map);

    /**
     * 根据uid查询药品全部数据
     *
     * @param uid
     * @return
     */
    Drug findId(Integer id);

    /**
     * 修改药品数据
     *
     * @param drug
     * @return
     */
    Integer updateIdDrug(Drug drug);

    /**
     * 删除药品
     *
     * @param id
     * @return
     */
    Integer deleteIdDrug(@Param("id") Integer id, @Param("isDelete") Integer isDelete,
                         @Param("modifiedUser") String modifiedUser, @Param("modifiedTime") Date modifiedTime);

    /**
     * 判断该条数据是否被引用
     *
     * @param uid
     * @return
     */
    Integer deleteDrugId(Integer uid);

    /**
     * 根据id修改库存
     *
     * @param id
     * @return
     */
    Integer updateByIdInventory(@Param("id") Integer id, @Param("inventory") Integer inventory, @Param("totalSales") Integer totalSales);

    /**
     * 查询药品数量
     *
     * @return
     */
    Long selectIdCount();

    /**
     * 查询数据导出
     *
     * @return
     */
    List<DrugANDDrugCategory> findselectIsdelete(Map<String, Object> map);

    /**
     * 根据药品名称修改库存
     *
     * @param drugName
     * @return
     */
    Integer updateByDrugNameInventory(@Param("drugName") String drugName, @Param("inventory") Integer inventory);

}
