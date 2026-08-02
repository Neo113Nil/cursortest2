package com.google.android.libraries.onegoogle.common;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import defpackage.ifn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CirclePulseDrawable extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public int b;
    private final RectF c;
    private final int d;
    private final int e;
    private final ifn f;
    private final ifn g;

    public CirclePulseDrawable(Drawable drawable, int i, int i2) {
        this.a = drawable;
        RectF rectF = new RectF(drawable.getBounds());
        this.c = rectF;
        this.b = (int) rectF.width();
        drawable.setCallback(this);
        this.f = new ifn(i);
        this.d = Color.alpha(i);
        this.g = new ifn(i2);
        this.e = Color.alpha(i2);
    }

    private final void b(ifn ifnVar, int i) {
        ifnVar.b = i;
        c(ifnVar, this.c);
        this.a.invalidateSelf();
    }

    private static void c(ifn ifnVar, RectF rectF) {
        float f = ifnVar.b;
        RectF rectF2 = new RectF(rectF.left - f, rectF.top - f, rectF.right + f, rectF.bottom + f);
        Path path = (Path) ifnVar.c;
        path.reset();
        path.addOval(rectF2, Path.Direction.CW);
        path.addOval(rectF, Path.Direction.CCW);
    }

    public final void a() {
        Rect bounds = getBounds();
        int width = getBounds().width() - this.b;
        int height = getBounds().height() - this.b;
        int i = width / 2;
        int i2 = bounds.left + i;
        int i3 = height / 2;
        int i4 = bounds.top + i3;
        int i5 = bounds.right - i;
        int i6 = bounds.bottom - i3;
        Drawable drawable = this.a;
        drawable.setBounds(i2, i4, i5, i6);
        RectF rectF = this.c;
        rectF.set(drawable.getBounds());
        c(this.f, rectF);
        c(this.g, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        ifn ifnVar = this.f;
        canvas.drawPath((Path) ifnVar.c, (Paint) ifnVar.a);
        ifn ifnVar2 = this.g;
        canvas.drawPath((Path) ifnVar2.c, (Paint) ifnVar2.a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.getAlpha();
    }

    public int getFirstPulseSize() {
        return this.f.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public int getSecondPulseSize() {
        return this.g.b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ((Paint) this.f.a).setAlpha((this.d * i) / 255);
        ((Paint) this.g.a).setAlpha((this.e * i) / 255);
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setFirstPulseSize(int i) {
        b(this.f, i);
    }

    public void setSecondPulseSize(int i) {
        b(this.g, i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
