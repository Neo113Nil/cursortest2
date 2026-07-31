package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class fb extends hhw {
    ObjectAnimator fs;
    private int iqz;
    private Runnable phc;
    ObjectAnimator zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn() {
        final View childAt = getChildAt(this.iqz);
        final View childAt2 = getChildAt((this.iqz + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(this.zg + getChildAt(this.iqz).getHeight())) / 2);
        this.zmn = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.zmn.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fb.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (this.zg + childAt2.getHeight()) / 2, 0.0f);
        this.fs = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.fs.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fb.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.zmn.setDuration(500L);
        this.fs.setDuration(500L);
        this.zmn.start();
        this.fs.start();
        int i = this.iqz + 1;
        this.iqz = i;
        this.iqz = i % getChildCount();
        postDelayed(this.phc, 2000L);
    }

    public fb(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        this.iqz = 0;
        this.phc = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fb.1
            @Override // java.lang.Runnable
            public void run() {
                fb.this.zmn();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.zg - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.phc, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkt
    public void fs() {
        removeCallbacks(this.phc);
        ObjectAnimator objectAnimator = this.zmn;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.zmn.cancel();
        }
        ObjectAnimator objectAnimator2 = this.fs;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.fs.cancel();
        }
        super.fs();
    }
}
