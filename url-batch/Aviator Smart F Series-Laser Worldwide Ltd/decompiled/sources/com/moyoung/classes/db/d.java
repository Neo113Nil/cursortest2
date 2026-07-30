package com.moyoung.classes.db;

import com.moyoung.classes.coach.model.event.SportTimeUpdateEvent;
import com.moyoung.classes.db.ClassesHistoryDao;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.query.k;

/* loaded from: classes4.dex */
public class d {
    private final ClassesHistoryDao dao = c.getInstance().getDaoSession().getClassesHistoryDao();

    private List<ClassesHistory> getPeriodRecordList(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        org.greenrobot.greendao.f fVar = ClassesHistoryDao.Properties.StartTimestamp;
        return queryBuilder.where(fVar.le(Long.valueOf(date2.getTime())), fVar.ge(Long.valueOf(date.getTime()))).orderDesc(fVar).list();
    }

    public void delete(ClassesHistory classesHistory) {
        this.dao.delete(classesHistory);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<ClassesHistory> getAll() {
        return this.dao.queryBuilder().orderDesc(ClassesHistoryDao.Properties.StartTimestamp).build().list();
    }

    public ClassesHistory getByType(int i8, int i9) {
        List<Object> list = this.dao.queryBuilder().where(ClassesHistoryDao.Properties.ClassesType.eq(Integer.valueOf(i8)), ClassesHistoryDao.Properties.Id.eq(Integer.valueOf(i9))).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ClassesHistory) list.get(0);
    }

    public List<ClassesHistory> getMonthTrainingList(Date date) {
        Calendar startCalendarOfMonth = m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodRecordList(time, m.getLastDayEndTime(startCalendarOfMonth.getTime()));
    }

    public List<ClassesHistory> getTodayList(Date date) {
        return getPeriodRecordList(m.getSameDayStartTime(date), m.getSameDayEndTime(date));
    }

    public List<ClassesHistory> getWeekList(Date date) {
        Calendar startCalendarOfWeek = m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodRecordList(time, m.getLastDayEndTime(startCalendarOfWeek.getTime()));
    }

    public List<ClassesHistory> getYearTrainingList(Date date) {
        Calendar startCalendarOfYear = m.getStartCalendarOfYear(date);
        Date time = startCalendarOfYear.getTime();
        startCalendarOfYear.add(1, 1);
        return getPeriodRecordList(time, m.getLastDayEndTime(startCalendarOfYear.getTime()));
    }

    public void save(ClassesHistory classesHistory) {
        this.dao.insert(classesHistory);
        org.greenrobot.eventbus.c.getDefault().post(new SportTimeUpdateEvent());
    }
}
