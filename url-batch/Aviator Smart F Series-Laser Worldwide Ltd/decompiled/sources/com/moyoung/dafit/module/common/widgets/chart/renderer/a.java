package com.moyoung.dafit.module.common.widgets.chart.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.j;

/* loaded from: classes4.dex */
public class a extends com.github.mikephil.charting.renderer.b {
    public a(u4.a aVar, com.github.mikephil.charting.animation.a aVar2, j jVar) {
        super(aVar, aVar2, jVar);
    }

    @Override // com.github.mikephil.charting.renderer.b, com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, d[] dVarArr) {
        com.github.mikephil.charting.data.a barData = this.mChart.getBarData();
        for (d dVar : dVarArr) {
            v4.a aVar = (v4.a) barData.getDataSetByIndex(dVar.getDataSetIndex());
            if (aVar != null && aVar.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) aVar.getEntryForXValue(dVar.getX(), dVar.getY());
                if (isInBoundsX(barEntry, aVar)) {
                    g transformer = this.mChart.getTransformer(aVar.getAxisDependency());
                    this.mHighlightPaint.setColor(aVar.getHighLightColor());
                    this.mHighlightPaint.setAlpha(aVar.getHighLightAlpha());
                    if (dVar.getStackIndex() >= 0) {
                        barEntry.isStacked();
                    }
                    prepareBarHighlight(barEntry.getX(), barEntry.getY(), 0.0f, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(dVar, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }
}
