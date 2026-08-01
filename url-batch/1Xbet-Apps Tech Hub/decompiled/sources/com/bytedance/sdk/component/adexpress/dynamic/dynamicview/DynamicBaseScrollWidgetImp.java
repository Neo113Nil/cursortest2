package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;

/* loaded from: classes.dex */
public class DynamicBaseScrollWidgetImp extends DynamicBaseWidgetImp implements NB {
    ObjectAnimator icD;
    ObjectAnimator pvs;
    private Runnable rCZ;
    private int uc;

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs() {
        final View childAt = getChildAt(this.uc);
        final View childAt2 = getChildAt((this.uc + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(this.so + getChildAt(this.uc).getHeight())) / 2);
        this.pvs = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.pvs.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.2
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
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (this.so + childAt2.getHeight()) / 2, 0.0f);
        this.icD = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.icD.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.3
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
        this.pvs.setDuration(500L);
        this.icD.setDuration(500L);
        this.pvs.start();
        this.icD.start();
        int i = this.uc + 1;
        this.uc = i;
        this.uc = i % getChildCount();
        postDelayed(this.rCZ, 2000L);
    }

    public DynamicBaseScrollWidgetImp(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.uc = 0;
        this.rCZ = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicBaseScrollWidgetImp.this.pvs();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.so - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.rCZ, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NB
    public void icD() {
        removeCallbacks(this.rCZ);
        ObjectAnimator objectAnimator = this.pvs;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.pvs.cancel();
        }
        ObjectAnimator objectAnimator2 = this.icD;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.icD.cancel();
        }
        super.icD();
    }
}
