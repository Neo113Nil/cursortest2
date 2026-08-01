package c2;

import android.os.Trace;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f1677a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1679c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1680d;

    /* renamed from: i, reason: collision with root package name */
    public x2.a f1684i;

    /* renamed from: b, reason: collision with root package name */
    public final a1.n f1678b = new a1.n(3);

    /* renamed from: e, reason: collision with root package name */
    public final c6.s f1681e = new c6.s(2);

    /* renamed from: f, reason: collision with root package name */
    public final o0.e f1682f = new o0.e(new g0[16]);
    public final long g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f1683h = new o0.e(new t0[16]);

    public u0(g0 g0Var) {
        this.f1677a = g0Var;
    }

    public static final boolean a(u0 u0Var, g0 g0Var, boolean z10) {
        x2.a aVar;
        boolean d10;
        g0 s3;
        a2.n0 placementScope;
        q qVar;
        g0 s10;
        g0 s11;
        g0 g0Var2 = u0Var.f1677a;
        boolean z11 = g0Var.f1549d0;
        k0 k0Var = g0Var.T;
        if (z11 || !j(g0Var)) {
            return false;
        }
        if (g0Var == g0Var2) {
            aVar = u0Var.f1684i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        boolean z12 = true;
        if (z10) {
            d10 = k0Var.f1597e ? c(g0Var, aVar) : false;
            if ((d10 || k0Var.f1598f) && Intrinsics.a(g0Var.G(), Boolean.TRUE)) {
                if (g0Var.P == e0.f1530i) {
                    g0Var.d();
                }
                s0 s0Var = k0Var.f1607q;
                s0Var.getClass();
                try {
                    s0Var.f1662u = true;
                    if (!s0Var.f1666y) {
                        z1.a.b("replace() called on item that was not placed");
                    }
                    s0Var.O = false;
                    if (s0Var.D == q0.f1643i) {
                        z12 = false;
                    }
                    s0Var.h0(s0Var.B, s0Var.C);
                    if (z12 && !s0Var.O && (s11 = s0Var.f1661t.f1593a.s()) != null) {
                        s11.O(false);
                    }
                    s0Var.f1662u = false;
                } catch (Throwable th) {
                    s0Var.f1662u = false;
                    throw th;
                }
            }
        } else {
            d10 = g0Var.p() ? d(g0Var, aVar) : false;
            if (g0Var.n() && (g0Var == g0Var2 || ((s10 = g0Var.s()) != null && s10.F() && k0Var.f1606p.G))) {
                e0 e0Var = g0Var.P;
                if (g0Var == g0Var2) {
                    if (e0Var == e0.f1530i) {
                        g0Var.d();
                    }
                    g0 s12 = g0Var.s();
                    if (s12 == null || (qVar = (q) s12.S.f1493d) == null || (placementScope = qVar.f1636y) == null) {
                        placementScope = j0.a(g0Var).getPlacementScope();
                    }
                    a2.n0.p(placementScope, k0Var.f1606p, 0, 0);
                } else {
                    if (e0Var == e0.f1530i) {
                        g0Var.d();
                    }
                    w0 w0Var = k0Var.f1606p;
                    k0 k0Var2 = w0Var.f1687t;
                    try {
                        w0Var.f1688u = true;
                        if (!w0Var.f1692y) {
                            z1.a.b("replace called on unplaced item");
                        }
                        boolean z13 = w0Var.F;
                        w0Var.g0(w0Var.A, w0Var.C, w0Var.B);
                        if (z13 && !w0Var.S && (s3 = k0Var2.f1593a.s()) != null) {
                            s3.Q(false);
                        }
                    } finally {
                    }
                }
                c6.s sVar = u0Var.f1681e;
                sVar.getClass();
                if (g0Var.f1547c0 > 0) {
                    ((o0.e) sVar.f1868d).b(g0Var);
                    g0Var.f1546b0 = true;
                }
            }
        }
        u0Var.e();
        return d10;
    }

    public static boolean c(g0 g0Var, x2.a aVar) {
        boolean i02;
        g0 g0Var2 = g0Var.f1556v;
        k0 k0Var = g0Var.T;
        if (g0Var2 == null) {
            return false;
        }
        if (aVar != null) {
            if (g0Var2 != null) {
                s0 s0Var = k0Var.f1607q;
                s0Var.getClass();
                i02 = s0Var.i0(aVar.f10316a);
            }
            i02 = false;
        } else {
            s0 s0Var2 = k0Var.f1607q;
            x2.a aVar2 = s0Var2 != null ? s0Var2.A : null;
            if (aVar2 != null && g0Var2 != null) {
                s0Var2.getClass();
                i02 = s0Var2.i0(aVar2.f10316a);
            }
            i02 = false;
        }
        g0 s3 = g0Var.s();
        if (i02 && s3 != null) {
            if (s3.f1556v == null) {
                g0.R(s3, false, 3);
                return i02;
            }
            if (g0Var.r() == e0.f1528d) {
                g0.P(s3, false, 3);
                return i02;
            }
            if (g0Var.r() == e0.f1529e) {
                s3.O(false);
            }
        }
        return i02;
    }

    public static boolean d(g0 g0Var, x2.a aVar) {
        boolean L;
        if (aVar != null) {
            if (g0Var.P == e0.f1530i) {
                g0Var.c();
            }
            L = g0Var.T.f1606p.h0(aVar.f10316a);
        } else {
            L = g0.L(g0Var);
        }
        g0 s3 = g0Var.s();
        if (L && s3 != null) {
            if (g0Var.q() == e0.f1528d) {
                g0.R(s3, false, 3);
                return L;
            }
            if (g0Var.q() == e0.f1529e) {
                s3.Q(false);
            }
        }
        return L;
    }

    public static boolean h(g0 g0Var) {
        s0 s0Var;
        h0 h0Var;
        if (g0Var.T.f1597e) {
            return (g0Var.r() == e0.f1530i && ((s0Var = g0Var.T.f1607q) == null || (h0Var = s0Var.E) == null || !h0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(g0 g0Var) {
        if (!g0Var.p()) {
            return false;
        }
        do {
            if (g0Var.q() == e0.f1530i && !g0Var.T.f1606p.K.e()) {
                g0 s3 = g0Var.s();
                if ((s3 != null ? s3.T.f1596d : null) != c0.f1505d) {
                    return false;
                }
            }
            g0Var = g0Var.s();
            if (g0Var == null) {
                return false;
            }
        } while (!g0Var.F());
        return true;
    }

    public static boolean j(g0 g0Var) {
        s0 s0Var;
        h0 h0Var;
        k0 k0Var = g0Var.T;
        return g0Var.F() || k0Var.f1606p.G || i(g0Var) || Intrinsics.a(g0Var.G(), Boolean.TRUE) || h(g0Var) || k0Var.f1606p.K.e() || !((s0Var = k0Var.f1607q) == null || (h0Var = s0Var.E) == null || !h0Var.e());
    }

    public final void b(boolean z10) {
        c6.s sVar = this.f1681e;
        if (z10) {
            o0.e eVar = (o0.e) sVar.f1868d;
            g0 g0Var = this.f1677a;
            if (g0Var.f1547c0 > 0) {
                eVar.g();
                eVar.b(g0Var);
                g0Var.f1546b0 = true;
            }
        }
        if (((o0.e) sVar.f1868d).f7319i != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                sVar.a();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        o0.e eVar = this.f1683h;
        int i3 = eVar.f7319i;
        if (i3 != 0) {
            Object[] objArr = eVar.f7317d;
            for (int i10 = 0; i10 < i3; i10++) {
                t0 t0Var = (t0) objArr[i10];
                if (t0Var.f1674a.E()) {
                    boolean z10 = t0Var.f1675b;
                    g0 g0Var = t0Var.f1674a;
                    boolean z11 = t0Var.f1676c;
                    if (z10) {
                        g0.P(g0Var, z11, 2);
                    } else {
                        g0.R(g0Var, z11, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void f(g0 g0Var, boolean z10) {
        if (!this.f1679c) {
            z1.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? g0Var.T.f1597e : g0Var.p()) {
            z1.a.a("node not yet measured");
        }
        g(g0Var, z10);
    }

    public final void g(g0 g0Var, boolean z10) {
        s0 s0Var;
        h0 h0Var;
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var2 = (g0) objArr[i10];
            if ((!z10 && (g0Var2.q() == e0.f1528d || g0Var2.T.f1606p.K.e())) || (z10 && (g0Var2.r() == e0.f1528d || ((s0Var = g0Var2.T.f1607q) != null && (h0Var = s0Var.E) != null && h0Var.e())))) {
                boolean q3 = k.q(g0Var2);
                k0 k0Var = g0Var2.T;
                if (q3 && !z10) {
                    if (k0Var.f1597e) {
                        a1.n nVar = this.f1678b;
                        nVar.getClass();
                        boolean z11 = g0Var2.f1556v == null;
                        boolean z12 = ((y1) ((d9.c) nVar.f41i).f3701e).contains(g0Var2) || ((y1) ((d9.c) nVar.f40e).f3701e).contains(g0Var2);
                        if (!z11 && z12) {
                            m(g0Var2, true);
                        }
                    }
                    f(g0Var2, true);
                }
                if (z10 ? k0Var.f1597e : g0Var2.p()) {
                    m(g0Var2, z10);
                }
                if (!(z10 ? k0Var.f1597e : g0Var2.p())) {
                    g(g0Var2, z10);
                }
            }
        }
        if (z10 ? g0Var.T.f1597e : g0Var.p()) {
            m(g0Var, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [d1.k] */
    public final boolean k(d2.p pVar) {
        boolean z10;
        d1.k kVar;
        o0.e eVar;
        int i3;
        boolean z11;
        g0 g0Var;
        boolean z12;
        boolean m10;
        a1.n nVar = this.f1678b;
        g0 g0Var2 = this.f1677a;
        if (!g0Var2.E()) {
            z1.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!g0Var2.F()) {
            z1.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f1679c) {
            z1.a.a("performMeasureAndLayout called during measure layout");
        }
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        if (this.f1684i != null) {
            this.f1679c = true;
            this.f1680d = true;
            try {
                boolean x10 = nVar.x();
                d9.c cVar = (d9.c) nVar.f41i;
                if (x10) {
                    z10 = false;
                    while (true) {
                        d9.c cVar2 = (d9.c) nVar.f42r;
                        d9.c cVar3 = (d9.c) nVar.f40e;
                        if (!((y1) cVar.f3701e).isEmpty()) {
                            g0Var = (g0) ((y1) cVar.f3701e).first();
                            cVar.s(g0Var);
                            z12 = g0Var.f1556v != null;
                            z11 = false;
                        } else if (!((y1) cVar3.f3701e).isEmpty()) {
                            g0Var = (g0) ((y1) cVar3.f3701e).first();
                            cVar3.s(g0Var);
                            z12 = g0Var.f1556v != null;
                            z11 = true;
                        } else {
                            if (((y1) cVar2.f3701e).isEmpty()) {
                                break;
                            }
                            g0 g0Var3 = (g0) ((y1) cVar2.f3701e).first();
                            cVar2.s(g0Var3);
                            z11 = true;
                            g0Var = g0Var3;
                            z12 = false;
                        }
                        if (z11) {
                            m10 = a(this, g0Var, z12);
                        } else {
                            m10 = m(g0Var, z12);
                            if (g0Var.T.f1598f) {
                                nVar.i(g0Var, s.f1657e);
                            }
                            if (g0Var.n()) {
                                nVar.i(g0Var, s.f1659r);
                            }
                        }
                        if (g0Var == g0Var2 && m10) {
                            z10 = true;
                        }
                    }
                    if (pVar != null) {
                        pVar.invoke();
                    }
                } else {
                    z10 = false;
                }
            } finally {
            }
        } else {
            z10 = false;
        }
        o0.e eVar2 = this.f1682f;
        Object[] objArr = eVar2.f7317d;
        int i11 = eVar2.f7319i;
        int i12 = 0;
        while (i12 < i11) {
            b1 b1Var = ((g0) objArr[i12]).S;
            q qVar = (q) b1Var.f1493d;
            int i13 = 4194304;
            boolean g = j1.g(4194304);
            if (g) {
                kVar = qVar.f1639d0;
            } else {
                kVar = qVar.f1639d0.f3309s;
                if (kVar == null) {
                    i12++;
                    i10 = 0;
                }
            }
            k1.d0 d0Var = i1.Z;
            d1.k F0 = qVar.F0(g);
            while (F0 != null && (F0.f3308r & i13) != 0) {
                if ((F0.f3307i & i13) != 0) {
                    j jVar = F0;
                    o0.e eVar3 = null;
                    while (jVar != 0) {
                        if (jVar instanceof u) {
                            ((u) jVar).g((q) b1Var.f1493d);
                        } else if ((jVar.f3307i & i13) != 0 && (jVar instanceof j)) {
                            d1.k kVar2 = jVar.D;
                            d1.k kVar3 = jVar;
                            eVar = eVar3;
                            while (kVar2 != null) {
                                int i14 = i13;
                                if ((kVar2.f3307i & i14) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        kVar3 = kVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o0.e(new d1.k[16]);
                                        }
                                        if (kVar3 != null) {
                                            eVar.b(kVar3);
                                            kVar3 = null;
                                        }
                                        eVar.b(kVar2);
                                    }
                                }
                                kVar2 = kVar2.f3310t;
                                i13 = i14;
                                kVar3 = kVar3;
                                eVar = eVar;
                            }
                            i3 = i13;
                            eVar = eVar;
                            if (i10 == 1) {
                                i13 = i3;
                                i10 = 0;
                                jVar = kVar3;
                                eVar3 = eVar;
                            }
                            kVar3 = k.e(eVar);
                            i13 = i3;
                            i10 = 0;
                            jVar = kVar3;
                            eVar3 = eVar;
                        }
                        i3 = i13;
                        eVar = eVar3;
                        kVar3 = k.e(eVar);
                        i13 = i3;
                        i10 = 0;
                        jVar = kVar3;
                        eVar3 = eVar;
                    }
                }
                int i15 = i13;
                if (F0 != kVar) {
                    F0 = F0.f3310t;
                    i13 = i15;
                    i10 = 0;
                }
            }
            i12++;
            i10 = 0;
        }
        eVar2.g();
        return z10;
    }

    public final void l() {
        a1.n nVar = this.f1678b;
        if (nVar.x()) {
            g0 g0Var = this.f1677a;
            if (!g0Var.E()) {
                z1.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!g0Var.F()) {
                z1.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f1679c) {
                z1.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f1684i != null) {
                this.f1679c = true;
                this.f1680d = false;
                try {
                    if ((((y1) ((d9.c) nVar.f42r).f3701e).isEmpty() || ((y1) ((d9.c) nVar.f41i).f3701e).isEmpty()) ? false : true) {
                        if (g0Var.f1556v != null) {
                            o(g0Var, true);
                        } else {
                            n(g0Var);
                        }
                    }
                    o(g0Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f1679c = false;
                        this.f1680d = false;
                    }
                }
            }
        }
    }

    public final boolean m(g0 g0Var, boolean z10) {
        x2.a aVar;
        boolean z11 = false;
        if (!g0Var.f1549d0 && j(g0Var)) {
            if (g0Var == this.f1677a) {
                aVar = this.f1684i;
                aVar.getClass();
            } else {
                aVar = null;
            }
            if (z10) {
                if (g0Var.T.f1597e) {
                    z11 = c(g0Var, aVar);
                }
            } else if (g0Var.p()) {
                z11 = d(g0Var, aVar);
            }
            e();
        }
        return z11;
    }

    public final void n(g0 g0Var) {
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var2 = (g0) objArr[i10];
            if (g0Var2.q() == e0.f1528d || g0Var2.T.f1606p.K.e()) {
                if (k.q(g0Var2)) {
                    o(g0Var2, true);
                } else {
                    n(g0Var2);
                }
            }
        }
    }

    public final void o(g0 g0Var, boolean z10) {
        x2.a aVar;
        if (g0Var.f1549d0) {
            return;
        }
        if (g0Var == this.f1677a) {
            aVar = this.f1684i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z10) {
            c(g0Var, aVar);
        } else {
            d(g0Var, aVar);
        }
    }

    public final boolean p(g0 g0Var, boolean z10) {
        int ordinal = g0Var.T.f1596d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.f1683h.b(new t0(g0Var, false, z10));
            } else {
                if (ordinal != 4) {
                    a2.r.p();
                    return false;
                }
                if (!g0Var.p() || z10) {
                    g0Var.T.f1606p.H = true;
                    if (!g0Var.f1549d0 && (g0Var.F() || i(g0Var))) {
                        g0 s3 = g0Var.s();
                        if (s3 == null || !s3.p()) {
                            this.f1678b.i(g0Var, s.f1658i);
                        }
                        if (!this.f1680d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        x2.a aVar = this.f1684i;
        if (aVar == null ? false : x2.a.b(aVar.f10316a, j)) {
            return;
        }
        if (this.f1679c) {
            z1.a.a("updateRootConstraints called while measuring");
        }
        this.f1684i = new x2.a(j);
        g0 g0Var = this.f1677a;
        g0 g0Var2 = g0Var.f1556v;
        k0 k0Var = g0Var.T;
        if (g0Var2 != null) {
            k0Var.f1597e = true;
        }
        k0Var.f1606p.H = true;
        this.f1678b.i(g0Var, g0Var2 != null ? s.f1656d : s.f1658i);
    }
}
