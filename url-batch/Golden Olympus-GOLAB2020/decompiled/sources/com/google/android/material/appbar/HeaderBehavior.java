package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1281a0;

/* loaded from: classes.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;

    private class FlingRunnable implements Runnable {
        private final V layout;
        private final CoordinatorLayout parent;

        FlingRunnable(CoordinatorLayout coordinatorLayout, V v4) {
            this.parent = coordinatorLayout;
            this.layout = v4;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.layout == null || (overScroller = HeaderBehavior.this.scroller) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
            AbstractC1281a0.g0(this.layout, this);
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    abstract boolean canDragView(V v4);

    final boolean fling(CoordinatorLayout coordinatorLayout, V v4, int i4, int i5, float f4) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v4.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v4.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f4), 0, 0, i4, i5);
        if (!this.scroller.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v4);
            return false;
        }
        FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v4);
        this.flingRunnable = flingRunnable;
        AbstractC1281a0.g0(v4, flingRunnable);
        return true;
    }

    abstract int getMaxDragOffset(V v4);

    abstract int getScrollRangeForDragFling(V v4);

    abstract int getTopBottomOffsetForScrollingSibling();

    abstract void onFlingFinished(CoordinatorLayout coordinatorLayout, V v4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i4 = this.activePointerId;
            if (i4 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i4)) == -1) {
                return false;
            }
            int y4 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y4 - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y4;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x4 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            boolean z4 = canDragView(v4) && coordinatorLayout.isPointInChildBounds(v4, x4, y5);
            this.isBeingDragged = z4;
            if (z4) {
                this.lastMotionY = y5;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        boolean z4;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y4 = (int) motionEvent.getY(findPointerIndex);
                int i4 = this.lastMotionY - y4;
                this.lastMotionY = y4;
                scroll(coordinatorLayout, v4, i4, getMaxDragOffset(v4), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i5 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.activePointerId = motionEvent.getPointerId(i5);
                    this.lastMotionY = (int) (motionEvent.getY(i5) + 0.5f);
                }
            }
            z4 = false;
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.isBeingDragged || z4;
        }
        VelocityTracker velocityTracker3 = this.velocityTracker;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.velocityTracker.computeCurrentVelocity(1000);
            fling(coordinatorLayout, v4, -getScrollRangeForDragFling(v4), 0, this.velocityTracker.getYVelocity(this.activePointerId));
            z4 = true;
            this.isBeingDragged = false;
            this.activePointerId = -1;
            velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
            }
            if (this.isBeingDragged) {
            }
        }
        z4 = false;
        this.isBeingDragged = false;
        this.activePointerId = -1;
        velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
        }
        if (this.isBeingDragged) {
        }
    }

    final int scroll(CoordinatorLayout coordinatorLayout, V v4, int i4, int i5, int i6) {
        return setHeaderTopBottomOffset(coordinatorLayout, v4, getTopBottomOffsetForScrollingSibling() - i4, i5, i6);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v4, int i4) {
        return setHeaderTopBottomOffset(coordinatorLayout, v4, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v4, int i4, int i5, int i6);

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }
}
