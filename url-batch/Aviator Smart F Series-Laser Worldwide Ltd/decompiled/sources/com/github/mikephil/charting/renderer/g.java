package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public abstract class g extends o {
    protected com.github.mikephil.charting.animation.a mAnimator;
    protected Paint mDrawPaint;
    protected Paint mHighlightPaint;
    protected Paint mRenderPaint;
    protected Paint mValuePaint;

    public g(com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(jVar);
        this.mAnimator = aVar;
        Paint paint = new Paint(1);
        this.mRenderPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mDrawPaint = new Paint(4);
        Paint paint2 = new Paint(1);
        this.mValuePaint = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
        this.mValuePaint.setTextSize(com.github.mikephil.charting.utils.i.convertDpToPixel(9.0f));
        Paint paint3 = new Paint(1);
        this.mHighlightPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(Color.rgb(255, 187, 115));
    }

    protected void applyValueTextStyle(v4.e eVar) {
        this.mValuePaint.setTypeface(eVar.getValueTypeface());
        this.mValuePaint.setTextSize(eVar.getValueTextSize());
    }

    public abstract void drawData(Canvas canvas);

    public abstract void drawExtras(Canvas canvas);

    public abstract void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr);

    public abstract void drawValue(Canvas canvas, String str, float f8, float f9, int i8);

    public abstract void drawValues(Canvas canvas);

    public Paint getPaintHighlight() {
        return this.mHighlightPaint;
    }

    public Paint getPaintRender() {
        return this.mRenderPaint;
    }

    public Paint getPaintValues() {
        return this.mValuePaint;
    }

    public abstract void initBuffers();

    protected boolean isDrawingValuesAllowed(u4.e eVar) {
        return ((float) eVar.getData().getEntryCount()) < ((float) eVar.getMaxVisibleCount()) * this.mViewPortHandler.getScaleX();
    }
}
