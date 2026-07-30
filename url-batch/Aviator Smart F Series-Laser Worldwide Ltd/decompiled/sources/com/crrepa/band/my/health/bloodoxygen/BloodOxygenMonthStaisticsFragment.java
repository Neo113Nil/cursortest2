package com.crrepa.band.my.health.bloodoxygen;

import com.crrepa.band.my.health.bloodoxygen.presenter.d;
import com.crrepa.band.my.health.bloodoxygen.presenter.g;
import com.moyoung.dafit.module.common.utils.m;
import k3.e;

/* loaded from: classes2.dex */
public class BloodOxygenMonthStaisticsFragment extends BaseBloodOxygenStatisticsFragment {
    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected int getBarMaxValue() {
        return 100;
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected d getBloodOxygenStatisticsPresenter() {
        return new g();
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected int getCalendarOffsetField() {
        return 5;
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected int getChartBarCount() {
        return m.getMonthCountDay(getDate());
    }

    @Override // com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment
    protected com.github.mikephil.charting.formatter.g getChartValueFormatter() {
        return new e(getDate());
    }
}
