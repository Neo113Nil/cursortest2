package t;

import u.x0;
import u.y0;
import w1.f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 extends w1.l implements w1.j, f1 {
    public x0 A;
    public w1.k B;
    public k C;
    public j D;
    public boolean E;

    /* renamed from: t, reason: collision with root package name */
    public y0 f6877t;

    /* renamed from: u, reason: collision with root package name */
    public u.j0 f6878u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6879v;

    /* renamed from: w, reason: collision with root package name */
    public u.i f6880w;

    /* renamed from: x, reason: collision with root package name */
    public v.j f6881x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6882y;

    /* renamed from: z, reason: collision with root package name */
    public j f6883z;

    @Override // w1.f1
    public final void F() {
        k kVar = (k) w1.f.i(this, q0.f6842a);
        if (q6.i.a(kVar, this.C)) {
            return;
        }
        this.C = kVar;
        this.D = null;
        w1.k kVar2 = this.B;
        if (kVar2 != null) {
            s0(kVar2);
        }
        this.B = null;
        u0();
        x0 x0Var = this.A;
        if (x0Var != null) {
            y0 y0Var = this.f6877t;
            u.j0 j0Var = this.f6878u;
            x0Var.y0(this.f6882y ? this.D : this.f6883z, this.f6880w, j0Var, y0Var, this.f6881x, this.f6879v, this.E);
        }
    }

    @Override // w1.k
    public final void b0() {
        boolean v02 = v0();
        if (this.E != v02) {
            this.E = v02;
            y0 y0Var = this.f6877t;
            u.j0 j0Var = this.f6878u;
            boolean z3 = this.f6882y;
            w0(z3 ? this.D : this.f6883z, this.f6880w, j0Var, y0Var, this.f6881x, z3, this.f6879v);
        }
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    @Override // y0.l
    public final void j0() {
        this.E = v0();
        u0();
        if (this.A == null) {
            y0 y0Var = this.f6877t;
            x0 x0Var = new x0(this.f6882y ? this.D : this.f6883z, this.f6880w, this.f6878u, y0Var, this.f6881x, this.f6879v, this.E);
            r0(x0Var);
            this.A = x0Var;
        }
    }

    @Override // y0.l
    public final void k0() {
        w1.k kVar = this.B;
        if (kVar != null) {
            s0(kVar);
        }
    }

    public final void u0() {
        w1.k kVar = this.B;
        if (kVar != null) {
            if (((y0.l) kVar).f8706d.f8718q) {
                return;
            }
            r0(kVar);
            return;
        }
        if (this.f6882y) {
            w1.f.r(this, new androidx.lifecycle.m0(13, this));
        }
        j jVar = this.f6882y ? this.D : this.f6883z;
        if (jVar != null) {
            w1.l lVar = jVar.i;
            if (lVar.f8706d.f8718q) {
                return;
            }
            r0(lVar);
            this.B = lVar;
        }
    }

    public final boolean v0() {
        return (this.f8718q ? w1.f.u(this).f7660z : r2.l.f6529d) != r2.l.f6530e || this.f6878u == u.j0.f7027d;
    }

    public final void w0(j jVar, u.i iVar, u.j0 j0Var, y0 y0Var, v.j jVar2, boolean z3, boolean z7) {
        boolean z8;
        this.f6877t = y0Var;
        this.f6878u = j0Var;
        boolean z9 = true;
        if (this.f6882y != z3) {
            this.f6882y = z3;
            z8 = true;
        } else {
            z8 = false;
        }
        if (q6.i.a(this.f6883z, jVar)) {
            z9 = false;
        } else {
            this.f6883z = jVar;
        }
        if (z8 || (z9 && !z3)) {
            w1.k kVar = this.B;
            if (kVar != null) {
                s0(kVar);
            }
            this.B = null;
            u0();
        }
        this.f6879v = z7;
        this.f6880w = iVar;
        this.f6881x = jVar2;
        boolean v02 = v0();
        this.E = v02;
        x0 x0Var = this.A;
        if (x0Var != null) {
            x0Var.y0(this.f6882y ? this.D : this.f6883z, iVar, j0Var, y0Var, jVar2, z7, v02);
        }
    }
}
