package com.crrepa.band.my.health.bloodoxygen.presenter;

import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class g extends d {
    private int getIndex(Date date) {
        return m.getDayOfMonth(date) - 1;
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.presenter.d
    public void getStatisticsData(Date date) {
        showDate(date);
        int monthCountDay = m.getMonthCountDay(date);
        float[] fArr = new float[monthCountDay];
        List<TimingBloodOxygen> monthList = new TimingBloodOxygenDaoProxy().getMonthList(date);
        if (monthList != null) {
            Iterator<TimingBloodOxygen> it = monthList.iterator();
            while (it.hasNext()) {
                int index = getIndex(it.next().getDate());
                if (monthCountDay <= index) {
                    index = monthCountDay - 1;
                }
                fArr[index] = r3.getAverage();
            }
        }
        showStatisticsChart(fArr);
        showAverageBloodOxygen((int) fArr[getIndex(date)]);
    }
}
