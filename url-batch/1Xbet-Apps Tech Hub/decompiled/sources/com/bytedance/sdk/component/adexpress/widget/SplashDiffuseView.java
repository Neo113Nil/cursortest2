package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class SplashDiffuseView extends View {
    private static int vG = 50;
    private ObjectAnimator Jd;
    private int icD;
    private Paint pvs;

    public SplashDiffuseView(Context context) {
        this(context, null);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.icD = 10;
        vG();
    }

    private void vG() {
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setAntiAlias(true);
        this.pvs.setColor(Color.parseColor("#FFFFFFFF"));
        this.pvs.setStyle(Paint.Style.STROKE);
        this.pvs.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.Jd = ofFloat;
        ofFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.pvs.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.icD, this.pvs);
    }

    public void pvs() {
        int min = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        vG = min;
        ValueAnimator ofInt = ValueAnimator.ofInt(10, min);
        ofInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SplashDiffuseView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SplashDiffuseView.this.icD = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SplashDiffuseView.this.invalidate();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SplashDiffuseView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SplashDiffuseView.this.setVisibility(0);
                SplashDiffuseView.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SplashDiffuseView.this.Jd.start();
            }
        });
        ofInt.start();
    }

    public void icD() {
        clearAnimation();
    }
}
