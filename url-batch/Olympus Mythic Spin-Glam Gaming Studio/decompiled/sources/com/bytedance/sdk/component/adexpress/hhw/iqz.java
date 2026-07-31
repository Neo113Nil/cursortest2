package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
public class iqz extends FrameLayout {
    private TextView btk;
    private AnimatorSet bvs;
    private ImageView fb;
    private ImageView fs;
    private AnimatorSet hhw;
    private AnimatorSet nps;
    private AnimatorSet zg;
    private Context zmn;
    private ImageView zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public iqz(@NonNull Context context) {
        super(context);
        this.hhw = new AnimatorSet();
        this.nps = new AnimatorSet();
        this.zg = new AnimatorSet();
        this.bvs = new AnimatorSet();
        this.zmn = context;
        zn();
    }

    private void zn() {
        ImageView imageView = new ImageView(this.zmn);
        this.fb = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.doe.fb(this.zmn, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 30.0f);
        addView(this.fb, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.zmn);
        this.zn = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.zmn, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 50.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 30.0f);
        addView(this.zn, layoutParams2);
        ImageView imageView3 = new ImageView(this.zmn);
        this.fs = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.zmn, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 80.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 30.0f);
        addView(this.fs, layoutParams3);
        TextView textView = new TextView(this.zmn);
        this.btk = textView;
        textView.setTextColor(-1);
        this.btk.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.btk, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.iqz.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) iqz.this.fs.getLayoutParams();
                layoutParams5.topMargin = (int) ((iqz.this.zn.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.fb.nps.zmn(iqz.this.getContext(), 7.0f));
                int zmn = (-iqz.this.zn.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(iqz.this.zmn, 30.0f));
                layoutParams5.leftMargin = zmn;
                layoutParams5.setMarginStart(zmn);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                iqz.this.fs.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) iqz.this.fb.getLayoutParams();
                layoutParams6.topMargin = (int) ((iqz.this.zn.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.fb.nps.zmn(iqz.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((iqz.this.zn.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(iqz.this.zmn, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                iqz.this.fb.setLayoutParams(layoutParams6);
            }
        });
    }

    private void fb() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.fs, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.zn, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.zn, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.fb, "alpha", 0.0f, 1.0f);
        this.zg.setDuration(300L);
        this.zg.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.fs, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), 90.0f));
        ofFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), 90.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.iqz.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iqz.this.fb.getLayoutParams();
                layoutParams.width = num.intValue();
                iqz.this.fb.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.zn, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), 90.0f));
        ofFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.bvs.setDuration(1500L);
        this.bvs.playTogether(ofFloat5, ofInt, ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.fs, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.fb, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.zn, "alpha", 1.0f, 0.0f);
        this.nps.setDuration(50L);
        this.nps.playTogether(ofFloat7, ofFloat8, ofFloat9);
        this.hhw.playSequentially(this.zg, this.bvs, this.nps);
    }

    public void zmn() {
        fb();
        this.hhw.start();
        this.hhw.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.hhw.iqz.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                iqz.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.iqz.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        iqz.this.hhw.start();
                    }
                }, 200L);
            }
        });
    }

    public void fs() {
        try {
            AnimatorSet animatorSet = this.hhw;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.zg;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.bvs;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.nps;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void setGuideText(String str) {
        this.btk.setText(str);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
