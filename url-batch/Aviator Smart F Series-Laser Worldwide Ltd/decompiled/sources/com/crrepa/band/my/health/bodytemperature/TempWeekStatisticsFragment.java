package com.crrepa.band.my.health.bodytemperature;

import com.crrepa.band.my.health.bodytemperature.presenter.d;
import com.crrepa.band.my.health.bodytemperature.presenter.h;
import com.github.mikephil.charting.formatter.g;
import k3.f;
import l2.c;

/* loaded from: classes2.dex */
public class TempWeekStatisticsFragment extends BaseTempStatisticsFragment {
    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected int getBarMaxValue() {
        return (int) c.getMaxTemp(false);
    }

    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected int getCalendarOffsetField() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected int getChartBarCount() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected g getChartValueFormatter() {
        return new f(getContext());
    }

    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected d getStatisticsPresenter() {
        return new h();
    }
}
