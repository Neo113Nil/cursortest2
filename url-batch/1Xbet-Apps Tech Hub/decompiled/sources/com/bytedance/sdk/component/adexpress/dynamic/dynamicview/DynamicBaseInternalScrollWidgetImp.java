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
public class DynamicBaseInternalScrollWidgetImp extends DynamicBaseWidgetImp implements NB {
    private Runnable OT;
    ObjectAnimator icD;
    ObjectAnimator pvs;
    private boolean rCZ;
    private int uc;

    public DynamicBaseInternalScrollWidgetImp(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.uc = 0;
        this.rCZ = false;
        this.OT = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicBaseInternalScrollWidgetImp.this.pvs();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs() {
        final View childAt;
        final View childAt2 = getChildAt(this.uc);
        int i = this.uc;
        if (i == 0) {
            this.rCZ = false;
        }
        if (i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.uc + 1)).getChildCount() <= 0) {
            this.rCZ = true;
            childAt = getChildAt(this.uc - 1);
            this.pvs = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (this.yiw + getChildAt(this.uc).getWidth()) / 2);
        } else {
            childAt = getChildAt(this.uc + 1);
            this.pvs = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(this.yiw + getChildAt(this.uc).getWidth())) / 2);
        }
        this.pvs.setInterpolator(new LinearInterpolator());
        this.pvs.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp.2
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
            this.icD = ObjectAnimator.ofFloat(childAt, "translationX", (-(this.yiw + childAt.getWidth())) / 2, 0.0f);
        } else {
            this.icD = ObjectAnimator.ofFloat(childAt, "translationX", (this.yiw + childAt.getWidth()) / 2, 0.0f);
        }
        this.icD.setInterpolator(new LinearInterpolator());
        this.icD.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp.3
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
                childAt.setVisibility(0);
            }
        });
        this.pvs.setDuration(500L);
        this.icD.setDuration(500L);
        this.pvs.start();
        this.icD.start();
        if (this.rCZ) {
            this.uc--;
        } else {
            this.uc++;
        }
        postDelayed(this.OT, 2000L);
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
