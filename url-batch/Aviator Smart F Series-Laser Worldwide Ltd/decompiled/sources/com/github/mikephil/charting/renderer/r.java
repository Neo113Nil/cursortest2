package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

/* loaded from: classes3.dex */
public class r extends q {
    protected BarChart mChart;
    protected Path mRenderLimitLinesPathBuffer;

    public r(com.github.mikephil.charting.utils.j jVar, XAxis xAxis, com.github.mikephil.charting.utils.g gVar, BarChart barChart) {
        super(jVar, xAxis, gVar);
        this.mRenderLimitLinesPathBuffer = new Path();
        this.mChart = barChart;
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void computeAxis(float f8, float f9, boolean z7) {
        float f10;
        double d8;
        if (this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            com.github.mikephil.charting.utils.d valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            com.github.mikephil.charting.utils.d valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            if (z7) {
                f10 = (float) valuesByTouchPoint2.f14113y;
                d8 = valuesByTouchPoint.f14113y;
            } else {
                f10 = (float) valuesByTouchPoint.f14113y;
                d8 = valuesByTouchPoint2.f14113y;
            }
            float f11 = (float) d8;
            com.github.mikephil.charting.utils.d.recycleInstance(valuesByTouchPoint);
            com.github.mikephil.charting.utils.d.recycleInstance(valuesByTouchPoint2);
            f8 = f10;
            f9 = f11;
        }
        computeAxisValues(f8, f9);
    }

    @Override // com.github.mikephil.charting.renderer.q
    protected void computeSize() {
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        com.github.mikephil.charting.utils.b calcTextSize = com.github.mikephil.charting.utils.i.calcTextSize(this.mAxisLabelPaint, this.mXAxis.getLongestLabel());
        float xOffset = (int) (calcTextSize.width + (this.mXAxis.getXOffset() * 3.5f));
        float f8 = calcTextSize.height;
        com.github.mikephil.charting.utils.b sizeOfRotatedRectangleByDegrees = com.github.mikephil.charting.utils.i.getSizeOfRotatedRectangleByDegrees(calcTextSize.width, f8, this.mXAxis.getLabelRotationAngle());
        this.mXAxis.mLabelWidth = Math.round(xOffset);
        this.mXAxis.mLabelHeight = Math.round(f8);
        XAxis xAxis = this.mXAxis;
        xAxis.mLabelRotatedWidth = (int) (sizeOfRotatedRectangleByDegrees.width + (xAxis.getXOffset() * 3.5f));
        this.mXAxis.mLabelRotatedHeight = Math.round(sizeOfRotatedRectangleByDegrees.height);
        com.github.mikephil.charting.utils.b.recycleInstance(sizeOfRotatedRectangleByDegrees);
    }

    @Override // com.github.mikephil.charting.renderer.q
    protected void drawGridLine(Canvas canvas, float f8, float f9, Path path) {
        path.moveTo(this.mViewPortHandler.contentRight(), f9);
        path.lineTo(this.mViewPortHandler.contentLeft(), f9);
        canvas.drawPath(path, this.mGridPaint);
        path.reset();
    }

    @Override // com.github.mikephil.charting.renderer.q
    protected void drawLabels(Canvas canvas, float f8, com.github.mikephil.charting.utils.e eVar) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean isCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i8 = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i8];
        for (int i9 = 0; i9 < i8; i9 += 2) {
            if (isCenterAxisLabelsEnabled) {
                fArr[i9 + 1] = this.mXAxis.mCenteredEntries[i9 / 2];
            } else {
                fArr[i9 + 1] = this.mXAxis.mEntries[i9 / 2];
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        for (int i10 = 0; i10 < i8; i10 += 2) {
            float f9 = fArr[i10 + 1];
            if (this.mViewPortHandler.isInBoundsY(f9)) {
                com.github.mikephil.charting.formatter.g valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis = this.mXAxis;
                drawLabel(canvas, valueFormatter.getAxisLabel(xAxis.mEntries[i10 / 2], xAxis), f8, f9, eVar, labelRotationAngle);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.q
    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(0.0f, -this.mAxis.getGridLineWidth());
        return this.mGridClippingRect;
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float xOffset = this.mXAxis.getXOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            com.github.mikephil.charting.utils.e eVar = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                eVar.f14114x = 0.0f;
                eVar.f14115y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentRight() + xOffset, eVar);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                eVar.f14114x = 1.0f;
                eVar.f14115y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentRight() - xOffset, eVar);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                eVar.f14114x = 1.0f;
                eVar.f14115y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentLeft() - xOffset, eVar);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                eVar.f14114x = 1.0f;
                eVar.f14115y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentLeft() + xOffset, eVar);
            } else {
                eVar.f14114x = 0.0f;
                eVar.f14115y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentRight() + xOffset, eVar);
                eVar.f14114x = 1.0f;
                eVar.f14115y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentLeft() - xOffset, eVar);
            }
            com.github.mikephil.charting.utils.e.recycleInstance(eVar);
        }
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void renderAxisLine(Canvas canvas) {
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.mRenderLimitLinesPathBuffer;
        path.reset();
        for (int i8 = 0; i8 < limitLines.size(); i8++) {
            LimitLine limitLine = limitLines.get(i8);
            if (limitLine.isEnabled()) {
                int save = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                this.mLimitLineClippingRect.inset(0.0f, -limitLine.getLineWidth());
                canvas.clipRect(this.mLimitLineClippingRect);
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                fArr[1] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                path.moveTo(this.mViewPortHandler.contentLeft(), fArr[1]);
                path.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String label = limitLine.getLabel();
                if (label != null && !label.equals("")) {
                    this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float calcTextHeight = com.github.mikephil.charting.utils.i.calcTextHeight(this.mLimitLinePaint, label);
                    float convertDpToPixel = com.github.mikephil.charting.utils.i.convertDpToPixel(4.0f) + limitLine.getXOffset();
                    float lineWidth = limitLine.getLineWidth() + calcTextHeight + limitLine.getYOffset();
                    LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                    if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - convertDpToPixel, (fArr[1] - lineWidth) + calcTextHeight, this.mLimitLinePaint);
                    } else if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - convertDpToPixel, fArr[1] + lineWidth, this.mLimitLinePaint);
                    } else if (labelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(label, this.mViewPortHandler.contentLeft() + convertDpToPixel, (fArr[1] - lineWidth) + calcTextHeight, this.mLimitLinePaint);
                    } else {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(label, this.mViewPortHandler.offsetLeft() + convertDpToPixel, fArr[1] + lineWidth, this.mLimitLinePaint);
                    }
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
