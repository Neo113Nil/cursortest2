package com.mopub.mobileads;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.mopub.common.AdReport;

/* loaded from: classes2.dex */
public class AdAlertGestureListener extends GestureDetector.SimpleOnGestureListener {
    private static final float MAXIMUM_THRESHOLD_X_IN_DIPS = 100.0f;
    private static final float MAXIMUM_THRESHOLD_Y_IN_DIPS = 100.0f;
    private static final int MINIMUM_NUMBER_OF_ZIGZAGS_TO_FLAG = 4;
    private AdAlertReporter mAdAlertReporter;
    private final AdReport mAdReport;
    private float mCurrentThresholdInDips;
    private ZigZagState mCurrentZigZagState = ZigZagState.UNSET;
    private boolean mHasCrossedLeftThreshold;
    private boolean mHasCrossedRightThreshold;
    private int mNumberOfZigZags;
    private float mPivotPositionX;
    private float mPreviousPositionX;
    private View mView;

    enum ZigZagState {
        UNSET,
        GOING_RIGHT,
        GOING_LEFT,
        FINISHED,
        FAILED
    }

    AdAlertGestureListener(View view, AdReport adReport) {
        this.mCurrentThresholdInDips = 100.0f;
        if (view != null && view.getWidth() > 0) {
            this.mCurrentThresholdInDips = Math.min(100.0f, view.getWidth() / 3.0f);
        }
        this.mView = view;
        this.mAdReport = adReport;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.mCurrentZigZagState == ZigZagState.FINISHED) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        if (isTouchOutOfBoundsOnYAxis(motionEvent.getY(), motionEvent2.getY())) {
            this.mCurrentZigZagState = ZigZagState.FAILED;
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        switch (this.mCurrentZigZagState) {
            case UNSET:
                this.mPivotPositionX = motionEvent.getX();
                updateInitialState(motionEvent2.getX());
                break;
            case GOING_RIGHT:
                updateZig(motionEvent2.getX());
                break;
            case GOING_LEFT:
                updateZag(motionEvent2.getX());
                break;
        }
        this.mPreviousPositionX = motionEvent2.getX();
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    void finishGestureDetection() {
        ZigZagState zigZagState = this.mCurrentZigZagState;
        ZigZagState zigZagState2 = this.mCurrentZigZagState;
        if (zigZagState == ZigZagState.FINISHED) {
            this.mAdAlertReporter = new AdAlertReporter(this.mView.getContext(), this.mView, this.mAdReport);
            this.mAdAlertReporter.send();
        }
        reset();
    }

    void reset() {
        this.mNumberOfZigZags = 0;
        this.mCurrentZigZagState = ZigZagState.UNSET;
    }

    private boolean isTouchOutOfBoundsOnYAxis(float f, float f2) {
        return Math.abs(f2 - f) > 100.0f;
    }

    private void updateInitialState(float f) {
        if (f > this.mPivotPositionX) {
            this.mCurrentZigZagState = ZigZagState.GOING_RIGHT;
        }
    }

    private void updateZig(float f) {
        if (rightThresholdReached(f) && isMovingLeft(f)) {
            this.mCurrentZigZagState = ZigZagState.GOING_LEFT;
            this.mPivotPositionX = f;
        }
    }

    private void updateZag(float f) {
        if (leftThresholdReached(f) && isMovingRight(f)) {
            this.mCurrentZigZagState = ZigZagState.GOING_RIGHT;
            this.mPivotPositionX = f;
        }
    }

    private void incrementNumberOfZigZags() {
        this.mNumberOfZigZags++;
        if (this.mNumberOfZigZags >= 4) {
            this.mCurrentZigZagState = ZigZagState.FINISHED;
        }
    }

    private boolean rightThresholdReached(float f) {
        if (this.mHasCrossedRightThreshold) {
            return true;
        }
        if (f < this.mPivotPositionX + this.mCurrentThresholdInDips) {
            return false;
        }
        this.mHasCrossedLeftThreshold = false;
        this.mHasCrossedRightThreshold = true;
        return true;
    }

    private boolean leftThresholdReached(float f) {
        if (this.mHasCrossedLeftThreshold) {
            return true;
        }
        if (f > this.mPivotPositionX - this.mCurrentThresholdInDips) {
            return false;
        }
        this.mHasCrossedRightThreshold = false;
        this.mHasCrossedLeftThreshold = true;
        incrementNumberOfZigZags();
        return true;
    }

    private boolean isMovingRight(float f) {
        return f > this.mPreviousPositionX;
    }

    private boolean isMovingLeft(float f) {
        return f < this.mPreviousPositionX;
    }

    @Deprecated
    int getNumberOfZigzags() {
        return this.mNumberOfZigZags;
    }

    @Deprecated
    float getMinimumDipsInZigZag() {
        return this.mCurrentThresholdInDips;
    }

    @Deprecated
    ZigZagState getCurrentZigZagState() {
        return this.mCurrentZigZagState;
    }

    @Deprecated
    AdAlertReporter getAdAlertReporter() {
        return this.mAdAlertReporter;
    }
}
