package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class SlideRightView extends FrameLayout {
    private ImageView Jd;
    private AnimatorSet Mxy;
    private TextView NB;
    private ImageView icD;
    private Context pvs;
    private AnimatorSet sUS;
    private AnimatorSet so;
    private ImageView vG;
    private AnimatorSet yiw;

    public SlideRightView(Context context) {
        super(context);
        this.sUS = new AnimatorSet();
        this.yiw = new AnimatorSet();
        this.so = new AnimatorSet();
        this.Mxy = new AnimatorSet();
        this.pvs = context;
        vG();
    }

    private void vG() {
        ImageView imageView = new ImageView(this.pvs);
        this.Jd = imageView;
        imageView.setBackgroundResource(uc.Jd(this.pvs, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) yiw.pvs(this.pvs, 30.0f);
        addView(this.Jd, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.pvs);
        this.vG = imageView2;
        imageView2.setImageResource(uc.Jd(this.pvs, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 50.0f), (int) yiw.pvs(this.pvs, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) yiw.pvs(this.pvs, 30.0f);
        addView(this.vG, layoutParams2);
        ImageView imageView3 = new ImageView(this.pvs);
        this.icD = imageView3;
        imageView3.setImageResource(uc.Jd(this.pvs, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 80.0f), (int) yiw.pvs(this.pvs, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) yiw.pvs(this.pvs, 30.0f);
        addView(this.icD, layoutParams3);
        TextView textView = new TextView(this.pvs);
        this.NB = textView;
        textView.setTextColor(-1);
        this.NB.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.NB, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) SlideRightView.this.icD.getLayoutParams();
                layoutParams5.topMargin = (int) ((SlideRightView.this.vG.getMeasuredHeight() / 2.0f) - yiw.pvs(SlideRightView.this.getContext(), 7.0f));
                layoutParams5.leftMargin = (-SlideRightView.this.vG.getMeasuredWidth()) + ((int) yiw.pvs(SlideRightView.this.pvs, 30.0f));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                SlideRightView.this.icD.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) SlideRightView.this.Jd.getLayoutParams();
                layoutParams6.topMargin = (int) ((SlideRightView.this.vG.getMeasuredHeight() / 2.0f) - yiw.pvs(SlideRightView.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((SlideRightView.this.vG.getMeasuredWidth() / 2.0f) + ((int) yiw.pvs(SlideRightView.this.pvs, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                SlideRightView.this.Jd.setLayoutParams(layoutParams6);
            }
        });
    }

    private void Jd() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.icD, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.vG, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.vG, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Jd, "alpha", 0.0f, 1.0f);
        this.so.setDuration(300L);
        this.so.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.icD, "translationX", 0.0f, yiw.pvs(getContext(), 90.0f));
        ofFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) yiw.pvs(getContext(), 90.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.Jd.getLayoutParams();
                layoutParams.width = num.intValue();
                SlideRightView.this.Jd.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.vG, "translationX", 0.0f, yiw.pvs(getContext(), 90.0f));
        ofFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.Mxy.setDuration(1500L);
        this.Mxy.playTogether(ofFloat5, ofInt, ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.icD, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.Jd, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.vG, "alpha", 1.0f, 0.0f);
        this.yiw.setDuration(50L);
        this.yiw.playTogether(ofFloat7, ofFloat8, ofFloat9);
        this.sUS.playSequentially(this.so, this.Mxy, this.yiw);
    }

    public void pvs() {
        Jd();
        this.sUS.start();
        this.sUS.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideRightView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideRightView.this.sUS.start();
                    }
                }, 200L);
            }
        });
    }

    public void icD() {
        try {
            AnimatorSet animatorSet = this.sUS;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.so;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.Mxy;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.yiw;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void setGuideText(String str) {
        this.NB.setText(str);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
