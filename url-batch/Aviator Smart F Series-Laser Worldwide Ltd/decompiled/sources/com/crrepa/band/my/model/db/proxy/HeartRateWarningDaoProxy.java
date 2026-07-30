package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.HeartRateWarning;
import com.crrepa.band.my.model.db.greendao.HeartRateWarningDao;
import java.util.List;

/* loaded from: classes2.dex */
public class HeartRateWarningDaoProxy {
    public static final long DEFAULT_ID = 1;
    private HeartRateWarningDao dao = c.getInstance().getDaoSession().getHeartRateWarningDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public HeartRateWarning get() {
        List<Object> list = this.dao.queryBuilder().orderAsc(HeartRateWarningDao.Properties.Id).limit(1).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (HeartRateWarning) list.get(0);
    }

    public void insert(HeartRateWarning heartRateWarning) {
        this.dao.insertOrReplace(heartRateWarning);
    }

    public void update(HeartRateWarning heartRateWarning) {
        this.dao.update(heartRateWarning);
    }
}
