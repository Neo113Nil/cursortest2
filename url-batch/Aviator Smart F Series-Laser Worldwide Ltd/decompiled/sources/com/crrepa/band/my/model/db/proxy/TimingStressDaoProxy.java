package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.greendao.TimingStressDao;
import com.crrepa.ble.conn.bean.CRPTimingStressInfo;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;

/* loaded from: classes2.dex */
public class TimingStressDaoProxy {
    private TimingStressDao dao = c.getInstance().getDaoSession().getTimingStressDao();

    private List<TimingStress> getPeriodList(Date date, Date date2) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingStressDao.Properties.Date;
        return queryBuilder.where(fVar.le(date2), fVar.ge(date)).orderAsc(fVar).list();
    }

    private int[] getStressStatistical(List<Integer> list) {
        int[] iArr = new int[3];
        if (list != null && !list.isEmpty()) {
            int intValue = list.get(0).intValue();
            int i8 = intValue;
            int i9 = 0;
            int i10 = 0;
            for (Integer num : list) {
                if (num.intValue() > 0) {
                    i10 += num.intValue();
                    i9++;
                    if (intValue == 0 || num.intValue() < intValue) {
                        intValue = num.intValue();
                    }
                    if (i8 < num.intValue()) {
                        i8 = num.intValue();
                    }
                }
            }
            if (i9 > 0) {
                iArr[0] = i10 / i9;
            }
            iArr[1] = intValue;
            iArr[2] = i8;
        }
        return iArr;
    }

    public TimingStress get(Date date) {
        Date sameDayStartTime = m.getSameDayStartTime(date);
        Date sameDayEndTime = m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingStressDao.Properties.Date;
        List<Object> list = queryBuilder.where(fVar.gt(sameDayStartTime), fVar.lt(sameDayEndTime)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (TimingStress) list.get(0);
    }

    public List<TimingStress> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = TimingStressDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).list();
    }

    public List<TimingStress> getMonthList(Date date) {
        Calendar startCalendarOfMonth = m.getStartCalendarOfMonth(date);
        Date time = startCalendarOfMonth.getTime();
        startCalendarOfMonth.add(2, 1);
        return getPeriodList(time, startCalendarOfMonth.getTime());
    }

    public List<TimingStress> getWeekList(Date date) {
        Calendar startCalendarOfWeek = m.getStartCalendarOfWeek(date);
        Date time = startCalendarOfWeek.getTime();
        startCalendarOfWeek.add(4, 1);
        return getPeriodList(time, startCalendarOfWeek.getTime());
    }

    public TimingStress insert(CRPTimingStressInfo cRPTimingStressInfo) {
        Date dateOfOffsetDay = m.getDateOfOffsetDay(new Date(), -cRPTimingStressInfo.getDate().getValue());
        TimingStress timingStress = get(dateOfOffsetDay);
        if (timingStress == null) {
            timingStress = new TimingStress();
        }
        timingStress.setDate(dateOfOffsetDay);
        int[] stressStatistical = getStressStatistical(cRPTimingStressInfo.getList());
        timingStress.setAverage(Integer.valueOf(stressStatistical[0]));
        timingStress.setMin(Integer.valueOf(stressStatistical[1]));
        timingStress.setMax(Integer.valueOf(stressStatistical[2]));
        timingStress.setStress(s.bean2Json(cRPTimingStressInfo.getList()));
        this.dao.insertOrReplace(timingStress);
        return timingStress;
    }
}
