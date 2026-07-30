package com.crrepa.band.my.health.heartrate.presenter;

import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.proxy.HeartRateDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class g extends d {
    private int getIndex(Date date) {
        return m.getDayOfMonth(date) - 1;
    }

    @Override // com.crrepa.band.my.health.heartrate.presenter.d
    public void getStatisticsData(Date date) {
        showDate(date);
        int monthCountDay = m.getMonthCountDay(date);
        float[] fArr = new float[monthCountDay];
        List<HeartRate> monthHeartRateList = new HeartRateDaoProxy().getMonthHeartRateList(date);
        if (monthHeartRateList != null) {
            Iterator<HeartRate> it = monthHeartRateList.iterator();
            while (it.hasNext()) {
                int index = getIndex(it.next().getDate());
                if (monthCountDay <= index) {
                    index = monthCountDay - 1;
                }
                fArr[index] = r3.getAverage().intValue();
            }
        }
        showStatisticsChart(fArr);
        showAverageHeartRate((int) fArr[getIndex(date)]);
    }
}
