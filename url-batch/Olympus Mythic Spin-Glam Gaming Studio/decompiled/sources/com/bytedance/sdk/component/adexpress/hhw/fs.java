package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class fs extends FrameLayout {
    private View btk;
    private int bvs;
    private View fb;
    private ObjectAnimator fs;
    private View hhw;
    private Context iv;
    private ImageView nps;
    private int zg;
    private AnimatorSet zmn;
    private boolean zn;

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

    public fs(Context context, int i, int i2) {
        super(context);
        this.zn = false;
        this.zmn = new AnimatorSet();
        this.zg = i;
        this.bvs = i2;
        this.iv = context;
        zn();
        fb();
    }

    private void zn() {
        View view = new View(this.iv);
        this.fb = view;
        view.setBackground(zmn("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.zg * 0.45d), (int) (this.bvs * 0.45d));
        layoutParams.gravity = 17;
        this.fb.setLayoutParams(layoutParams);
        addView(this.fb);
        View view2 = new View(this.iv);
        this.btk = view2;
        view2.setBackground(zmn("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.zg * 0.25d), (int) (this.bvs * 0.25d));
        layoutParams2.gravity = 17;
        this.btk.setLayoutParams(layoutParams2);
        addView(this.btk);
        View view3 = new View(this.iv);
        this.hhw = view3;
        view3.setBackground(zmn("#807BBEFF", "#FF7BBEFF"));
        int i = this.zg;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i * 0.25d), (int) (i * 0.25d));
        layoutParams3.gravity = 17;
        this.hhw.setLayoutParams(layoutParams3);
        addView(this.hhw);
        ImageView imageView = new ImageView(this.iv);
        this.nps = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.doe.fb(getContext(), "tt_blue_hand"));
        this.nps.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.zg * 0.62d), (int) (this.bvs * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.nps.setLayoutParams(layoutParams4);
        addView(this.nps);
    }

    private void fb() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.fb, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.fb, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.btk, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.btk, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.hhw, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.hhw, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.nps, "rotation", 0.0f, -20.0f, 0.0f);
        this.fs = ofFloat7;
        ofFloat7.setDuration(1000L);
        this.zmn.setDuration(1500L);
        this.zmn.setInterpolator(new AccelerateDecelerateInterpolator());
        this.zmn.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        this.zmn.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.fs.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (fs.this.zn) {
                    return;
                }
                fs.this.fs.start();
                fs.this.zmn.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                fs.this.zn = true;
            }
        });
    }

    private GradientDrawable zmn(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void zmn() {
        this.zn = false;
        ObjectAnimator objectAnimator = this.fs;
        if (objectAnimator == null || this.zmn == null) {
            return;
        }
        objectAnimator.start();
        this.zmn.start();
    }

    public void fs() {
        this.zn = true;
        ObjectAnimator objectAnimator = this.fs;
        if (objectAnimator == null || this.zmn == null) {
            return;
        }
        objectAnimator.cancel();
        this.zmn.cancel();
    }
}
