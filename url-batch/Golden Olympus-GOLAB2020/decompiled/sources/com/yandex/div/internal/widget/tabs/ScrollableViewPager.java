package com.yandex.div.internal.widget.tabs;

import N.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.util.Set;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class ScrollableViewPager extends RtlViewPager {
    private Set<Integer> mDisabledPages;
    private boolean mIsEdgeScrollEnabled;
    private boolean mIsScrollEnabled;
    private boolean mIsScrollLocked;
    private boolean mIsSwipeLocked;
    private final NestedHorizontalScrollCompanion mNestedScrollCompanion;
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;
    private N.c mViewDragHelper;

    public ScrollableViewPager(@NonNull Context context) {
        this(context, null);
    }

    private boolean processTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!this.mIsEdgeScrollEnabled && this.mViewDragHelper != null) {
            if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                this.mIsSwipeLocked = false;
            }
            this.mViewDragHelper.z(motionEvent);
        }
        Set<Integer> set = this.mDisabledPages;
        if (set != null) {
            this.mIsScrollLocked = this.mIsScrollEnabled && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.mIsSwipeLocked || this.mIsScrollLocked || !this.mIsScrollEnabled) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.mNestedScrollCompanion.dispatchTouchEventAfterSuperCall(motionEvent);
        return dispatchTouchEvent;
    }

    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.mOnInterceptTouchEventListener;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.mOnInterceptTouchEventListener;
        if (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent) : false) {
            return true;
        }
        return processTouchEvent(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        this.mNestedScrollCompanion.dispatchOnScrollChanged();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return processTouchEvent(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(Set<Integer> set) {
        this.mDisabledPages = set;
    }

    public void setEdgeScrollEnabled(boolean z4) {
        this.mIsEdgeScrollEnabled = z4;
        if (z4) {
            return;
        }
        N.c m4 = N.c.m(this, new c.AbstractC0021c() { // from class: com.yandex.div.internal.widget.tabs.ScrollableViewPager.1
            @Override // N.c.AbstractC0021c
            public void onEdgeDragStarted(int i4, int i5) {
                super.onEdgeDragStarted(i4, i5);
                ScrollableViewPager scrollableViewPager = ScrollableViewPager.this;
                boolean z5 = true;
                if ((i4 & 2) == 0 && (i4 & 1) == 0) {
                    z5 = false;
                }
                scrollableViewPager.mIsSwipeLocked = z5;
            }

            @Override // N.c.AbstractC0021c
            public boolean tryCaptureView(View view, int i4) {
                return false;
            }
        });
        this.mViewDragHelper = m4;
        m4.F(3);
    }

    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setScrollEnabled(boolean z4) {
        this.mIsScrollEnabled = z4;
    }

    public ScrollableViewPager(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNestedScrollCompanion = new NestedHorizontalScrollCompanion((ViewPager) this);
        this.mIsScrollEnabled = true;
        this.mIsEdgeScrollEnabled = true;
        this.mIsSwipeLocked = false;
        this.mIsScrollLocked = false;
    }
}
