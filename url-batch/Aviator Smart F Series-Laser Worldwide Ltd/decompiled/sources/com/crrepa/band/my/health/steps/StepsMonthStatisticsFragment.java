package com.crrepa.band.my.health.steps;

import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.m;
import k3.e;

/* loaded from: classes2.dex */
public class StepsMonthStatisticsFragment extends BaseStepsStatisticsFragment {
    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getBarMaxValue() {
        return 10000;
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getCalendarOffsetField() {
        return 5;
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getChartBarCount() {
        return m.getMonthCountDay(getDate());
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected g getChartValueFormatter() {
        return new e(getDate());
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected com.crrepa.band.my.health.steps.presenter.b getPresenter() {
        return new com.crrepa.band.my.health.steps.presenter.e(1000);
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected boolean isRedisplaySteps() {
        return false;
    }
}
