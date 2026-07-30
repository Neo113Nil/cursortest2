package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;

/* loaded from: classes4.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;

    @Nullable
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;

    @Nullable
    private VelocityTracker velocityTracker;

    private class FlingRunnable implements Runnable {
        private final V layout;
        private final CoordinatorLayout parent;

        FlingRunnable(CoordinatorLayout coordinatorLayout, V v7) {
            this.parent = coordinatorLayout;
            this.layout = v7;
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
            this.layout.postOnAnimation(this);
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

    boolean canDragView(V v7) {
        return false;
    }

    final boolean fling(CoordinatorLayout coordinatorLayout, @NonNull V v7, int i8, int i9, float f8) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v7.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v7.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f8), 0, 0, i8, i9);
        if (!this.scroller.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v7);
            return false;
        }
        FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v7);
        this.flingRunnable = flingRunnable;
        v7.postOnAnimation(flingRunnable);
        return true;
    }

    int getMaxDragOffset(@NonNull V v7) {
        return -v7.getHeight();
    }

    int getScrollRangeForDragFling(@NonNull V v7) {
        return v7.getHeight();
    }

    int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    void onFlingFinished(CoordinatorLayout coordinatorLayout, V v7) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i8 = this.activePointerId;
            if (i8 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i8)) == -1) {
                return false;
            }
            int y7 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y7 - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y7;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x7 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            boolean z7 = canDragView(v7) && coordinatorLayout.isPointInChildBounds(v7, x7, y8);
            this.isBeingDragged = z7;
            if (z7) {
                this.lastMotionY = y8;
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull MotionEvent motionEvent) {
        boolean z7;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y7 = (int) motionEvent.getY(findPointerIndex);
                int i8 = this.lastMotionY - y7;
                this.lastMotionY = y7;
                scroll(coordinatorLayout, v7, i8, getMaxDragOffset(v7), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i9 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.activePointerId = motionEvent.getPointerId(i9);
                    this.lastMotionY = (int) (motionEvent.getY(i9) + 0.5f);
                }
            }
            z7 = false;
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.isBeingDragged || z7;
        }
        VelocityTracker velocityTracker3 = this.velocityTracker;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.velocityTracker.computeCurrentVelocity(1000);
            fling(coordinatorLayout, v7, -getScrollRangeForDragFling(v7), 0, this.velocityTracker.getYVelocity(this.activePointerId));
            z7 = true;
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
                return true;
            }
        }
        z7 = false;
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

    final int scroll(CoordinatorLayout coordinatorLayout, V v7, int i8, int i9, int i10) {
        return setHeaderTopBottomOffset(coordinatorLayout, v7, getTopBottomOffsetForScrollingSibling() - i8, i9, i10);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v7, int i8) {
        return setHeaderTopBottomOffset(coordinatorLayout, v7, i8, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v7, int i8, int i9, int i10) {
        int clamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i9 == 0 || topAndBottomOffset < i9 || topAndBottomOffset > i10 || topAndBottomOffset == (clamp = MathUtils.clamp(i8, i9, i10))) {
            return 0;
        }
        setTopAndBottomOffset(clamp);
        return topAndBottomOffset - clamp;
    }
}
