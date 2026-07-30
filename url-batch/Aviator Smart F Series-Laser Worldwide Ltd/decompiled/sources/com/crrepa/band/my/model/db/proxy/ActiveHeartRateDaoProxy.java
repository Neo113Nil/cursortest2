package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.crrepa.band.my.model.db.greendao.ActiveHeartRateDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class ActiveHeartRateDaoProxy {
    private ActiveHeartRateDao dao = c.getInstance().getDaoSession().getActiveHeartRateDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<ActiveHeartRate> getAll() {
        return this.dao.queryBuilder().orderDesc(ActiveHeartRateDao.Properties.StartDate).build().list();
    }

    public ActiveHeartRate getHeartRate(long j8) {
        List<Object> list = this.dao.queryBuilder().where(ActiveHeartRateDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ActiveHeartRate) list.get(0);
    }

    public ActiveHeartRate getLastTimeHeartRate() {
        List<Object> list = this.dao.queryBuilder().orderDesc(ActiveHeartRateDao.Properties.StartDate).limit(1).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ActiveHeartRate) list.get(0);
    }

    public void insert(ActiveHeartRate activeHeartRate) {
        if (activeHeartRate == null || activeHeartRate.getAverage().intValue() <= 0) {
            return;
        }
        this.dao.insertOrReplace(activeHeartRate);
    }
}
