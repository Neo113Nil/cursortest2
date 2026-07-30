package com.crrepa.band.my.health.steps;

import com.github.mikephil.charting.formatter.g;
import k3.f;

/* loaded from: classes2.dex */
public class StepsWeekStatisticsFragment extends BaseStepsStatisticsFragment {
    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getBarMaxValue() {
        return 10000;
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getCalendarOffsetField() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getChartBarCount() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected g getChartValueFormatter() {
        return new f(getContext());
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected com.crrepa.band.my.health.steps.presenter.b getPresenter() {
        return new com.crrepa.band.my.health.steps.presenter.f(1000);
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected boolean isRedisplaySteps() {
        return false;
    }
}
