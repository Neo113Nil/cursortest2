package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.rCZ;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ShakeAnimationView extends LinearLayout {
    private rCZ Jd;
    private int Mxy;
    private TextView NB;
    private int Wyp;
    private TextView icD;
    private JSONObject kj;
    private TextView pvs;
    private int qh;
    private TextView sUS;
    private LinearLayout so;
    private ImageView vG;
    private pvs yiw;

    public interface pvs {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public ShakeAnimationView(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.Mxy = i;
        this.Wyp = i2;
        this.qh = i3;
        this.kj = jSONObject;
        pvs(context, view);
    }

    protected void pvs(Context context, View view) {
        addView(view);
        this.so = (LinearLayout) findViewById(2097610727);
        this.vG = (ImageView) findViewById(2097610725);
        this.pvs = (TextView) findViewById(2097610724);
        this.icD = (TextView) findViewById(2097610726);
        this.NB = (TextView) findViewById(2097610723);
        this.sUS = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.so.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.NB.setVisibility(8);
            this.sUS.setVisibility(8);
        } else {
            this.NB.setText(str);
        }
    }

    public LinearLayout getShakeLayout() {
        return this.so;
    }

    public void setOnShakeViewListener(pvs pvsVar) {
        this.yiw = pvsVar;
    }

    public void pvs() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShakeAnimationView.this.vG != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new icD(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ShakeAnimationView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ShakeAnimationView.this.vG.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                ShakeAnimationView.this.vG.startAnimation(rotateAnimation);
            }
        }
    }

    private static class icD implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * (-2.0f)) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private icD() {
        }

        /* synthetic */ icD(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.Jd == null) {
                this.Jd = new rCZ(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
