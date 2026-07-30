package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarEntry;

/* loaded from: classes3.dex */
public class n extends k {
    protected RadarChart mChart;
    protected Path mDrawDataSetSurfacePathBuffer;
    protected Path mDrawHighlightCirclePathBuffer;
    protected Paint mHighlightCirclePaint;
    protected Paint mWebPaint;

    public n(RadarChart radarChart, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.mDrawDataSetSurfacePathBuffer = new Path();
        this.mDrawHighlightCirclePathBuffer = new Path();
        this.mChart = radarChart;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.mWebPaint = paint2;
        paint2.setStyle(style);
        this.mHighlightCirclePaint = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void drawData(Canvas canvas) {
        cn.hutool.core.convert.impl.s.a(((com.github.mikephil.charting.data.o) this.mChart.getData()).getMaxEntryCountSet());
        throw null;
    }

    protected void drawDataSet(Canvas canvas, v4.j jVar, int i8) {
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        com.github.mikephil.charting.utils.e centerOffsets = this.mChart.getCenterOffsets();
        com.github.mikephil.charting.utils.e eVar = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        Path path = this.mDrawDataSetSurfacePathBuffer;
        path.reset();
        boolean z7 = false;
        for (int i9 = 0; i9 < jVar.getEntryCount(); i9++) {
            this.mRenderPaint.setColor(jVar.getColor(i9));
            com.github.mikephil.charting.utils.i.getPosition(centerOffsets, (((RadarEntry) jVar.getEntryForIndex(i9)).getY() - this.mChart.getYChartMin()) * factor * phaseY, (i9 * sliceAngle * phaseX) + this.mChart.getRotationAngle(), eVar);
            if (!Float.isNaN(eVar.f14114x)) {
                if (z7) {
                    path.lineTo(eVar.f14114x, eVar.f14115y);
                } else {
                    path.moveTo(eVar.f14114x, eVar.f14115y);
                    z7 = true;
                }
            }
        }
        if (jVar.getEntryCount() > i8) {
            path.lineTo(centerOffsets.f14114x, centerOffsets.f14115y);
        }
        path.close();
        if (jVar.isDrawFilledEnabled()) {
            Drawable fillDrawable = jVar.getFillDrawable();
            if (fillDrawable != null) {
                drawFilledPath(canvas, path, fillDrawable);
            } else {
                drawFilledPath(canvas, path, jVar.getFillColor(), jVar.getFillAlpha());
            }
        }
        this.mRenderPaint.setStrokeWidth(jVar.getLineWidth());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        if (!jVar.isDrawFilledEnabled() || jVar.getFillAlpha() < 255) {
            canvas.drawPath(path, this.mRenderPaint);
        }
        com.github.mikephil.charting.utils.e.recycleInstance(centerOffsets);
        com.github.mikephil.charting.utils.e.recycleInstance(eVar);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawExtras(Canvas canvas) {
        drawWeb(canvas);
    }

    public void drawHighlightCircle(Canvas canvas, com.github.mikephil.charting.utils.e eVar, float f8, float f9, int i8, int i9, float f10) {
        canvas.save();
        float convertDpToPixel = com.github.mikephil.charting.utils.i.convertDpToPixel(f9);
        float convertDpToPixel2 = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
        if (i8 != 1122867) {
            Path path = this.mDrawHighlightCirclePathBuffer;
            path.reset();
            path.addCircle(eVar.f14114x, eVar.f14115y, convertDpToPixel, Path.Direction.CW);
            if (convertDpToPixel2 > 0.0f) {
                path.addCircle(eVar.f14114x, eVar.f14115y, convertDpToPixel2, Path.Direction.CCW);
            }
            this.mHighlightCirclePaint.setColor(i8);
            this.mHighlightCirclePaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.mHighlightCirclePaint);
        }
        if (i9 != 1122867) {
            this.mHighlightCirclePaint.setColor(i9);
            this.mHighlightCirclePaint.setStyle(Paint.Style.STROKE);
            this.mHighlightCirclePaint.setStrokeWidth(com.github.mikephil.charting.utils.i.convertDpToPixel(f10));
            canvas.drawCircle(eVar.f14114x, eVar.f14115y, convertDpToPixel, this.mHighlightCirclePaint);
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        this.mChart.getSliceAngle();
        this.mChart.getFactor();
        com.github.mikephil.charting.utils.e centerOffsets = this.mChart.getCenterOffsets();
        com.github.mikephil.charting.utils.e eVar = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        com.github.mikephil.charting.data.o oVar = (com.github.mikephil.charting.data.o) this.mChart.getData();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            cn.hutool.core.convert.impl.s.a(oVar.getDataSetByIndex(dVar.getDataSetIndex()));
        }
        com.github.mikephil.charting.utils.e.recycleInstance(centerOffsets);
        com.github.mikephil.charting.utils.e.recycleInstance(eVar);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        this.mValuePaint.setColor(i8);
        canvas.drawText(str, f8, f9, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        this.mAnimator.getPhaseX();
        this.mAnimator.getPhaseY();
        this.mChart.getSliceAngle();
        this.mChart.getFactor();
        com.github.mikephil.charting.utils.e centerOffsets = this.mChart.getCenterOffsets();
        com.github.mikephil.charting.utils.e eVar = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        com.github.mikephil.charting.utils.e eVar2 = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        com.github.mikephil.charting.utils.i.convertDpToPixel(5.0f);
        for (int i8 = 0; i8 < ((com.github.mikephil.charting.data.o) this.mChart.getData()).getDataSetCount(); i8++) {
            cn.hutool.core.convert.impl.s.a(((com.github.mikephil.charting.data.o) this.mChart.getData()).getDataSetByIndex(i8));
            if (shouldDrawValues(null)) {
                applyValueTextStyle(null);
                throw null;
            }
        }
        com.github.mikephil.charting.utils.e.recycleInstance(centerOffsets);
        com.github.mikephil.charting.utils.e.recycleInstance(eVar);
        com.github.mikephil.charting.utils.e.recycleInstance(eVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawWeb(Canvas canvas) {
        this.mChart.getSliceAngle();
        this.mChart.getFactor();
        this.mChart.getRotationAngle();
        this.mChart.getCenterOffsets();
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidth());
        this.mWebPaint.setColor(this.mChart.getWebColor());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        this.mChart.getSkipWebLineCount();
        cn.hutool.core.convert.impl.s.a(((com.github.mikephil.charting.data.o) this.mChart.getData()).getMaxEntryCountSet());
        throw null;
    }

    public Paint getWebPaint() {
        return this.mWebPaint;
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void initBuffers() {
    }
}
