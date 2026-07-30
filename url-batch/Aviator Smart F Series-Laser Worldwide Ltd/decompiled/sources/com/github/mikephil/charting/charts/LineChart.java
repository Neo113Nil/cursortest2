package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.renderer.j;
import u4.g;

/* loaded from: classes3.dex */
public class LineChart extends BarLineChartBase<k> implements g {
    public LineChart(Context context) {
        super(context);
    }

    @Override // u4.g
    public k getLineData() {
        return (k) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new j(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.github.mikephil.charting.renderer.g gVar = this.mRenderer;
        if (gVar != null && (gVar instanceof j)) {
            ((j) gVar).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
