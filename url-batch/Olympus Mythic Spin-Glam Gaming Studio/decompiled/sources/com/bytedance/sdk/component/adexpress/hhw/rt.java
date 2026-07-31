package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
public class rt extends FrameLayout {
    private boolean btk;
    private AnimatorSet fb;
    private ImageView fs;
    private Context zmn;
    private doe zn;

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

    public rt(@NonNull Context context) {
        super(context);
        this.btk = true;
        this.zmn = context;
        this.fb = new AnimatorSet();
        zn();
        fb();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.rt.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rt.this.fs.getLayoutParams();
                layoutParams.topMargin = (int) ((rt.this.zn.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.fb.nps.zmn(rt.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((rt.this.zn.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.fb.nps.zmn(rt.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-rt.this.zn.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.fb.nps.zmn(rt.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-rt.this.zn.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.fb.nps.zmn(rt.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                rt.this.fs.setLayoutParams(layoutParams);
            }
        });
    }

    private void zn() {
        this.zn = new doe(this.zmn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 40.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.zn, layoutParams);
        this.fs = new ImageView(this.zmn);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 62.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 62.0f));
        layoutParams2.gravity = 16;
        this.fs.setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.zmn, "tt_splash_hand"));
        addView(this.fs, layoutParams2);
    }

    private void fb() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.fs, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.rt.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rt.this.fs, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                rt.this.fs.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (rt.this.btk) {
                    rt.this.zn.zmn();
                }
                rt.this.btk = !r2.btk;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.fs, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.fb.playTogether(ofFloat, ofFloat2);
    }

    public void zmn() {
        this.fb.start();
    }

    public void fs() {
        AnimatorSet animatorSet = this.fb;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        doe doeVar = this.zn;
        if (doeVar != null) {
            doeVar.fs();
        }
        ImageView imageView = this.fs;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
