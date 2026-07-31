package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class kgc extends LinearLayout {
    private TextView btk;
    private int bvs;
    private com.bytedance.sdk.component.utils.uqh fb;
    private TextView fs;
    private TextView hhw;
    private int iv;
    private JSONObject klz;
    private zmn nps;
    private int rc;
    private LinearLayout zg;
    private TextView zmn;
    private ImageView zn;

    public interface zmn {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public kgc(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.bvs = i;
        this.iv = i2;
        this.rc = i3;
        this.klz = jSONObject;
        zmn(context, view);
    }

    protected void zmn(Context context, View view) {
        addView(view);
        this.zg = (LinearLayout) findViewById(2097610727);
        this.zn = (ImageView) findViewById(2097610725);
        this.zmn = (TextView) findViewById(2097610724);
        this.fs = (TextView) findViewById(2097610726);
        this.btk = (TextView) findViewById(2097610723);
        this.hhw = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.zg.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.btk.setVisibility(8);
            this.hhw.setVisibility(8);
        } else {
            this.btk.setText(str);
        }
    }

    public LinearLayout getShakeLayout() {
        return this.zg;
    }

    public void setOnShakeViewListener(zmn zmnVar) {
        this.nps = zmnVar;
    }

    public void zmn() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.hhw.kgc$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (kgc.this.zn != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new fs(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.kgc.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        kgc.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.kgc.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                kgc.this.zn.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                kgc.this.zn.startAnimation(rotateAnimation);
            }
        }
    }

    private static class fs implements Interpolator {
        private fs() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * (-2.0f)) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        /* synthetic */ fs(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.fb == null) {
                this.fb = new com.bytedance.sdk.component.utils.uqh(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.hhw.kgc.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
