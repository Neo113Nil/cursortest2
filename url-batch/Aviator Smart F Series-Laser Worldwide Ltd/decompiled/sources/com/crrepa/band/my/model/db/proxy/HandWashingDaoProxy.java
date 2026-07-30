package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.HandWashing;
import com.crrepa.band.my.model.db.greendao.HandWashingDao;
import java.util.List;

/* loaded from: classes2.dex */
public class HandWashingDaoProxy {
    private HandWashingDao dao = c.getInstance().getDaoSession().getHandWashingDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public HandWashing get() {
        List<Object> list = this.dao.queryBuilder().orderAsc(HandWashingDao.Properties.Id).limit(1).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (HandWashing) list.get(0);
    }

    public void insert(HandWashing handWashing) {
        this.dao.insertOrReplace(handWashing);
    }

    public void update(HandWashing handWashing) {
        this.dao.update(handWashing);
    }
}
