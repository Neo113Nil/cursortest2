package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.OnceHeartRate;
import com.crrepa.band.my.model.db.greendao.OnceHeartRateDao;
import com.crrepa.ble.conn.bean.CRPHistoryHeartRateInfo;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class OnceHeartRateDaoProxy {
    private static final long SAVED_MIN_TIME = 15000;
    private OnceHeartRateDao dao = c.getInstance().getDaoSession().getOnceHeartRateDao();

    private boolean hasHeartRate(CRPHistoryHeartRateInfo cRPHistoryHeartRateInfo) {
        List<Object> list = this.dao.queryBuilder().where(OnceHeartRateDao.Properties.HeartRate.eq(Integer.valueOf(cRPHistoryHeartRateInfo.getHr())), new m[0]).orderDesc(OnceHeartRateDao.Properties.Date).list();
        if (list != null && !list.isEmpty()) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                if (Math.abs(((OnceHeartRate) it.next()).getDate().getTime() - cRPHistoryHeartRateInfo.getDate().getTime()) < 15000) {
                    return true;
                }
            }
        }
        return false;
    }

    public OnceHeartRate get(long j8) {
        List<Object> list = this.dao.queryBuilder().where(OnceHeartRateDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OnceHeartRate) list.get(0);
    }

    public List<OnceHeartRate> getAll() {
        return this.dao.queryBuilder().orderDesc(OnceHeartRateDao.Properties.Date).build().list();
    }

    public List<OnceHeartRate> getHistoryList(Date date, int i8) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = OnceHeartRateDao.Properties.Date;
        return queryBuilder.where(fVar.le(date), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public OnceHeartRate getLastOnceHeartRate() {
        List<OnceHeartRate> historyList = getHistoryList(new Date(), 1);
        if (historyList == null || historyList.isEmpty()) {
            return null;
        }
        return historyList.get(0);
    }

    public void insert(OnceHeartRate onceHeartRate) {
        this.dao.insert(onceHeartRate);
    }

    public void saveHistoryList(List<CRPHistoryHeartRateInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CRPHistoryHeartRateInfo cRPHistoryHeartRateInfo : list) {
            if (cRPHistoryHeartRateInfo.getHr() > 0 && !hasHeartRate(cRPHistoryHeartRateInfo)) {
                OnceHeartRate onceHeartRate = new OnceHeartRate();
                onceHeartRate.setHeartRate(Integer.valueOf(cRPHistoryHeartRateInfo.getHr()));
                onceHeartRate.setDate(cRPHistoryHeartRateInfo.getDate());
                insert(onceHeartRate);
            }
        }
    }
}
