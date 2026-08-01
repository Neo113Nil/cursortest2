package com.winpower.neonfit.ui;

import a.AbstractC0058a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import j1.h;

/* loaded from: classes.dex */
public final class MacroRingView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2622a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2623b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2624c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f2625d;
    public final Paint e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f2626f;

    /* renamed from: g, reason: collision with root package name */
    public int f2627g;

    /* renamed from: h, reason: collision with root package name */
    public String f2628h;
    public float i;
    public float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MacroRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(12.0f);
        paint.setColor(872415231);
        this.f2622a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(12.0f);
        this.f2623b = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(18.0f);
        paint3.setAlpha(60);
        this.f2624c = paint3;
        Paint paint4 = new Paint(1);
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        paint4.setTextSize(28.0f);
        paint4.setColor(-1507542);
        this.f2625d = paint4;
        Paint paint5 = new Paint(1);
        paint5.setTextAlign(align);
        paint5.setTextSize(22.0f);
        paint5.setColor(-1);
        this.e = paint5;
        this.f2626f = new RectF();
        this.f2627g = -1507542;
        this.f2628h = "";
        this.j = 1.0f;
    }

    public final float getConsumed() {
        return this.i;
    }

    public final String getLabel() {
        return this.f2628h;
    }

    public final int getRingColor() {
        return this.f2627g;
    }

    public final float getTarget() {
        return this.j;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        float min = Math.min(getWidth(), getHeight());
        RectF rectF = this.f2626f;
        float f2 = min - 20.0f;
        rectF.set(20.0f, 20.0f, f2, f2);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, this.f2622a);
        float l2 = AbstractC0058a.l(this.i / this.j, 1.0f);
        Paint paint = this.f2623b;
        paint.setColor(this.f2627g);
        Paint paint2 = this.f2624c;
        paint2.setColor(this.f2627g);
        float f3 = l2 * 270.0f;
        canvas.drawArc(rectF, 135.0f, f3, false, paint2);
        canvas.drawArc(rectF, 135.0f, f3, false, paint);
        float f4 = min / 2.0f;
        canvas.drawText(this.f2628h, f4, f4 - 6.0f, this.f2625d);
        canvas.drawText(((int) this.i) + "g", f4, 24.0f + f4, this.e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > size2) {
            size = size2;
        }
        setMeasuredDimension(size, size);
    }

    public final void setConsumed(float f2) {
        this.i = f2;
        invalidate();
    }

    public final void setLabel(String str) {
        h.e(str, "value");
        this.f2628h = str;
        invalidate();
    }

    public final void setRingColor(int i) {
        this.f2627g = i;
        invalidate();
    }

    public final void setTarget(float f2) {
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        this.j = f2;
        invalidate();
    }
}
