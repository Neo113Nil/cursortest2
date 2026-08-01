package com.playgen.securelock.view;

import P0.b;
import P0.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import b1.d;
import u1.l;

/* loaded from: classes.dex */
public final class NeonBackgroundView extends View implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1945a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1946b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1947c;
    public final Choreographer d;

    /* renamed from: e, reason: collision with root package name */
    public long f1948e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1949f;

    /* renamed from: g, reason: collision with root package name */
    public float f1950g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeonBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f1945a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(1.5f);
        paint2.setStyle(Paint.Style.STROKE);
        this.f1946b = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.f1947c = paint3;
        this.d = Choreographer.getInstance();
        this.h = 40;
        a(l.v(b.SECURE));
    }

    public final void a(c cVar) {
        this.f1945a.setColor(cVar.f642a);
        this.f1946b.setColor(cVar.f644c);
        this.f1947c.setColor(cVar.d);
        this.h = 51;
        invalidate();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        if (this.f1949f) {
            this.f1950g = (float) (((j2 - this.f1948e) / 1.0E9d) % 4.0d);
            invalidate();
            this.d.postFrameCallback(this);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1948e = System.nanoTime();
        this.f1949f = true;
        this.d.postFrameCallback(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f1949f = false;
        this.d.removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        d.e(canvas, "canvas");
        float width = getWidth();
        float height = getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.f1945a);
        float f2 = getResources().getDisplayMetrics().density * 48.0f;
        float f3 = 0.0f;
        while (true) {
            paint = this.f1946b;
            if (f3 > width) {
                break;
            }
            canvas.drawLine(f3, 0.0f, f3, height, paint);
            f3 += f2;
        }
        for (float f4 = 0.0f; f4 <= height; f4 += f2) {
            canvas.drawLine(0.0f, f4, width, f4, paint);
        }
        float sin = (float) ((Math.sin((this.f1950g * 3.141592653589793d) / 2.0d) + 1.0d) * 0.5d);
        Paint paint2 = this.f1947c;
        paint2.setAlpha(l.n((int) ((sin * 50) + this.h), 0, 255));
        float f5 = ((this.f1950g % 4.0f) / 4.0f) * height;
        canvas.drawRect(0.0f, f5, width, (getResources().getDisplayMetrics().density * 6.0f) + f5, paint2);
    }
}
