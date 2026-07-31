package com.yandex.div.internal.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC1281a0;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public class NestedHorizontalScrollCompanion {
    private boolean mCanDispatchNestedScroll;
    private float mDownX;
    private float mDownY;
    private final float mSlop;
    private final View mTarget;

    public NestedHorizontalScrollCompanion(@NonNull View view) {
        this(view, getScaledTouchSlop(view));
    }

    private static int getScaledTouchSlop(@NonNull View view) {
        return ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    public void dispatchOnOverScrolled(boolean z4) {
        if (this.mCanDispatchNestedScroll && z4) {
            AbstractC1281a0.h(this.mTarget, 0, 0, 1, 0, null);
        }
    }

    public void dispatchOnScrollChanged() {
        this.mCanDispatchNestedScroll = false;
    }

    public void dispatchTouchEventAfterSuperCall(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.mDownX);
                float abs2 = Math.abs(motionEvent.getY() - this.mDownY);
                if (this.mCanDispatchNestedScroll || abs < this.mSlop || abs <= abs2) {
                    return;
                }
                this.mCanDispatchNestedScroll = true;
                AbstractC1281a0.N0(this.mTarget, 1);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.mCanDispatchNestedScroll = false;
        AbstractC1281a0.P0(this.mTarget);
    }

    NestedHorizontalScrollCompanion(@NonNull View view, float f4) {
        this.mTarget = view;
        AbstractC1281a0.D0(view, true);
        this.mSlop = f4;
    }

    public NestedHorizontalScrollCompanion(@NonNull ViewPager viewPager) {
        this(viewPager, getScaledTouchSlop(viewPager));
    }
}
