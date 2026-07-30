package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;

/* loaded from: classes3.dex */
public class s extends q {
    private RadarChart mChart;

    public s(com.github.mikephil.charting.utils.j jVar, XAxis xAxis, RadarChart radarChart) {
        super(jVar, xAxis, null);
        this.mChart = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            this.mXAxis.getLabelRotationAngle();
            com.github.mikephil.charting.utils.e.getInstance(0.5f, 0.25f);
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            this.mChart.getSliceAngle();
            this.mChart.getFactor();
            this.mChart.getCenterOffsets();
            com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
            cn.hutool.core.convert.impl.s.a(((com.github.mikephil.charting.data.o) this.mChart.getData()).getMaxEntryCountSet());
            throw null;
        }
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void renderLimitLines(Canvas canvas) {
    }
}
