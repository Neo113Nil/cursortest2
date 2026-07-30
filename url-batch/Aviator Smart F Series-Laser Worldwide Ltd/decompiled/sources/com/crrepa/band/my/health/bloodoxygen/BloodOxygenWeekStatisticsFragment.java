package com.crrepa.band.my.health.bloodoxygen;

import com.crrepa.band.my.health.bloodoxygen.presenter.d;
import com.crrepa.band.my.health.bloodoxygen.presenter.h;
import com.github.mikephil.charting.formatter.g;
import k3.f;

/* loaded from: classes2.dex */
public class BloodOxygenWeekStatisticsFragment extends BaseBloodOxygenStatisticsFragment {
    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected int getBarMaxValue() {
        return 100;
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected d getBloodOxygenStatisticsPresenter() {
        return new h();
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected int getCalendarOffsetField() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected int getChartBarCount() {
        return 7;
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected g getChartValueFormatter() {
        return new f(getContext());
    }
}
