package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flm extends flw {
    public final TimeInterpolator c;
    public final flb d;
    public int e;
    public float f;
    public float g;
    aqc h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = fes.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new flk(Float.class);
    private static final Property m = new fll(Float.class);

    public flm(Context context, fln flnVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = flnVar;
        this.c = fny.p(context, R.attr.motionEasingStandardInterpolator, i);
    }

    private final void i() {
        if (this.n == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<flm, Float>) l, 0.0f, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration((long) (this.d.n * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new fli(this));
        }
        if (this.o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<flm, Float>) m, 0.0f, 1.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration((long) (this.d.n * 500.0f));
            this.o.addListener(new flj(this));
        }
    }

    @Override // defpackage.flw
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.flw
    public final void b() {
        i();
        flb flbVar = this.d;
        ObjectAnimator objectAnimator = this.n;
        float f = flbVar.n;
        objectAnimator.setDuration((long) (6000.0f * f));
        this.o.setDuration((long) (f * 500.0f));
        e();
    }

    @Override // defpackage.flw
    public final void c(aqc aqcVar) {
        this.h = aqcVar;
    }

    @Override // defpackage.flw
    public final void d() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    final void e() {
        this.e = 0;
        ((flu) this.k.get(0)).c = this.d.e[0];
        this.g = 0.0f;
    }

    @Override // defpackage.flw
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.flw
    public final void g() {
        this.h = null;
    }
}
