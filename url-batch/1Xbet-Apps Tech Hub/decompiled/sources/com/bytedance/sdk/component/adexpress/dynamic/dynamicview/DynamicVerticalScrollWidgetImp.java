package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;

/* loaded from: classes.dex */
public class DynamicVerticalScrollWidgetImp extends DynamicBaseWidgetImp implements NB {
    private Runnable OT;
    ObjectAnimator icD;
    ObjectAnimator pvs;
    private boolean rCZ;
    private int uc;

    public DynamicVerticalScrollWidgetImp(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.uc = 0;
        this.rCZ = false;
        this.OT = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicVerticalScrollWidgetImp.this.pvs();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs() {
        View childAt;
        final View view;
        final View childAt2 = getChildAt(this.uc);
        int i = this.uc;
        if (i == 0) {
            this.rCZ = false;
        }
        boolean z = i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.uc + 1)).getChildCount() <= 0;
        if (!this.Ju.Wyp().NB().pvs() && z) {
            this.rCZ = true;
            view = getChildAt(this.uc - 1);
            this.pvs = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (this.so + getChildAt(this.uc).getHeight()) / 2);
        } else {
            if (z) {
                childAt = getChildAt((this.uc + 2) % getChildCount());
            } else {
                childAt = getChildAt((this.uc + 1) % getChildCount());
            }
            this.pvs = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (-(this.so + getChildAt(this.uc).getHeight())) / 2);
            if (z) {
                this.uc++;
            }
            view = childAt;
        }
        this.pvs.setInterpolator(new LinearInterpolator());
        this.pvs.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.2
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
                childAt2.setVisibility(8);
            }
        });
        if (this.rCZ) {
            this.icD = ObjectAnimator.ofFloat(view, "translationY", (-(this.so + view.getHeight())) / 2, 0.0f);
        } else {
            this.icD = ObjectAnimator.ofFloat(view, "translationY", (this.so + view.getHeight()) / 2, 0.0f);
        }
        this.icD.setInterpolator(new LinearInterpolator());
        this.icD.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.3
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
                view.setVisibility(0);
            }
        });
        this.pvs.setDuration(500L);
        this.icD.setDuration(500L);
        this.pvs.start();
        this.icD.start();
        if (this.rCZ) {
            this.uc--;
        } else {
            int i2 = this.uc + 1;
            this.uc = i2;
            this.uc = i2 % getChildCount();
        }
        postDelayed(this.OT, 3000L);
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
        postDelayed(this.OT, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NB
    public void icD() {
        removeCallbacks(this.OT);
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
