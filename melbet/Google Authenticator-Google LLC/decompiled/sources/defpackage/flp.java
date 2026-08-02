package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class flp extends flt {
    public static final /* synthetic */ int h = 0;
    private static final acs q = new flo();
    public final flv a;
    public final flu b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final act r;
    private boolean s;
    private final ValueAnimator t;

    public flp(Context context, flb flbVar, flv flvVar) {
        super(context, flbVar);
        this.s = false;
        this.a = flvVar;
        flu fluVar = new flu();
        this.b = fluVar;
        fluVar.h = true;
        act actVar = new act(this, q);
        this.r = actVar;
        acu acuVar = new acu();
        acuVar.c(1.0f);
        acuVar.e(50.0f);
        actVar.t = acuVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.t = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new edm(this, flbVar, 3));
        if (flbVar.c(true) && flbVar.m != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        flb flbVar = this.j;
        float f = i;
        return (f < flbVar.o * 10000.0f || f > flbVar.p * 10000.0f) ? 0.0f : 1.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.o)) {
            canvas.save();
            flv flvVar = this.a;
            flvVar.h(canvas, getBounds(), f(), k(), j());
            flu fluVar = this.b;
            fluVar.f = g();
            Paint paint = this.m;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            flb flbVar = this.j;
            fluVar.c = flbVar.e[0];
            int i = flbVar.i;
            if (i > 0) {
                if (!(flvVar instanceof fly)) {
                    i = (int) ((i * pj.i(b(), 0.0f, 0.01f)) / 0.01f);
                }
                flvVar.f(canvas, paint, b(), 1.0f, flbVar.f, this.n, i);
            } else {
                flvVar.f(canvas, paint, 0.0f, 1.0f, flbVar.f, this.n, 0);
            }
            flvVar.e(canvas, paint, fluVar, this.n);
            flvVar.d(canvas, paint, flbVar.e[0], this.n);
            canvas.restore();
        }
    }

    @Override // defpackage.flt
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        float o = fny.o(this.i.getContentResolver());
        if (o == 0.0f) {
            this.s = true;
            return e;
        }
        this.s = false;
        this.r.t.e(50.0f / o);
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.flt, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.r.k();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        float a = a(i);
        if (this.s) {
            this.r.k();
            d(f / 10000.0f);
            c(a);
            return true;
        }
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            boolean z = this.a instanceof fly;
            act actVar = this.r;
            if (z) {
                actVar.h(10000.0f / width);
            } else {
                actVar.h((float) (10000.0d / (Math.min(height, width) * 3.141592653589793d)));
            }
        }
        act actVar2 = this.r;
        actVar2.i(b() * 10000.0f);
        actVar2.j(f);
        return true;
    }
}
