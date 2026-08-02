package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmb extends flw {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new fma(Float.class);
    public final adx a;
    public final flb b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public fmb(fmg fmgVar) {
        super(3);
        this.c = 1;
        this.b = fmgVar;
        this.a = new adx();
    }

    private final void i() {
        if (this.h == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<fmb, Float>) g, 0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration((long) (this.b.n * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new flz(this));
        }
    }

    @Override // defpackage.flw
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.flw
    public final void b() {
        i();
        this.h.setDuration((long) (this.b.n * 333.0f));
        e();
    }

    final void e() {
        this.d = true;
        this.c = 1;
        for (flu fluVar : this.k) {
            flb flbVar = this.b;
            fluVar.c = flbVar.e[0];
            fluVar.d = flbVar.i / 2;
        }
    }

    @Override // defpackage.flw
    public final void f() {
        i();
        e();
        this.h.start();
    }

    @Override // defpackage.flw
    public final void d() {
    }

    @Override // defpackage.flw
    public final void g() {
    }

    @Override // defpackage.flw
    public final void c(aqc aqcVar) {
    }
}
