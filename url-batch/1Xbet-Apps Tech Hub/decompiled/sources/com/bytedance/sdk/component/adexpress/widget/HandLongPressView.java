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
public class HandLongPressView extends FrameLayout {
    private AnimatorSet Jd;
    private boolean NB;
    private ImageView icD;
    private Context pvs;
    private TextView sUS;
    private CircleRippleView vG;

    public HandLongPressView(Context context) {
        super(context);
        this.NB = true;
        this.pvs = context;
        this.Jd = new AnimatorSet();
        vG();
        Jd();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.HandLongPressView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) HandLongPressView.this.icD.getLayoutParams();
                layoutParams.topMargin = ((int) ((HandLongPressView.this.vG.getMeasuredHeight() / 2.0f) - yiw.pvs(HandLongPressView.this.getContext(), 5.0f))) + ((int) yiw.pvs(HandLongPressView.this.pvs, 20.0f));
                layoutParams.leftMargin = ((int) ((HandLongPressView.this.vG.getMeasuredWidth() / 2.0f) - yiw.pvs(HandLongPressView.this.getContext(), 5.0f))) + ((int) yiw.pvs(HandLongPressView.this.pvs, 20.0f));
                layoutParams.bottomMargin = (int) (((-HandLongPressView.this.vG.getMeasuredHeight()) / 2.0f) + yiw.pvs(HandLongPressView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-HandLongPressView.this.vG.getMeasuredWidth()) / 2.0f) + yiw.pvs(HandLongPressView.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                HandLongPressView.this.icD.setLayoutParams(layoutParams);
            }
        });
    }

    private void vG() {
        this.vG = new CircleRippleView(this.pvs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 80.0f), (int) yiw.pvs(this.pvs, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) yiw.pvs(this.pvs, 20.0f);
        layoutParams.leftMargin = (int) yiw.pvs(this.pvs, 20.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.vG, layoutParams);
        this.vG.pvs();
        this.icD = new ImageView(this.pvs);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 80.0f), (int) yiw.pvs(this.pvs, 80.0f));
        this.icD.setImageResource(uc.Jd(this.pvs, "tt_splash_hand"));
        addView(this.icD, layoutParams2);
        TextView textView = new TextView(this.pvs);
        this.sUS = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) yiw.pvs(this.pvs, 10.0f);
        addView(this.sUS, layoutParams3);
    }

    private void Jd() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.icD, "scaleX", 1.0f, 0.8f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.HandLongPressView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(HandLongPressView.this.icD, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                HandLongPressView.this.icD.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (HandLongPressView.this.NB) {
                    HandLongPressView.this.vG.pvs();
                    HandLongPressView.this.vG.setAlpha(1.0f);
                } else {
                    HandLongPressView.this.vG.icD();
                    HandLongPressView.this.vG.setAlpha(0.0f);
                }
                HandLongPressView.this.NB = !r2.NB;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.icD, "scaleY", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.Jd.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
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
        CircleRippleView circleRippleView = this.vG;
        if (circleRippleView != null) {
            circleRippleView.icD();
        }
    }
}
