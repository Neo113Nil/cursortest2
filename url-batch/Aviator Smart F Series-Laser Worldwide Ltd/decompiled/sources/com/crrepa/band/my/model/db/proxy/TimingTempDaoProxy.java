package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.greendao.TimingTempDao;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;

/* loaded from: classes2.dex */
public class TimingTempDaoProxy {
    private TimingTempDao dao = c.getInstance().getDaoSession().getTimingTempDao();

    private List<TimingTemp> getPeriodTempList(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingTempDao.Properties.Date;
        return queryBuilder.where(fVar.le(date2), fVar.ge(date)).orderAsc(fVar).list();
    }

    public TimingTemp get(Date date) {
        List<TimingTemp> periodTempList = getPeriodTempList(m.getSameDayStartTime(date), m.getSameDayEndTime(date));
        if (periodTempList == null || periodTempList.isEmpty()) {
            return null;
        }
        return periodTempList.get(0);
    }

    public List<TimingTemp> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingTempDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).list();
    }

    public List<TimingTemp> getHistory(Date date, int i8) {
        Date sameDayEndTime = m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingTempDao.Properties.Date;
        return queryBuilder.where(fVar.le(sameDayEndTime), new org.greenrobot.greendao.query.m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public List<TimingTemp> getMonthTempList(Date date) {
        Calendar startCalendarOfMonth = m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodTempList(time, startCalendarOfMonth.getTime());
    }

    public List<TimingTemp> getWeekTempList(Date date) {
        Calendar startCalendarOfWeek = m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodTempList(time, startCalendarOfWeek.getTime());
    }

    public void insert(TimingTemp timingTemp) {
        this.dao.insertOrReplace(timingTemp);
    }

    public void update(TimingTemp timingTemp) {
        this.dao.update(timingTemp);
    }
}
