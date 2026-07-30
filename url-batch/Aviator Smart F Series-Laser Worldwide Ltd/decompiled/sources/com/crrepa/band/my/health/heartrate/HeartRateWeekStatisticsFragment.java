package com.crrepa.band.my.health.heartrate;

import com.crrepa.band.my.health.heartrate.presenter.d;
import com.crrepa.band.my.health.heartrate.presenter.h;
import com.github.mikephil.charting.formatter.g;
import k3.f;

/* loaded from: classes2.dex */
public class HeartRateWeekStatisticsFragment extends BaseHeartRateStatisticsFragment {
    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected int getBarMaxValue() {
        return 210;
    }

    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected int getCalendarOffsetField() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected int getChartBarCount() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected g getChartValueFormatter() {
        return new f(getContext());
    }

    @Override // com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment
    protected d getHeartRateStatisticsPresenter() {
        return new h();
    }
}
