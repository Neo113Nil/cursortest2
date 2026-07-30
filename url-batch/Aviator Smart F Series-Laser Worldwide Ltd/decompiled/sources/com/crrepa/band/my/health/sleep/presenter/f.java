package com.crrepa.band.my.health.sleep.presenter;

import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.proxy.SleepDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;

/* loaded from: classes2.dex */
public class f extends b {
    private int getIndex(Date date) {
        return m.getDayOfWeek(date) - 1;
    }

    @Override // com.crrepa.band.my.health.sleep.presenter.b
    public void getSleepStatisticsData(Date date) {
        showDate(date);
        float[] fArr = new float[7];
        float[] fArr2 = new float[7];
        float[] fArr3 = new float[7];
        for (Sleep sleep : SleepDaoProxy.getInstance().getWeekSleep(date)) {
            if (sleep != null) {
                int index = getIndex(sleep.getDate());
                if (7 <= index) {
                    break;
                }
                fArr[index] = sleep.getDeep().intValue();
                fArr2[index] = sleep.getShallow().intValue();
                fArr3[index] = sleep.getRem() == null ? 0.0f : sleep.getRem().intValue();
            }
        }
        showSleepTimeChart(fArr, fArr2, fArr3);
        int index2 = getIndex(date);
        showSleepTime((int) (fArr[index2] + fArr2[index2] + fArr3[index2]));
    }
}
