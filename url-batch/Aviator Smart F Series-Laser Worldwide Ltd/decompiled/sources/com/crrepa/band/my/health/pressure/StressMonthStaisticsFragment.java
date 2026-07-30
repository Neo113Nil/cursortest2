package com.crrepa.band.my.health.pressure;

import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.m;
import k3.e;

/* loaded from: classes2.dex */
public class StressMonthStaisticsFragment extends BaseStressStatisticsFragment {
    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected int getBarMaxValue() {
        return 110;
    }

    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected int getCalendarOffsetField() {
        return 5;
    }

    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected int getChartBarCount() {
        return m.getMonthCountDay(getDate());
    }

    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected g getChartValueFormatter() {
        return new e(getDate());
    }

    @Override // com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment
    protected com.crrepa.band.my.health.pressure.presenter.b getStressStatisticsPresenter() {
        return new com.crrepa.band.my.health.pressure.presenter.e();
    }
}
