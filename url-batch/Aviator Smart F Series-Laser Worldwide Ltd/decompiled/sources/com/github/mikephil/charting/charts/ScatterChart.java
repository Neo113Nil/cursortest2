package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.p;
import u4.h;

/* loaded from: classes3.dex */
public class ScatterChart extends BarLineChartBase<p> implements h {
    public ScatterChart(Context context) {
        super(context);
    }

    @Override // u4.h
    public p getScatterData() {
        return (p) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.github.mikephil.charting.renderer.p(this, this.mAnimator, this.mViewPortHandler);
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
