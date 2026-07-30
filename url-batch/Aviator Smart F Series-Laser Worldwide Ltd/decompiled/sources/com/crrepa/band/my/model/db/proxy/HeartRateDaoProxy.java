package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.greendao.HeartRateDao;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class HeartRateDaoProxy {
    private HeartRateDao dao = c.getInstance().getDaoSession().getHeartRateDao();

    private List<HeartRate> getPeriodHeartRateList(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = HeartRateDao.Properties.Date;
        return queryBuilder.where(fVar.le(date2), fVar.ge(date)).orderAsc(fVar).list();
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<HeartRate> getAllHeartRate() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = HeartRateDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new m[0]).orderAsc(fVar).build().list();
    }

    public HeartRate getHeartRate(Date date) {
        List<HeartRate> periodHeartRateList = getPeriodHeartRateList(com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date), com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date));
        if (periodHeartRateList == null || periodHeartRateList.isEmpty()) {
            return null;
        }
        return periodHeartRateList.get(0);
    }

    public List<HeartRate> getMonthHeartRateList(Date date) {
        Calendar startCalendarOfMonth = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodHeartRateList(time, startCalendarOfMonth.getTime());
    }

    public List<HeartRate> getPartHeartRate(Date date, int i8) {
        Date sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = HeartRateDao.Properties.Date;
        return queryBuilder.where(fVar.lt(sameDayEndTime), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public List<HeartRate> getWeekHeartRateList(Date date) {
        Calendar startCalendarOfWeek = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodHeartRateList(time, startCalendarOfWeek.getTime());
    }

    public void insertHeartRate(HeartRate heartRate) {
        this.dao.insertOrReplace(heartRate);
    }

    public void updateHeartRate(HeartRate heartRate) {
        this.dao.update(heartRate);
    }
}
