package com.crrepa.band.my.health.pressure.presenter;

import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.proxy.TimingStressDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class f extends b {
    private int getIndex(Date date) {
        return m.getDayOfWeek(date) - 1;
    }

    @Override // com.crrepa.band.my.health.pressure.presenter.b
    public void getStatisticsData(Date date) {
        showDate(date);
        float[] fArr = new float[7];
        List<TimingStress> weekList = new TimingStressDaoProxy().getWeekList(date);
        if (weekList != null) {
            Iterator<TimingStress> it = weekList.iterator();
            while (it.hasNext()) {
                int index = getIndex(it.next().getDate());
                if (7 <= index) {
                    index = 6;
                }
                fArr[index] = r3.getAverage().intValue();
            }
        }
        showStatisticsChart(fArr);
        showAverageStress((int) fArr[getIndex(date)]);
    }
}
