package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.a;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.b;

/* loaded from: classes3.dex */
public class BarChart extends BarLineChartBase<a> implements u4.a {
    private boolean mDrawBarShadow;
    private boolean mDrawValueAboveBar;
    private boolean mFitBars;
    protected boolean mHighlightFullBarEnabled;

    public BarChart(Context context) {
        super(context);
        this.mHighlightFullBarEnabled = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mFitBars = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        if (this.mFitBars) {
            this.mXAxis.calculate(((a) this.mData).getXMin() - (((a) this.mData).getBarWidth() / 2.0f), ((a) this.mData).getXMax() + (((a) this.mData).getBarWidth() / 2.0f));
        } else {
            this.mXAxis.calculate(((a) this.mData).getXMin(), ((a) this.mData).getXMax());
        }
        YAxis yAxis = this.mAxisLeft;
        a aVar = (a) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calculate(aVar.getYMin(axisDependency), ((a) this.mData).getYMax(axisDependency));
        YAxis yAxis2 = this.mAxisRight;
        a aVar2 = (a) this.mData;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.calculate(aVar2.getYMin(axisDependency2), ((a) this.mData).getYMax(axisDependency2));
    }

    public RectF getBarBounds(BarEntry barEntry) {
        RectF rectF = new RectF();
        getBarBounds(barEntry, rectF);
        return rectF;
    }

    @Override // u4.a
    public a getBarData() {
        return (a) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public d getHighlightByTouchPoint(float f8, float f9) {
        if (this.mData == 0) {
            Log.e(Chart.LOG_TAG, "Can't select by touch. No data set.");
            return null;
        }
        d highlight = getHighlighter().getHighlight(f8, f9);
        return (highlight == null || !isHighlightFullBarEnabled()) ? highlight : new d(highlight.getX(), highlight.getY(), highlight.getXPx(), highlight.getYPx(), highlight.getDataSetIndex(), -1, highlight.getAxis());
    }

    public void groupBars(float f8, float f9, float f10) {
        if (getBarData() == null) {
            throw new RuntimeException("You need to set data for the chart before grouping bars.");
        }
        getBarData().groupBars(f8, f9, f10);
        notifyDataSetChanged();
    }

    public void highlightValue(float f8, int i8, int i9) {
        highlightValue(new d(f8, i8, i9), false);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new b(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new com.github.mikephil.charting.highlight.a(this));
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    @Override // u4.a
    public boolean isDrawBarShadowEnabled() {
        return this.mDrawBarShadow;
    }

    @Override // u4.a
    public boolean isDrawValueAboveBarEnabled() {
        return this.mDrawValueAboveBar;
    }

    @Override // u4.a
    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    public void setDrawBarShadow(boolean z7) {
        this.mDrawBarShadow = z7;
    }

    public void setDrawValueAboveBar(boolean z7) {
        this.mDrawValueAboveBar = z7;
    }

    public void setFitBars(boolean z7) {
        this.mFitBars = z7;
    }

    public void setHighlightFullBarEnabled(boolean z7) {
        this.mHighlightFullBarEnabled = z7;
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHighlightFullBarEnabled = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mFitBars = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mHighlightFullBarEnabled = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mFitBars = false;
    }

    public void getBarBounds(BarEntry barEntry, RectF rectF) {
        v4.a aVar = (v4.a) ((a) this.mData).getDataSetForEntry(barEntry);
        if (aVar == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float y7 = barEntry.getY();
        float x7 = barEntry.getX();
        float barWidth = ((a) this.mData).getBarWidth() / 2.0f;
        float f8 = x7 - barWidth;
        float f9 = x7 + barWidth;
        float f10 = y7 >= 0.0f ? y7 : 0.0f;
        if (y7 > 0.0f) {
            y7 = 0.0f;
        }
        rectF.set(f8, f10, f9, y7);
        getTransformer(aVar.getAxisDependency()).rectValueToPixel(rectF);
    }
}
