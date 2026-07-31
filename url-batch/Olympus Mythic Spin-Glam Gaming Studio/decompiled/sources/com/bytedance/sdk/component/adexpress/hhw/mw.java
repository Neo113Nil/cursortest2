package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.yandex.div.internal.widget.DivLayoutParams;

/* loaded from: classes15.dex */
public class mw extends FrameLayout {
    private boolean btk;
    private AnimatorSet fb;
    private ImageView fs;
    private TextView hhw;
    private Context zmn;
    private fb zn;

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

    public mw(@NonNull Context context) {
        super(context);
        this.btk = true;
        this.zmn = context;
        this.fb = new AnimatorSet();
        zn();
        fb();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.mw.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mw.this.fs.getLayoutParams();
                layoutParams.topMargin = ((int) ((mw.this.zn.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.fb.nps.zmn(mw.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(mw.this.zmn, 20.0f));
                layoutParams.leftMargin = ((int) ((mw.this.zn.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.fb.nps.zmn(mw.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(mw.this.zmn, 20.0f));
                layoutParams.bottomMargin = (int) (((-mw.this.zn.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.fb.nps.zmn(mw.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-mw.this.zn.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.fb.nps.zmn(mw.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                mw.this.fs.setLayoutParams(layoutParams);
            }
        });
    }

    private void zn() {
        this.zn = new fb(this.zmn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 80.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 80.0f));
        layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 20.0f);
        int zmn = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 20.0f);
        layoutParams.leftMargin = zmn;
        layoutParams.setMarginStart(zmn);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.zn, layoutParams);
        this.zn.zmn();
        this.fs = new ImageView(this.zmn);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 80.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 80.0f));
        this.fs.setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.zmn, "tt_splash_hand"));
        addView(this.fs, layoutParams2);
        TextView textView = new TextView(this.zmn);
        this.hhw = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 10.0f);
        addView(this.hhw, layoutParams3);
    }

    private void fb() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.fs, "scaleX", 1.0f, 0.8f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.mw.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mw.this.fs, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                mw.this.fs.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (mw.this.btk) {
                    mw.this.zn.zmn();
                    mw.this.zn.setAlpha(1.0f);
                } else {
                    mw.this.zn.fs();
                    mw.this.zn.setAlpha(0.0f);
                }
                mw.this.btk = !r2.btk;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.fs, "scaleY", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.fb.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
        this.hhw.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.hhw.setTextColor(i);
    }

    public void zmn() {
        this.fb.start();
    }

    public void fs() {
        AnimatorSet animatorSet = this.fb;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.fs();
        }
    }
}
