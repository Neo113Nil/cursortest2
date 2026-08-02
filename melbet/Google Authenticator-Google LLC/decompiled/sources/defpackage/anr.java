package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class anr extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new adx();
    private static final int[] g = {-16777216};
    public final anq a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private final Animator i;

    public anr(Context context) {
        tw.F(context);
        this.b = context.getResources();
        anq anqVar = new anq();
        this.a = anqVar;
        anqVar.i = g;
        anqVar.g();
        anqVar.d(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new edm(this, anqVar, 1));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new anp(this, anqVar));
        this.i = ofFloat;
    }

    public static final void e(float f2, anq anqVar) {
        if (f2 <= 0.75f) {
            anqVar.t = anqVar.a();
            return;
        }
        int a = anqVar.a();
        int[] iArr = anqVar.i;
        anqVar.f();
        int i = iArr[0];
        int i2 = a >> 24;
        int i3 = a >> 16;
        int i4 = a >> 8;
        int i5 = i >> 16;
        int i6 = i >> 8;
        float f3 = (f2 - 0.75f) / 0.25f;
        int i7 = (i4 & 255) + ((int) (((i6 & 255) - r4) * f3));
        int i8 = (i3 & 255) + ((int) (((i5 & 255) - r3) * f3));
        int i9 = i2 & 255;
        anqVar.t = ((i9 + ((int) (f3 * (((i >> 24) & 255) - i9)))) << 24) | (i8 << 16) | (i7 << 8) | ((a & 255) + ((int) (((i & 255) - r0) * f3)));
    }

    public final void a(float f2, anq anqVar, boolean z) {
        float interpolation;
        float f3;
        if (this.d) {
            e(f2, anqVar);
            double floor = Math.floor(anqVar.l / 0.8f) + 1.0d;
            float f4 = anqVar.j;
            float f5 = anqVar.k;
            anqVar.e = f4 + ((((-0.01f) + f5) - f4) * f2);
            anqVar.f = f5;
            float f6 = anqVar.l;
            anqVar.g = f6 + ((((float) floor) - f6) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f7 = anqVar.l;
            if (f2 < 0.5f) {
                interpolation = anqVar.j;
                f3 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = anqVar.j + 0.79f;
                interpolation = f8 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            float f9 = f7 + (0.20999998f * f2);
            float f10 = f2 + this.c;
            anqVar.e = interpolation;
            anqVar.f = f3;
            anqVar.g = f9;
            this.h = f10 * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.c(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        anq anqVar = this.a;
        if (f2 != anqVar.o) {
            anqVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        anq anqVar = this.a;
        anqVar.e = 0.0f;
        anqVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        anq anqVar = this.a;
        float f2 = anqVar.p;
        float f3 = (anqVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((anqVar.q * anqVar.o) / 2.0f, anqVar.h / 2.0f);
        }
        RectF rectF = anqVar.a;
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f4 = anqVar.e;
        float f5 = anqVar.g;
        float f6 = f4 + f5;
        float f7 = anqVar.f + f5;
        Paint paint = anqVar.b;
        paint.setColor(anqVar.t);
        paint.setAlpha(anqVar.s);
        float f8 = anqVar.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, anqVar.d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        float f10 = f6 * 360.0f;
        float f11 = (f7 * 360.0f) - f10;
        canvas.drawArc(rectF, f10, f11, false, paint);
        if (anqVar.m) {
            Path path = anqVar.n;
            if (path == null) {
                anqVar.n = new Path();
                anqVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f12 = (anqVar.q * anqVar.o) / 2.0f;
            anqVar.n.moveTo(0.0f, 0.0f);
            anqVar.n.lineTo(anqVar.q * anqVar.o, 0.0f);
            Path path2 = anqVar.n;
            float f13 = anqVar.q;
            float f14 = anqVar.o;
            path2.lineTo((f13 * f14) / 2.0f, anqVar.r * f14);
            anqVar.n.offset((min + rectF.centerX()) - f12, rectF.centerY() + (anqVar.h / 2.0f));
            anqVar.n.close();
            Paint paint2 = anqVar.c;
            paint2.setColor(anqVar.t);
            paint2.setAlpha(anqVar.s);
            canvas.save();
            canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
            canvas.drawPath(anqVar.n, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animator animator = this.i;
        animator.cancel();
        anq anqVar = this.a;
        anqVar.e();
        if (anqVar.f != anqVar.e) {
            this.d = true;
            animator.setDuration(666L);
            animator.start();
        } else {
            anqVar.g();
            anqVar.b();
            animator.setDuration(1332L);
            animator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        anq anqVar = this.a;
        anqVar.c(false);
        anqVar.g();
        anqVar.b();
        invalidateSelf();
    }
}
