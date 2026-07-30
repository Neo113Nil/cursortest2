package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;

/* loaded from: classes3.dex */
public abstract class ChartTouchListener extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    protected static final int DRAG = 1;
    protected static final int NONE = 0;
    protected static final int PINCH_ZOOM = 4;
    protected static final int POST_ZOOM = 5;
    protected static final int ROTATE = 6;
    protected static final int X_ZOOM = 2;
    protected static final int Y_ZOOM = 3;
    protected Chart<?> mChart;
    protected GestureDetector mGestureDetector;
    protected com.github.mikephil.charting.highlight.d mLastHighlighted;
    protected ChartGesture mLastGesture = ChartGesture.NONE;
    protected int mTouchMode = 0;

    public enum ChartGesture {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public ChartTouchListener(Chart<?> chart) {
        this.mChart = chart;
        this.mGestureDetector = new GestureDetector(chart.getContext(), this);
    }

    protected static float distance(float f8, float f9, float f10, float f11) {
        float f12 = f8 - f9;
        float f13 = f10 - f11;
        return (float) Math.sqrt((f12 * f12) + (f13 * f13));
    }

    public void endAction(MotionEvent motionEvent) {
        this.mChart.getOnChartGestureListener();
    }

    public ChartGesture getLastGesture() {
        return this.mLastGesture;
    }

    public int getTouchMode() {
        return this.mTouchMode;
    }

    protected void performHighlight(com.github.mikephil.charting.highlight.d dVar, MotionEvent motionEvent) {
        if (dVar == null || dVar.equalTo(this.mLastHighlighted)) {
            this.mChart.highlightValue((com.github.mikephil.charting.highlight.d) null, true);
            this.mLastHighlighted = null;
        } else {
            this.mChart.highlightValue(dVar, true);
            this.mLastHighlighted = dVar;
        }
    }

    public void setLastHighlighted(com.github.mikephil.charting.highlight.d dVar) {
        this.mLastHighlighted = dVar;
    }

    public void startAction(MotionEvent motionEvent) {
        this.mChart.getOnChartGestureListener();
    }
}
