package defpackage;

import android.view.View;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bh1 extends ul1 implements iv0, xd0, xh2, xt1 {
    public s72 A;
    public kv2 B;
    public v12 C;
    public View D;
    public ca0 E;
    public u12 F;
    public ia0 H;
    public x31 J;
    public lq K;
    public final lz1 G = new lz1(null, qb2.Z);
    public long I = 9205357640488583168L;

    public bh1(s72 s72Var, kv2 kv2Var, v12 v12Var) {
        this.A = s72Var;
        this.B = kv2Var;
        this.C = v12Var;
    }

    public final long G0() {
        if (this.H == null) {
            this.H = ij2.f(new ah1(this, 0));
        }
        ia0 ia0Var = this.H;
        if (ia0Var != null) {
            return ((au1) ia0Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void H0() {
        u12 u12Var = this.F;
        if (u12Var != null) {
            ((w12) u12Var).b();
        }
        View view = this.D;
        if (view == null) {
            view = s93.Q(this);
        }
        this.D = view;
        ca0 ca0Var = this.E;
        if (ca0Var == null) {
            ca0Var = s03.J(this).I;
        }
        this.E = ca0Var;
        this.F = this.C.d(view, ca0Var);
        J0();
    }

    public final void I0() {
        ca0 ca0Var = this.E;
        if (ca0Var == null) {
            ca0Var = s03.J(this).I;
            this.E = ca0Var;
        }
        long j = ((au1) this.A.invoke(ca0Var)).a;
        if (!ap.D(j) || !ap.D(G0())) {
            this.I = 9205357640488583168L;
            u12 u12Var = this.F;
            if (u12Var != null) {
                ((w12) u12Var).b();
                return;
            }
            return;
        }
        this.I = au1.g(G0(), j);
        if (this.F == null) {
            H0();
        }
        u12 u12Var2 = this.F;
        if (u12Var2 != null) {
            u12Var2.a(this.I, 9205357640488583168L);
        }
        J0();
    }

    public final void J0() {
        ca0 ca0Var;
        u12 u12Var = this.F;
        if (u12Var == null || (ca0Var = this.E) == null) {
            return;
        }
        w12 w12Var = (w12) u12Var;
        long c = w12Var.c();
        x31 x31Var = this.J;
        if (x31Var != null && c == x31Var.a) {
            return;
        }
        this.B.invoke(new sc0(ca0Var.C(zm3.Q(w12Var.c()))));
        this.J = new x31(w12Var.c());
    }

    @Override // defpackage.xt1
    public final void L() {
        j8.P(this, new ah1(this, 2));
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
        sh2Var.d(ch1.a, new ah1(this, 1));
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        k91Var.a();
        lq lqVar = this.K;
        if (lqVar != null) {
            lqVar.d(Unit.a);
        }
    }

    @Override // defpackage.iv0
    public final void y(ks1 ks1Var) {
        this.G.setValue(ks1Var);
    }

    @Override // defpackage.ul1
    public final void y0() {
        L();
        this.K = s93.g(0, 7, null);
        z71.H(u0(), null, new fj(5, (o30) null, this), 3);
    }

    @Override // defpackage.ul1
    public final void z0() {
        u12 u12Var = this.F;
        if (u12Var != null) {
            ((w12) u12Var).b();
        }
        this.F = null;
    }
}
