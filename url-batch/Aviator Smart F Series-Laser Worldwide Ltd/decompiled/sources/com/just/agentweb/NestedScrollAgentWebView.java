package com.just.agentweb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;

/* loaded from: classes4.dex */
public class NestedScrollAgentWebView extends AgentWebView implements NestedScrollingChild {
    private NestedScrollingChildHelper mChildHelper;
    private int mLastMotionY;
    private int mNestedYOffset;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;

    public NestedScrollAgentWebView(Context context) {
        super(context);
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        init();
    }

    private void init() {
        this.mChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f8, float f9, boolean z7) {
        return this.mChildHelper.dispatchNestedFling(f8, f9, z7);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.mChildHelper.dispatchNestedPreFling(f8, f9);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return this.mChildHelper.dispatchNestedPreScroll(i8, i9, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return this.mChildHelper.dispatchNestedScroll(i8, i9, i10, i11, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
        }
        int y7 = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, this.mNestedYOffset);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i8 = this.mLastMotionY - y7;
                    if (dispatchNestedPreScroll(0, i8, this.mScrollConsumed, this.mScrollOffset)) {
                        i8 -= this.mScrollConsumed[1];
                        obtain.offsetLocation(0.0f, this.mScrollOffset[1]);
                        this.mNestedYOffset += this.mScrollOffset[1];
                    }
                    this.mLastMotionY = y7 - this.mScrollOffset[1];
                    int scrollY = getScrollY();
                    int max = Math.max(0, scrollY + i8) - scrollY;
                    if (dispatchNestedScroll(0, max, 0, i8 - max, this.mScrollOffset)) {
                        int i9 = this.mLastMotionY;
                        int i10 = this.mScrollOffset[1];
                        this.mLastMotionY = i9 - i10;
                        obtain.offsetLocation(0.0f, i10);
                        this.mNestedYOffset += this.mScrollOffset[1];
                    }
                    boolean onTouchEvent = super.onTouchEvent(obtain);
                    obtain.recycle();
                    return onTouchEvent;
                }
                if (actionMasked != 3 && actionMasked != 5) {
                    return false;
                }
            }
            stopNestedScroll();
        } else {
            this.mLastMotionY = y7;
            startNestedScroll(2);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z7) {
        this.mChildHelper.setNestedScrollingEnabled(z7);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i8) {
        return this.mChildHelper.startNestedScroll(i8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.mChildHelper.stopNestedScroll();
    }

    public NestedScrollAgentWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        init();
    }
}
