package com.crrepa.band.my.health.sleep;

import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.m;

/* loaded from: classes2.dex */
public class SleepMonthStatisticsFragment extends BaseSleepStatisticsFragment {
    @Override // com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment
    protected int getCalendarOffsetField() {
        return 5;
    }

    @Override // com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment
    protected int getChartBarCount() {
        return m.getMonthCountDay(getDate());
    }

    @Override // com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment
    protected g getChartValueFormatter() {
        return new k3.e(getDate());
    }

    @Override // com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment
    protected com.crrepa.band.my.health.sleep.presenter.b getPresenter() {
        return new com.crrepa.band.my.health.sleep.presenter.e();
    }
}
