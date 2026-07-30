package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vf1 implements nr, dn {
    public final /* synthetic */ wf1 d;
    public final tf e;
    public tf g;
    public nx0 h = nx0.e;
    public final g i = g.d;
    public final /* synthetic */ wf1 j;

    public vf1(wf1 wf1Var, tf tfVar) {
        this.j = wf1Var;
        this.d = wf1Var;
        this.e = tfVar;
    }

    @Override // defpackage.nr
    public final float A(long j) {
        return this.d.A(j);
    }

    @Override // defpackage.nr
    public final int H(float f) {
        return this.d.H(f);
    }

    @Override // defpackage.nr
    public final long Q(long j) {
        return this.d.Q(j);
    }

    @Override // defpackage.nr
    public final float U(long j) {
        return this.d.U(j);
    }

    public final Object a(nx0 nx0Var, yc ycVar) {
        tf tfVar = new tf(1, qa0.b(ycVar));
        tfVar.w();
        this.h = nx0Var;
        this.g = tfVar;
        Object u = tfVar.u();
        tn tnVar = tn.d;
        return u;
    }

    @Override // defpackage.nr
    public final long a0(float f) {
        return this.d.a0(f);
    }

    @Override // defpackage.nr
    public final float f() {
        return this.d.f();
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return this.i;
    }

    @Override // defpackage.nr
    public final float i0(int i) {
        return this.d.i0(i);
    }

    @Override // defpackage.nr
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.nr
    public final float k0(float f) {
        return f / this.d.k();
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        wf1 wf1Var = this.j;
        synchronized (wf1Var.y) {
            wf1Var.x.j(this);
        }
        this.e.l(obj);
    }

    @Override // defpackage.nr
    public final long p(float f) {
        return this.d.p(f);
    }

    @Override // defpackage.nr
    public final float s(float f) {
        return this.d.k() * f;
    }
}
