package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class x extends bb {

    /* renamed from: a, reason: collision with root package name */
    private Paint f3879a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f3880b;

    /* renamed from: c, reason: collision with root package name */
    private Path f3881c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f3882d;
    private RectF e;
    private int f;
    private float g;
    private float h;

    public x(Context context) {
        super(context);
        this.f = 0;
        a(context);
    }

    private void a(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        this.g = 4.5f * f;
        this.f3879a = new Paint();
        this.f3879a.setColor(-1);
        this.f3879a.setStyle(Paint.Style.STROKE);
        this.f3879a.setStrokeWidth(f * 1.0f);
        this.f3879a.setAntiAlias(true);
        this.f3880b = new Paint();
        this.f3880b.setColor(-855638017);
        this.f3880b.setStyle(Paint.Style.FILL);
        this.f3880b.setAntiAlias(true);
        this.f3881c = new Path();
        this.e = new RectF();
        this.f3882d = new RectF();
    }

    @Override // com.chartboost.sdk.impl.bb
    protected void a(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f3882d.set(0.0f, 0.0f, getWidth(), getHeight());
        float min = Math.min(1, Math.round(f * 0.5f));
        this.f3882d.inset(min, min);
        this.f3881c.reset();
        this.f3881c.addRoundRect(this.f3882d, this.g, this.g, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.f3881c);
        canvas.drawColor(this.f);
        this.e.set(this.f3882d);
        this.e.right = ((this.e.right - this.e.left) * this.h) + this.e.left;
        canvas.drawRect(this.e, this.f3880b);
        canvas.restore();
        canvas.drawRoundRect(this.f3882d, this.g, this.g, this.f3879a);
    }

    public void a(int i) {
        this.f = i;
        invalidate();
    }

    public void b(int i) {
        this.f3879a.setColor(i);
        invalidate();
    }

    public void c(int i) {
        this.f3880b.setColor(i);
        invalidate();
    }

    public void a(float f) {
        this.h = f;
        if (getVisibility() != 8) {
            invalidate();
        }
    }

    public void b(float f) {
        this.g = f;
    }
}
