package com.crrepa.band.my.health.bodytemperature.presenter;

import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.proxy.TimingTempDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class g extends d {
    private int getIndex(Date date) {
        return m.getDayOfMonth(date) - 1;
    }

    @Override // com.crrepa.band.my.health.bodytemperature.presenter.d
    public void getStatisticsData(Date date) {
        showDate(date);
        int monthCountDay = m.getMonthCountDay(date);
        float[] fArr = new float[monthCountDay];
        List<TimingTemp> monthTempList = new TimingTempDaoProxy().getMonthTempList(date);
        if (monthTempList != null) {
            for (TimingTemp timingTemp : monthTempList) {
                int index = getIndex(timingTemp.getDate());
                if (monthCountDay <= index) {
                    index = monthCountDay - 1;
                }
                fArr[index] = timingTemp.getAverage().floatValue();
            }
        }
        showStatisticsChart(fArr);
        showAverageTemp(fArr[getIndex(date)]);
    }
}
