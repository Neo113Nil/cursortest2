package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.r;
import com.github.mikephil.charting.renderer.u;
import com.github.mikephil.charting.utils.c;
import com.github.mikephil.charting.utils.e;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import v4.a;

/* loaded from: classes3.dex */
public class HorizontalBarChart extends BarChart {
    protected float[] mGetPositionBuffer;
    private RectF mOffsetsBuffer;

    public HorizontalBarChart(Context context) {
        super(context);
        this.mOffsetsBuffer = new RectF();
        this.mGetPositionBuffer = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        calculateLegendOffsets(this.mOffsetsBuffer);
        RectF rectF = this.mOffsetsBuffer;
        float f8 = rectF.left + 0.0f;
        float f9 = rectF.top + 0.0f;
        float f10 = rectF.right + 0.0f;
        float f11 = rectF.bottom + 0.0f;
        if (this.mAxisLeft.needsOffset()) {
            f9 += this.mAxisLeft.getRequiredHeightSpace(this.mAxisRendererLeft.getPaintAxisLabels());
        }
        if (this.mAxisRight.needsOffset()) {
            f11 += this.mAxisRight.getRequiredHeightSpace(this.mAxisRendererRight.getPaintAxisLabels());
        }
        XAxis xAxis = this.mXAxis;
        float f12 = xAxis.mLabelRotatedWidth;
        if (xAxis.isEnabled()) {
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                f8 += f12;
            } else {
                if (this.mXAxis.getPosition() != XAxis.XAxisPosition.TOP) {
                    if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                        f8 += f12;
                    }
                }
                f10 += f12;
            }
        }
        float extraTopOffset = f9 + getExtraTopOffset();
        float extraRightOffset = f10 + getExtraRightOffset();
        float extraBottomOffset = f11 + getExtraBottomOffset();
        float extraLeftOffset = f8 + getExtraLeftOffset();
        float convertDpToPixel = i.convertDpToPixel(this.mMinOffset);
        this.mViewPortHandler.restrainViewPort(Math.max(convertDpToPixel, extraLeftOffset), Math.max(convertDpToPixel, extraTopOffset), Math.max(convertDpToPixel, extraRightOffset), Math.max(convertDpToPixel, extraBottomOffset));
        if (this.mLogEnabled) {
            Log.i(Chart.LOG_TAG, "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb = new StringBuilder();
            sb.append("Content: ");
            sb.append(this.mViewPortHandler.getContentRect().toString());
            Log.i(Chart.LOG_TAG, sb.toString());
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    @Override // com.github.mikephil.charting.charts.BarChart
    public void getBarBounds(BarEntry barEntry, RectF rectF) {
        a aVar = (a) ((com.github.mikephil.charting.data.a) this.mData).getDataSetForEntry(barEntry);
        if (aVar == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float y7 = barEntry.getY();
        float x7 = barEntry.getX();
        float barWidth = ((com.github.mikephil.charting.data.a) this.mData).getBarWidth() / 2.0f;
        float f8 = x7 - barWidth;
        float f9 = x7 + barWidth;
        float f10 = y7 >= 0.0f ? y7 : 0.0f;
        if (y7 > 0.0f) {
            y7 = 0.0f;
        }
        rectF.set(f10, f8, y7, f9);
        getTransformer(aVar.getAxisDependency()).rectValueToPixel(rectF);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, u4.b
    public float getHighestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.posForGetHighestVisibleX);
        return (float) Math.min(this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.f14113y);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public d getHighlightByTouchPoint(float f8, float f9) {
        if (this.mData != 0) {
            return getHighlighter().getHighlight(f9, f8);
        }
        if (!this.mLogEnabled) {
            return null;
        }
        Log.e(Chart.LOG_TAG, "Can't select by touch. No data set.");
        return null;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, u4.b
    public float getLowestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.posForGetLowestVisibleX);
        return (float) Math.max(this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.f14113y);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] getMarkerPosition(d dVar) {
        return new float[]{dVar.getDrawY(), dVar.getDrawX()};
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public e getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = this.mGetPositionBuffer;
        fArr[0] = entry.getY();
        fArr[1] = entry.getX();
        getTransformer(axisDependency).pointValuesToPixel(fArr);
        return e.getInstance(fArr[0], fArr[1]);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        this.mViewPortHandler = new c();
        super.init();
        this.mLeftAxisTransformer = new h(this.mViewPortHandler);
        this.mRightAxisTransformer = new h(this.mViewPortHandler);
        this.mRenderer = new com.github.mikephil.charting.renderer.h(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new com.github.mikephil.charting.highlight.e(this));
        this.mAxisRendererLeft = new u(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new u(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new r(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer, this);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    protected void prepareValuePxMatrix() {
        g gVar = this.mRightAxisTransformer;
        YAxis yAxis = this.mAxisRight;
        float f8 = yAxis.mAxisMinimum;
        float f9 = yAxis.mAxisRange;
        XAxis xAxis = this.mXAxis;
        gVar.prepareMatrixValuePx(f8, f9, xAxis.mAxisRange, xAxis.mAxisMinimum);
        g gVar2 = this.mLeftAxisTransformer;
        YAxis yAxis2 = this.mAxisLeft;
        float f10 = yAxis2.mAxisMinimum;
        float f11 = yAxis2.mAxisRange;
        XAxis xAxis2 = this.mXAxis;
        gVar2.prepareMatrixValuePx(f10, f11, xAxis2.mAxisRange, xAxis2.mAxisMinimum);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float f8, float f9) {
        float f10 = this.mXAxis.mAxisRange;
        this.mViewPortHandler.setMinMaxScaleY(f10 / f8, f10 / f9);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f8) {
        this.mViewPortHandler.setMinimumScaleY(this.mXAxis.mAxisRange / f8);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f8) {
        this.mViewPortHandler.setMaximumScaleY(this.mXAxis.mAxisRange / f8);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRange(float f8, float f9, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinMaxScaleX(getAxisRange(axisDependency) / f8, getAxisRange(axisDependency) / f9);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMaximum(float f8, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinimumScaleX(getAxisRange(axisDependency) / f8);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMinimum(float f8, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMaximumScaleX(getAxisRange(axisDependency) / f8);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOffsetsBuffer = new RectF();
        this.mGetPositionBuffer = new float[2];
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mOffsetsBuffer = new RectF();
        this.mGetPositionBuffer = new float[2];
    }
}
