package com.crrepa.band.my.health.sleep;

import com.github.mikephil.charting.formatter.g;
import k3.f;

/* loaded from: classes2.dex */
public class SleepWeekStatisticsFragment extends BaseSleepStatisticsFragment {
    @Override // com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment
    protected int getCalendarOffsetField() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment
    protected int getChartBarCount() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment
    protected g getChartValueFormatter() {
        return new f(getContext());
    }

    @Override // com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment
    protected com.crrepa.band.my.health.sleep.presenter.b getPresenter() {
        return new com.crrepa.band.my.health.sleep.presenter.f();
    }
}
