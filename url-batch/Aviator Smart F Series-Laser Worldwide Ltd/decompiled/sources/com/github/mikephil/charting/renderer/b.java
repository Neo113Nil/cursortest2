package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends c {
    protected Paint mBarBorderPaint;
    protected com.github.mikephil.charting.buffer.b[] mBarBuffers;
    protected RectF mBarRect;
    private RectF mBarShadowRectBuffer;
    protected u4.a mChart;
    protected Paint mShadowPaint;

    public b(u4.a aVar, com.github.mikephil.charting.animation.a aVar2, com.github.mikephil.charting.utils.j jVar) {
        super(aVar2, jVar);
        this.mBarRect = new RectF();
        this.mBarShadowRectBuffer = new RectF();
        this.mChart = aVar;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.mShadowPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.mBarBorderPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawData(Canvas canvas) {
        com.github.mikephil.charting.data.a barData = this.mChart.getBarData();
        for (int i8 = 0; i8 < barData.getDataSetCount(); i8++) {
            v4.a aVar = (v4.a) barData.getDataSetByIndex(i8);
            if (aVar.isVisible()) {
                drawDataSet(canvas, aVar, i8);
            }
        }
    }

    protected void drawDataSet(Canvas canvas, v4.a aVar, int i8) {
        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(aVar.getAxisDependency());
        this.mBarBorderPaint.setColor(aVar.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(com.github.mikephil.charting.utils.i.convertDpToPixel(aVar.getBarBorderWidth()));
        boolean z7 = aVar.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(aVar.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int min = Math.min((int) Math.ceil(aVar.getEntryCount() * phaseX), aVar.getEntryCount());
            for (int i9 = 0; i9 < min; i9++) {
                float x7 = ((BarEntry) aVar.getEntryForIndex(i9)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.left = x7 - barWidth;
                rectF.right = x7 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        com.github.mikephil.charting.buffer.b bVar = this.mBarBuffers[i8];
        bVar.setPhases(phaseX, phaseY);
        bVar.setDataSet(i8);
        bVar.setInverted(this.mChart.isInverted(aVar.getAxisDependency()));
        bVar.setBarWidth(this.mChart.getBarData().getBarWidth());
        bVar.feed(aVar);
        transformer.pointValuesToPixel(bVar.buffer);
        boolean z8 = aVar.getColors().size() == 1;
        if (z8) {
            this.mRenderPaint.setColor(aVar.getColor());
        }
        for (int i10 = 0; i10 < bVar.size(); i10 += 4) {
            int i11 = i10 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(bVar.buffer[i11])) {
                if (!this.mViewPortHandler.isInBoundsRight(bVar.buffer[i10])) {
                    return;
                }
                if (!z8) {
                    this.mRenderPaint.setColor(aVar.getColor(i10 / 4));
                }
                if (aVar.getGradientColor() != null) {
                    w4.a gradientColor = aVar.getGradientColor();
                    Paint paint = this.mRenderPaint;
                    float[] fArr = bVar.buffer;
                    float f8 = fArr[i10];
                    paint.setShader(new LinearGradient(f8, fArr[i10 + 3], f8, fArr[i10 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                }
                if (aVar.getGradientColors() != null) {
                    Paint paint2 = this.mRenderPaint;
                    float[] fArr2 = bVar.buffer;
                    float f9 = fArr2[i10];
                    float f10 = fArr2[i10 + 3];
                    float f11 = fArr2[i10 + 1];
                    int i12 = i10 / 4;
                    paint2.setShader(new LinearGradient(f9, f10, f9, f11, aVar.getGradientColor(i12).getStartColor(), aVar.getGradientColor(i12).getEndColor(), Shader.TileMode.MIRROR));
                }
                float[] fArr3 = bVar.buffer;
                int i13 = i10 + 1;
                int i14 = i10 + 3;
                canvas.drawRect(fArr3[i10], fArr3[i13], fArr3[i11], fArr3[i14], this.mRenderPaint);
                if (z7) {
                    float[] fArr4 = bVar.buffer;
                    canvas.drawRect(fArr4[i10], fArr4[i13], fArr4[i11], fArr4[i14], this.mBarBorderPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawExtras(Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        float y7;
        float f8;
        com.github.mikephil.charting.data.a barData = this.mChart.getBarData();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            v4.a aVar = (v4.a) barData.getDataSetByIndex(dVar.getDataSetIndex());
            if (aVar != null && aVar.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) aVar.getEntryForXValue(dVar.getX(), dVar.getY());
                if (isInBoundsX(barEntry, aVar)) {
                    com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(aVar.getAxisDependency());
                    this.mHighlightPaint.setColor(aVar.getHighLightColor());
                    this.mHighlightPaint.setAlpha(aVar.getHighLightAlpha());
                    if (dVar.getStackIndex() < 0 || !barEntry.isStacked()) {
                        y7 = barEntry.getY();
                        f8 = 0.0f;
                    } else if (this.mChart.isHighlightFullBarEnabled()) {
                        float positiveSum = barEntry.getPositiveSum();
                        f8 = -barEntry.getNegativeSum();
                        y7 = positiveSum;
                    } else {
                        com.github.mikephil.charting.highlight.j jVar = barEntry.getRanges()[dVar.getStackIndex()];
                        y7 = jVar.from;
                        f8 = jVar.to;
                    }
                    prepareBarHighlight(barEntry.getX(), y7, f8, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(dVar, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        this.mValuePaint.setColor(i8);
        canvas.drawText(str, f8, f9, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        List<v4.e> list;
        com.github.mikephil.charting.utils.e eVar;
        int i8;
        float f8;
        boolean z7;
        float[] fArr;
        com.github.mikephil.charting.utils.g gVar;
        int i9;
        float f9;
        int i10;
        BarEntry barEntry;
        float[] fArr2;
        float f10;
        float f11;
        float f12;
        BarEntry barEntry2;
        float f13;
        boolean z8;
        int i11;
        com.github.mikephil.charting.formatter.g gVar2;
        List<v4.e> list2;
        com.github.mikephil.charting.utils.e eVar2;
        BarEntry barEntry3;
        float f14;
        if (isDrawingValuesAllowed(this.mChart)) {
            List<v4.e> dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = com.github.mikephil.charting.utils.i.convertDpToPixel(4.5f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i12 = 0;
            while (i12 < this.mChart.getBarData().getDataSetCount()) {
                v4.a aVar = (v4.a) dataSets.get(i12);
                if (shouldDrawValues(aVar)) {
                    applyValueTextStyle(aVar);
                    boolean isInverted = this.mChart.isInverted(aVar.getAxisDependency());
                    float calcTextHeight = com.github.mikephil.charting.utils.i.calcTextHeight(this.mValuePaint, "8");
                    float f15 = isDrawValueAboveBarEnabled ? -convertDpToPixel : calcTextHeight + convertDpToPixel;
                    float f16 = isDrawValueAboveBarEnabled ? calcTextHeight + convertDpToPixel : -convertDpToPixel;
                    if (isInverted) {
                        f15 = (-f15) - calcTextHeight;
                        f16 = (-f16) - calcTextHeight;
                    }
                    float f17 = f15;
                    float f18 = f16;
                    com.github.mikephil.charting.buffer.b bVar = this.mBarBuffers[i12];
                    float phaseY = this.mAnimator.getPhaseY();
                    com.github.mikephil.charting.formatter.g valueFormatter = aVar.getValueFormatter();
                    com.github.mikephil.charting.utils.e eVar3 = com.github.mikephil.charting.utils.e.getInstance(aVar.getIconsOffset());
                    eVar3.f14114x = com.github.mikephil.charting.utils.i.convertDpToPixel(eVar3.f14114x);
                    eVar3.f14115y = com.github.mikephil.charting.utils.i.convertDpToPixel(eVar3.f14115y);
                    if (aVar.isStacked()) {
                        list = dataSets;
                        eVar = eVar3;
                        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(aVar.getAxisDependency());
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < aVar.getEntryCount() * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry4 = (BarEntry) aVar.getEntryForIndex(i13);
                            float[] yVals = barEntry4.getYVals();
                            float[] fArr3 = bVar.buffer;
                            float f19 = (fArr3[i14] + fArr3[i14 + 2]) / 2.0f;
                            int valueTextColor = aVar.getValueTextColor(i13);
                            if (yVals != null) {
                                BarEntry barEntry5 = barEntry4;
                                i8 = i13;
                                f8 = convertDpToPixel;
                                z7 = isDrawValueAboveBarEnabled;
                                fArr = yVals;
                                gVar = transformer;
                                float f20 = f19;
                                int length = fArr.length * 2;
                                float[] fArr4 = new float[length];
                                float f21 = -barEntry5.getNegativeSum();
                                int i15 = 0;
                                int i16 = 0;
                                float f22 = 0.0f;
                                while (i15 < length) {
                                    float f23 = fArr[i16];
                                    if (f23 == 0.0f && (f22 == 0.0f || f21 == 0.0f)) {
                                        float f24 = f21;
                                        f21 = f23;
                                        f11 = f24;
                                    } else if (f23 >= 0.0f) {
                                        f22 += f23;
                                        f11 = f21;
                                        f21 = f22;
                                    } else {
                                        f11 = f21 - f23;
                                    }
                                    fArr4[i15 + 1] = f21 * phaseY;
                                    i15 += 2;
                                    i16++;
                                    f21 = f11;
                                }
                                gVar.pointValuesToPixel(fArr4);
                                int i17 = 0;
                                while (i17 < length) {
                                    float f25 = fArr[i17 / 2];
                                    float f26 = fArr4[i17 + 1] + (((f25 > 0.0f ? 1 : (f25 == 0.0f ? 0 : -1)) == 0 && (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1)) == 0 && (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1)) > 0) || (f25 > 0.0f ? 1 : (f25 == 0.0f ? 0 : -1)) < 0 ? f18 : f17);
                                    int i18 = i17;
                                    if (!this.mViewPortHandler.isInBoundsRight(f20)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsY(f26) && this.mViewPortHandler.isInBoundsLeft(f20)) {
                                        if (aVar.isDrawValuesEnabled()) {
                                            BarEntry barEntry6 = barEntry5;
                                            f10 = f26;
                                            i10 = i18;
                                            barEntry = barEntry6;
                                            fArr2 = fArr4;
                                            i9 = length;
                                            f9 = f20;
                                            drawValue(canvas, valueFormatter.getBarStackedLabel(f25, barEntry6), f20, f10, valueTextColor);
                                        } else {
                                            f10 = f26;
                                            i9 = length;
                                            f9 = f20;
                                            i10 = i18;
                                            barEntry = barEntry5;
                                            fArr2 = fArr4;
                                        }
                                        if (barEntry.getIcon() != null && aVar.isDrawIconsEnabled()) {
                                            Drawable icon = barEntry.getIcon();
                                            com.github.mikephil.charting.utils.i.drawImage(canvas, icon, (int) (f9 + eVar.f14114x), (int) (f10 + eVar.f14115y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                        }
                                    } else {
                                        i9 = length;
                                        f9 = f20;
                                        i10 = i18;
                                        barEntry = barEntry5;
                                        fArr2 = fArr4;
                                    }
                                    i17 = i10 + 2;
                                    fArr4 = fArr2;
                                    barEntry5 = barEntry;
                                    length = i9;
                                    f20 = f9;
                                }
                            } else {
                                if (!this.mViewPortHandler.isInBoundsRight(f19)) {
                                    break;
                                }
                                int i19 = i14 + 1;
                                if (this.mViewPortHandler.isInBoundsY(bVar.buffer[i19]) && this.mViewPortHandler.isInBoundsLeft(f19)) {
                                    if (aVar.isDrawValuesEnabled()) {
                                        f12 = f19;
                                        f8 = convertDpToPixel;
                                        fArr = yVals;
                                        barEntry2 = barEntry4;
                                        i8 = i13;
                                        z7 = isDrawValueAboveBarEnabled;
                                        gVar = transformer;
                                        drawValue(canvas, valueFormatter.getBarLabel(barEntry4), f12, bVar.buffer[i19] + (barEntry4.getY() >= 0.0f ? f17 : f18), valueTextColor);
                                    } else {
                                        f12 = f19;
                                        i8 = i13;
                                        f8 = convertDpToPixel;
                                        z7 = isDrawValueAboveBarEnabled;
                                        fArr = yVals;
                                        barEntry2 = barEntry4;
                                        gVar = transformer;
                                    }
                                    if (barEntry2.getIcon() != null && aVar.isDrawIconsEnabled()) {
                                        Drawable icon2 = barEntry2.getIcon();
                                        com.github.mikephil.charting.utils.i.drawImage(canvas, icon2, (int) (eVar.f14114x + f12), (int) (bVar.buffer[i19] + (barEntry2.getY() >= 0.0f ? f17 : f18) + eVar.f14115y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                    }
                                } else {
                                    transformer = transformer;
                                    isDrawValueAboveBarEnabled = isDrawValueAboveBarEnabled;
                                    convertDpToPixel = convertDpToPixel;
                                    i13 = i13;
                                }
                            }
                            i14 = fArr == null ? i14 + 4 : i14 + (fArr.length * 4);
                            i13 = i8 + 1;
                            transformer = gVar;
                            isDrawValueAboveBarEnabled = z7;
                            convertDpToPixel = f8;
                        }
                    } else {
                        int i20 = 0;
                        while (i20 < bVar.buffer.length * this.mAnimator.getPhaseX()) {
                            float[] fArr5 = bVar.buffer;
                            float f27 = (fArr5[i20] + fArr5[i20 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f27)) {
                                break;
                            }
                            int i21 = i20 + 1;
                            if (this.mViewPortHandler.isInBoundsY(bVar.buffer[i21]) && this.mViewPortHandler.isInBoundsLeft(f27)) {
                                int i22 = i20 / 4;
                                BarEntry barEntry7 = (BarEntry) aVar.getEntryForIndex(i22);
                                float y7 = barEntry7.getY();
                                if (aVar.isDrawValuesEnabled()) {
                                    String barLabel = valueFormatter.getBarLabel(barEntry7);
                                    float[] fArr6 = bVar.buffer;
                                    barEntry3 = barEntry7;
                                    f14 = f27;
                                    i11 = i20;
                                    list2 = dataSets;
                                    eVar2 = eVar3;
                                    float f28 = y7 >= 0.0f ? fArr6[i21] + f17 : fArr6[i20 + 3] + f18;
                                    gVar2 = valueFormatter;
                                    drawValue(canvas, barLabel, f14, f28, aVar.getValueTextColor(i22));
                                } else {
                                    barEntry3 = barEntry7;
                                    f14 = f27;
                                    i11 = i20;
                                    gVar2 = valueFormatter;
                                    list2 = dataSets;
                                    eVar2 = eVar3;
                                }
                                if (barEntry3.getIcon() != null && aVar.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry3.getIcon();
                                    com.github.mikephil.charting.utils.i.drawImage(canvas, icon3, (int) (f14 + eVar2.f14114x), (int) ((y7 >= 0.0f ? bVar.buffer[i21] + f17 : bVar.buffer[i11 + 3] + f18) + eVar2.f14115y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i11 = i20;
                                gVar2 = valueFormatter;
                                list2 = dataSets;
                                eVar2 = eVar3;
                            }
                            i20 = i11 + 4;
                            eVar3 = eVar2;
                            valueFormatter = gVar2;
                            dataSets = list2;
                        }
                        list = dataSets;
                        eVar = eVar3;
                    }
                    f13 = convertDpToPixel;
                    z8 = isDrawValueAboveBarEnabled;
                    com.github.mikephil.charting.utils.e.recycleInstance(eVar);
                } else {
                    list = dataSets;
                    f13 = convertDpToPixel;
                    z8 = isDrawValueAboveBarEnabled;
                }
                i12++;
                isDrawValueAboveBarEnabled = z8;
                dataSets = list;
                convertDpToPixel = f13;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void initBuffers() {
        com.github.mikephil.charting.data.a barData = this.mChart.getBarData();
        this.mBarBuffers = new com.github.mikephil.charting.buffer.b[barData.getDataSetCount()];
        for (int i8 = 0; i8 < this.mBarBuffers.length; i8++) {
            v4.a aVar = (v4.a) barData.getDataSetByIndex(i8);
            this.mBarBuffers[i8] = new com.github.mikephil.charting.buffer.b(aVar.getEntryCount() * 4 * (aVar.isStacked() ? aVar.getStackSize() : 1), barData.getDataSetCount(), aVar.isStacked());
        }
    }

    protected void prepareBarHighlight(float f8, float f9, float f10, float f11, com.github.mikephil.charting.utils.g gVar) {
        this.mBarRect.set(f8 - f11, f9, f8 + f11, f10);
        gVar.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    protected void setHighlightDrawPos(com.github.mikephil.charting.highlight.d dVar, RectF rectF) {
        dVar.setDraw(rectF.centerX(), rectF.top);
    }
}
