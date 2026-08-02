package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class flt extends Drawable implements Animatable {
    private static final Property a = new fls(Float.class);
    private ValueAnimator b;
    private ValueAnimator c;
    private float e;
    final Context i;
    final flb j;
    public List k;
    public boolean l;
    public int n;
    private final float d = -1.0f;
    final Paint m = new Paint();
    final Rect o = new Rect();
    final fny p = new fny();

    public flt(Context context, flb flbVar) {
        this.i = context;
        this.j = flbVar;
        setAlpha(255);
    }

    private final void a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.l;
        this.l = true;
        valueAnimatorArr[0].end();
        this.l = z;
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        if (this.b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<flt, Float>) a, 0.0f, 1.0f);
            this.b = ofFloat;
            ofFloat.setDuration(500L);
            this.b.setInterpolator(fes.b);
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator;
            valueAnimator.addListener(new flq(this));
        }
        if (this.c == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<flt, Float>) a, 1.0f, 0.0f);
            this.c = ofFloat2;
            ofFloat2.setDuration(500L);
            this.c.setInterpolator(fes.b);
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.c = valueAnimator2;
            valueAnimator2.addListener(new flr(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator3 = z ? this.b : this.c;
        ValueAnimator valueAnimator4 = z ? this.c : this.b;
        if (!z3) {
            if (valueAnimator4.isRunning()) {
                boolean z4 = this.l;
                this.l = true;
                valueAnimator4.cancel();
                this.l = z4;
            }
            if (valueAnimator3.isRunning()) {
                valueAnimator3.end();
            } else {
                a(valueAnimator3);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator3.isRunning()) {
            return false;
        }
        boolean z5 = !z || super.setVisible(true, false);
        flb flbVar = this.j;
        if (!(z ? flbVar.e() : flbVar.d())) {
            a(valueAnimator3);
            return z5;
        }
        if (z2 || !valueAnimator3.isPaused()) {
            valueAnimator3.start();
            return z5;
        }
        valueAnimator3.resume();
        return z5;
    }

    final float f() {
        flb flbVar = this.j;
        if (flbVar.e() || flbVar.d()) {
            return this.e;
        }
        return 1.0f;
    }

    final float g() {
        int i;
        float f = this.d;
        if (f > 0.0f) {
            return f;
        }
        flb flbVar = this.j;
        boolean z = this instanceof flp;
        if (flbVar.c(z) && (i = flbVar.m) != 0) {
            float o = fny.o(this.i.getContentResolver());
            if (o > 0.0f) {
                float uptimeMillis = (SystemClock.uptimeMillis() % r6) / ((int) ((((z ? flbVar.j : flbVar.k) * 1000.0f) / i) * o));
                return uptimeMillis < 0.0f ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(aqc aqcVar) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (this.k.contains(aqcVar)) {
            return;
        }
        this.k.add(aqcVar);
    }

    final void i(float f) {
        if (this.e != f) {
            this.e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return k() || j();
    }

    public final boolean j() {
        ValueAnimator valueAnimator = this.c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean k() {
        ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean l(boolean z, boolean z2, boolean z3) {
        float o = fny.o(this.i.getContentResolver());
        boolean z4 = false;
        if (z3 && o > 0.0f) {
            z4 = true;
        }
        return e(z, z2, z4);
    }

    public final void n(aqc aqcVar) {
        List list = this.k;
        if (list == null || !list.contains(aqcVar)) {
            return;
        }
        this.k.remove(aqcVar);
        if (this.k.isEmpty()) {
            this.k = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return l(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
