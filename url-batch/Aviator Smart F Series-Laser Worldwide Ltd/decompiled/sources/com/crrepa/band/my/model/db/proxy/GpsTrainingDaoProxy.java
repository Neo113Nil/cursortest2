package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.greendao.GpsTrainingDao;
import com.moyoung.classes.coach.model.event.SportTimeUpdateEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class GpsTrainingDaoProxy {
    public static final int AMAP_TYPE = 0;
    public static final int GOOGLE_MAP_TYPE = 1;
    public static final int GPS_TYPE = 241;
    public static final int NO_MAP_TYPE = 2;
    private GpsTrainingDao dao = c.getInstance().getDaoSession().getGpsTrainingDao();

    private List<GpsTraining> getPeriodTrainingList(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = GpsTrainingDao.Properties.StartDate;
        return queryBuilder.where(fVar.le(date2), fVar.ge(date)).orderDesc(fVar).list();
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public GpsTraining get(Date date) {
        List<Object> list = this.dao.queryBuilder().where(GpsTrainingDao.Properties.StartDate.eq(date), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (GpsTraining) list.get(0);
    }

    public List<GpsTraining> getAll() {
        return this.dao.queryBuilder().orderDesc(GpsTrainingDao.Properties.StartDate).build().list();
    }

    public GpsTraining getLastTimeGpsRun() {
        List<Object> list = this.dao.queryBuilder().orderDesc(GpsTrainingDao.Properties.StartDate).limit(1).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (GpsTraining) list.get(0);
    }

    public List<GpsTraining> getMonthTrainingList(Date date) {
        Calendar startCalendarOfMonth = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodTrainingList(time, com.moyoung.dafit.module.common.utils.m.getLastDayEndTime(startCalendarOfMonth.getTime()));
    }

    public List<GpsTraining> getToday() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = GpsTrainingDao.Properties.StartDate;
        return queryBuilder.where(fVar.ge(com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(new Date())), fVar.le(com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(new Date()))).orderDesc(fVar).build().list();
    }

    public float getTrainingTotalMinutes() {
        Iterator<GpsTraining> it = getToday().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += it.next().getTrainingSeconds().intValue();
        }
        return (i8 * 1.0f) / 60.0f;
    }

    public List<GpsTraining> getWeekTrainingList(Date date) {
        Calendar startCalendarOfWeek = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodTrainingList(time, com.moyoung.dafit.module.common.utils.m.getLastDayEndTime(startCalendarOfWeek.getTime()));
    }

    public List<GpsTraining> getYearTrainingList(Date date) {
        Calendar startCalendarOfYear = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfYear(date);
        Date time = startCalendarOfYear.getTime();
        startCalendarOfYear.add(1, 1);
        return getPeriodTrainingList(time, com.moyoung.dafit.module.common.utils.m.getLastDayEndTime(startCalendarOfYear.getTime()));
    }

    public long insert(GpsTraining gpsTraining) {
        if (gpsTraining == null) {
            return -1L;
        }
        org.greenrobot.eventbus.c.getDefault().post(new SportTimeUpdateEvent());
        return this.dao.insertOrReplace(gpsTraining);
    }

    public GpsTraining get(long j8) {
        List<Object> list = this.dao.queryBuilder().where(GpsTrainingDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (GpsTraining) list.get(0);
    }

    public List<GpsTraining> getToday(Date date) {
        return getPeriodTrainingList(com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date), com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date));
    }
}
