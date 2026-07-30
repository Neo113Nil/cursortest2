package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.greendao.SleepDao;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class SleepDaoProxy {
    private SleepDao dao;

    private static class Holder {
        private static final SleepDaoProxy INSTANCE = new SleepDaoProxy();

        private Holder() {
        }
    }

    public static SleepDaoProxy getInstance() {
        return Holder.INSTANCE;
    }

    private List<Sleep> getPeriodSleep(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = SleepDao.Properties.Date;
        return queryBuilder.where(fVar.le(date2), fVar.ge(date)).orderAsc(fVar).list();
    }

    public static int getSleepTime(Sleep sleep) {
        if (sleep == null) {
            return 0;
        }
        return (sleep.getDeep() == null ? 0 : sleep.getDeep().intValue()) + (sleep.getShallow() == null ? 0 : sleep.getShallow().intValue()) + (sleep.getRem() != null ? sleep.getRem().intValue() : 0);
    }

    public static int getTotalSleepTime(Sleep sleep) {
        return sleep.getDeep().intValue() + sleep.getShallow().intValue() + (sleep.getRem() == null ? 0 : sleep.getRem().intValue());
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<Sleep> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = SleepDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new m[0]).orderAsc(fVar).build().list();
    }

    public List<Sleep> getMonthSleep(Date date) {
        Calendar startCalendarOfMonth = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodSleep(time, startCalendarOfMonth.getTime());
    }

    public List<Sleep> getPartSleep(Date date, int i8) {
        Date sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = SleepDao.Properties.Date;
        return queryBuilder.where(fVar.le(sameDayEndTime), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public Sleep getSleep(Date date) {
        Date sameDayStartTime = com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date);
        Date sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = SleepDao.Properties.Date;
        List<Object> list = queryBuilder.where(fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Sleep) list.get(0);
    }

    public List<Sleep> getWeekSleep(Date date) {
        Calendar startCalendarOfWeek = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodSleep(time, startCalendarOfWeek.getTime());
    }

    public void insert(Sleep sleep) {
        this.dao.insertOrReplace(sleep);
    }

    public void update(Sleep sleep) {
        this.dao.update(sleep);
    }

    private SleepDaoProxy() {
        this.dao = c.getInstance().getDaoSession().getSleepDao();
    }
}
