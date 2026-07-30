package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.greendao.PerformanceInsightsDao;
import com.moyoung.dafit.module.common.utils.m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;

/* loaded from: classes2.dex */
public class PerformanceInsightsDaoProxy {
    private final PerformanceInsightsDao dao;

    private static class Holder {
        private static final PerformanceInsightsDaoProxy INSTANCE = new PerformanceInsightsDaoProxy();

        private Holder() {
        }
    }

    private PerformanceInsights findInsightForDate(List<PerformanceInsights> list, Date date) {
        Date sameDayStartTime = m.getSameDayStartTime(date);
        Date sameDayEndTime = m.getSameDayEndTime(date);
        for (PerformanceInsights performanceInsights : list) {
            Date date2 = performanceInsights.getDate();
            if (date2 != null && !date2.before(sameDayStartTime) && !date2.after(sameDayEndTime)) {
                return performanceInsights;
            }
        }
        return null;
    }

    public static PerformanceInsightsDaoProxy getInstance() {
        return Holder.INSTANCE;
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<PerformanceInsights> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = PerformanceInsightsDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).build().list();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<PerformanceInsights> getThisMonth(Date date) {
        Date startDateOfMonth = m.getStartDateOfMonth(date);
        Date endDateOfMonth = m.getEndDateOfMonth(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = PerformanceInsightsDao.Properties.Date;
        List<Object> list = queryBuilder.where(fVar.between(startDateOfMonth, endDateOfMonth), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).build().list();
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDateOfMonth);
        while (!calendar.getTime().after(endDateOfMonth)) {
            Date time = calendar.getTime();
            PerformanceInsights findInsightForDate = findInsightForDate(list, time);
            if (findInsightForDate == null) {
                findInsightForDate = new PerformanceInsights();
                findInsightForDate.setDate(time);
            }
            arrayList.add(findInsightForDate);
            calendar.add(5, 1);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<PerformanceInsights> getThisWeek(Date date) {
        Date startDateOfWeek = m.getStartDateOfWeek(date);
        Date endDateOfWeek = m.getEndDateOfWeek(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = PerformanceInsightsDao.Properties.Date;
        List<Object> list = queryBuilder.where(fVar.between(startDateOfWeek, endDateOfWeek), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).build().list();
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDateOfWeek);
        while (!calendar.getTime().after(endDateOfWeek)) {
            Date time = calendar.getTime();
            PerformanceInsights findInsightForDate = findInsightForDate(list, time);
            if (findInsightForDate == null) {
                findInsightForDate = new PerformanceInsights();
                findInsightForDate.setDate(time);
            }
            arrayList.add(findInsightForDate);
            calendar.add(5, 1);
        }
        return arrayList;
    }

    public List<PerformanceInsights> getThisYear(Date date) {
        Date startDateOfYear = m.getStartDateOfYear(date);
        Date endDateOfYear = m.getEndDateOfYear(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = PerformanceInsightsDao.Properties.Date;
        return queryBuilder.where(fVar.between(startDateOfYear, endDateOfYear), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).build().list();
    }

    public PerformanceInsights queryInsight(Date date) {
        Date sameDayStartTime = m.getSameDayStartTime(date);
        Date sameDayEndTime = m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = PerformanceInsightsDao.Properties.Date;
        List<Object> list = queryBuilder.where(fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (PerformanceInsights) list.get(0);
    }

    public void save(PerformanceInsights performanceInsights) {
        PerformanceInsights queryInsight = queryInsight(performanceInsights.getDate());
        if (queryInsight != null) {
            this.dao.delete(queryInsight);
        }
        this.dao.insertOrReplace(performanceInsights);
    }

    private PerformanceInsightsDaoProxy() {
        this.dao = c.getInstance().getDaoSession().getPerformanceInsightsDao();
    }
}
