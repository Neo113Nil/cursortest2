package com.crrepa.band.my.health.bodytemperature.presenter;

import com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment;
import com.crrepa.band.my.health.bodytemperature.TempDayStatisticsFragment;
import com.crrepa.band.my.health.bodytemperature.TempMonthStaisticsFragment;
import com.crrepa.band.my.health.bodytemperature.TempWeekStatisticsFragment;
import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.proxy.TimingTempDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes2.dex */
public class b implements com.moyoung.dafit.module.common.baseui.f {
    private m2.b view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getLast7DaysAverageTemp(Date date) {
        float[] fArr = new float[7];
        for (TimingTemp timingTemp : new TimingTempDaoProxy().getHistory(date, 7)) {
            if (timingTemp != null) {
                int daySpace = m.getDaySpace(timingTemp.getDate(), date);
                if (daySpace < 0 || daySpace >= 7) {
                    break;
                } else {
                    fArr[6 - daySpace] = timingTemp.getAverage().floatValue();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 7; i8++) {
            arrayList.add(Float.valueOf(fArr[i8]));
        }
        this.view.renderLast7DaysAverageTemp(date, arrayList);
    }

    public void getStatisticsFragment(Date date) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TempDayStatisticsFragment.newInstance(date));
        arrayList.add(BaseTempStatisticsFragment.getInstance(new TempWeekStatisticsFragment(), date));
        arrayList.add(BaseTempStatisticsFragment.getInstance(new TempMonthStaisticsFragment(), date));
        this.view.renderStatisticsFragment(arrayList);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(m2.b bVar) {
        this.view = bVar;
    }
}
