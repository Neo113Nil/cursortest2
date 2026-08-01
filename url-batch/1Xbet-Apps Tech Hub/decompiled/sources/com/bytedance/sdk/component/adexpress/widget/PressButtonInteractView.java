package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class PressButtonInteractView extends FrameLayout {
    private AnimatorSet Jd;
    private boolean NB;
    private ImageView icD;
    private Context pvs;
    private SplashDiffuseView vG;

    public PressButtonInteractView(Context context) {
        super(context);
        this.NB = true;
        this.pvs = context;
        this.Jd = new AnimatorSet();
        vG();
        Jd();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.icD.getLayoutParams();
                layoutParams.topMargin = (int) ((PressButtonInteractView.this.vG.getMeasuredHeight() / 2.0f) - yiw.pvs(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((PressButtonInteractView.this.vG.getMeasuredWidth() / 2.0f) - yiw.pvs(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-PressButtonInteractView.this.vG.getMeasuredHeight()) / 2.0f) + yiw.pvs(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-PressButtonInteractView.this.vG.getMeasuredWidth()) / 2.0f) + yiw.pvs(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                PressButtonInteractView.this.icD.setLayoutParams(layoutParams);
            }
        });
    }

    private void vG() {
        this.vG = new SplashDiffuseView(this.pvs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 40.0f), (int) yiw.pvs(this.pvs, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.vG, layoutParams);
        this.icD = new ImageView(this.pvs);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 62.0f), (int) yiw.pvs(this.pvs, 62.0f));
        layoutParams2.gravity = 16;
        this.icD.setImageResource(uc.Jd(this.pvs, "tt_splash_hand"));
        addView(this.icD, layoutParams2);
    }

    private void Jd() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.icD, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(PressButtonInteractView.this.icD, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                PressButtonInteractView.this.icD.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.NB) {
                    PressButtonInteractView.this.vG.pvs();
                }
                PressButtonInteractView.this.NB = !r2.NB;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.icD, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.Jd.playTogether(ofFloat, ofFloat2);
    }

    public void pvs() {
        this.Jd.start();
    }

    public void icD() {
        AnimatorSet animatorSet = this.Jd;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        SplashDiffuseView splashDiffuseView = this.vG;
        if (splashDiffuseView != null) {
            splashDiffuseView.icD();
        }
        ImageView imageView = this.icD;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
