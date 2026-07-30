package androidx.swiperefreshlayout.widget;

import a0.InterpolatorC0170a;
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
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class e extends Drawable implements Animatable {

    /* renamed from: o, reason: collision with root package name */
    public static final LinearInterpolator f4051o = new LinearInterpolator();

    /* renamed from: p, reason: collision with root package name */
    public static final InterpolatorC0170a f4052p = new InterpolatorC0170a(InterpolatorC0170a.f3038c);

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f4053q = {-16777216};

    /* renamed from: d, reason: collision with root package name */
    public final d f4054d;

    /* renamed from: e, reason: collision with root package name */
    public float f4055e;

    /* renamed from: i, reason: collision with root package name */
    public final Resources f4056i;

    /* renamed from: l, reason: collision with root package name */
    public final ValueAnimator f4057l;

    /* renamed from: m, reason: collision with root package name */
    public float f4058m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4059n;

    public e(Context context) {
        context.getClass();
        this.f4056i = context.getResources();
        d dVar = new d();
        this.f4054d = dVar;
        dVar.f4039i = f4053q;
        dVar.a(0);
        dVar.f4038h = 2.5f;
        dVar.f4032b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4051o);
        ofFloat.addListener(new c(this, dVar));
        this.f4057l = ofFloat;
    }

    public static void d(float f7, d dVar) {
        if (f7 <= 0.75f) {
            dVar.f4050u = dVar.f4039i[dVar.j];
            return;
        }
        float f8 = (f7 - 0.75f) / 0.25f;
        int[] iArr = dVar.f4039i;
        int i2 = dVar.j;
        int i5 = iArr[i2];
        int i7 = iArr[(i2 + 1) % iArr.length];
        dVar.f4050u = ((((i5 >> 24) & 255) + ((int) ((((i7 >> 24) & 255) - r1) * f8))) << 24) | ((((i5 >> 16) & 255) + ((int) ((((i7 >> 16) & 255) - r3) * f8))) << 16) | ((((i5 >> 8) & 255) + ((int) ((((i7 >> 8) & 255) - r4) * f8))) << 8) | ((i5 & 255) + ((int) (f8 * ((i7 & 255) - r2))));
    }

    public final void a(float f7, d dVar, boolean z7) {
        float interpolation;
        float f8;
        if (this.f4059n) {
            d(f7, dVar);
            float floor = (float) (Math.floor(dVar.f4042m / 0.8f) + 1.0d);
            float f9 = dVar.f4040k;
            float f10 = dVar.f4041l;
            dVar.f4035e = (((f10 - 0.01f) - f9) * f7) + f9;
            dVar.f4036f = f10;
            float f11 = dVar.f4042m;
            dVar.f4037g = ((floor - f11) * f7) + f11;
            return;
        }
        if (f7 != 1.0f || z7) {
            float f12 = dVar.f4042m;
            InterpolatorC0170a interpolatorC0170a = f4052p;
            if (f7 < 0.5f) {
                interpolation = dVar.f4040k;
                f8 = (interpolatorC0170a.getInterpolation(f7 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f13 = dVar.f4040k + 0.79f;
                interpolation = f13 - (((1.0f - interpolatorC0170a.getInterpolation((f7 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f8 = f13;
            }
            float f14 = (0.20999998f * f7) + f12;
            float f15 = (f7 + this.f4058m) * 216.0f;
            dVar.f4035e = interpolation;
            dVar.f4036f = f8;
            dVar.f4037g = f14;
            this.f4055e = f15;
        }
    }

    public final void b(float f7, float f8, float f9, float f10) {
        float f11 = this.f4056i.getDisplayMetrics().density;
        float f12 = f8 * f11;
        d dVar = this.f4054d;
        dVar.f4038h = f12;
        dVar.f4032b.setStrokeWidth(f12);
        dVar.f4046q = f7 * f11;
        dVar.a(0);
        dVar.f4047r = (int) (f9 * f11);
        dVar.f4048s = (int) (f10 * f11);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4055e, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f4054d;
        Paint paint = dVar.f4032b;
        RectF rectF = dVar.f4031a;
        float f7 = dVar.f4046q;
        float f8 = (dVar.f4038h / 2.0f) + f7;
        if (f7 <= 0.0f) {
            f8 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f4047r * dVar.f4045p) / 2.0f, dVar.f4038h / 2.0f);
        }
        rectF.set(bounds.centerX() - f8, bounds.centerY() - f8, bounds.centerX() + f8, bounds.centerY() + f8);
        float f9 = dVar.f4035e;
        float f10 = dVar.f4037g;
        float f11 = (f9 + f10) * 360.0f;
        float f12 = ((dVar.f4036f + f10) * 360.0f) - f11;
        paint.setColor(dVar.f4050u);
        paint.setAlpha(dVar.f4049t);
        float f13 = dVar.f4038h / 2.0f;
        rectF.inset(f13, f13);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f4034d);
        float f14 = -f13;
        rectF.inset(f14, f14);
        canvas.drawArc(rectF, f11, f12, false, paint);
        Paint paint2 = dVar.f4033c;
        if (dVar.f4043n) {
            Path path = dVar.f4044o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f4044o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f15 = (dVar.f4047r * dVar.f4045p) / 2.0f;
            dVar.f4044o.moveTo(0.0f, 0.0f);
            dVar.f4044o.lineTo(dVar.f4047r * dVar.f4045p, 0.0f);
            Path path3 = dVar.f4044o;
            float f16 = dVar.f4047r;
            float f17 = dVar.f4045p;
            path3.lineTo((f16 * f17) / 2.0f, dVar.f4048s * f17);
            dVar.f4044o.offset((rectF.centerX() + min) - f15, (dVar.f4038h / 2.0f) + rectF.centerY());
            dVar.f4044o.close();
            paint2.setColor(dVar.f4050u);
            paint2.setAlpha(dVar.f4049t);
            canvas.save();
            canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f4044o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4054d.f4049t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f4057l.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f4054d.f4049t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4054d.f4032b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f4057l.cancel();
        d dVar = this.f4054d;
        float f7 = dVar.f4035e;
        dVar.f4040k = f7;
        float f8 = dVar.f4036f;
        dVar.f4041l = f8;
        dVar.f4042m = dVar.f4037g;
        if (f8 != f7) {
            this.f4059n = true;
            this.f4057l.setDuration(666L);
            this.f4057l.start();
            return;
        }
        dVar.a(0);
        dVar.f4040k = 0.0f;
        dVar.f4041l = 0.0f;
        dVar.f4042m = 0.0f;
        dVar.f4035e = 0.0f;
        dVar.f4036f = 0.0f;
        dVar.f4037g = 0.0f;
        this.f4057l.setDuration(1332L);
        this.f4057l.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f4057l.cancel();
        this.f4055e = 0.0f;
        d dVar = this.f4054d;
        if (dVar.f4043n) {
            dVar.f4043n = false;
        }
        dVar.a(0);
        dVar.f4040k = 0.0f;
        dVar.f4041l = 0.0f;
        dVar.f4042m = 0.0f;
        dVar.f4035e = 0.0f;
        dVar.f4036f = 0.0f;
        dVar.f4037g = 0.0f;
        invalidateSelf();
    }
}
