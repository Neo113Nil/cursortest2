package com.crrepa.band.my.health.bodytemperature;

import com.crrepa.band.my.health.bodytemperature.presenter.d;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.m;
import k3.e;
import l2.c;

/* loaded from: classes2.dex */
public class TempMonthStaisticsFragment extends BaseTempStatisticsFragment {
    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected int getBarMaxValue() {
        return (int) c.getMaxTemp(false);
    }

    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected int getCalendarOffsetField() {
        return 5;
    }

    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected int getChartBarCount() {
        return m.getMonthCountDay(getDate());
    }

    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected g getChartValueFormatter() {
        return new e(getDate());
    }

    @Override // com.crrepa.band.my.health.bodytemperature.BaseTempStatisticsFragment
    protected d getStatisticsPresenter() {
        return new com.crrepa.band.my.health.bodytemperature.presenter.g();
    }
}
