package com.crrepa.band.my.health.pressure;

import com.github.mikephil.charting.formatter.g;
import k3.f;

/* loaded from: classes2.dex */
public class StressWeekStatisticsFragment extends BaseStressStatisticsFragment {
    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected int getBarMaxValue() {
        return 110;
    }

    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected int getCalendarOffsetField() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected int getChartBarCount() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected g getChartValueFormatter() {
        return new f(getContext());
    }

    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected com.crrepa.band.my.health.pressure.presenter.b getStressStatisticsPresenter() {
        return new com.crrepa.band.my.health.pressure.presenter.f();
    }
}
