package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.renderer.c;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class e extends l {
    private float[] mBodyBuffers;
    protected u4.d mChart;
    private float[] mCloseBuffers;
    private float[] mOpenBuffers;
    private float[] mRangeBuffers;
    private float[] mShadowBuffers;

    public e(u4.d dVar, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.mShadowBuffers = new float[8];
        this.mBodyBuffers = new float[4];
        this.mRangeBuffers = new float[4];
        this.mOpenBuffers = new float[4];
        this.mCloseBuffers = new float[4];
        this.mChart = dVar;
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawData(Canvas canvas) {
        Iterator<v4.e> it = this.mChart.getCandleData().getDataSets().iterator();
        if (it.hasNext()) {
            cn.hutool.core.convert.impl.s.a(it.next());
            throw null;
        }
    }

    protected void drawDataSet(Canvas canvas, v4.d dVar) {
        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(dVar.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        float i8 = dVar.i();
        boolean d8 = dVar.d();
        this.mXBounds.set(this.mChart, dVar);
        this.mRenderPaint.setStrokeWidth(dVar.g());
        int i9 = this.mXBounds.min;
        while (true) {
            c.a aVar = this.mXBounds;
            if (i9 > aVar.range + aVar.min) {
                return;
            }
            CandleEntry candleEntry = (CandleEntry) dVar.getEntryForIndex(i9);
            if (candleEntry != null) {
                float x7 = candleEntry.getX();
                float open = candleEntry.getOpen();
                float close = candleEntry.getClose();
                float high = candleEntry.getHigh();
                float low = candleEntry.getLow();
                if (d8) {
                    float[] fArr = this.mShadowBuffers;
                    fArr[0] = x7;
                    fArr[2] = x7;
                    fArr[4] = x7;
                    fArr[6] = x7;
                    if (open > close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = open * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = close * phaseY;
                    } else if (open < close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = close * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = open * phaseY;
                    } else {
                        fArr[1] = high * phaseY;
                        float f8 = open * phaseY;
                        fArr[3] = f8;
                        fArr[5] = low * phaseY;
                        fArr[7] = f8;
                    }
                    transformer.pointValuesToPixel(fArr);
                    if (!dVar.b()) {
                        this.mRenderPaint.setColor(dVar.l() == 1122867 ? dVar.getColor(i9) : dVar.l());
                    } else if (open > close) {
                        this.mRenderPaint.setColor(dVar.m() == 1122867 ? dVar.getColor(i9) : dVar.m());
                    } else if (open < close) {
                        this.mRenderPaint.setColor(dVar.c() == 1122867 ? dVar.getColor(i9) : dVar.c());
                    } else {
                        this.mRenderPaint.setColor(dVar.e() == 1122867 ? dVar.getColor(i9) : dVar.e());
                    }
                    this.mRenderPaint.setStyle(Paint.Style.STROKE);
                    canvas.drawLines(this.mShadowBuffers, this.mRenderPaint);
                    float[] fArr2 = this.mBodyBuffers;
                    fArr2[0] = (x7 - 0.5f) + i8;
                    fArr2[1] = close * phaseY;
                    fArr2[2] = (x7 + 0.5f) - i8;
                    fArr2[3] = open * phaseY;
                    transformer.pointValuesToPixel(fArr2);
                    if (open > close) {
                        if (dVar.m() == 1122867) {
                            this.mRenderPaint.setColor(dVar.getColor(i9));
                        } else {
                            this.mRenderPaint.setColor(dVar.m());
                        }
                        this.mRenderPaint.setStyle(dVar.h());
                        float[] fArr3 = this.mBodyBuffers;
                        canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.mRenderPaint);
                    } else if (open < close) {
                        if (dVar.c() == 1122867) {
                            this.mRenderPaint.setColor(dVar.getColor(i9));
                        } else {
                            this.mRenderPaint.setColor(dVar.c());
                        }
                        this.mRenderPaint.setStyle(dVar.j());
                        float[] fArr4 = this.mBodyBuffers;
                        canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.mRenderPaint);
                    } else {
                        if (dVar.e() == 1122867) {
                            this.mRenderPaint.setColor(dVar.getColor(i9));
                        } else {
                            this.mRenderPaint.setColor(dVar.e());
                        }
                        float[] fArr5 = this.mBodyBuffers;
                        canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.mRenderPaint);
                    }
                } else {
                    float[] fArr6 = this.mRangeBuffers;
                    fArr6[0] = x7;
                    fArr6[1] = high * phaseY;
                    fArr6[2] = x7;
                    fArr6[3] = low * phaseY;
                    float[] fArr7 = this.mOpenBuffers;
                    fArr7[0] = (x7 - 0.5f) + i8;
                    float f9 = open * phaseY;
                    fArr7[1] = f9;
                    fArr7[2] = x7;
                    fArr7[3] = f9;
                    float[] fArr8 = this.mCloseBuffers;
                    fArr8[0] = (0.5f + x7) - i8;
                    float f10 = close * phaseY;
                    fArr8[1] = f10;
                    fArr8[2] = x7;
                    fArr8[3] = f10;
                    transformer.pointValuesToPixel(fArr6);
                    transformer.pointValuesToPixel(this.mOpenBuffers);
                    transformer.pointValuesToPixel(this.mCloseBuffers);
                    this.mRenderPaint.setColor(open > close ? dVar.m() == 1122867 ? dVar.getColor(i9) : dVar.m() : open < close ? dVar.c() == 1122867 ? dVar.getColor(i9) : dVar.c() : dVar.e() == 1122867 ? dVar.getColor(i9) : dVar.e());
                    float[] fArr9 = this.mRangeBuffers;
                    canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.mRenderPaint);
                    float[] fArr10 = this.mOpenBuffers;
                    canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.mRenderPaint);
                    float[] fArr11 = this.mCloseBuffers;
                    canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.mRenderPaint);
                }
            }
            i9++;
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawExtras(Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        com.github.mikephil.charting.data.h candleData = this.mChart.getCandleData();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            cn.hutool.core.convert.impl.s.a(candleData.getDataSetByIndex(dVar.getDataSetIndex()));
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        this.mValuePaint.setColor(i8);
        canvas.drawText(str, f8, f9, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<v4.e> dataSets = this.mChart.getCandleData().getDataSets();
            for (int i8 = 0; i8 < dataSets.size(); i8++) {
                cn.hutool.core.convert.impl.s.a(dataSets.get(i8));
                if (shouldDrawValues(null)) {
                    throw null;
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void initBuffers() {
    }
}
