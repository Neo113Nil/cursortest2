package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.a;
import com.github.mikephil.charting.data.g;
import com.github.mikephil.charting.data.h;
import com.github.mikephil.charting.data.j;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.data.p;
import com.github.mikephil.charting.highlight.c;
import com.github.mikephil.charting.highlight.d;
import u4.f;
import v4.b;

/* loaded from: classes3.dex */
public class CombinedChart extends BarLineChartBase<j> implements f {
    private boolean mDrawBarShadow;
    protected DrawOrder[] mDrawOrder;
    private boolean mDrawValueAboveBar;
    protected boolean mHighlightFullBarEnabled;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.mDrawValueAboveBar = true;
        this.mHighlightFullBarEnabled = false;
        this.mDrawBarShadow = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void drawMarkers(Canvas canvas) {
        if (this.mMarker == null || !isDrawMarkersEnabled() || !valuesToHighlight()) {
            return;
        }
        int i8 = 0;
        while (true) {
            d[] dVarArr = this.mIndicesToHighlight;
            if (i8 >= dVarArr.length) {
                return;
            }
            d dVar = dVarArr[i8];
            b dataSetByHighlight = ((j) this.mData).getDataSetByHighlight(dVar);
            Entry entryForHighlight = ((j) this.mData).getEntryForHighlight(dVar);
            if (entryForHighlight != null && dataSetByHighlight.getEntryIndex(entryForHighlight) <= dataSetByHighlight.getEntryCount() * this.mAnimator.getPhaseX()) {
                float[] markerPosition = getMarkerPosition(dVar);
                if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                    this.mMarker.refreshContent(entryForHighlight, dVar);
                    this.mMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                }
            }
            i8++;
        }
    }

    @Override // u4.f, u4.a
    public a getBarData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((j) t7).getBarData();
    }

    @Override // u4.f, u4.c
    public g getBubbleData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((j) t7).getBubbleData();
    }

    @Override // u4.f, u4.d
    public h getCandleData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((j) t7).getCandleData();
    }

    @Override // u4.f
    public j getCombinedData() {
        return (j) this.mData;
    }

    public DrawOrder[] getDrawOrder() {
        return this.mDrawOrder;
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

    @Override // u4.f, u4.g
    public k getLineData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((j) t7).getLineData();
    }

    @Override // u4.f, u4.h
    public p getScatterData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((j) t7).getScatterData();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mDrawOrder = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new c(this, this));
        setHighlightFullBarEnabled(true);
        this.mRenderer = new com.github.mikephil.charting.renderer.f(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // u4.f, u4.a
    public boolean isDrawBarShadowEnabled() {
        return this.mDrawBarShadow;
    }

    @Override // u4.f, u4.a
    public boolean isDrawValueAboveBarEnabled() {
        return this.mDrawValueAboveBar;
    }

    @Override // u4.f, u4.a
    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    public void setDrawBarShadow(boolean z7) {
        this.mDrawBarShadow = z7;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr == null || drawOrderArr.length <= 0) {
            return;
        }
        this.mDrawOrder = drawOrderArr;
    }

    public void setDrawValueAboveBar(boolean z7) {
        this.mDrawValueAboveBar = z7;
    }

    public void setHighlightFullBarEnabled(boolean z7) {
        this.mHighlightFullBarEnabled = z7;
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDrawValueAboveBar = true;
        this.mHighlightFullBarEnabled = false;
        this.mDrawBarShadow = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(j jVar) {
        super.setData((CombinedChart) jVar);
        setHighlighter(new c(this, this));
        ((com.github.mikephil.charting.renderer.f) this.mRenderer).createRenderers();
        this.mRenderer.initBuffers();
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mDrawValueAboveBar = true;
        this.mHighlightFullBarEnabled = false;
        this.mDrawBarShadow = false;
    }
}
