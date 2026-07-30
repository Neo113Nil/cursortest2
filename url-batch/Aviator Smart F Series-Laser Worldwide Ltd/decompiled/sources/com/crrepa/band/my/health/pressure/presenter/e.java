package com.crrepa.band.my.health.pressure.presenter;

import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.proxy.TimingStressDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class e extends b {
    private int getIndex(Date date) {
        return m.getDayOfMonth(date) - 1;
    }

    @Override // com.crrepa.band.my.health.pressure.presenter.b
    public void getStatisticsData(Date date) {
        showDate(date);
        int monthCountDay = m.getMonthCountDay(date);
        float[] fArr = new float[monthCountDay];
        List<TimingStress> monthList = new TimingStressDaoProxy().getMonthList(date);
        if (monthList != null) {
            Iterator<TimingStress> it = monthList.iterator();
            while (it.hasNext()) {
                int index = getIndex(it.next().getDate());
                if (monthCountDay <= index) {
                    index = monthCountDay - 1;
                }
                fArr[index] = r3.getAverage().intValue();
            }
        }
        showStatisticsChart(fArr);
        showAverageStress((int) fArr[getIndex(date)]);
    }
}
