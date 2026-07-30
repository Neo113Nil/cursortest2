package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.j;

/* loaded from: classes3.dex */
public class a extends ChartTouchListener {
    private v4.e mClosestDataSetToTouch;
    private com.github.mikephil.charting.utils.e mDecelerationCurrentPoint;
    private long mDecelerationLastTime;
    private com.github.mikephil.charting.utils.e mDecelerationVelocity;
    private float mDragTriggerDist;
    private Matrix mMatrix;
    private float mMinScalePointerDistance;
    private float mSavedDist;
    private Matrix mSavedMatrix;
    private float mSavedXDist;
    private float mSavedYDist;
    private com.github.mikephil.charting.utils.e mTouchPointCenter;
    private com.github.mikephil.charting.utils.e mTouchStartPoint;
    private VelocityTracker mVelocityTracker;

    public a(BarLineChartBase<? extends com.github.mikephil.charting.data.c> barLineChartBase, Matrix matrix, float f8) {
        super(barLineChartBase);
        this.mMatrix = new Matrix();
        this.mSavedMatrix = new Matrix();
        this.mTouchStartPoint = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        this.mTouchPointCenter = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        this.mSavedXDist = 1.0f;
        this.mSavedYDist = 1.0f;
        this.mSavedDist = 1.0f;
        this.mDecelerationLastTime = 0L;
        this.mDecelerationCurrentPoint = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        this.mDecelerationVelocity = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        this.mMatrix = matrix;
        this.mDragTriggerDist = i.convertDpToPixel(f8);
        this.mMinScalePointerDistance = i.convertDpToPixel(3.5f);
    }

