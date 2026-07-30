package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.DrinkWater;
import com.crrepa.band.my.model.db.greendao.DrinkWaterDao;
import java.util.List;

/* loaded from: classes2.dex */
public class DrinkWaterDaoProxy {
    private DrinkWaterDao dao = c.getInstance().getDaoSession().getDrinkWaterDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public DrinkWater get() {
        List<Object> list = this.dao.queryBuilder().orderAsc(DrinkWaterDao.Properties.Id).limit(1).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (DrinkWater) list.get(0);
    }

    public void insert(DrinkWater drinkWater) {
        this.dao.insertOrReplace(drinkWater);
    }

    public void update(DrinkWater drinkWater) {
        this.dao.update(drinkWater);
    }
}
