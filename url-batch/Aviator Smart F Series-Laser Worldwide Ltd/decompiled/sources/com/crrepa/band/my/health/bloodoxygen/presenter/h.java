package com.crrepa.band.my.health.bloodoxygen.presenter;

import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class h extends d {
    private int getIndex(Date date) {
        return m.getDayOfWeek(date) - 1;
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.presenter.d
    public void getStatisticsData(Date date) {
        showDate(date);
        float[] fArr = new float[7];
        List<TimingBloodOxygen> weekList = new TimingBloodOxygenDaoProxy().getWeekList(date);
        if (weekList != null) {
            Iterator<TimingBloodOxygen> it = weekList.iterator();
            while (it.hasNext()) {
                int index = getIndex(it.next().getDate());
                if (7 <= index) {
                    index = 6;
                }
                fArr[index] = r3.getAverage();
            }
        }
        showStatisticsChart(fArr);
        showAverageBloodOxygen((int) fArr[getIndex(date)]);
    }
}
