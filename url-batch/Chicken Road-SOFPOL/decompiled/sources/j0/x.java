package j0;

import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final float f3936a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3937b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3938c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3939d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3940e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3941f;

    public x(float f6, float f8, float f9, float f10, float f11, float f12) {
        this.f3936a = f6;
        this.f3937b = f8;
        this.f3938c = f9;
        this.f3939d = f10;
        this.f3940e = f11;
        this.f3941f = f12;
    }

    public final t2 a(boolean z3, v.j jVar, m0.s sVar, int i) {
        r.c cVar;
        sVar.V(-1763481333);
        float f6 = this.f3936a;
        Object obj = m0.n.f5019a;
        if (jVar == null) {
            sVar.V(167751211);
            Object K = sVar.K();
            if (K == obj) {
                K = m0.b.q(new r2.f(f6));
                sVar.f0(K);
            }
            m0.z0 z0Var = (m0.z0) K;
            sVar.p(false);
            sVar.p(false);
            return z0Var;
        }
        sVar.V(167824247);
        sVar.p(false);
        Object K2 = sVar.K();
        if (K2 == obj) {
            K2 = new w0.p();
            sVar.f0(K2);
        }
        w0.p pVar = (w0.p) K2;
        boolean z7 = true;
        boolean z8 = (((i & 112) ^ 48) > 32 && sVar.f(jVar)) || (i & 48) == 32;
        Object K3 = sVar.K();
        if (z8 || K3 == obj) {
            K3 = new q(jVar, pVar, null, 1);
            sVar.f0(K3);
        }
        m0.b.f(jVar, sVar, (p6.e) K3);
        v.h hVar = (v.h) d6.m.Y(pVar);
        if (!z3) {
            f6 = this.f3941f;
        } else if (hVar instanceof v.l) {
            f6 = this.f3937b;
        } else if (hVar instanceof v.f) {
            f6 = this.f3939d;
        } else if (hVar instanceof v.d) {
            f6 = this.f3938c;
        } else if (hVar instanceof v.b) {
            f6 = this.f3940e;
        }
        Object K4 = sVar.K();
        if (K4 == obj) {
            K4 = new r.c(new r2.f(f6), r.d.f6264l, null, 12);
            sVar.f0(K4);
        }
        r.c cVar2 = (r.c) K4;
        r2.f fVar = new r2.f(f6);
        boolean h8 = sVar.h(cVar2) | sVar.c(f6) | ((((i & 14) ^ 6) > 4 && sVar.g(z3)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !sVar.f(this)) && (i & 384) != 256) {
            z7 = false;
        }
        boolean h9 = h8 | z7 | sVar.h(hVar);
        Object K5 = sVar.K();
        if (h9 || K5 == obj) {
            cVar = cVar2;
            Object rVar = new r(cVar, f6, z3, this, hVar, null, 1);
            sVar.f0(rVar);
            K5 = rVar;
        } else {
            cVar = cVar2;
        }
        m0.b.f(fVar, sVar, (p6.e) K5);
        r.k kVar = cVar.f6235c;
        sVar.p(false);
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return r2.f.a(this.f3936a, xVar.f3936a) && r2.f.a(this.f3937b, xVar.f3937b) && r2.f.a(this.f3938c, xVar.f3938c) && r2.f.a(this.f3939d, xVar.f3939d) && r2.f.a(this.f3941f, xVar.f3941f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3941f) + a0.q.a(this.f3939d, a0.q.a(this.f3938c, a0.q.a(this.f3937b, Float.hashCode(this.f3936a) * 31, 31), 31), 31);
    }
}
