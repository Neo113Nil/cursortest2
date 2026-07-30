package com.crrepa.band.my.health.bodytemperature.presenter;

import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.proxy.TimingTempDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements com.moyoung.dafit.module.common.baseui.f {
    private m2.c view;

    private float getTemp(Float f8) {
        if (f8 == null) {
            return 0.0f;
        }
        return f8.floatValue();
    }

    private void showLast7DayAverageTemp(List<TimingTemp> list, Date date) {
        float[] fArr = new float[7];
        Date[] dateArr = new Date[7];
        boolean z7 = false;
        for (TimingTemp timingTemp : list) {
            if (timingTemp != null) {
                int daySpace = m.getDaySpace(timingTemp.getDate(), date);
                if (daySpace < 0 || daySpace >= 7) {
                    break;
                }
                int i8 = 6 - daySpace;
                fArr[i8] = timingTemp.getAverage().floatValue();
                dateArr[i8] = timingTemp.getDate();
                z7 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z7) {
            for (int i9 = 0; i9 < 7; i9++) {
                arrayList.add(Float.valueOf(fArr[i9]));
            }
        }
        this.view.renderLast7DaysAverageTemp(arrayList, dateArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getTimerTemp(Date date) {
        List<Float> list;
        this.view.renderStatisticsDate(date);
        TimingTempDaoProxy timingTempDaoProxy = new TimingTempDaoProxy();
        TimingTemp timingTemp = timingTempDaoProxy.get(date);
        if (timingTemp != null) {
            float temp = getTemp(timingTemp.getAverage());
            float temp2 = getTemp(timingTemp.getMax());
            this.view.renderTemp(temp, getTemp(timingTemp.getMin()), temp2);
            list = s.json2List(timingTemp.getTempStr(), Float[].class);
        } else {
            list = null;
        }
        if (list == null) {
            list = new ArrayList<>();
            list.add(Float.valueOf(0.0f));
        }
        this.view.renderTodayTempList(list);
        showLast7DayAverageTemp(timingTempDaoProxy.getHistory(date, 7), date);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(m2.c cVar) {
        this.view = cVar;
    }
}
