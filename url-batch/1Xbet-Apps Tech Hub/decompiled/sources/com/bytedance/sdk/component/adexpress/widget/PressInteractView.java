package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class PressInteractView extends FrameLayout {
    private AnimatorSet Jd;
    private boolean NB;
    private ImageView icD;
    private Context pvs;
    private TextView sUS;
    private SplashDiffuseView vG;

    public PressInteractView(Context context) {
        super(context);
        this.NB = true;
        this.pvs = context;
        this.Jd = new AnimatorSet();
        vG();
        Jd();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.PressInteractView.1
            @Override // java.lang.Runnable
            public void run() {
                int pvs = (int) yiw.pvs(PressInteractView.this.pvs, 50.0f);
                int pvs2 = (int) yiw.pvs(PressInteractView.this.pvs, 50.0f);
                if (PressInteractView.this.vG.getMeasuredHeight() > 0) {
                    pvs = PressInteractView.this.vG.getMeasuredHeight();
                }
                if (PressInteractView.this.vG.getMeasuredWidth() > 0) {
                    pvs2 = PressInteractView.this.vG.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressInteractView.this.icD.getLayoutParams();
                layoutParams.topMargin = ((int) ((pvs / 2.0f) - yiw.pvs(PressInteractView.this.getContext(), 5.0f))) + ((int) yiw.pvs(PressInteractView.this.pvs, 40.0f));
                layoutParams.leftMargin = ((int) ((pvs2 / 2.0f) - yiw.pvs(PressInteractView.this.getContext(), 5.0f))) + ((int) yiw.pvs(PressInteractView.this.pvs, 20.0f));
                layoutParams.bottomMargin = (int) (((-pvs) / 2.0f) + yiw.pvs(PressInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-pvs2) / 2.0f) + yiw.pvs(PressInteractView.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                PressInteractView.this.icD.setLayoutParams(layoutParams);
            }
        });
    }

    private void vG() {
        this.vG = new SplashDiffuseView(this.pvs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 50.0f), (int) yiw.pvs(this.pvs, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) yiw.pvs(this.pvs, 40.0f);
        layoutParams.leftMargin = (int) yiw.pvs(this.pvs, 20.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.vG, layoutParams);
        this.icD = new ImageView(this.pvs);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 78.0f), (int) yiw.pvs(this.pvs, 78.0f));
        this.icD.setImageResource(uc.Jd(this.pvs, "tt_splash_hand"));
        addView(this.icD, layoutParams2);
        TextView textView = new TextView(this.pvs);
        this.sUS = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) yiw.pvs(this.pvs, 10.0f);
        addView(this.sUS, layoutParams3);
        this.sUS.setVisibility(8);
    }

    private void Jd() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.icD, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat.setDuration(600L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.PressInteractView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(PressInteractView.this.icD, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                PressInteractView.this.icD.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (PressInteractView.this.NB) {
                    PressInteractView.this.vG.pvs();
                }
                PressInteractView.this.NB = !r2.NB;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.icD, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat2.setDuration(600L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.Jd.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
        this.sUS.setVisibility(0);
        this.sUS.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.sUS.setTextColor(i);
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
