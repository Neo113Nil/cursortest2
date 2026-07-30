package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.model.db.greendao.BloodOxygenDao;
import com.crrepa.ble.conn.bean.CRPHistoryBloodOxygenInfo;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class BloodOxygenDaoProxy {
    private static final long SAVED_MIN_TIME = 15000;
    private BloodOxygenDao dao = c.getInstance().getDaoSession().getBloodOxygenDao();

    private List<BloodOxygen> get(int i8) {
        return this.dao.queryBuilder().where(BloodOxygenDao.Properties.BloodOxygen.eq(Integer.valueOf(i8)), new m[0]).orderDesc(BloodOxygenDao.Properties.Date).list();
    }

    private boolean hasBloodOxygen(CRPHistoryBloodOxygenInfo cRPHistoryBloodOxygenInfo) {
        List<BloodOxygen> list = get(cRPHistoryBloodOxygenInfo.getBo());
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<BloodOxygen> it = list.iterator();
        while (it.hasNext()) {
            if (Math.abs(it.next().getDate().getTime() - cRPHistoryBloodOxygenInfo.getDate().getTime()) < 15000) {
                return true;
            }
        }
        return false;
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<BloodOxygen> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = BloodOxygenDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new m[0]).orderDesc(fVar).build().list();
    }

    public BloodOxygen getBloodPressure(long j8) {
        List<Object> list = this.dao.queryBuilder().where(BloodOxygenDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (BloodOxygen) list.get(0);
    }

    public BloodOxygen getLastTimeBloodOxygen() {
        List<BloodOxygen> lastTimesBloodOxygen = getLastTimesBloodOxygen(new Date(), 1);
        if (lastTimesBloodOxygen == null || lastTimesBloodOxygen.isEmpty()) {
            return null;
        }
        return lastTimesBloodOxygen.get(0);
    }

    public List<BloodOxygen> getLastTimesBloodOxygen(Date date, int i8) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = BloodOxygenDao.Properties.Date;
        return queryBuilder.where(fVar.le(date), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public List<BloodOxygen> getThisDayData(Date date) {
        Date sameDayStartTime = com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date);
        Date sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = BloodOxygenDao.Properties.Date;
        return queryBuilder.where(fVar.between(sameDayStartTime, sameDayEndTime), new m[0]).orderDesc(fVar).build().list();
    }

    public void insert(BloodOxygen bloodOxygen) {
        this.dao.insertOrReplace(bloodOxygen);
    }

    public void saveHistoryList(List<CRPHistoryBloodOxygenInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CRPHistoryBloodOxygenInfo cRPHistoryBloodOxygenInfo : list) {
            if (cRPHistoryBloodOxygenInfo.getBo() > 0 && !hasBloodOxygen(cRPHistoryBloodOxygenInfo)) {
                BloodOxygen bloodOxygen = new BloodOxygen();
                bloodOxygen.setBloodOxygen(Integer.valueOf(cRPHistoryBloodOxygenInfo.getBo()));
                bloodOxygen.setDate(cRPHistoryBloodOxygenInfo.getDate());
                insert(bloodOxygen);
            }
        }
    }
}
