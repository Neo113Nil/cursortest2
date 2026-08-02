package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flh extends flw {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new flf(Float.class);
    private static final Property m = new flg(Float.class);
    public final adx d;
    public final flb e;
    public int f;
    public float g;
    public float h;
    aqc i;
    private ObjectAnimator n;
    private ObjectAnimator o;

    public flh(fln flnVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = flnVar;
        this.d = new adx();
    }

    private final void i() {
        if (this.n == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<flh, Float>) l, 0.0f, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration((long) (this.e.n * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new fld(this));
        }
        if (this.o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<flh, Float>) m, 0.0f, 1.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration((long) (this.e.n * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new fle(this));
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
        flb flbVar = this.e;
        ObjectAnimator objectAnimator = this.n;
        float f = flbVar.n;
        objectAnimator.setDuration((long) (5400.0f * f));
        this.o.setDuration((long) (f * 333.0f));
        e();
    }

    @Override // defpackage.flw
    public final void c(aqc aqcVar) {
        this.i = aqcVar;
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
        this.f = 0;
        ((flu) this.k.get(0)).c = this.e.e[0];
        this.h = 0.0f;
    }

    @Override // defpackage.flw
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.flw
    public final void g() {
        this.i = null;
    }
}
