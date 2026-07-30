package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.greendao.StepDao;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class StepsDaoProxy {
    private StepDao dao;

    private static class Holder {
        private static StepsDaoProxy INSTANCE = new StepsDaoProxy();

        private Holder() {
        }
    }

    public static StepsDaoProxy getInstance() {
        return Holder.INSTANCE;
    }

    private List<Step> getPeriodSteps(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = StepDao.Properties.Date;
        return queryBuilder.where(fVar.le(date2), fVar.ge(date)).orderAsc(fVar).list();
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<Step> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = StepDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new m[0]).orderAsc(fVar).build().list();
    }

    public List<Step> getFutureStep(Date date, int i8) {
        Date sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = StepDao.Properties.Date;
        return queryBuilder.where(fVar.gt(sameDayEndTime), new m[0]).orderAsc(fVar).limit(i8).build().list();
    }

    public List<Step> getMonthStepList(Date date) {
        Calendar startCalendarOfMonth = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodSteps(time, startCalendarOfMonth.getTime());
    }

    public List<Step> getPartStep(Date date, int i8) {
        Date sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = StepDao.Properties.Date;
        return queryBuilder.where(fVar.le(sameDayEndTime), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public synchronized Step getStep(Date date) {
        Date sameDayStartTime = com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date);
        Date sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = StepDao.Properties.Date;
        List<Object> list = queryBuilder.where(fVar.gt(sameDayStartTime), fVar.lt(sameDayEndTime)).list();
        if (list != null && !list.isEmpty()) {
            return (Step) list.get(0);
        }
        return null;
    }

    public Step getTodayStep() {
        return getStep(com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(new Date()));
    }

    public List<Step> getWeekStepList(Date date) {
        Calendar startCalendarOfWeek = com.moyoung.dafit.module.common.utils.m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodSteps(time, startCalendarOfWeek.getTime());
    }

    public void insert(Step step) {
        this.dao.insertOrReplace(step);
    }

    public synchronized void updateStep(Step step) {
        this.dao.update(step);
    }

    private StepsDaoProxy() {
        this.dao = c.getInstance().getDaoSession().getStepDao();
    }
}
