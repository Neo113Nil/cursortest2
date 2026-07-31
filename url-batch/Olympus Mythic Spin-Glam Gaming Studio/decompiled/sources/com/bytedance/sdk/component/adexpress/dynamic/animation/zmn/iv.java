package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class iv extends fb {
    private float btk;
    private zmn fb;
    private float hhw;

    public iv(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    List<ObjectAnimator> zmn() {
        int i;
        String str;
        View view = this.zn;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk)) {
            this.zn = (View) this.zn.getParent();
        }
        this.zn.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "alpha", 0.0f, 1.0f).setDuration((int) (this.fs.iv() * 1000.0d));
        this.fb = new zmn(this.zn);
        final int i2 = this.zn.getLayoutParams().height;
        this.btk = i2;
        this.hhw = this.zn.getLayoutParams().width;
        if ("left".equals(this.fs.zmn()) || "right".equals(this.fs.zmn())) {
            i = (int) this.hhw;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.fb, str, 0, i).setDuration((int) (this.fs.iv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zmn(duration));
        arrayList.add(zmn(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.iv.1
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
                iv.this.fb.zmn(i2);
            }
        });
        return arrayList;
    }

    private class zmn {
        private View fs;

        public zmn(View view) {
            this.fs = view;
        }

        public void zmn(int i) {
            if (ViewHierarchyConstants.DIMENSION_TOP_KEY.equals(iv.this.fs.zmn())) {
                if (iv.this.zn instanceof ViewGroup) {
                    for (int i2 = 0; i2 < ((ViewGroup) iv.this.zn).getChildCount(); i2++) {
                        ((ViewGroup) iv.this.zn).getChildAt(i2).setTranslationY(i - iv.this.btk);
                    }
                }
                iv ivVar = iv.this;
                ivVar.zn.setTranslationY(ivVar.btk - i);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.fs.getLayoutParams();
            layoutParams.height = i;
            this.fs.setLayoutParams(layoutParams);
            this.fs.requestLayout();
        }
    }
}
