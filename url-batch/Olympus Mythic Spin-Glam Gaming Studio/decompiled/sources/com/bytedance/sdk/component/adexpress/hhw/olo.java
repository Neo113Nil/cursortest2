package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes12.dex */
public class olo extends View {
    private Paint btk;
    private Animator.AnimatorListener bvs;
    private ValueAnimator fb;
    private float fs;
    private long hhw;
    private int iv;
    private float nps;
    private float zg;
    private float zmn;
    private ValueAnimator zn;

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

    public olo(Context context, int i) {
        super(context);
        this.hhw = 300L;
        this.nps = 0.0f;
        this.iv = i;
        zmn();
    }

    public void zmn() {
        Paint paint = new Paint(1);
        this.btk = paint;
        paint.setStyle(Paint.Style.FILL);
        this.btk.setColor(this.iv);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.zmn = i / 2.0f;
        this.fs = i2 / 2.0f;
        this.zg = (float) (Math.hypot(i, i2) / 2.0d);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.zmn, this.fs, this.nps, this.btk);
    }

    public void fs() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.zg);
        this.zn = ofFloat;
        ofFloat.setDuration(this.hhw);
        this.zn.setInterpolator(new LinearInterpolator());
        this.zn.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.olo.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                olo.this.nps = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                olo.this.invalidate();
            }
        });
        this.zn.start();
    }

    public void zn() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.zg, 0.0f);
        this.fb = ofFloat;
        ofFloat.setDuration(this.hhw);
        this.fb.setInterpolator(new LinearInterpolator());
        this.fb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.olo.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                olo.this.nps = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                olo.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.bvs;
        if (animatorListener != null) {
            this.fb.addListener(animatorListener);
        }
        this.fb.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.bvs = animatorListener;
    }
}
