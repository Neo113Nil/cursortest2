package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class RingProgressView extends View {
    private float Jd;
    private ValueAnimator NB;
    private Paint icD;
    private Context pvs;
    private int sUS;
    private RectF vG;
    private boolean yiw;

    public RingProgressView(Context context) {
        super(context);
        this.sUS = 1500;
        this.pvs = context;
        Paint paint = new Paint();
        this.icD = paint;
        paint.setAntiAlias(true);
        this.icD.setStyle(Paint.Style.STROKE);
        this.icD.setStrokeWidth(10.0f);
        this.icD.setColor(Color.parseColor("#80FFFFFF"));
        this.vG = new RectF();
    }

    public void pvs() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.NB = ofFloat;
        ofFloat.setDuration(this.sUS);
        this.NB.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RingProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RingProgressView.this.Jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.NB.start();
    }

    public void icD() {
        ValueAnimator valueAnimator = this.NB;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void vG() {
        this.yiw = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.sUS = i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.yiw) {
            return;
        }
        canvas.drawArc(this.vG, 270.0f, this.Jd, false, this.icD);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.vG.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
