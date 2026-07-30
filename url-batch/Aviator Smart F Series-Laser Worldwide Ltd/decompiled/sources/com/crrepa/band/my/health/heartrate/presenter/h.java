package com.crrepa.band.my.health.heartrate.presenter;

import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.proxy.HeartRateDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class h extends d {
    private int getIndex(Date date) {
        return m.getDayOfWeek(date) - 1;
    }

    @Override // com.crrepa.band.my.health.heartrate.presenter.d
    public void getStatisticsData(Date date) {
        showDate(date);
        float[] fArr = new float[7];
        List<HeartRate> weekHeartRateList = new HeartRateDaoProxy().getWeekHeartRateList(date);
        if (weekHeartRateList != null) {
            Iterator<HeartRate> it = weekHeartRateList.iterator();
            while (it.hasNext()) {
                int index = getIndex(it.next().getDate());
                if (7 <= index) {
                    index = 6;
                }
                fArr[index] = r3.getAverage().intValue();
            }
        }
        showStatisticsChart(fArr);
        showAverageHeartRate((int) fArr[getIndex(date)]);
    }
}
