package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.h;
import com.github.mikephil.charting.renderer.e;
import u4.d;

/* loaded from: classes3.dex */
public class CandleStickChart extends BarLineChartBase<h> implements d {
    public CandleStickChart(Context context) {
        super(context);
    }

    @Override // u4.d
    public h getCandleData() {
        return (h) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new e(this, this.mAnimator, this.mViewPortHandler);
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
