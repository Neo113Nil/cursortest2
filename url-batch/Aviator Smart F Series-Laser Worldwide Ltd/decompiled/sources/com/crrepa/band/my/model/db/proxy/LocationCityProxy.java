package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.LocationCity;
import com.crrepa.band.my.model.db.greendao.LocationCityDao;
import java.util.List;

/* loaded from: classes2.dex */
public class LocationCityProxy {
    private LocationCityDao dao = c.getInstance().getDaoSession().getLocationCityDao();

    public LocationCity get() {
        List<Object> list = this.dao.queryBuilder().orderDesc(LocationCityDao.Properties.Id).limit(1).build().list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (LocationCity) list.get(0);
    }

    public void insert(LocationCity locationCity) {
        this.dao.insertOrReplace(locationCity);
    }

    public void update(LocationCity locationCity) {
        this.dao.update(locationCity);
    }
}
