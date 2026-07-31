package com.bytedance.sdk.openadsdk.core.mw.fs.fb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.fb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public class zmn extends View {
    private int btk;
    private int bvs;
    private int fb;
    private Paint fs;
    private float hhw;
    private String iv;
    private ValueAnimator klz;
    private int mw;
    private float nps;
    private fb rc;
    private float rt;
    private int zg;
    private Paint zmn;
    private RectF zn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public zmn(Context context) {
        super(context);
        this.fb = com.bytedance.adsdk.ugeno.nps.zmn.zmn("#FFD813");
        this.btk = com.bytedance.adsdk.ugeno.nps.zmn.zmn("rgba(0, 0, 0, 0.5)");
        this.hhw = 3.0f;
        this.nps = 0.0f;
        this.zg = 0;
        this.bvs = 100;
        this.iv = "line";
        this.mw = 1000;
        setBackgroundColor(0);
        zmn();
    }

    private void zmn() {
        Paint paint = new Paint(1);
        this.zmn = paint;
        paint.setColor(this.btk);
        Paint paint2 = this.zmn;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.fs = paint3;
        paint3.setColor(this.fb);
        this.fs.setStyle(style);
        this.zn = new RectF();
        this.rt = this.zg;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[0]);
        this.klz = ofFloat;
        ofFloat.setDuration(this.mw);
        this.klz.setInterpolator(new LinearInterpolator());
        this.klz.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                zmn.this.rt = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zmn.this.invalidate();
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.iv, "ring") || TextUtils.equals(this.iv, "ring_reverse")) {
            zmn(canvas);
        } else {
            fs(canvas);
        }
    }

    private void zmn(Canvas canvas) {
        float f;
        int i;
        float f2 = this.hhw / 2.0f;
        this.zn.set(f2, f2, getWidth() - f2, getHeight() - f2);
        Paint paint = this.zmn;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.zmn.setStrokeWidth(this.hhw);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f2, this.zmn);
        if (TextUtils.equals(this.iv, "ring_reverse")) {
            f = this.rt * (-360.0f);
            i = this.bvs;
        } else {
            f = this.rt * 360.0f;
            i = this.bvs;
        }
        float f3 = f / i;
        this.fs.setStyle(style);
        this.fs.setStrokeWidth(this.hhw);
        if (this.nps <= 0.0f) {
            this.fs.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.fs.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.zn, -90.0f, f3, false, this.fs);
    }

    private void fs(Canvas canvas) {
        Paint paint = this.zmn;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f = this.hhw;
        float f2 = this.nps;
        canvas.drawRoundRect(0.0f, 0.0f, width, f, f2, f2, this.zmn);
        float width2 = (getWidth() * this.rt) / this.bvs;
        this.fs.setStyle(style);
        if (TextUtils.equals(this.iv, "line_reverse")) {
            float width3 = getWidth();
            float f3 = this.hhw;
            float f4 = this.nps;
            canvas.drawRoundRect(getWidth() - width2, 0.0f, width3, f3, f4, f4, this.fs);
            return;
        }
        float f5 = this.hhw;
        float f6 = this.nps;
        canvas.drawRoundRect(0.0f, 0.0f, width2, f5, f6, f6, this.fs);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        fb fbVar = this.rc;
        if (fbVar != null) {
            int[] zmn = fbVar.zmn(i, i2);
            super.onMeasure(zmn[0], zmn[1]);
        } else {
            super.onMeasure(i, i2);
        }
        if (TextUtils.equals(this.iv, "ring") || TextUtils.equals(this.iv, "ring_reverse")) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(min, min);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.hhw);
        }
        fb fbVar2 = this.rc;
        if (fbVar2 != null) {
            fbVar2.btk();
        }
    }

    public void setProgress(int i) {
        int min = Math.min(i, this.bvs);
        this.zg = min;
        if (min < 0) {
            this.zg = 0;
        }
        ValueAnimator valueAnimator = this.klz;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.klz.setFloatValues(this.rt, this.zg);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.rt + " progress=" + i);
            this.klz.start();
        }
    }

    public zmn zmn(int i) {
        this.fs.setColor(i);
        return this;
    }

    public zmn fs(int i) {
        this.zmn.setColor(i);
        return this;
    }

    public zmn zmn(float f) {
        this.hhw = f;
        invalidate();
        return this;
    }

    public zmn fs(float f) {
        this.nps = f;
        return this;
    }

    public void setMaxProgress(int i) {
        this.bvs = i;
        invalidate();
    }

    public zmn zmn(String str) {
        this.iv = str;
        return this;
    }

    public int getProgress() {
        return this.zg;
    }

    public int getMaxProgress() {
        return this.bvs;
    }

    public void zmn(fb fbVar) {
        this.rc = fbVar;
    }

    public void setAnimationDuration(int i) {
        this.mw = i;
        this.klz.setDuration(i);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.klz;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
