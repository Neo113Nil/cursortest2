package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class cyb extends View {
    private ValueAnimator btk;
    private float fb;
    private Paint fs;
    private int hhw;
    private boolean nps;
    private Context zmn;
    private RectF zn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public cyb(Context context) {
        super(context);
        this.hhw = 1500;
        this.zmn = context;
        Paint paint = new Paint();
        this.fs = paint;
        paint.setAntiAlias(true);
        this.fs.setStyle(Paint.Style.STROKE);
        this.fs.setStrokeWidth(10.0f);
        this.fs.setColor(Color.parseColor("#80FFFFFF"));
        this.zn = new RectF();
    }

    public void zmn() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.btk = ofFloat;
        ofFloat.setDuration(this.hhw);
        this.btk.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.cyb.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                cyb.this.fb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cyb.this.requestLayout();
            }
        });
        this.btk.start();
    }

    public void fs() {
        ValueAnimator valueAnimator = this.btk;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void zn() {
        this.nps = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.hhw = i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.nps) {
            return;
        }
        canvas.drawArc(this.zn, 270.0f, this.fb, false, this.fs);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.zn.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