    private static float getXDist(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float getYDist(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    private boolean inverted() {
        v4.e eVar;
        return (this.mClosestDataSetToTouch == null && ((BarLineChartBase) this.mChart).isAnyAxisInverted()) || ((eVar = this.mClosestDataSetToTouch) != null && ((BarLineChartBase) this.mChart).isInverted(eVar.getAxisDependency()));
    }

    private static void midPoint(com.github.mikephil.charting.utils.e eVar, MotionEvent motionEvent) {
        float x7 = motionEvent.getX(0) + motionEvent.getX(1);
        float y7 = motionEvent.getY(0) + motionEvent.getY(1);
        eVar.f14114x = x7 / 2.0f;
        eVar.f14115y = y7 / 2.0f;
    }

    private void performDrag(MotionEvent motionEvent, float f8, float f9) {
        this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
        this.mMatrix.set(this.mSavedMatrix);
        ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (inverted()) {
            if (this.mChart instanceof HorizontalBarChart) {
                f8 = -f8;
            } else {
                f9 = -f9;
            }
        }
        this.mMatrix.postTranslate(f8, f9);
    }

    private void performHighlightDrag(MotionEvent motionEvent) {
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = ((BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        if (highlightByTouchPoint == null || highlightByTouchPoint.equalTo(this.mLastHighlighted)) {
            return;
        }
        this.mLastHighlighted = highlightByTouchPoint;
        ((BarLineChartBase) this.mChart).highlightValue(highlightByTouchPoint, true);
    }

    private void performZoom(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.mChart).getOnChartGestureListener();
            float spacing = spacing(motionEvent);
            if (spacing > this.mMinScalePointerDistance) {
                com.github.mikephil.charting.utils.e eVar = this.mTouchPointCenter;
                com.github.mikephil.charting.utils.e trans = getTrans(eVar.f14114x, eVar.f14115y);
                j viewPortHandler = ((BarLineChartBase) this.mChart).getViewPortHandler();
                int i8 = this.mTouchMode;
                if (i8 == 4) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f8 = spacing / this.mSavedDist;
                    boolean z7 = f8 < 1.0f;
                    boolean canZoomOutMoreX = z7 ? viewPortHandler.canZoomOutMoreX() : viewPortHandler.canZoomInMoreX();
                    boolean canZoomOutMoreY = z7 ? viewPortHandler.canZoomOutMoreY() : viewPortHandler.canZoomInMoreY();
                    float f9 = ((BarLineChartBase) this.mChart).isScaleXEnabled() ? f8 : 1.0f;
                    float f10 = ((BarLineChartBase) this.mChart).isScaleYEnabled() ? f8 : 1.0f;
                    if (canZoomOutMoreY || canZoomOutMoreX) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(f9, f10, trans.f14114x, trans.f14115y);
                    }
                } else if (i8 == 2 && ((BarLineChartBase) this.mChart).isScaleXEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.X_ZOOM;
                    float xDist = getXDist(motionEvent) / this.mSavedXDist;
                    if (xDist < 1.0f ? viewPortHandler.canZoomOutMoreX() : viewPortHandler.canZoomInMoreX()) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(xDist, 1.0f, trans.f14114x, trans.f14115y);
                    }
                } else if (this.mTouchMode == 3 && ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.Y_ZOOM;
                    float yDist = getYDist(motionEvent) / this.mSavedYDist;
                    if (yDist < 1.0f ? viewPortHandler.canZoomOutMoreY() : viewPortHandler.canZoomInMoreY()) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(1.0f, yDist, trans.f14114x, trans.f14115y);
                    }
                }
                com.github.mikephil.charting.utils.e.recycleInstance(trans);
            }
        }
    }

    private void saveTouchStart(MotionEvent motionEvent) {
        this.mSavedMatrix.set(this.mMatrix);
        this.mTouchStartPoint.f14114x = motionEvent.getX();
        this.mTouchStartPoint.f14115y = motionEvent.getY();
        this.mClosestDataSetToTouch = ((BarLineChartBase) this.mChart).getDataSetByTouchPoint(motionEvent.getX(), motionEvent.getY());
    }

    private static float spacing(MotionEvent motionEvent) {
        float x7 = motionEvent.getX(0) - motionEvent.getX(1);
        float y7 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x7 * x7) + (y7 * y7));
    }

    public void computeScroll() {
        com.github.mikephil.charting.utils.e eVar = this.mDecelerationVelocity;
        if (eVar.f14114x == 0.0f && eVar.f14115y == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.mDecelerationVelocity.f14114x *= ((BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
        this.mDecelerationVelocity.f14115y *= ((BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
        float f8 = (currentAnimationTimeMillis - this.mDecelerationLastTime) / 1000.0f;
        com.github.mikephil.charting.utils.e eVar2 = this.mDecelerationVelocity;
        float f9 = eVar2.f14114x * f8;
        float f10 = eVar2.f14115y * f8;
        com.github.mikephil.charting.utils.e eVar3 = this.mDecelerationCurrentPoint;
        float f11 = eVar3.f14114x + f9;
        eVar3.f14114x = f11;
        float f12 = eVar3.f14115y + f10;
        eVar3.f14115y = f12;
        MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f11, f12, 0);
        performDrag(obtain, ((BarLineChartBase) this.mChart).isDragXEnabled() ? this.mDecelerationCurrentPoint.f14114x - this.mTouchStartPoint.f14114x : 0.0f, ((BarLineChartBase) this.mChart).isDragYEnabled() ? this.mDecelerationCurrentPoint.f14115y - this.mTouchStartPoint.f14115y : 0.0f);
        obtain.recycle();
        this.mMatrix = ((BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, false);
        this.mDecelerationLastTime = currentAnimationTimeMillis;
        if (Math.abs(this.mDecelerationVelocity.f14114x) >= 0.01d || Math.abs(this.mDecelerationVelocity.f14115y) >= 0.01d) {
            i.postInvalidateOnAnimation(this.mChart);
            return;
        }
        ((BarLineChartBase) this.mChart).calculateOffsets();
        ((BarLineChartBase) this.mChart).postInvalidate();
        stopDeceleration();
    }

    public Matrix getMatrix() {
        return this.mMatrix;
    }

    public com.github.mikephil.charting.utils.e getTrans(float f8, float f9) {
        j viewPortHandler = ((BarLineChartBase) this.mChart).getViewPortHandler();
        return com.github.mikephil.charting.utils.e.getInstance(f8 - viewPortHandler.offsetLeft(), inverted() ? -(f9 - viewPortHandler.offsetTop()) : -((((BarLineChartBase) this.mChart).getMeasuredHeight() - f9) - viewPortHandler.offsetBottom()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (((BarLineChartBase) this.mChart).isDoubleTapToZoomEnabled() && ((com.github.mikephil.charting.data.c) ((BarLineChartBase) this.mChart).getData()).getEntryCount() > 0) {
            com.github.mikephil.charting.utils.e trans = getTrans(motionEvent.getX(), motionEvent.getY());
            Chart<?> chart = this.mChart;
            ((BarLineChartBase) chart).zoom(((BarLineChartBase) chart).isScaleXEnabled() ? 1.4f : 1.0f, ((BarLineChartBase) this.mChart).isScaleYEnabled() ? 1.4f : 1.0f, trans.f14114x, trans.f14115y);
            if (((BarLineChartBase) this.mChart).isLogEnabled()) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + trans.f14114x + ", y: " + trans.f14115y);
            }
            com.github.mikephil.charting.utils.e.recycleInstance(trans);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        this.mLastGesture = ChartTouchListener.ChartGesture.FLING;
        ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f8, f9);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        ((BarLineChartBase) this.mChart).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (!((BarLineChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.mVelocityTracker) != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        if (this.mTouchMode == 0) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.mChart).isDragEnabled() && !((BarLineChartBase) this.mChart).isScaleXEnabled() && !((BarLineChartBase) this.mChart).isScaleYEnabled()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            startAction(motionEvent);
            stopDeceleration();
            saveTouchStart(motionEvent);
        } else if (action == 1) {
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            int pointerId = motionEvent.getPointerId(0);
            velocityTracker2.computeCurrentVelocity(1000, i.getMaximumFlingVelocity());
            float yVelocity = velocityTracker2.getYVelocity(pointerId);
            float xVelocity = velocityTracker2.getXVelocity(pointerId);
            if ((Math.abs(xVelocity) > i.getMinimumFlingVelocity() || Math.abs(yVelocity) > i.getMinimumFlingVelocity()) && this.mTouchMode == 1 && ((BarLineChartBase) this.mChart).isDragDecelerationEnabled()) {
                stopDeceleration();
                this.mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
                this.mDecelerationCurrentPoint.f14114x = motionEvent.getX();
                this.mDecelerationCurrentPoint.f14115y = motionEvent.getY();
                com.github.mikephil.charting.utils.e eVar = this.mDecelerationVelocity;
                eVar.f14114x = xVelocity;
                eVar.f14115y = yVelocity;
                i.postInvalidateOnAnimation(this.mChart);
            }
            int i8 = this.mTouchMode;
            if (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) {
                ((BarLineChartBase) this.mChart).calculateOffsets();
                ((BarLineChartBase) this.mChart).postInvalidate();
            }
            this.mTouchMode = 0;
            ((BarLineChartBase) this.mChart).enableScroll();
            VelocityTracker velocityTracker3 = this.mVelocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.mVelocityTracker = null;
            }
            endAction(motionEvent);
        } else if (action == 2) {
            int i9 = this.mTouchMode;
            if (i9 == 1) {
                ((BarLineChartBase) this.mChart).disableScroll();
                performDrag(motionEvent, ((BarLineChartBase) this.mChart).isDragXEnabled() ? motionEvent.getX() - this.mTouchStartPoint.f14114x : 0.0f, ((BarLineChartBase) this.mChart).isDragYEnabled() ? motionEvent.getY() - this.mTouchStartPoint.f14115y : 0.0f);
            } else if (i9 == 2 || i9 == 3 || i9 == 4) {
                ((BarLineChartBase) this.mChart).disableScroll();
                if (((BarLineChartBase) this.mChart).isScaleXEnabled() || ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    performZoom(motionEvent);
                }
            } else if (i9 == 0 && Math.abs(ChartTouchListener.distance(motionEvent.getX(), this.mTouchStartPoint.f14114x, motionEvent.getY(), this.mTouchStartPoint.f14115y)) > this.mDragTriggerDist && ((BarLineChartBase) this.mChart).isDragEnabled()) {
                if (!((BarLineChartBase) this.mChart).isFullyZoomedOut() || !((BarLineChartBase) this.mChart).hasNoDragOffset()) {
                    float abs = Math.abs(motionEvent.getX() - this.mTouchStartPoint.f14114x);
                    float abs2 = Math.abs(motionEvent.getY() - this.mTouchStartPoint.f14115y);
                    if ((((BarLineChartBase) this.mChart).isDragXEnabled() || abs2 >= abs) && (((BarLineChartBase) this.mChart).isDragYEnabled() || abs2 <= abs)) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
                        this.mTouchMode = 1;
                    }
                } else if (((BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
                    if (((BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                        performHighlightDrag(motionEvent);
                    }
                }
            }
        } else if (action == 3) {
            this.mTouchMode = 0;
            endAction(motionEvent);
        } else if (action != 5) {
            if (action == 6) {
                i.velocityTrackerPointerUpCleanUpIfNecessary(motionEvent, this.mVelocityTracker);
                this.mTouchMode = 5;
            }
        } else if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.mChart).disableScroll();
            saveTouchStart(motionEvent);
            this.mSavedXDist = getXDist(motionEvent);
            this.mSavedYDist = getYDist(motionEvent);
            float spacing = spacing(motionEvent);
            this.mSavedDist = spacing;
            if (spacing > 10.0f) {
                if (((BarLineChartBase) this.mChart).isPinchZoomEnabled()) {
                    this.mTouchMode = 4;
                } else if (((BarLineChartBase) this.mChart).isScaleXEnabled() != ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    this.mTouchMode = ((BarLineChartBase) this.mChart).isScaleXEnabled() ? 2 : 3;
                } else {
                    this.mTouchMode = this.mSavedXDist > this.mSavedYDist ? 2 : 3;
                }
            }
            midPoint(this.mTouchPointCenter, motionEvent);
        }
        this.mMatrix = ((BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, true);
        return true;
    }

    public void setDragTriggerDist(float f8) {
        this.mDragTriggerDist = i.convertDpToPixel(f8);
    }

    public void stopDeceleration() {
        com.github.mikephil.charting.utils.e eVar = this.mDecelerationVelocity;
        eVar.f14114x = 0.0f;
        eVar.f14115y = 0.0f;
    }
}
