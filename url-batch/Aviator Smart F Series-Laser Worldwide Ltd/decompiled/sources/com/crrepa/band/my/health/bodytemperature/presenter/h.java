package com.crrepa.band.my.health.bodytemperature.presenter;

import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.proxy.TimingTempDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class h extends d {
    private int getIndex(Date date) {
        return m.getDayOfWeek(date) - 1;
    }

    @Override // com.crrepa.band.my.health.bodytemperature.presenter.d
    public void getStatisticsData(Date date) {
        showDate(date);
        float[] fArr = new float[7];
        List<TimingTemp> weekTempList = new TimingTempDaoProxy().getWeekTempList(date);
        if (weekTempList != null) {
            for (TimingTemp timingTemp : weekTempList) {
                int index = getIndex(timingTemp.getDate());
                if (7 <= index) {
                    index = 6;
                }
                fArr[index] = timingTemp.getAverage().floatValue();
            }
        }
        showStatisticsChart(fArr);
        showAverageTemp(fArr[getIndex(date)]);
    }
}
