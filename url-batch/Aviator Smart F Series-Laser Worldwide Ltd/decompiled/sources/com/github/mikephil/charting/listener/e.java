package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class e extends ChartTouchListener {
    private ArrayList<a> _velocitySamples;
    private float mDecelerationAngularVelocity;
    private long mDecelerationLastTime;
    private float mStartAngle;
    private com.github.mikephil.charting.utils.e mTouchStartPoint;

    private class a {
        public float angle;
        public long time;

        public a(long j8, float f8) {
            this.time = j8;
            this.angle = f8;
        }
    }

    public e(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.mTouchStartPoint = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        this.mStartAngle = 0.0f;
        this._velocitySamples = new ArrayList<>();
        this.mDecelerationLastTime = 0L;
        this.mDecelerationAngularVelocity = 0.0f;
    }

    private float calculateVelocity() {
        if (this._velocitySamples.isEmpty()) {
            return 0.0f;
        }
        a aVar = this._velocitySamples.get(0);
        ArrayList<a> arrayList = this._velocitySamples;
        a aVar2 = arrayList.get(arrayList.size() - 1);
        a aVar3 = aVar;
        for (int size = this._velocitySamples.size() - 1; size >= 0; size--) {
            aVar3 = this._velocitySamples.get(size);
            if (aVar3.angle != aVar2.angle) {
                break;
            }
        }
        float f8 = (aVar2.time - aVar.time) / 1000.0f;
        if (f8 == 0.0f) {
            f8 = 0.1f;
        }
        boolean z7 = aVar2.angle >= aVar3.angle;
        if (Math.abs(r1 - r6) > 270.0d) {
            z7 = !z7;
        }
        float f9 = aVar2.angle;
        float f10 = aVar.angle;
        if (f9 - f10 > 180.0d) {
            aVar.angle = (float) (f10 + 360.0d);
        } else if (f10 - f9 > 180.0d) {
            aVar2.angle = (float) (f9 + 360.0d);
        }
        float abs = Math.abs((aVar2.angle - aVar.angle) / f8);
        return !z7 ? -abs : abs;
    }

    private void resetVelocity() {
        this._velocitySamples.clear();
    }

    private void sampleVelocity(float f8, float f9) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this._velocitySamples.add(new a(currentAnimationTimeMillis, ((PieRadarChartBase) this.mChart).getAngleForPoint(f8, f9)));
        for (int size = this._velocitySamples.size(); size - 2 > 0 && currentAnimationTimeMillis - this._velocitySamples.get(0).time > 1000; size--) {
            this._velocitySamples.remove(0);
        }
    }

    public void computeScroll() {
        if (this.mDecelerationAngularVelocity == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.mDecelerationAngularVelocity *= ((PieRadarChartBase) this.mChart).getDragDecelerationFrictionCoef();
        Chart<?> chart = this.mChart;
        ((PieRadarChartBase) chart).setRotationAngle(((PieRadarChartBase) chart).getRotationAngle() + (this.mDecelerationAngularVelocity * ((currentAnimationTimeMillis - this.mDecelerationLastTime) / 1000.0f)));
        this.mDecelerationLastTime = currentAnimationTimeMillis;
        if (Math.abs(this.mDecelerationAngularVelocity) >= 0.001d) {
            i.postInvalidateOnAnimation(this.mChart);
        } else {
            stopDeceleration();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (!((PieRadarChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((PieRadarChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.mGestureDetector.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.mChart).isRotationEnabled()) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                startAction(motionEvent);
                stopDeceleration();
                resetVelocity();
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x7, y7);
                }
                setGestureStartAngle(x7, y7);
                com.github.mikephil.charting.utils.e eVar = this.mTouchStartPoint;
                eVar.f14114x = x7;
                eVar.f14115y = y7;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    sampleVelocity(x7, y7);
                    float calculateVelocity = calculateVelocity();
                    this.mDecelerationAngularVelocity = calculateVelocity;
                    if (calculateVelocity != 0.0f) {
                        this.mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
                        i.postInvalidateOnAnimation(this.mChart);
                    }
                }
                ((PieRadarChartBase) this.mChart).enableScroll();
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x7, y7);
                }
                if (this.mTouchMode == 0) {
                    com.github.mikephil.charting.utils.e eVar2 = this.mTouchStartPoint;
                    if (ChartTouchListener.distance(x7, eVar2.f14114x, y7, eVar2.f14115y) > i.convertDpToPixel(8.0f)) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.ROTATE;
                        this.mTouchMode = 6;
                        ((PieRadarChartBase) this.mChart).disableScroll();
                        endAction(motionEvent);
                    }
                }
                if (this.mTouchMode == 6) {
                    updateGestureRotation(x7, y7);
                    ((PieRadarChartBase) this.mChart).invalidate();
                }
                endAction(motionEvent);
            }
        }
        return true;
    }

    public void setGestureStartAngle(float f8, float f9) {
        this.mStartAngle = ((PieRadarChartBase) this.mChart).getAngleForPoint(f8, f9) - ((PieRadarChartBase) this.mChart).getRawRotationAngle();
    }

    public void stopDeceleration() {
        this.mDecelerationAngularVelocity = 0.0f;
    }

    public void updateGestureRotation(float f8, float f9) {
        Chart<?> chart = this.mChart;
        ((PieRadarChartBase) chart).setRotationAngle(((PieRadarChartBase) chart).getAngleForPoint(f8, f9) - this.mStartAngle);
    }
}
