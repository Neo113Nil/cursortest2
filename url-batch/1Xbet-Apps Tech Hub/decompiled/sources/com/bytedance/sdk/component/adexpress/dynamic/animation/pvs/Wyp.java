package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RubInAnimation.java */
/* loaded from: classes.dex */
public class Wyp extends Jd {
    private pvs Jd;
    private float NB;
    private float sUS;

    public Wyp(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        int i;
        String str;
        if ((this.vG instanceof ImageView) && (this.vG.getParent() instanceof DynamicBaseWidget)) {
            this.vG = (View) this.vG.getParent();
        }
        this.vG.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "alpha", 0.0f, 1.0f).setDuration((int) (this.icD.Wyp() * 1000.0d));
        this.Jd = new pvs(this.vG);
        final int i2 = this.vG.getLayoutParams().height;
        this.NB = i2;
        this.sUS = this.vG.getLayoutParams().width;
        if ("left".equals(this.icD.pvs()) || "right".equals(this.icD.pvs())) {
            i = (int) this.sUS;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.Jd, str, 0, i).setDuration((int) (this.icD.Wyp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvs(duration));
        arrayList.add(pvs(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Wyp.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Wyp.this.Jd.pvs(i2);
            }
        });
        return arrayList;
    }

    /* compiled from: RubInAnimation.java */
    private class pvs {
        private View icD;

        public pvs(View view) {
            this.icD = view;
        }

        public void pvs(int i) {
            if ("top".equals(Wyp.this.icD.pvs())) {
                if (Wyp.this.vG instanceof ViewGroup) {
                    for (int i2 = 0; i2 < ((ViewGroup) Wyp.this.vG).getChildCount(); i2++) {
                        ((ViewGroup) Wyp.this.vG).getChildAt(i2).setTranslationY(i - Wyp.this.NB);
                    }
                }
                Wyp.this.vG.setTranslationY(Wyp.this.NB - i);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.icD.getLayoutParams();
            layoutParams.height = i;
            this.icD.setLayoutParams(layoutParams);
            this.icD.requestLayout();
        }
    }
}
