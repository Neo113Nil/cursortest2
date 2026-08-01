package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class RippleView extends View {
    private ValueAnimator Jd;
    private Animator.AnimatorListener Mxy;
    private Paint NB;
    private int Wyp;
    private float icD;
    private float pvs;
    private long sUS;
    private float so;
    private ValueAnimator vG;
    private float yiw;

    public RippleView(Context context, int i) {
        super(context);
        this.sUS = 300L;
        this.yiw = 0.0f;
        this.Wyp = i;
        pvs();
    }

    public void pvs() {
        Paint paint = new Paint(1);
        this.NB = paint;
        paint.setStyle(Paint.Style.FILL);
        this.NB.setColor(this.Wyp);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.pvs = i / 2.0f;
        this.icD = i2 / 2.0f;
        this.so = (float) (Math.hypot(i, i2) / 2.0d);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.pvs, this.icD, this.yiw, this.NB);
    }

    public void icD() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.so);
        this.vG = ofFloat;
        ofFloat.setDuration(this.sUS);
        this.vG.setInterpolator(new LinearInterpolator());
        this.vG.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.yiw = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.vG.start();
    }

    public void vG() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.so, 0.0f);
        this.Jd = ofFloat;
        ofFloat.setDuration(this.sUS);
        this.Jd.setInterpolator(new LinearInterpolator());
        this.Jd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.yiw = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.Mxy;
        if (animatorListener != null) {
            this.Jd.addListener(animatorListener);
        }
        this.Jd.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.Mxy = animatorListener;
    }
}
