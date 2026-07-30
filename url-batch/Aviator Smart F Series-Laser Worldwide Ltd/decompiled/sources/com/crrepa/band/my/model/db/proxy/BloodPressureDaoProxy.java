package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.BloodPressure;
import com.crrepa.band.my.model.db.greendao.BloodPressureDao;
import com.crrepa.ble.conn.bean.CRPHistoryBloodPressureInfo;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class BloodPressureDaoProxy {
    private static final long SAVED_MIN_TIME = 15000;
    private BloodPressureDao dao = c.getInstance().getDaoSession().getBloodPressureDao();

    private List<BloodPressure> get(int i8, int i9) {
        return this.dao.queryBuilder().where(BloodPressureDao.Properties.Sbp.eq(Integer.valueOf(i8)), BloodPressureDao.Properties.Dbp.eq(Integer.valueOf(i9))).orderDesc(BloodPressureDao.Properties.Date).list();
    }

    private boolean hasBloodPressure(CRPHistoryBloodPressureInfo cRPHistoryBloodPressureInfo) {
        List<BloodPressure> list = get(cRPHistoryBloodPressureInfo.getSbp(), cRPHistoryBloodPressureInfo.getDbp());
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<BloodPressure> it = list.iterator();
        while (it.hasNext()) {
            if (Math.abs(it.next().getDate().getTime() - cRPHistoryBloodPressureInfo.getDate().getTime()) < 15000) {
                return true;
            }
        }
        return false;
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<BloodPressure> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = BloodPressureDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new m[0]).orderDesc(fVar).build().list();
    }

    public BloodPressure getBloodPressure(long j8) {
        List<Object> list = this.dao.queryBuilder().where(BloodPressureDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (BloodPressure) list.get(0);
    }

    public BloodPressure getLastTimeBloodPressure() {
        List<Object> list = this.dao.queryBuilder().orderDesc(BloodPressureDao.Properties.Date).limit(1).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (BloodPressure) list.get(0);
    }

    public List<BloodPressure> getLastTimesBloodPressure(Date date, int i8) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = BloodPressureDao.Properties.Date;
        return queryBuilder.where(fVar.le(date), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public void insert(BloodPressure bloodPressure) {
        this.dao.insertOrReplace(bloodPressure);
    }

    public void saveHistoryList(List<CRPHistoryBloodPressureInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CRPHistoryBloodPressureInfo cRPHistoryBloodPressureInfo : list) {
            if (cRPHistoryBloodPressureInfo.getSbp() > 0 && cRPHistoryBloodPressureInfo.getDbp() > 0 && !hasBloodPressure(cRPHistoryBloodPressureInfo)) {
                BloodPressure bloodPressure = new BloodPressure();
                bloodPressure.setSbp(Integer.valueOf(cRPHistoryBloodPressureInfo.getSbp()));
                bloodPressure.setDbp(Integer.valueOf(cRPHistoryBloodPressureInfo.getDbp()));
                bloodPressure.setDate(cRPHistoryBloodPressureInfo.getDate());
                insert(bloodPressure);
            }
        }
    }
}
