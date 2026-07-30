package com.crrepa.band.my.health.bloodoxygen.presenter;

import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements com.moyoung.dafit.module.common.baseui.f {
    private h2.a view;

    private int getBloodOxygenValue(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private void showLast7DayAverageBo(List<TimingBloodOxygen> list, Date date) {
        float[] fArr = new float[7];
        Date[] dateArr = new Date[7];
        boolean z7 = false;
        for (TimingBloodOxygen timingBloodOxygen : list) {
            if (timingBloodOxygen != null) {
                int daySpace = m.getDaySpace(timingBloodOxygen.getDate(), date);
                if (daySpace < 0 || daySpace >= 7) {
                    break;
                }
                int i8 = 6 - daySpace;
                fArr[i8] = timingBloodOxygen.getAverage();
                dateArr[i8] = timingBloodOxygen.getDate();
                z7 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z7) {
            for (int i9 = 0; i9 < 7; i9++) {
                arrayList.add(Float.valueOf(fArr[i9]));
            }
        }
        this.view.renderLast7DaysAverageBo(arrayList, dateArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getBloodOxygen(Date date) {
        List<Float> list;
        this.view.renderStatisticsDate(date);
        TimingBloodOxygenDaoProxy timingBloodOxygenDaoProxy = new TimingBloodOxygenDaoProxy();
        TimingBloodOxygen timingBloodOxygen = timingBloodOxygenDaoProxy.get(date);
        if (timingBloodOxygen != null) {
            int bloodOxygenValue = getBloodOxygenValue(Integer.valueOf(timingBloodOxygen.getAverage()));
            int bloodOxygenValue2 = getBloodOxygenValue(Integer.valueOf(timingBloodOxygen.getMax()));
            this.view.renderBloodOxygen(bloodOxygenValue, getBloodOxygenValue(Integer.valueOf(timingBloodOxygen.getMin())), bloodOxygenValue2);
            list = s.json2List(timingBloodOxygen.getBloodOxygen(), Float[].class);
        } else {
            list = null;
        }
        if (list == null) {
            list = new ArrayList<>();
            list.add(Float.valueOf(0.0f));
        }
        this.view.renderTodayBoList(list);
        showLast7DayAverageBo(timingBloodOxygenDaoProxy.getHistory(date, 7), date);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(h2.a aVar) {
        this.view = aVar;
    }
}
