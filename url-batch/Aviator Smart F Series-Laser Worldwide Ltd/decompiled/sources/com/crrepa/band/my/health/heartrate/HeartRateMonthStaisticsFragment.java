package com.crrepa.band.my.health.heartrate;

import com.crrepa.band.my.health.heartrate.presenter.d;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.m;
import k3.e;

/* loaded from: classes2.dex */
public class HeartRateMonthStaisticsFragment extends BaseHeartRateStatisticsFragment {
    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected int getBarMaxValue() {
        return 210;
    }

    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected int getCalendarOffsetField() {
        return 5;
    }

    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected int getChartBarCount() {
        return m.getMonthCountDay(getDate());
    }

    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected g getChartValueFormatter() {
        return new e(getDate());
    }

    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected d getHeartRateStatisticsPresenter() {
        return new com.crrepa.band.my.health.heartrate.presenter.g();
    }
}
