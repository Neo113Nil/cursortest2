package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class i extends o {
    protected List<com.github.mikephil.charting.components.e> computedEntries;
    protected Paint.FontMetrics legendFontMetrics;
    protected Legend mLegend;
    protected Paint mLegendFormPaint;
    protected Paint mLegendLabelPaint;
    private Path mLineFormPath;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[Legend.LegendForm.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm = iArr;
            try {
                iArr[Legend.LegendForm.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.SQUARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr2;
            try {
                iArr2[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[Legend.LegendOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr4;
            try {
                iArr4[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public i(com.github.mikephil.charting.utils.j jVar, Legend legend) {
        super(jVar);
        this.computedEntries = new ArrayList(16);
        this.legendFontMetrics = new Paint.FontMetrics();
        this.mLineFormPath = new Path();
        this.mLegend = legend;
        Paint paint = new Paint(1);
        this.mLegendLabelPaint = paint;
        paint.setTextSize(com.github.mikephil.charting.utils.i.convertDpToPixel(9.0f));
        this.mLegendLabelPaint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.mLegendFormPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    public void computeLegend(com.github.mikephil.charting.data.i iVar) {
        com.github.mikephil.charting.data.i iVar2;
        com.github.mikephil.charting.data.i iVar3 = iVar;
        if (!this.mLegend.isLegendCustom()) {
            this.computedEntries.clear();
            int i8 = 0;
            while (i8 < iVar.getDataSetCount()) {
                v4.e dataSetByIndex = iVar3.getDataSetByIndex(i8);
                List<Integer> colors = dataSetByIndex.getColors();
                int entryCount = dataSetByIndex.getEntryCount();
                if (dataSetByIndex instanceof v4.a) {
                    v4.a aVar = (v4.a) dataSetByIndex;
                    if (aVar.isStacked()) {
                        String[] stackLabels = aVar.getStackLabels();
                        for (int i9 = 0; i9 < colors.size() && i9 < aVar.getStackSize(); i9++) {
                            this.computedEntries.add(new com.github.mikephil.charting.components.e(stackLabels[i9 % stackLabels.length], dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i9).intValue()));
                        }
                        if (aVar.getLabel() != null) {
                            this.computedEntries.add(new com.github.mikephil.charting.components.e(dataSetByIndex.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, com.github.mikephil.charting.utils.a.COLOR_NONE));
                        }
                        iVar2 = iVar3;
                        i8++;
                        iVar3 = iVar2;
                    }
                }
                if (dataSetByIndex instanceof v4.i) {
                    v4.i iVar4 = (v4.i) dataSetByIndex;
                    for (int i10 = 0; i10 < colors.size() && i10 < entryCount; i10++) {
                        this.computedEntries.add(new com.github.mikephil.charting.components.e(((PieEntry) iVar4.getEntryForIndex(i10)).getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i10).intValue()));
                    }
                    if (iVar4.getLabel() != null) {
                        this.computedEntries.add(new com.github.mikephil.charting.components.e(dataSetByIndex.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, com.github.mikephil.charting.utils.a.COLOR_NONE));
                    }
                } else {
                    int i11 = 0;
                    while (i11 < colors.size() && i11 < entryCount) {
                        this.computedEntries.add(new com.github.mikephil.charting.components.e((i11 >= colors.size() + (-1) || i11 >= entryCount + (-1)) ? iVar.getDataSetByIndex(i8).getLabel() : null, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i11).intValue()));
                        i11++;
                    }
                }
                iVar2 = iVar;
                i8++;
                iVar3 = iVar2;
            }
            if (this.mLegend.getExtraEntries() != null) {
                Collections.addAll(this.computedEntries, this.mLegend.getExtraEntries());
            }
            this.mLegend.setEntries(this.computedEntries);
        }
        Typeface typeface = this.mLegend.getTypeface();
        if (typeface != null) {
            this.mLegendLabelPaint.setTypeface(typeface);
        }
        this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
        this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
        this.mLegend.calculateDimensions(this.mLegendLabelPaint, this.mViewPortHandler);
    }

    protected void drawForm(Canvas canvas, float f8, float f9, com.github.mikephil.charting.components.e eVar, Legend legend) {
        int i8 = eVar.formColor;
        if (i8 == 1122868 || i8 == 1122867 || i8 == 0) {
            return;
        }
        int save = canvas.save();
        Legend.LegendForm legendForm = eVar.form;
        if (legendForm == Legend.LegendForm.DEFAULT) {
            legendForm = legend.getForm();
        }
        this.mLegendFormPaint.setColor(eVar.formColor);
        float convertDpToPixel = com.github.mikephil.charting.utils.i.convertDpToPixel(Float.isNaN(eVar.formSize) ? legend.getFormSize() : eVar.formSize);
        float f10 = convertDpToPixel / 2.0f;
        int i9 = a.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[legendForm.ordinal()];
        if (i9 == 3 || i9 == 4) {
            this.mLegendFormPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f8 + f10, f9, f10, this.mLegendFormPaint);
        } else if (i9 == 5) {
            this.mLegendFormPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f8, f9 - f10, f8 + convertDpToPixel, f9 + f10, this.mLegendFormPaint);
        } else if (i9 == 6) {
            float convertDpToPixel2 = com.github.mikephil.charting.utils.i.convertDpToPixel(Float.isNaN(eVar.formLineWidth) ? legend.getFormLineWidth() : eVar.formLineWidth);
            DashPathEffect dashPathEffect = eVar.formLineDashEffect;
            if (dashPathEffect == null) {
                dashPathEffect = legend.getFormLineDashEffect();
            }
            this.mLegendFormPaint.setStyle(Paint.Style.STROKE);
            this.mLegendFormPaint.setStrokeWidth(convertDpToPixel2);
            this.mLegendFormPaint.setPathEffect(dashPathEffect);
            this.mLineFormPath.reset();
            this.mLineFormPath.moveTo(f8, f9);
            this.mLineFormPath.lineTo(f8 + convertDpToPixel, f9);
            canvas.drawPath(this.mLineFormPath, this.mLegendFormPaint);
        }
        canvas.restoreToCount(save);
    }

    protected void drawLabel(Canvas canvas, float f8, float f9, String str) {
        canvas.drawText(str, f8, f9, this.mLegendLabelPaint);
    }

    public Paint getFormPaint() {
        return this.mLegendFormPaint;
    }

    public Paint getLabelPaint() {
        return this.mLegendLabelPaint;
    }

    public void renderLegend(Canvas canvas) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        List<Boolean> list;
        List<com.github.mikephil.charting.utils.b> list2;
        int i8;
        float f13;
        float f14;
        float f15;
        float f16;
        float contentTop;
        float f17;
        float f18;
        float f19;
        Legend.LegendDirection legendDirection;
        com.github.mikephil.charting.components.e eVar;
        float f20;
        double d8;
        if (this.mLegend.isEnabled()) {
            Typeface typeface = this.mLegend.getTypeface();
            if (typeface != null) {
                this.mLegendLabelPaint.setTypeface(typeface);
            }
            this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
            this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
            float lineHeight = com.github.mikephil.charting.utils.i.getLineHeight(this.mLegendLabelPaint, this.legendFontMetrics);
            float lineSpacing = com.github.mikephil.charting.utils.i.getLineSpacing(this.mLegendLabelPaint, this.legendFontMetrics) + com.github.mikephil.charting.utils.i.convertDpToPixel(this.mLegend.getYEntrySpace());
            float calcTextHeight = lineHeight - (com.github.mikephil.charting.utils.i.calcTextHeight(this.mLegendLabelPaint, "ABC") / 2.0f);
            com.github.mikephil.charting.components.e[] entries = this.mLegend.getEntries();
            float convertDpToPixel = com.github.mikephil.charting.utils.i.convertDpToPixel(this.mLegend.getFormToTextSpace());
            float convertDpToPixel2 = com.github.mikephil.charting.utils.i.convertDpToPixel(this.mLegend.getXEntrySpace());
            Legend.LegendOrientation orientation = this.mLegend.getOrientation();
            Legend.LegendHorizontalAlignment horizontalAlignment = this.mLegend.getHorizontalAlignment();
            Legend.LegendVerticalAlignment verticalAlignment = this.mLegend.getVerticalAlignment();
            Legend.LegendDirection direction = this.mLegend.getDirection();
            float convertDpToPixel3 = com.github.mikephil.charting.utils.i.convertDpToPixel(this.mLegend.getFormSize());
            float convertDpToPixel4 = com.github.mikephil.charting.utils.i.convertDpToPixel(this.mLegend.getStackSpace());
            float yOffset = this.mLegend.getYOffset();
            float xOffset = this.mLegend.getXOffset();
            int i9 = a.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[horizontalAlignment.ordinal()];
            float f21 = convertDpToPixel4;
            float f22 = convertDpToPixel2;
            if (i9 == 1) {
                f8 = lineHeight;
                f9 = lineSpacing;
                if (orientation != Legend.LegendOrientation.VERTICAL) {
                    xOffset += this.mViewPortHandler.contentLeft();
                }
                f10 = direction == Legend.LegendDirection.RIGHT_TO_LEFT ? xOffset + this.mLegend.mNeededWidth : xOffset;
            } else if (i9 == 2) {
                f8 = lineHeight;
                f9 = lineSpacing;
                f10 = (orientation == Legend.LegendOrientation.VERTICAL ? this.mViewPortHandler.getChartWidth() : this.mViewPortHandler.contentRight()) - xOffset;
                if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                    f10 -= this.mLegend.mNeededWidth;
                }
            } else if (i9 != 3) {
                f8 = lineHeight;
                f9 = lineSpacing;
                f10 = 0.0f;
            } else {
                Legend.LegendOrientation legendOrientation = Legend.LegendOrientation.VERTICAL;
                float chartWidth = orientation == legendOrientation ? this.mViewPortHandler.getChartWidth() / 2.0f : this.mViewPortHandler.contentLeft() + (this.mViewPortHandler.contentWidth() / 2.0f);
                Legend.LegendDirection legendDirection2 = Legend.LegendDirection.LEFT_TO_RIGHT;
                f9 = lineSpacing;
                f10 = chartWidth + (direction == legendDirection2 ? xOffset : -xOffset);
                if (orientation == legendOrientation) {
                    double d9 = f10;
                    if (direction == legendDirection2) {
                        f8 = lineHeight;
                        d8 = ((-this.mLegend.mNeededWidth) / 2.0d) + xOffset;
                    } else {
                        f8 = lineHeight;
                        d8 = (this.mLegend.mNeededWidth / 2.0d) - xOffset;
                    }
                    f10 = (float) (d9 + d8);
                } else {
                    f8 = lineHeight;
                }
            }
            int i10 = a.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[orientation.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                int i11 = a.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[verticalAlignment.ordinal()];
                if (i11 == 1) {
                    contentTop = (horizontalAlignment == Legend.LegendHorizontalAlignment.CENTER ? 0.0f : this.mViewPortHandler.contentTop()) + yOffset;
                } else if (i11 == 2) {
                    contentTop = (horizontalAlignment == Legend.LegendHorizontalAlignment.CENTER ? this.mViewPortHandler.getChartHeight() : this.mViewPortHandler.contentBottom()) - (this.mLegend.mNeededHeight + yOffset);
                } else if (i11 != 3) {
                    contentTop = 0.0f;
                } else {
                    float chartHeight = this.mViewPortHandler.getChartHeight() / 2.0f;
                    Legend legend = this.mLegend;
                    contentTop = (chartHeight - (legend.mNeededHeight / 2.0f)) + legend.getYOffset();
                }
                float f23 = contentTop;
                boolean z7 = false;
                int i12 = 0;
                float f24 = 0.0f;
                while (i12 < entries.length) {
                    com.github.mikephil.charting.components.e eVar2 = entries[i12];
                    boolean z8 = eVar2.form != Legend.LegendForm.NONE;
                    float convertDpToPixel5 = Float.isNaN(eVar2.formSize) ? convertDpToPixel3 : com.github.mikephil.charting.utils.i.convertDpToPixel(eVar2.formSize);
                    if (z8) {
                        Legend.LegendDirection legendDirection3 = Legend.LegendDirection.LEFT_TO_RIGHT;
                        f20 = direction == legendDirection3 ? f10 + f24 : f10 - (convertDpToPixel5 - f24);
                        f18 = calcTextHeight;
                        f19 = f21;
                        f17 = f10;
                        legendDirection = direction;
                        drawForm(canvas, f20, f23 + calcTextHeight, eVar2, this.mLegend);
                        if (legendDirection == legendDirection3) {
                            f20 += convertDpToPixel5;
                        }
                        eVar = eVar2;
                    } else {
                        f17 = f10;
                        f18 = calcTextHeight;
                        f19 = f21;
                        legendDirection = direction;
                        eVar = eVar2;
                        f20 = f17;
                    }
                    if (eVar.label != null) {
                        if (z8 && !z7) {
                            f20 += legendDirection == Legend.LegendDirection.LEFT_TO_RIGHT ? convertDpToPixel : -convertDpToPixel;
                        } else if (z7) {
                            f20 = f17;
                        }
                        if (legendDirection == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            f20 -= com.github.mikephil.charting.utils.i.calcTextWidth(this.mLegendLabelPaint, r1);
                        }
                        float f25 = f20;
                        if (z7) {
                            f23 += f8 + f9;
                            drawLabel(canvas, f25, f23 + f8, eVar.label);
                        } else {
                            drawLabel(canvas, f25, f23 + f8, eVar.label);
                        }
                        f23 += f8 + f9;
                        f24 = 0.0f;
                    } else {
                        f24 += convertDpToPixel5 + f19;
                        z7 = true;
                    }
                    i12++;
                    direction = legendDirection;
                    f21 = f19;
                    calcTextHeight = f18;
                    f10 = f17;
                }
                return;
            }
            float f26 = f10;
            float f27 = f21;
            List<com.github.mikephil.charting.utils.b> calculatedLineSizes = this.mLegend.getCalculatedLineSizes();
            List<com.github.mikephil.charting.utils.b> calculatedLabelSizes = this.mLegend.getCalculatedLabelSizes();
            List<Boolean> calculatedLabelBreakPoints = this.mLegend.getCalculatedLabelBreakPoints();
            int i13 = a.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[verticalAlignment.ordinal()];
            if (i13 != 1) {
                yOffset = i13 != 2 ? i13 != 3 ? 0.0f : yOffset + ((this.mViewPortHandler.getChartHeight() - this.mLegend.mNeededHeight) / 2.0f) : (this.mViewPortHandler.getChartHeight() - yOffset) - this.mLegend.mNeededHeight;
            }
            int length = entries.length;
            float f28 = f26;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                float f29 = f27;
                com.github.mikephil.charting.components.e eVar3 = entries[i14];
                float f30 = f28;
                int i16 = length;
                boolean z9 = eVar3.form != Legend.LegendForm.NONE;
                float convertDpToPixel6 = Float.isNaN(eVar3.formSize) ? convertDpToPixel3 : com.github.mikephil.charting.utils.i.convertDpToPixel(eVar3.formSize);
                if (i14 >= calculatedLabelBreakPoints.size() || !calculatedLabelBreakPoints.get(i14).booleanValue()) {
                    f11 = f30;
                    f12 = yOffset;
                } else {
                    f12 = yOffset + f8 + f9;
                    f11 = f26;
                }
                if (f11 == f26 && horizontalAlignment == Legend.LegendHorizontalAlignment.CENTER && i15 < calculatedLineSizes.size()) {
                    f11 += (direction == Legend.LegendDirection.RIGHT_TO_LEFT ? calculatedLineSizes.get(i15).width : -calculatedLineSizes.get(i15).width) / 2.0f;
                    i15++;
                }
                int i17 = i15;
                boolean z10 = eVar3.label == null;
                if (z9) {
                    if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f11 -= convertDpToPixel6;
                    }
                    float f31 = f11;
                    list2 = calculatedLineSizes;
                    i8 = i14;
                    list = calculatedLabelBreakPoints;
                    drawForm(canvas, f31, f12 + calcTextHeight, eVar3, this.mLegend);
                    f11 = direction == Legend.LegendDirection.LEFT_TO_RIGHT ? f31 + convertDpToPixel6 : f31;
                } else {
                    list = calculatedLabelBreakPoints;
                    list2 = calculatedLineSizes;
                    i8 = i14;
                }
                if (z10) {
                    f13 = f22;
                    if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f14 = f29;
                        f15 = -f14;
                    } else {
                        f14 = f29;
                        f15 = f14;
                    }
                    f28 = f11 + f15;
                } else {
                    if (z9) {
                        f11 += direction == Legend.LegendDirection.RIGHT_TO_LEFT ? -convertDpToPixel : convertDpToPixel;
                    }
                    Legend.LegendDirection legendDirection4 = Legend.LegendDirection.RIGHT_TO_LEFT;
                    if (direction == legendDirection4) {
                        f11 -= calculatedLabelSizes.get(i8).width;
                    }
                    drawLabel(canvas, f11, f12 + f8, eVar3.label);
                    if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f11 += calculatedLabelSizes.get(i8).width;
                    }
                    if (direction == legendDirection4) {
                        f13 = f22;
                        f16 = -f13;
                    } else {
                        f13 = f22;
                        f16 = f13;
                    }
                    f28 = f11 + f16;
                    f14 = f29;
                }
                f22 = f13;
                f27 = f14;
                i14 = i8 + 1;
                yOffset = f12;
                length = i16;
                i15 = i17;
                calculatedLineSizes = list2;
                calculatedLabelBreakPoints = list;
            }
        }
    }
}
