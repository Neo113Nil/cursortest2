package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.renderer.c;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class d extends c {
    private float[] _hsvBuffer;
    protected u4.c mChart;
    private float[] pointBuffer;
    private float[] sizeBuffer;

    public d(u4.c cVar, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.sizeBuffer = new float[4];
        this.pointBuffer = new float[2];
        this._hsvBuffer = new float[3];
        this.mChart = cVar;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(com.github.mikephil.charting.utils.i.convertDpToPixel(1.5f));
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawData(Canvas canvas) {
        Iterator<v4.e> it = this.mChart.getBubbleData().getDataSets().iterator();
        if (it.hasNext()) {
            cn.hutool.core.convert.impl.s.a(it.next());
            throw null;
        }
    }

    protected void drawDataSet(Canvas canvas, v4.c cVar) {
        if (cVar.getEntryCount() < 1) {
            return;
        }
        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(cVar.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mXBounds.set(this.mChart, cVar);
        float[] fArr = this.sizeBuffer;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        transformer.pointValuesToPixel(fArr);
        boolean f8 = cVar.f();
        float[] fArr2 = this.sizeBuffer;
        float min = Math.min(Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), Math.abs(fArr2[2] - fArr2[0]));
        int i8 = this.mXBounds.min;
        while (true) {
            c.a aVar = this.mXBounds;
            if (i8 > aVar.range + aVar.min) {
                return;
            }
            BubbleEntry bubbleEntry = (BubbleEntry) cVar.getEntryForIndex(i8);
            this.pointBuffer[0] = bubbleEntry.getX();
            this.pointBuffer[1] = bubbleEntry.getY() * phaseY;
            transformer.pointValuesToPixel(this.pointBuffer);
            float shapeSize = getShapeSize(bubbleEntry.getSize(), cVar.a(), min, f8) / 2.0f;
            if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[0] + shapeSize)) {
                if (!this.mViewPortHandler.isInBoundsRight(this.pointBuffer[0] - shapeSize)) {
                    return;
                }
                this.mRenderPaint.setColor(cVar.getColor((int) bubbleEntry.getX()));
                float[] fArr3 = this.pointBuffer;
                canvas.drawCircle(fArr3[0], fArr3[1], shapeSize, this.mRenderPaint);
            }
            i8++;
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawExtras(Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        com.github.mikephil.charting.data.g bubbleData = this.mChart.getBubbleData();
        this.mAnimator.getPhaseY();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            cn.hutool.core.convert.impl.s.a(bubbleData.getDataSetByIndex(dVar.getDataSetIndex()));
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        this.mValuePaint.setColor(i8);
        canvas.drawText(str, f8, f9, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        com.github.mikephil.charting.data.g bubbleData = this.mChart.getBubbleData();
        if (bubbleData != null && isDrawingValuesAllowed(this.mChart)) {
            List<v4.e> dataSets = bubbleData.getDataSets();
            com.github.mikephil.charting.utils.i.calcTextHeight(this.mValuePaint, "1");
            for (int i8 = 0; i8 < dataSets.size(); i8++) {
                cn.hutool.core.convert.impl.s.a(dataSets.get(i8));
                if (shouldDrawValues(null)) {
                    throw null;
                }
            }
        }
    }

    protected float getShapeSize(float f8, float f9, float f10, boolean z7) {
        if (z7) {
            f8 = f9 == 0.0f ? 1.0f : (float) Math.sqrt(f8 / f9);
        }
        return f10 * f8;
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void initBuffers() {
    }
}
