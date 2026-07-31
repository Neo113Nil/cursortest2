package com.bytedance.sdk.component.adexpress.hhw;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class doe extends View {
    private static int zn = 50;
    private ObjectAnimator fb;
    private int fs;
    private Paint zmn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public doe(Context context) {
        this(context, null);
    }

    public doe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public doe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fs = 10;
        zn();
    }

    private void zn() {
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setAntiAlias(true);
        this.zmn.setColor(Color.parseColor("#FFFFFFFF"));
        this.zmn.setStyle(Paint.Style.STROKE);
        this.zmn.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.fb = ofFloat;
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
        this.zmn.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.fs, this.zmn);
    }

    public void zmn() {
        int min = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        zn = min;
        ValueAnimator ofInt = ValueAnimator.ofInt(10, min);
        ofInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.doe.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                doe.this.fs = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                doe.this.invalidate();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.doe.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                doe.this.setVisibility(0);
                doe.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                doe.this.fb.start();
            }
        });
        ofInt.start();
    }

    public void fs() {
        clearAnimation();
    }
}
