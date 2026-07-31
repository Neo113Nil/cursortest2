package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes10.dex */
public class phc extends RelativeLayout {
    private TextView btk;
    private AnimatorSet bvs;
    private TextView fb;
    private ImageView fs;
    private AnimatorSet hhw;
    private String iv;
    private AnimatorSet nps;
    private int rc;
    private AnimatorSet zg;
    private ImageView zmn;
    private ImageView zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public phc(Context context) {
        super(context);
        this.hhw = new AnimatorSet();
        this.nps = new AnimatorSet();
        this.zg = new AnimatorSet();
        this.bvs = new AnimatorSet();
        this.rc = 100;
        zmn(context);
    }

    public phc(Context context, String str) {
        super(context);
        this.hhw = new AnimatorSet();
        this.nps = new AnimatorSet();
        this.zg = new AnimatorSet();
        this.bvs = new AnimatorSet();
        this.rc = 100;
        setClipChildren(false);
        this.iv = str;
        zmn(context);
    }

    protected void zmn(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.fb.zmn();
        }
        if ("5".equals(this.iv)) {
            addView(com.bytedance.sdk.component.adexpress.zn.zmn.hhw(context));
            this.rc = (int) (this.rc * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.zn.zmn.btk(context));
        }
        this.zmn = (ImageView) findViewById(2097610734);
        this.fs = (ImageView) findViewById(2097610735);
        this.fb = (TextView) findViewById(2097610730);
        this.zn = (ImageView) findViewById(2097610733);
        this.btk = (TextView) findViewById(2097610731);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.hhw;
    }

    public void zmn() {
        zn();
        this.hhw.start();
        this.hhw.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.hhw.phc.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                phc.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.phc.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        phc.this.hhw.start();
                    }
                }, 200L);
            }
        });
    }

    public void zn() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.zmn, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.zmn, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.zmn, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), -this.rc));
        ofFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), this.rc));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.phc.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (phc.this.zn != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) phc.this.zn.getLayoutParams();
                    layoutParams.height = num.intValue();
                    phc.this.zn.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.zn, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.zn, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.fs, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.fs, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.fs, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.fs, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.fs, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), -this.rc));
        ofFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.nps.setDuration(50L);
        this.bvs.setDuration(1500L);
        this.zg.setDuration(50L);
        this.nps.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.zg.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.bvs.playTogether(ofFloat3, ofInt, ofFloat10);
        this.hhw.playSequentially(this.zg, this.bvs, this.nps);
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
            AnimatorSet animatorSet3 = this.nps;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.bvs;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setGuideText(String str) {
        TextView textView = this.fb;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.btk != null) {
            if (TextUtils.isEmpty(str)) {
                this.btk.setText("");
            } else {
                this.btk.setText(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fs();
    }
}
