package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.greendao.TimingBloodOxygenDao;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;

/* loaded from: classes2.dex */
public class TimingBloodOxygenDaoProxy {
    private TimingBloodOxygenDao dao = c.getInstance().getDaoSession().getTimingBloodOxygenDao();

    private List<TimingBloodOxygen> getPeriodList(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingBloodOxygenDao.Properties.Date;
        return queryBuilder.where(fVar.le(date2), fVar.ge(date)).orderAsc(fVar).list();
    }

    private List<TimingBloodOxygen> getTimingBloodOxygenList(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingBloodOxygenDao.Properties.Date;
        return queryBuilder.where(fVar.le(date2), fVar.ge(date)).orderAsc(fVar).list();
    }

    public TimingBloodOxygen get(Date date) {
        List<TimingBloodOxygen> timingBloodOxygenList = getTimingBloodOxygenList(m.getSameDayStartTime(date), m.getSameDayEndTime(date));
        if (timingBloodOxygenList == null || timingBloodOxygenList.isEmpty()) {
            return null;
        }
        return timingBloodOxygenList.get(0);
    }

    public List<TimingBloodOxygen> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingBloodOxygenDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).list();
    }

    public List<TimingBloodOxygen> getHistory(Date date, int i8) {
        Date sameDayEndTime = m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingBloodOxygenDao.Properties.Date;
        return queryBuilder.where(fVar.le(sameDayEndTime), new org.greenrobot.greendao.query.m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public List<TimingBloodOxygen> getMonthList(Date date) {
        Calendar startCalendarOfMonth = m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodList(time, startCalendarOfMonth.getTime());
    }

    public List<TimingBloodOxygen> getWeekList(Date date) {
        Calendar startCalendarOfWeek = m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodList(time, startCalendarOfWeek.getTime());
    }

    public long insert(TimingBloodOxygen timingBloodOxygen) {
        return this.dao.insertOrReplace(timingBloodOxygen);
    }

    public void update(TimingBloodOxygen timingBloodOxygen) {
        this.dao.update(timingBloodOxygen);
    }
}
