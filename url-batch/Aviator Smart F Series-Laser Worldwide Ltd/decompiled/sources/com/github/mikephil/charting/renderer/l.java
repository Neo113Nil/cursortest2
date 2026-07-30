package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;

/* loaded from: classes3.dex */
public abstract class l extends c {
    private Path mHighlightLinePath;

    public l(com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.mHighlightLinePath = new Path();
    }

    protected void drawHighlightLines(Canvas canvas, float f8, float f9, v4.h hVar) {
        this.mHighlightPaint.setColor(hVar.getHighLightColor());
        this.mHighlightPaint.setStrokeWidth(hVar.getHighlightLineWidth());
        this.mHighlightPaint.setPathEffect(hVar.getDashPathEffectHighlight());
        if (hVar.isVerticalHighlightIndicatorEnabled()) {
            this.mHighlightLinePath.reset();
            this.mHighlightLinePath.moveTo(f8, this.mViewPortHandler.contentTop());
            this.mHighlightLinePath.lineTo(f8, this.mViewPortHandler.contentBottom());
            canvas.drawPath(this.mHighlightLinePath, this.mHighlightPaint);
        }
        if (hVar.isHorizontalHighlightIndicatorEnabled()) {
            this.mHighlightLinePath.reset();
            this.mHighlightLinePath.moveTo(this.mViewPortHandler.contentLeft(), f9);
            this.mHighlightLinePath.lineTo(this.mViewPortHandler.contentRight(), f9);
            canvas.drawPath(this.mHighlightLinePath, this.mHighlightPaint);
        }
    }
}
