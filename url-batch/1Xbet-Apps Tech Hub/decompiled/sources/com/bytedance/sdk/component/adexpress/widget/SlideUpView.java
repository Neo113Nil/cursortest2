package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.vG.pvs;
import com.bytedance.sdk.component.utils.Ju;

/* loaded from: classes.dex */
public class SlideUpView extends RelativeLayout {
    private TextView Jd;
    private AnimatorSet Mxy;
    private TextView NB;
    private String Wyp;
    private ImageView icD;
    private ImageView pvs;
    private int qh;
    private AnimatorSet sUS;
    private AnimatorSet so;
    private ImageView vG;
    private AnimatorSet yiw;

    public SlideUpView(Context context) {
        super(context);
        this.sUS = new AnimatorSet();
        this.yiw = new AnimatorSet();
        this.so = new AnimatorSet();
        this.Mxy = new AnimatorSet();
        this.qh = 100;
        pvs(context);
    }

    public SlideUpView(Context context, String str) {
        super(context);
        this.sUS = new AnimatorSet();
        this.yiw = new AnimatorSet();
        this.so = new AnimatorSet();
        this.Mxy = new AnimatorSet();
        this.qh = 100;
        setClipChildren(false);
        this.Wyp = str;
        pvs(context);
    }

    protected void pvs(Context context) {
        if (context == null) {
            context = Jd.pvs();
        }
        if ("5".equals(this.Wyp)) {
            addView(pvs.yiw(context));
            this.qh = (int) (this.qh * 1.25d);
        } else {
            addView(pvs.sUS(context));
        }
        this.pvs = (ImageView) findViewById(2097610734);
        this.icD = (ImageView) findViewById(2097610735);
        this.Jd = (TextView) findViewById(2097610730);
        this.vG = (ImageView) findViewById(2097610733);
        this.NB = (TextView) findViewById(2097610731);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.sUS;
    }

    public void pvs() {
        vG();
        this.sUS.start();
        this.sUS.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideUpView.this.sUS.start();
                    }
                }, 200L);
            }
        });
    }

    public void vG() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.pvs, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.pvs, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.pvs, "translationY", 0.0f, yiw.pvs(getContext(), -this.qh));
        ofFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) yiw.pvs(getContext(), this.qh));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (SlideUpView.this.vG != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.vG.getLayoutParams();
                    layoutParams.height = num.intValue();
                    SlideUpView.this.vG.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.vG, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.vG, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.icD, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.icD, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.icD, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.icD, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.icD, "translationY", 0.0f, yiw.pvs(getContext(), -this.qh));
        ofFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.yiw.setDuration(50L);
        this.Mxy.setDuration(1500L);
        this.so.setDuration(50L);
        this.yiw.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.so.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.Mxy.playTogether(ofFloat3, ofInt, ofFloat10);
        this.sUS.playSequentially(this.so, this.Mxy, this.yiw);
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
            AnimatorSet animatorSet3 = this.yiw;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.Mxy;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            Ju.icD(e.getMessage());
        }
    }

    public void setGuideText(String str) {
        TextView textView = this.Jd;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.NB != null) {
            if (TextUtils.isEmpty(str)) {
                this.NB.setText("");
            } else {
                this.NB.setText(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        icD();
    }
}
