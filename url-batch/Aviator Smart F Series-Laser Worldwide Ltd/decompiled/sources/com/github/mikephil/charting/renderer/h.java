package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* loaded from: classes3.dex */
public class h extends b {
    private RectF mBarShadowRectBuffer;

    public h(u4.a aVar, com.github.mikephil.charting.animation.a aVar2, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, aVar2, jVar);
        this.mBarShadowRectBuffer = new RectF();
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.charting.renderer.b
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
                rectF.top = x7 - barWidth;
                rectF.bottom = x7 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
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
            int i11 = i10 + 3;
            if (!this.mViewPortHandler.isInBoundsTop(bVar.buffer[i11])) {
                return;
            }
            int i12 = i10 + 1;
            if (this.mViewPortHandler.isInBoundsBottom(bVar.buffer[i12])) {
                if (!z8) {
                    this.mRenderPaint.setColor(aVar.getColor(i10 / 4));
                }
                float[] fArr = bVar.buffer;
                int i13 = i10 + 2;
                canvas.drawRect(fArr[i10], fArr[i12], fArr[i13], fArr[i11], this.mRenderPaint);
                if (z7) {
                    float[] fArr2 = bVar.buffer;
                    canvas.drawRect(fArr2[i10], fArr2[i12], fArr2[i13], fArr2[i11], this.mBarBorderPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.b, com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        this.mValuePaint.setColor(i8);
        canvas.drawText(str, f8, f9, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.b, com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        List<v4.e> list;
        int i8;
        com.github.mikephil.charting.utils.e eVar;
        int i9;
        float f8;
        float[] fArr;
        float f9;
        int i10;
        float[] fArr2;
        float f10;
        float f11;
        BarEntry barEntry;
        int i11;
        List<v4.e> list2;
        int i12;
        float f12;
        com.github.mikephil.charting.utils.e eVar2;
        com.github.mikephil.charting.buffer.b bVar;
        com.github.mikephil.charting.formatter.g gVar;
        if (isDrawingValuesAllowed(this.mChart)) {
            List<v4.e> dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = com.github.mikephil.charting.utils.i.convertDpToPixel(5.0f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i13 = 0;
            while (i13 < this.mChart.getBarData().getDataSetCount()) {
                v4.a aVar = (v4.a) dataSets.get(i13);
                if (shouldDrawValues(aVar)) {
                    boolean isInverted = this.mChart.isInverted(aVar.getAxisDependency());
                    applyValueTextStyle(aVar);
                    float f13 = 2.0f;
                    float calcTextHeight = com.github.mikephil.charting.utils.i.calcTextHeight(this.mValuePaint, "10") / 2.0f;
                    com.github.mikephil.charting.formatter.g valueFormatter = aVar.getValueFormatter();
                    com.github.mikephil.charting.buffer.b bVar2 = this.mBarBuffers[i13];
                    float phaseY = this.mAnimator.getPhaseY();
                    com.github.mikephil.charting.utils.e eVar3 = com.github.mikephil.charting.utils.e.getInstance(aVar.getIconsOffset());
                    eVar3.f14114x = com.github.mikephil.charting.utils.i.convertDpToPixel(eVar3.f14114x);
                    eVar3.f14115y = com.github.mikephil.charting.utils.i.convertDpToPixel(eVar3.f14115y);
                    if (aVar.isStacked()) {
                        list = dataSets;
                        i8 = i13;
                        eVar = eVar3;
                        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(aVar.getAxisDependency());
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < aVar.getEntryCount() * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry2 = (BarEntry) aVar.getEntryForIndex(i14);
                            int valueTextColor = aVar.getValueTextColor(i14);
                            float[] yVals = barEntry2.getYVals();
                            if (yVals == null) {
                                int i16 = i15 + 1;
                                if (!this.mViewPortHandler.isInBoundsTop(bVar2.buffer[i16])) {
                                    break;
                                }
                                if (this.mViewPortHandler.isInBoundsX(bVar2.buffer[i15]) && this.mViewPortHandler.isInBoundsBottom(bVar2.buffer[i16])) {
                                    String barLabel = valueFormatter.getBarLabel(barEntry2);
                                    float calcTextWidth = com.github.mikephil.charting.utils.i.calcTextWidth(this.mValuePaint, barLabel);
                                    float f14 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth + convertDpToPixel);
                                    float f15 = isDrawValueAboveBarEnabled ? -(calcTextWidth + convertDpToPixel) : convertDpToPixel;
                                    if (isInverted) {
                                        f14 = (-f14) - calcTextWidth;
                                        f15 = (-f15) - calcTextWidth;
                                    }
                                    float f16 = f14;
                                    float f17 = f15;
                                    if (aVar.isDrawValuesEnabled()) {
                                        float f18 = bVar2.buffer[i15 + 2] + (barEntry2.getY() >= 0.0f ? f16 : f17);
                                        float f19 = bVar2.buffer[i16] + calcTextHeight;
                                        f8 = calcTextHeight;
                                        fArr = yVals;
                                        barEntry = barEntry2;
                                        i9 = i14;
                                        drawValue(canvas, barLabel, f18, f19, valueTextColor);
                                    } else {
                                        i9 = i14;
                                        f8 = calcTextHeight;
                                        fArr = yVals;
                                        barEntry = barEntry2;
                                    }
                                    if (barEntry.getIcon() != null && aVar.isDrawIconsEnabled()) {
                                        Drawable icon = barEntry.getIcon();
                                        float f20 = bVar2.buffer[i15 + 2];
                                        if (barEntry.getY() < 0.0f) {
                                            f16 = f17;
                                        }
                                        com.github.mikephil.charting.utils.i.drawImage(canvas, icon, (int) (f20 + f16 + eVar.f14114x), (int) (bVar2.buffer[i16] + eVar.f14115y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                i9 = i14;
                                f8 = calcTextHeight;
                                fArr = yVals;
                                int length = fArr.length * 2;
                                float[] fArr3 = new float[length];
                                float f21 = -barEntry2.getNegativeSum();
                                int i17 = 0;
                                int i18 = 0;
                                float f22 = 0.0f;
                                while (i17 < length) {
                                    float f23 = fArr[i18];
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
                                    fArr3[i17] = f21 * phaseY;
                                    i17 += 2;
                                    i18++;
                                    f21 = f11;
                                }
                                transformer.pointValuesToPixel(fArr3);
                                int i19 = 0;
                                while (i19 < length) {
                                    float f25 = fArr[i19 / 2];
                                    String barStackedLabel = valueFormatter.getBarStackedLabel(f25, barEntry2);
                                    float calcTextWidth2 = com.github.mikephil.charting.utils.i.calcTextWidth(this.mValuePaint, barStackedLabel);
                                    float f26 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth2 + convertDpToPixel);
                                    int i20 = length;
                                    float f27 = isDrawValueAboveBarEnabled ? -(calcTextWidth2 + convertDpToPixel) : convertDpToPixel;
                                    if (isInverted) {
                                        f26 = (-f26) - calcTextWidth2;
                                        f27 = (-f27) - calcTextWidth2;
                                    }
                                    boolean z7 = (f25 == 0.0f && f21 == 0.0f && f22 > 0.0f) || f25 < 0.0f;
                                    float f28 = fArr3[i19];
                                    if (z7) {
                                        f26 = f27;
                                    }
                                    float f29 = f28 + f26;
                                    float[] fArr4 = bVar2.buffer;
                                    float f30 = (fArr4[i15 + 1] + fArr4[i15 + 3]) / 2.0f;
                                    if (!this.mViewPortHandler.isInBoundsTop(f30)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsX(f29) && this.mViewPortHandler.isInBoundsBottom(f30)) {
                                        if (aVar.isDrawValuesEnabled()) {
                                            f9 = f30;
                                            i10 = i19;
                                            fArr2 = fArr3;
                                            f10 = f29;
                                            drawValue(canvas, barStackedLabel, f29, f30 + f8, valueTextColor);
                                        } else {
                                            f9 = f30;
                                            i10 = i19;
                                            fArr2 = fArr3;
                                            f10 = f29;
                                        }
                                        if (barEntry2.getIcon() != null && aVar.isDrawIconsEnabled()) {
                                            Drawable icon2 = barEntry2.getIcon();
                                            com.github.mikephil.charting.utils.i.drawImage(canvas, icon2, (int) (f10 + eVar.f14114x), (int) (f9 + eVar.f14115y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i10 = i19;
                                        fArr2 = fArr3;
                                    }
                                    i19 = i10 + 2;
                                    length = i20;
                                    fArr3 = fArr2;
                                }
                            }
                            i15 = fArr == null ? i15 + 4 : i15 + (fArr.length * 4);
                            i14 = i9 + 1;
                            calcTextHeight = f8;
                        }
                    } else {
                        int i21 = 0;
                        while (i21 < bVar2.buffer.length * this.mAnimator.getPhaseX()) {
                            float[] fArr5 = bVar2.buffer;
                            int i22 = i21 + 1;
                            float f31 = fArr5[i22];
                            float f32 = (fArr5[i21 + 3] + f31) / f13;
                            if (!this.mViewPortHandler.isInBoundsTop(f31)) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsX(bVar2.buffer[i21]) && this.mViewPortHandler.isInBoundsBottom(bVar2.buffer[i22])) {
                                BarEntry barEntry3 = (BarEntry) aVar.getEntryForIndex(i21 / 4);
                                float y7 = barEntry3.getY();
                                String barLabel2 = valueFormatter.getBarLabel(barEntry3);
                                float calcTextWidth3 = com.github.mikephil.charting.utils.i.calcTextWidth(this.mValuePaint, barLabel2);
                                float f33 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth3 + convertDpToPixel);
                                float f34 = isDrawValueAboveBarEnabled ? -(calcTextWidth3 + convertDpToPixel) : convertDpToPixel;
                                if (isInverted) {
                                    f33 = (-f33) - calcTextWidth3;
                                    f34 = (-f34) - calcTextWidth3;
                                }
                                float f35 = f33;
                                float f36 = f34;
                                if (aVar.isDrawValuesEnabled()) {
                                    float f37 = bVar2.buffer[i21 + 2];
                                    float f38 = y7 >= 0.0f ? f35 : f36;
                                    i11 = i21;
                                    list2 = dataSets;
                                    eVar2 = eVar3;
                                    f12 = f36;
                                    bVar = bVar2;
                                    i12 = i13;
                                    gVar = valueFormatter;
                                    drawValue(canvas, barLabel2, f37 + f38, f32 + calcTextHeight, aVar.getValueTextColor(i21 / 2));
                                } else {
                                    i11 = i21;
                                    list2 = dataSets;
                                    i12 = i13;
                                    f12 = f36;
                                    eVar2 = eVar3;
                                    bVar = bVar2;
                                    gVar = valueFormatter;
                                }
                                if (barEntry3.getIcon() != null && aVar.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry3.getIcon();
                                    float f39 = bVar.buffer[i11 + 2];
                                    if (y7 < 0.0f) {
                                        f35 = f12;
                                    }
                                    com.github.mikephil.charting.utils.i.drawImage(canvas, icon3, (int) (f39 + f35 + eVar2.f14114x), (int) (f32 + eVar2.f14115y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i11 = i21;
                                bVar = bVar2;
                                list2 = dataSets;
                                i12 = i13;
                                eVar2 = eVar3;
                                gVar = valueFormatter;
                            }
                            i21 = i11 + 4;
                            eVar3 = eVar2;
                            valueFormatter = gVar;
                            bVar2 = bVar;
                            dataSets = list2;
                            i13 = i12;
                            f13 = 2.0f;
                        }
                        list = dataSets;
                        i8 = i13;
                        eVar = eVar3;
                    }
                    com.github.mikephil.charting.utils.e.recycleInstance(eVar);
                } else {
                    list = dataSets;
                    i8 = i13;
                }
                i13 = i8 + 1;
                dataSets = list;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.b, com.github.mikephil.charting.renderer.g
    public void initBuffers() {
        com.github.mikephil.charting.data.a barData = this.mChart.getBarData();
        this.mBarBuffers = new com.github.mikephil.charting.buffer.c[barData.getDataSetCount()];
        for (int i8 = 0; i8 < this.mBarBuffers.length; i8++) {
            v4.a aVar = (v4.a) barData.getDataSetByIndex(i8);
            this.mBarBuffers[i8] = new com.github.mikephil.charting.buffer.c(aVar.getEntryCount() * 4 * (aVar.isStacked() ? aVar.getStackSize() : 1), barData.getDataSetCount(), aVar.isStacked());
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    protected boolean isDrawingValuesAllowed(u4.e eVar) {
        return ((float) eVar.getData().getEntryCount()) < ((float) eVar.getMaxVisibleCount()) * this.mViewPortHandler.getScaleY();
    }

    @Override // com.github.mikephil.charting.renderer.b
    protected void prepareBarHighlight(float f8, float f9, float f10, float f11, com.github.mikephil.charting.utils.g gVar) {
        this.mBarRect.set(f9, f8 - f11, f10, f8 + f11);
        gVar.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    @Override // com.github.mikephil.charting.renderer.b
    protected void setHighlightDrawPos(com.github.mikephil.charting.highlight.d dVar, RectF rectF) {
        dVar.setDraw(rectF.centerY(), rectF.right);
    }
}
