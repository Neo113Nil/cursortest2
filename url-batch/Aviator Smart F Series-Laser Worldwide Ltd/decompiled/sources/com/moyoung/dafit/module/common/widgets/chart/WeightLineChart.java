package com.moyoung.dafit.module.common.widgets.chart;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes4.dex */
public class WeightLineChart extends CrpLineChart {
    public WeightLineChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.moyoung.dafit.module.common.widgets.chart.renderer.c(this, this.mAnimator, this.mViewPortHandler);
    }

    public WeightLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeightLineChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
