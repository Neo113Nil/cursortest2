package com.facebook.ads.internal.view.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Keep;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class CircularProgressView extends View {

    /* renamed from: a, reason: collision with root package name */
    private final float f5568a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f5569b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f5570c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f5571d;
    private float e;

    public CircularProgressView(Context context) {
        super(context);
        this.f5568a = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.e = 0.0f;
        this.f5569b = new RectF();
        this.f5570c = new Paint(1);
        this.f5570c.setStyle(Paint.Style.STROKE);
        this.f5570c.setStrokeWidth(this.f5568a);
        this.f5571d = new Paint(1);
        this.f5571d.setStyle(Paint.Style.STROKE);
        this.f5571d.setStrokeWidth(this.f5568a);
    }

    public void a(int i, int i2) {
        this.f5570c.setColor(i);
        this.f5571d.setColor(i2);
    }

    @Keep
    public float getProgress() {
        return this.e;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f5569b, 0.0f, 360.0f, false, this.f5570c);
        canvas.drawArc(this.f5569b, -90.0f, (this.e * 360.0f) / 100.0f, false, this.f5571d);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i2), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(min, min);
        float f = min;
        this.f5569b.set((this.f5568a / 2.0f) + 0.0f + getPaddingLeft(), (this.f5568a / 2.0f) + 0.0f + getPaddingTop(), (f - (this.f5568a / 2.0f)) - getPaddingRight(), (f - (this.f5568a / 2.0f)) - getPaddingBottom());
    }

    @Keep
    public void setProgress(float f) {
        this.e = Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, NotificationCompat.CATEGORY_PROGRESS, f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
