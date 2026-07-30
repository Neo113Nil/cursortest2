package com.crrepa.band.my.model.db.proxy;

import android.os.Bundle;
import android.util.Log;
import cn.hutool.core.date.d;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.greendao.MovementHeartRateDao;
import com.crrepa.band.my.training.utils.q;
import com.moyoung.classes.coach.model.event.SportTimeUpdateEvent;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;

/* loaded from: classes2.dex */
public class MovementHeartRateDaoProxy {
    private static final long MIN_GPS_TRAINING_TIME = 60000;
    private static final long MIN_TRAINING_TIME = 5000;
    private final MovementHeartRateDao dao = c.getInstance().getDaoSession().getMovementHeartRateDao();

    private List<MovementHeartRate> get(long j8, long j9) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = MovementHeartRateDao.Properties.StartTime;
        return queryBuilder.where(fVar.ge(Long.valueOf(j8 - j9)), fVar.le(Long.valueOf(j8 + j9))).orderDesc(fVar).build().list();
    }

    private List<MovementHeartRate> getPeriodMovementList(Long l8, Long l9) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = MovementHeartRateDao.Properties.StartTime;
        return queryBuilder.where(fVar.le(l9), fVar.ge(l8)).orderDesc(fVar).list();
    }

    private void logTrainingEvent(MovementHeartRate movementHeartRate) {
        String format = m.format(new Date(movementHeartRate.getStartTime().longValue()), d.PURE_DATE_PATTERN);
        String trainingNameByTrack = q.getTrainingNameByTrack(com.moyoung.dafit.module.common.utils.d.get(), movementHeartRate.getType().intValue());
        int minuteSpace = m.getMinuteSpace(movementHeartRate.getStartTime().longValue(), movementHeartRate.getEndTime().longValue());
        Bundle bundle = new Bundle();
        bundle.putString("exercise_date", format);
        bundle.putString("exercise_type", trainingNameByTrack);
        bundle.putString("exercise_time", minuteSpace + "分钟");
        s0.logEvent("锻炼", bundle);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<MovementHeartRate> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = MovementHeartRateDao.Properties.StartTime;
        return queryBuilder.where(fVar.le(Long.valueOf(new Date().getTime())), new org.greenrobot.greendao.query.m[0]).orderDesc(fVar).build().list();
    }

    public MovementHeartRate getGpsTraining(long j8, int i8) {
        List<MovementHeartRate> list = get(j8, 60000L);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MovementHeartRate> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Math.abs(it.next().getTrainingSeconds().intValue() - i8)));
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            if (intValue == 0) {
                return list.get(i11);
            }
            if (i10 == 0 || intValue < i10) {
                i9 = i11;
                i10 = intValue;
            }
        }
        return list.get(i9);
    }

    public List<MovementHeartRate> getMonthMovementList(Date date) {
        Calendar startCalendarOfMonth = m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodMovementList(Long.valueOf(time.getTime()), Long.valueOf(startCalendarOfMonth.getTime().getTime()));
    }

    public MovementHeartRate getMovementHeartRate(long j8) {
        List<Object> list = this.dao.queryBuilder().where(MovementHeartRateDao.Properties.StartTime.eq(Long.valueOf(j8)), new org.greenrobot.greendao.query.m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (MovementHeartRate) list.get(0);
    }

    public MovementHeartRate getTodayLastMovementHeartRate(int i8) {
        k queryBuilder = this.dao.queryBuilder();
        org.greenrobot.greendao.query.m eq = MovementHeartRateDao.Properties.Type.eq(Integer.valueOf(i8));
        f fVar = MovementHeartRateDao.Properties.StartTime;
        List<Object> list = queryBuilder.where(eq, fVar.le(Long.valueOf(System.currentTimeMillis()))).orderDesc(fVar).limit(1).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (MovementHeartRate) list.get(0);
    }

    public List<MovementHeartRate> getTodayMovementHeartRate() {
        Date date = new Date();
        k queryBuilder = this.dao.queryBuilder();
        f fVar = MovementHeartRateDao.Properties.StartTime;
        return queryBuilder.where(fVar.ge(Long.valueOf(m.getSameDayStartTime(date).getTime())), fVar.le(Long.valueOf(m.getSameDayEndTime(date).getTime()))).orderDesc(fVar).build().list();
    }

    public long getTotalCount() {
        return this.dao.count();
    }

    public List<MovementHeartRate> getWeekMovementList(Date date) {
        Calendar startCalendarOfWeek = m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodMovementList(Long.valueOf(time.getTime()), Long.valueOf(startCalendarOfWeek.getTime().getTime()));
    }

    public List<MovementHeartRate> getYearMovementList(Date date) {
        Calendar startCalendarOfYear = m.getStartCalendarOfYear(date);
        Date time = startCalendarOfYear.getTime();
        startCalendarOfYear.add(1, 1);
        return getPeriodMovementList(Long.valueOf(time.getTime()), Long.valueOf(startCalendarOfYear.getTime().getTime()));
    }

    public boolean isSavedTraining(long j8) {
        List<MovementHeartRate> list = get(j8, 5000L);
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean save(MovementHeartRate movementHeartRate) {
        if (movementHeartRate == null || movementHeartRate.getAverage() == null) {
            Log.d("MovementHeartRate", "save false ");
            return false;
        }
        this.dao.insertOrReplace(movementHeartRate);
        org.greenrobot.eventbus.c.getDefault().post(new SportTimeUpdateEvent());
        logTrainingEvent(movementHeartRate);
        return true;
    }

    public List<MovementHeartRate> getAll(int i8) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = MovementHeartRateDao.Properties.StartTime;
        return queryBuilder.where(fVar.le(Long.valueOf(new Date().getTime())), MovementHeartRateDao.Properties.Type.eq(Integer.valueOf(i8))).orderDesc(fVar).build().list();
    }

    public MovementHeartRate getMovementHeartRate(long j8, long j9) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = MovementHeartRateDao.Properties.StartTime;
        List<Object> list = queryBuilder.where(fVar.ge(Long.valueOf(j8 - 10000)), fVar.le(Long.valueOf(j8 + 10000))).orderDesc(fVar).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (MovementHeartRate) list.get(0);
    }
}
