package com.crrepa.band.my.health.steps;

import com.crrepa.band.my.health.steps.presenter.d;
import com.github.mikephil.charting.formatter.g;

/* loaded from: classes2.dex */
public class StepsDayStatisticsFragement extends BaseStepsStatisticsFragment {
    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getBarMaxValue() {
        return 200;
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getCalendarOffsetField() {
        return 0;
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected int getChartBarCount() {
        return 48;
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected g getChartValueFormatter() {
        return new k3.a();
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected com.crrepa.band.my.health.steps.presenter.b getPresenter() {
        return new d(20);
    }

    @Override // com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment
    protected boolean isRedisplaySteps() {
        return true;
    }
}
