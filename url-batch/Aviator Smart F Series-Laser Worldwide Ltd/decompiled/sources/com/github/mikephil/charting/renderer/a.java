package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public abstract class a extends o {
    protected com.github.mikephil.charting.components.a mAxis;
    protected Paint mAxisLabelPaint;
    protected Paint mAxisLinePaint;
    protected Paint mGridPaint;
    protected Paint mLimitLinePaint;
    protected com.github.mikephil.charting.utils.g mTrans;

    public a(com.github.mikephil.charting.utils.j jVar, com.github.mikephil.charting.utils.g gVar, com.github.mikephil.charting.components.a aVar) {
        super(jVar);
        this.mTrans = gVar;
        this.mAxis = aVar;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint = new Paint(1);
            Paint paint = new Paint();
            this.mGridPaint = paint;
            paint.setColor(-7829368);
            this.mGridPaint.setStrokeWidth(1.0f);
            Paint paint2 = this.mGridPaint;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.mGridPaint.setAlpha(90);
            Paint paint3 = new Paint();
            this.mAxisLinePaint = paint3;
            paint3.setColor(-16777216);
            this.mAxisLinePaint.setStrokeWidth(1.0f);
            this.mAxisLinePaint.setStyle(style);
            Paint paint4 = new Paint(1);
            this.mLimitLinePaint = paint4;
            paint4.setStyle(style);
        }
    }

    public void computeAxis(float f8, float f9, boolean z7) {
        float f10;
        double d8;
        com.github.mikephil.charting.utils.j jVar = this.mViewPortHandler;
        if (jVar != null && jVar.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            com.github.mikephil.charting.utils.d valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            com.github.mikephil.charting.utils.d valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            if (z7) {
                f10 = (float) valuesByTouchPoint.f14113y;
                d8 = valuesByTouchPoint2.f14113y;
            } else {
                f10 = (float) valuesByTouchPoint2.f14113y;
                d8 = valuesByTouchPoint.f14113y;
            }
            float f11 = (float) d8;
            com.github.mikephil.charting.utils.d.recycleInstance(valuesByTouchPoint);
            com.github.mikephil.charting.utils.d.recycleInstance(valuesByTouchPoint2);
            f8 = f10;
            f9 = f11;
        }
        computeAxisValues(f8, f9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    protected void computeAxisValues(float f8, float f9) {
        float f10 = f8;
        int labelCount = this.mAxis.getLabelCount();
        double abs = Math.abs(f9 - f10);
        if (labelCount == 0 || abs <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || Double.isInfinite(abs)) {
            com.github.mikephil.charting.components.a aVar = this.mAxis;
            aVar.mEntries = new float[0];
            aVar.mCenteredEntries = new float[0];
            aVar.mEntryCount = 0;
            return;
        }
        double roundToNextSignificant = com.github.mikephil.charting.utils.i.roundToNextSignificant(abs / labelCount);
        if (this.mAxis.isGranularityEnabled() && roundToNextSignificant < this.mAxis.getGranularity()) {
            roundToNextSignificant = this.mAxis.getGranularity();
        }
        double roundToNextSignificant2 = com.github.mikephil.charting.utils.i.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(roundToNextSignificant)));
        if (((int) (roundToNextSignificant / roundToNextSignificant2)) > 5) {
            roundToNextSignificant = Math.floor(roundToNextSignificant2 * 10.0d);
        }
        int isCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            roundToNextSignificant = ((float) abs) / (labelCount - 1);
            com.github.mikephil.charting.components.a aVar2 = this.mAxis;
            aVar2.mEntryCount = labelCount;
            if (aVar2.mEntries.length < labelCount) {
                aVar2.mEntries = new float[labelCount];
            }
            for (int i8 = 0; i8 < labelCount; i8++) {
                this.mAxis.mEntries[i8] = f10;
                f10 = (float) (f10 + roundToNextSignificant);
            }
        } else {
            double ceil = roundToNextSignificant == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : Math.ceil(f10 / roundToNextSignificant) * roundToNextSignificant;
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                ceil -= roundToNextSignificant;
            }
            double nextUp = roundToNextSignificant == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : com.github.mikephil.charting.utils.i.nextUp(Math.floor(f9 / roundToNextSignificant) * roundToNextSignificant);
            if (roundToNextSignificant != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                double d8 = ceil;
                isCenterAxisLabelsEnabled = isCenterAxisLabelsEnabled;
                while (d8 <= nextUp) {
                    d8 += roundToNextSignificant;
                    isCenterAxisLabelsEnabled++;
                }
            }
            com.github.mikephil.charting.components.a aVar3 = this.mAxis;
            aVar3.mEntryCount = isCenterAxisLabelsEnabled;
            if (aVar3.mEntries.length < isCenterAxisLabelsEnabled) {
                aVar3.mEntries = new float[isCenterAxisLabelsEnabled];
            }
            for (int i9 = 0; i9 < isCenterAxisLabelsEnabled; i9++) {
                if (ceil == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                    ceil = 0.0d;
                }
                this.mAxis.mEntries[i9] = (float) ceil;
                ceil += roundToNextSignificant;
            }
            labelCount = isCenterAxisLabelsEnabled;
        }
        if (roundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(roundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            com.github.mikephil.charting.components.a aVar4 = this.mAxis;
            if (aVar4.mCenteredEntries.length < labelCount) {
                aVar4.mCenteredEntries = new float[labelCount];
            }
            float f11 = ((float) roundToNextSignificant) / 2.0f;
            for (int i10 = 0; i10 < labelCount; i10++) {
                com.github.mikephil.charting.components.a aVar5 = this.mAxis;
                aVar5.mCenteredEntries[i10] = aVar5.mEntries[i10] + f11;
            }
        }
    }

    public Paint getPaintAxisLabels() {
        return this.mAxisLabelPaint;
    }

    public Paint getPaintAxisLine() {
        return this.mAxisLinePaint;
    }

    public Paint getPaintGrid() {
        return this.mGridPaint;
    }

    public com.github.mikephil.charting.utils.g getTransformer() {
        return this.mTrans;
    }

    public abstract void renderAxisLabels(Canvas canvas);

    public abstract void renderAxisLine(Canvas canvas);

    public abstract void renderGridLines(Canvas canvas);

    public abstract void renderLimitLines(Canvas canvas);
}
