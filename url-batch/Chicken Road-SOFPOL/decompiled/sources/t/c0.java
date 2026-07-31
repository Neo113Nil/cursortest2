package t;

import a0.z0;
import w1.b1;
import w1.d1;
import w1.f1;
import w1.s1;
import w1.x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 extends w1.l implements s1, w1.n, w1.j, f1, x1 {

    /* renamed from: z, reason: collision with root package name */
    public static final b f6750z = new b();

    /* renamed from: t, reason: collision with root package name */
    public v.j f6751t;

    /* renamed from: u, reason: collision with root package name */
    public final a7.v0 f6752u;

    /* renamed from: v, reason: collision with root package name */
    public v.d f6753v;

    /* renamed from: w, reason: collision with root package name */
    public a0.i0 f6754w;

    /* renamed from: x, reason: collision with root package name */
    public d1 f6755x;

    /* renamed from: y, reason: collision with root package name */
    public final d1.n f6756y;

    public c0(v.j jVar, a7.v0 v0Var) {
        this.f6751t = jVar;
        this.f6752u = v0Var;
        d1.n nVar = new d1.n(0, new b0(2, this, c0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0), 4);
        r0(nVar);
        this.f6756y = nVar;
    }

    @Override // w1.f1
    public final void F() {
        q6.s sVar = new q6.s();
        w1.f.r(this, new z0(9, sVar, this));
        a0.i0 i0Var = (a0.i0) sVar.f6205d;
        if (this.f6756y.t0().a()) {
            a0.i0 i0Var2 = this.f6754w;
            if (i0Var2 != null) {
                i0Var2.b();
            }
            if (i0Var != null) {
                i0Var.a();
            } else {
                i0Var = null;
            }
            this.f6754w = i0Var;
        }
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    @Override // w1.n
    public final void k(d1 d1Var) {
        d0 v02;
        this.f6755x = d1Var;
        if (this.f6756y.t0().a()) {
            if (!d1Var.E0().f8718q) {
                d0 v03 = v0();
                if (v03 != null) {
                    v03.r0(null);
                    return;
                }
                return;
            }
            d1 d1Var2 = this.f6755x;
            if (d1Var2 == null || !d1Var2.E0().f8718q || (v02 = v0()) == null) {
                return;
            }
            v02.r0(this.f6755x);
        }
    }

    @Override // y0.l
    public final void l0() {
        a0.i0 i0Var = this.f6754w;
        if (i0Var != null) {
            i0Var.b();
        }
        this.f6754w = null;
    }

    @Override // w1.x1
    public final Object m() {
        return f6750z;
    }

    @Override // w1.s1
    public final void q(d2.j jVar) {
        boolean a8 = this.f6756y.t0().a();
        w6.d[] dVarArr = d2.u.f2215a;
        d2.v vVar = d2.s.f2197k;
        w6.d dVar = d2.u.f2215a[4];
        vVar.a(jVar, Boolean.valueOf(a8));
        jVar.e(d2.i.f2144u, new d2.a(null, new d1.e(0, this, c0.class, "requestFocus", "requestFocus()Z", 0, 0, 1)));
    }

    public final void u0(v.j jVar, v.h hVar) {
        if (!this.f8718q) {
            jVar.c(hVar);
            return;
        }
        a7.s0 s0Var = (a7.s0) ((f7.c) f0()).f2769d.l(a7.r.f297e);
        a7.x.n(f0(), null, new b0.c(jVar, hVar, s0Var != null ? s0Var.w(new a0.v0(17, jVar, hVar)) : null, null, 11), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final d0 v0() {
        x1 x1Var;
        b1 b1Var;
        if (this.f8718q) {
            if (!this.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar = this.f8706d.f8710h;
            w1.f0 u7 = w1.f.u(this);
            loop0: while (true) {
                if (u7 == null) {
                    x1Var = null;
                    break;
                }
                if ((u7.F.f7600f.f8709g & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.f8708f & 262144) != 0) {
                            w1.l lVar2 = lVar;
                            ?? r52 = 0;
                            while (lVar2 != 0) {
                                if (lVar2 instanceof x1) {
                                    x1Var = (x1) lVar2;
                                    if (d0.f6762s.equals(x1Var.m())) {
                                        break loop0;
                                    }
                                } else if ((lVar2.f8708f & 262144) != 0 && (lVar2 instanceof w1.l)) {
                                    y0.l lVar3 = lVar2.f7707s;
                                    int i = 0;
                                    lVar2 = lVar2;
                                    r52 = r52;
                                    while (lVar3 != null) {
                                        if ((lVar3.f8708f & 262144) != 0) {
                                            i++;
                                            r52 = r52;
                                            if (i == 1) {
                                                lVar2 = lVar3;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar2 != 0) {
                                                    r52.b(lVar2);
                                                    lVar2 = 0;
                                                }
                                                r52.b(lVar3);
                                            }
                                        }
                                        lVar3 = lVar3.i;
                                        lVar2 = lVar2;
                                        r52 = r52;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lVar2 = w1.f.f(r52);
                            }
                        }
                        lVar = lVar.f8710h;
                    }
                }
                u7 = u7.s();
                lVar = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
            }
            if (x1Var instanceof d0) {
                return (d0) x1Var;
            }
        }
        return null;
    }

    public final void w0(v.j jVar) {
        v.d dVar;
        if (q6.i.a(this.f6751t, jVar)) {
            return;
        }
        v.j jVar2 = this.f6751t;
        if (jVar2 != null && (dVar = this.f6753v) != null) {
            jVar2.c(new v.e(dVar));
        }
        this.f6753v = null;
        this.f6751t = jVar;
    }
}
