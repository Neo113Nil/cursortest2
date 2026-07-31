package w1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d1 extends n0 implements u1.d0, u1.p, l1 {
    public static final f1.g0 M;
    public static final t N;
    public static final d O;
    public static final d P;
    public u1.f0 A;
    public o.d0 B;
    public float D;
    public e1.a E;
    public t F;
    public i1.b G;
    public f1.q H;
    public a1.g I;
    public boolean K;
    public j1 L;

    /* renamed from: r, reason: collision with root package name */
    public final f0 f7614r;

    /* renamed from: s, reason: collision with root package name */
    public d1 f7615s;

    /* renamed from: t, reason: collision with root package name */
    public d1 f7616t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7617u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7618v;

    /* renamed from: w, reason: collision with root package name */
    public p6.c f7619w;

    /* renamed from: x, reason: collision with root package name */
    public r2.c f7620x;

    /* renamed from: y, reason: collision with root package name */
    public r2.l f7621y;

    /* renamed from: z, reason: collision with root package name */
    public float f7622z = 0.8f;
    public long C = 0;
    public final c1 J = new c1(this, 1);

    static {
        f1.g0 g0Var = new f1.g0();
        g0Var.f2645e = 1.0f;
        g0Var.f2646f = 1.0f;
        g0Var.f2647g = 1.0f;
        long j7 = f1.y.f2709a;
        g0Var.i = j7;
        g0Var.f2649j = j7;
        g0Var.f2650k = 8.0f;
        g0Var.f2651l = f1.l0.f2683b;
        g0Var.f2652m = f1.p.f2693a;
        g0Var.f2654o = 9205357640488583168L;
        g0Var.f2655p = h0.a.b();
        g0Var.f2656q = r2.l.f6529d;
        g0Var.f2657r = 3;
        M = g0Var;
        N = new t();
        O = new d(1);
        P = new d(2);
    }

    public d1(f0 f0Var) {
        this.f7614r = f0Var;
        this.f7620x = f0Var.f7659y;
        this.f7621y = f0Var.f7660z;
    }

    public final d1 A0(d1 d1Var) {
        f0 f0Var = d1Var.f7614r;
        f0 f0Var2 = this.f7614r;
        if (f0Var == f0Var2) {
            y0.l E0 = d1Var.E0();
            y0.l E02 = E0();
            if (!E02.f8706d.f8718q) {
                t1.a.b("visitLocalAncestors called on an unattached node");
            }
            for (y0.l lVar = E02.f8706d.f8710h; lVar != null; lVar = lVar.f8710h) {
                if ((lVar.f8708f & 2) != 0 && lVar == E0) {
                    return d1Var;
                }
            }
            return this;
        }
        while (f0Var.f7651q > f0Var2.f7651q) {
            f0Var = f0Var.s();
            q6.i.b(f0Var);
        }
        f0 f0Var3 = f0Var2;
        while (f0Var3.f7651q > f0Var.f7651q) {
            f0Var3 = f0Var3.s();
            q6.i.b(f0Var3);
        }
        while (f0Var != f0Var3) {
            f0Var = f0Var.s();
            f0Var3 = f0Var3.s();
            if (f0Var == null || f0Var3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (f0Var3 != f0Var2) {
            if (f0Var != d1Var.f7614r) {
                return f0Var.F.f7597c;
            }
            return d1Var;
        }
        return this;
    }

    public final long B0(long j7) {
        long j8 = this.C;
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - ((int) (j8 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) - ((int) (j8 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        j1 j1Var = this.L;
        return j1Var != null ? ((x1.j1) j1Var).c(floatToRawIntBits, true) : floatToRawIntBits;
    }

    @Override // u1.p
    public final boolean C() {
        return E0().f8718q;
    }

    public abstract o0 C0();

    public final long D0() {
        return this.f7620x.O(this.f7614r.A.c());
    }

    public abstract y0.l E0();

    @Override // u1.p
    public final long F(u1.p pVar, long j7) {
        return N0(pVar, j7);
    }

    public final y0.l F0(int i) {
        boolean g3 = e1.g(i);
        y0.l E0 = E0();
        if (!g3 && (E0 = E0.f8710h) == null) {
            return null;
        }
        for (y0.l G0 = G0(g3); G0 != null && (G0.f8709g & i) != 0; G0 = G0.i) {
            if ((G0.f8708f & i) != 0) {
                return G0;
            }
            if (G0 == E0) {
                return null;
            }
        }
        return null;
    }

    @Override // u1.p
    public final long G() {
        return this.f7232f;
    }

    public final y0.l G0(boolean z3) {
        y0.l E0;
        b1 b1Var = this.f7614r.F;
        if (b1Var.f7598d == this) {
            return b1Var.f7600f;
        }
        if (!z3) {
            d1 d1Var = this.f7616t;
            if (d1Var != null) {
                return d1Var.E0();
            }
            return null;
        }
        d1 d1Var2 = this.f7616t;
        if (d1Var2 == null || (E0 = d1Var2.E0()) == null) {
            return null;
        }
        return E0.i;
    }

    public final void H0(y0.l lVar, d dVar, long j7, p pVar, int i, boolean z3) {
        if (lVar == null) {
            K0(dVar, j7, pVar, i, z3);
            return;
        }
        int i8 = pVar.f7747f;
        o.e0 e0Var = pVar.f7745d;
        pVar.b(i8 + 1, e0Var.f5443b);
        pVar.f7747f++;
        e0Var.a(lVar);
        pVar.f7746e.a(f.a(-1.0f, z3, false));
        H0(f.e(lVar, dVar.b()), dVar, j7, pVar, i, z3);
        pVar.f7747f = i8;
    }

    public final void I0(y0.l lVar, d dVar, long j7, p pVar, int i, boolean z3, float f6) {
        if (lVar == null) {
            K0(dVar, j7, pVar, i, z3);
            return;
        }
        int i8 = pVar.f7747f;
        o.e0 e0Var = pVar.f7745d;
        pVar.b(i8 + 1, e0Var.f5443b);
        pVar.f7747f++;
        e0Var.a(lVar);
        pVar.f7746e.a(f.a(f6, z3, false));
        T0(f.e(lVar, dVar.b()), dVar, j7, pVar, i, z3, f6, true);
        pVar.f7747f = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (w1.f.h(r18.a(), w1.f.a(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(d dVar, long j7, p pVar, int i, boolean z3) {
        boolean z7;
        boolean z8;
        y0.l F0 = F0(dVar.b());
        if (!d1(j7)) {
            if (i == 1) {
                float w02 = w0(j7, D0());
                if ((Float.floatToRawIntBits(w02) & Integer.MAX_VALUE) < 2139095040) {
                    if (pVar.f7747f != s6.a.t(pVar)) {
                        if (f.h(pVar.a(), f.a(w02, false, false)) <= 0) {
                            return;
                        }
                    }
                    I0(F0, dVar, j7, pVar, i, false, w02);
                    return;
                }
                return;
            }
            return;
        }
        if (F0 == null) {
            K0(dVar, j7, pVar, i, z3);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < S() && intBitsToFloat2 < Q()) {
            H0(F0, dVar, j7, pVar, i, z3);
            return;
        }
        float w03 = i == 1 ? w0(j7, D0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(w03) & Integer.MAX_VALUE) < 2139095040) {
            if (pVar.f7747f == s6.a.t(pVar)) {
                z7 = z3;
            } else {
                z7 = z3;
            }
            z8 = true;
            T0(F0, dVar, j7, pVar, i, z7, w03, z8);
        }
        z7 = z3;
        z8 = false;
        T0(F0, dVar, j7, pVar, i, z7, w03, z8);
    }

    @Override // u1.p
    public final e1.c K(u1.p pVar, boolean z3) {
        d1 d1Var;
        if (!E0().f8718q) {
            t1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!pVar.C()) {
            t1.a.b("LayoutCoordinates " + pVar + " is not attached!");
        }
        u1.c0 c0Var = pVar instanceof u1.c0 ? (u1.c0) pVar : null;
        if (c0Var == null || (d1Var = c0Var.f7198d.f7737r) == null) {
            d1Var = (d1) pVar;
        }
        d1Var.P0();
        d1 A0 = A0(d1Var);
        e1.a aVar = this.E;
        if (aVar == null) {
            aVar = new e1.a();
            this.E = aVar;
        }
        aVar.f2451a = 0.0f;
        aVar.f2452b = 0.0f;
        aVar.f2453c = (int) (pVar.G() >> 32);
        aVar.f2454d = (int) (pVar.G() & 4294967295L);
        while (d1Var != A0) {
            d1Var.W0(aVar, z3, false);
            if (aVar.b()) {
                return e1.c.f2456e;
            }
            d1Var = d1Var.f7616t;
            q6.i.b(d1Var);
        }
        t0(A0, aVar, z3);
        return new e1.c(aVar.f2451a, aVar.f2452b, aVar.f2453c, aVar.f2454d);
    }

    public void K0(d dVar, long j7, p pVar, int i, boolean z3) {
        d1 d1Var = this.f7615s;
        if (d1Var != null) {
            d1Var.J0(dVar, d1Var.B0(j7), pVar, i, z3);
        }
    }

    public final void L0() {
        j1 j1Var = this.L;
        if (j1Var != null) {
            j1Var.invalidate();
            return;
        }
        d1 d1Var = this.f7616t;
        if (d1Var != null) {
            d1Var.L0();
        }
    }

    public final boolean M0() {
        if (this.L != null && this.f7622z <= 0.0f) {
            return true;
        }
        d1 d1Var = this.f7616t;
        if (d1Var != null) {
            return d1Var.M0();
        }
        return false;
    }

    public final long N0(u1.p pVar, long j7) {
        d1 d1Var;
        boolean z3 = pVar instanceof u1.c0;
        if (z3) {
            u1.c0 c0Var = (u1.c0) pVar;
            c0Var.f7198d.f7737r.P0();
            return c0Var.b(this, j7 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        u1.c0 c0Var2 = z3 ? (u1.c0) pVar : null;
        if (c0Var2 == null || (d1Var = c0Var2.f7198d.f7737r) == null) {
            q6.i.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            d1Var = (d1) pVar;
        }
        d1Var.P0();
        d1 A0 = A0(d1Var);
        while (d1Var != A0) {
            j7 = d1Var.Z0(j7);
            d1Var = d1Var.f7616t;
            q6.i.b(d1Var);
        }
        return u0(A0, j7);
    }

    public final long O0(long j7) {
        if (!E0().f8718q) {
            t1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        P0();
        for (d1 d1Var = this; d1Var != null; d1Var = d1Var.f7616t) {
            j7 = d1Var.Z0(j7);
        }
        return j7;
    }

    public final void P0() {
        this.f7614r.G.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r7v7, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void Q0() {
        y0.l lVar;
        boolean g3 = e1.g(128);
        y0.l G0 = G0(g3);
        if (G0 == null || (G0.f8706d.f8709g & 128) == 0) {
            return;
        }
        w0.f e8 = w0.q.e();
        p6.c e9 = e8 != null ? e8.e() : null;
        w0.f h8 = w0.q.h(e8);
        try {
            if (g3) {
                lVar = E0();
            } else {
                lVar = E0().f8710h;
                if (lVar == null) {
                }
            }
            for (y0.l G02 = G0(g3); G02 != null; G02 = G02.i) {
                if ((G02.f8709g & 128) == 0) {
                    break;
                }
                if ((G02.f8708f & 128) != 0) {
                    l lVar2 = G02;
                    ?? r8 = 0;
                    while (lVar2 != 0) {
                        if (lVar2 instanceof u) {
                            ((u) lVar2).o(this.f7232f);
                        } else if ((lVar2.f8708f & 128) != 0 && (lVar2 instanceof l)) {
                            y0.l lVar3 = lVar2.f7707s;
                            int i = 0;
                            lVar2 = lVar2;
                            r8 = r8;
                            while (lVar3 != null) {
                                if ((lVar3.f8708f & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        lVar2 = lVar3;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new o0.e(new y0.l[16]);
                                        }
                                        if (lVar2 != 0) {
                                            r8.b(lVar2);
                                            lVar2 = 0;
                                        }
                                        r8.b(lVar3);
                                    }
                                }
                                lVar3 = lVar3.i;
                                lVar2 = lVar2;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        lVar2 = f.f(r8);
                    }
                }
                if (G02 == lVar) {
                    break;
                }
            }
        } finally {
            w0.q.k(e8, h8, e9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public final void R0() {
        boolean g3 = e1.g(128);
        y0.l E0 = E0();
        if (!g3 && (E0 = E0.f8710h) == null) {
            return;
        }
        for (y0.l G0 = G0(g3); G0 != null && (G0.f8709g & 128) != 0; G0 = G0.i) {
            if ((G0.f8708f & 128) != 0) {
                l lVar = G0;
                ?? r52 = 0;
                while (lVar != 0) {
                    if (lVar instanceof u) {
                        ((u) lVar).P(this);
                    } else if ((lVar.f8708f & 128) != 0 && (lVar instanceof l)) {
                        y0.l lVar2 = lVar.f7707s;
                        int i = 0;
                        lVar = lVar;
                        r52 = r52;
                        while (lVar2 != null) {
                            if ((lVar2.f8708f & 128) != 0) {
                                i++;
                                r52 = r52;
                                if (i == 1) {
                                    lVar = lVar2;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new o0.e(new y0.l[16]);
                                    }
                                    if (lVar != 0) {
                                        r52.b(lVar);
                                        lVar = 0;
                                    }
                                    r52.b(lVar2);
                                }
                            }
                            lVar2 = lVar2.i;
                            lVar = lVar;
                            r52 = r52;
                        }
                        if (i == 1) {
                        }
                    }
                    lVar = f.f(r52);
                }
            }
            if (G0 == E0) {
                return;
            }
        }
    }

    public final void S0() {
        this.f7617u = true;
        this.J.b();
        X0();
        if (r2.i.a(this.C, 0L)) {
            return;
        }
        this.f7614r.M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01da  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(y0.l lVar, d dVar, long j7, p pVar, int i, boolean z3, float f6, boolean z7) {
        Throwable th;
        float f8;
        int i8;
        y0.l f9;
        boolean z8;
        int i9;
        if (lVar == null) {
            K0(dVar, j7, pVar, i, z3);
            return;
        }
        int i10 = i;
        int i11 = 2;
        if (i10 == 3 || i10 == 4) {
            l lVar2 = lVar;
            o0.e eVar = null;
            while (lVar2 != 0) {
                if (lVar2 instanceof p1) {
                    ((p1) lVar2).getClass();
                    int i12 = v1.f7798b;
                    long j8 = v1.f7797a;
                    int i13 = (int) (j7 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i13);
                    f0 f0Var = this.f7614r;
                    th = null;
                    r2.l lVar3 = f0Var.f7660z;
                    int i14 = v1.f7798b;
                    long j9 = j8 & Long.MIN_VALUE;
                    r2.l lVar4 = r2.l.f6529d;
                    if (intBitsToFloat >= (-((j9 == 0 || lVar3 == lVar4) ? d.a(0, j8) : d.a(i11, j8)))) {
                        if (Float.intBitsToFloat(i13) < S() + ((j9 == 0 || f0Var.f7660z == lVar4) ? d.a(i11, j8) : d.a(0, j8))) {
                            i8 = i11;
                            int i15 = (int) (j7 & 4294967295L);
                            if (Float.intBitsToFloat(i15) >= (-d.a(1, j8))) {
                                if (Float.intBitsToFloat(i15) < d.a(3, j8) + Q()) {
                                    o.z zVar = pVar.f7746e;
                                    o.e0 e0Var = pVar.f7745d;
                                    if (pVar.f7747f == s6.a.t(pVar)) {
                                        int i16 = pVar.f7747f;
                                        pVar.b(i16 + 1, e0Var.f5443b);
                                        pVar.f7747f++;
                                        e0Var.a(lVar);
                                        zVar.a(f.a(0.0f, z3, true));
                                        T0(f.e(lVar, dVar.b()), dVar, j7, pVar, i10, z3, f6, z7);
                                        pVar.f7747f = i16;
                                        return;
                                    }
                                    long a8 = pVar.a();
                                    int i17 = pVar.f7747f;
                                    if (!f.o(a8)) {
                                        if (f.k(a8) > 0.0f) {
                                            int i18 = pVar.f7747f;
                                            pVar.b(i18 + 1, e0Var.f5443b);
                                            pVar.f7747f++;
                                            e0Var.a(lVar);
                                            zVar.a(f.a(0.0f, z3, true));
                                            T0(f.e(lVar, dVar.b()), dVar, j7, pVar, i, z3, f6, z7);
                                            pVar.f7747f = i18;
                                            return;
                                        }
                                        return;
                                    }
                                    int t3 = s6.a.t(pVar);
                                    pVar.f7747f = t3;
                                    pVar.b(t3 + 1, e0Var.f5443b);
                                    pVar.f7747f++;
                                    e0Var.a(lVar);
                                    zVar.a(f.a(0.0f, z3, true));
                                    T0(f.e(lVar, dVar.b()), dVar, j7, pVar, i, z3, f6, z7);
                                    pVar.f7747f = t3;
                                    if (f.k(pVar.a()) < 0.0f) {
                                        pVar.b(i17 + 1, pVar.f7747f + 1);
                                    }
                                    pVar.f7747f = i17;
                                    return;
                                }
                            }
                            f8 = f6;
                            if (z7) {
                                I0(lVar, dVar, j7, pVar, i, z3, f6);
                                return;
                            }
                            switch (dVar.f7609d) {
                                case 1:
                                    l lVar5 = lVar;
                                    ?? r62 = th;
                                    while (lVar5 != 0) {
                                        if (lVar5 instanceof p1) {
                                            if (((p1) lVar5).Z()) {
                                                z8 = true;
                                                break;
                                            }
                                        } else if ((lVar5.f8708f & 16) != 0 && (lVar5 instanceof l)) {
                                            y0.l lVar6 = lVar5.f7707s;
                                            int i19 = 0;
                                            lVar5 = lVar5;
                                            r62 = r62;
                                            while (lVar6 != null) {
                                                if ((lVar6.f8708f & 16) != 0) {
                                                    i19++;
                                                    r62 = r62;
                                                    if (i19 == 1) {
                                                        lVar5 = lVar6;
                                                    } else {
                                                        if (r62 == 0) {
                                                            r62 = new o0.e(new y0.l[16]);
                                                        }
                                                        if (lVar5 != 0) {
                                                            r62.b(lVar5);
                                                            lVar5 = th;
                                                        }
                                                        r62.b(lVar6);
                                                    }
                                                }
                                                lVar6 = lVar6.i;
                                                lVar5 = lVar5;
                                                r62 = r62;
                                            }
                                            if (i19 == 1) {
                                            }
                                        }
                                        lVar5 = f.f(r62);
                                    }
                                    break;
                                default:
                                    z8 = false;
                                    break;
                            }
                            if (!z8) {
                                T0(f.e(lVar, dVar.b()), dVar, j7, pVar, i, z3, f6, false);
                                return;
                            }
                            o.z zVar2 = pVar.f7746e;
                            o.e0 e0Var2 = pVar.f7745d;
                            if (pVar.f7747f != s6.a.t(pVar)) {
                                float f10 = f8;
                                long a9 = pVar.a();
                                int i20 = pVar.f7747f;
                                int t7 = s6.a.t(pVar);
                                pVar.f7747f = t7;
                                pVar.b(t7 + 1, e0Var2.f5443b);
                                pVar.f7747f++;
                                e0Var2.a(lVar);
                                zVar2.a(f.a(f10, z3, false));
                                T0(f.e(lVar, dVar.b()), dVar, j7, pVar, i, z3, f10, false);
                                pVar.f7747f = t7;
                                long a10 = pVar.a();
                                if (pVar.f7747f + 1 >= s6.a.t(pVar) || f.h(a9, a10) <= 0) {
                                    pVar.b(pVar.f7747f + 1, e0Var2.f5443b);
                                } else {
                                    pVar.b(i20 + 1, f.o(a10) ? pVar.f7747f + 2 : pVar.f7747f + 1);
                                }
                                pVar.f7747f = i20;
                                return;
                            }
                            int i21 = pVar.f7747f;
                            int i22 = i21 + 1;
                            pVar.b(i22, e0Var2.f5443b);
                            pVar.f7747f++;
                            e0Var2.a(lVar);
                            zVar2.a(f.a(f8, z3, false));
                            T0(f.e(lVar, dVar.b()), dVar, j7, pVar, i, z3, f8, false);
                            pVar.f7747f = i21;
                            if (i22 == s6.a.t(pVar) || f.o(pVar.a())) {
                                int i23 = pVar.f7747f;
                                int i24 = i23 + 1;
                                e0Var2.j(i24);
                                if (i24 < 0 || i24 >= (i9 = zVar2.f5570b)) {
                                    p.a.d("Index must be between 0 and size");
                                    throw th;
                                }
                                long[] jArr = zVar2.f5569a;
                                long j10 = jArr[i24];
                                if (i24 != i9 - 1) {
                                    d6.l.G(jArr, jArr, i24, i23 + i8, i9);
                                }
                                zVar2.f5570b--;
                                return;
                            }
                            return;
                        }
                    }
                    f8 = f6;
                    i8 = i11;
                    if (z7) {
                    }
                } else {
                    int i25 = i11;
                    int i26 = 16;
                    if ((lVar2.f8708f & 16) != 0 && (lVar2 instanceof l)) {
                        y0.l lVar7 = lVar2.f7707s;
                        int i27 = 0;
                        f9 = lVar2;
                        eVar = eVar;
                        while (lVar7 != null) {
                            if ((lVar7.f8708f & 16) != 0) {
                                i27++;
                                eVar = eVar;
                                if (i27 == 1) {
                                    f9 = lVar7;
                                } else {
                                    if (eVar == null) {
                                        eVar = new o0.e(new y0.l[i26]);
                                    }
                                    if (f9 != null) {
                                        eVar.b(f9);
                                        f9 = null;
                                    }
                                    eVar.b(lVar7);
                                }
                            }
                            lVar7 = lVar7.i;
                            i26 = 16;
                            f9 = f9;
                            eVar = eVar;
                        }
                        if (i27 == 1) {
                            i10 = i;
                            i11 = i25;
                            lVar2 = f9;
                            eVar = eVar;
                        }
                    }
                    f9 = f.f(eVar);
                    i10 = i;
                    i11 = i25;
                    lVar2 = f9;
                    eVar = eVar;
                }
            }
        }
        f8 = f6;
        i8 = i11;
        th = null;
        if (z7) {
        }
    }

    public abstract void U0(f1.q qVar, i1.b bVar);

    public final void V0(long j7, float f6, p6.c cVar) {
        b1(cVar, false);
        boolean a8 = r2.i.a(this.C, j7);
        f0 f0Var = this.f7614r;
        if (!a8) {
            ((x1.t) i0.a(f0Var)).I(-4.0f);
            this.C = j7;
            f0Var.G.f7700p.g0();
            j1 j1Var = this.L;
            if (j1Var != null) {
                ((x1.j1) j1Var).d(j7);
            } else {
                d1 d1Var = this.f7616t;
                if (d1Var != null) {
                    d1Var.L0();
                }
            }
            f0Var.M();
            n0.q0(this);
            k1 k1Var = f0Var.f7650p;
            if (k1Var != null) {
                ((x1.t) k1Var).w(f0Var);
            }
        }
        this.D = f6;
        if (!this.f7730n) {
            g0(m0());
        }
        if (this == f0Var.F.f7598d) {
            ((x1.t) i0.a(f0Var)).getRectManager().g(f0Var, !f0Var.G.f7700p.f7804n);
        }
    }

    public final void W0(e1.a aVar, boolean z3, boolean z7) {
        j1 j1Var = this.L;
        if (j1Var != null) {
            if (this.f7618v) {
                if (z7) {
                    long D0 = D0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (D0 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (D0 & 4294967295L)) / 2.0f;
                    long j7 = this.f7232f;
                    aVar.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j7 >> 32)) + intBitsToFloat, ((int) (j7 & 4294967295L)) + intBitsToFloat2);
                } else if (z3) {
                    long j8 = this.f7232f;
                    aVar.a(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            x1.j1 j1Var2 = (x1.j1) j1Var;
            float[] b8 = j1Var2.b();
            if (!j1Var2.f8482v) {
                if (b8 == null) {
                    aVar.f2451a = 0.0f;
                    aVar.f2452b = 0.0f;
                    aVar.f2453c = 0.0f;
                    aVar.f2454d = 0.0f;
                } else {
                    f1.p.n(b8, aVar);
                }
            }
        }
        long j9 = this.C;
        float f6 = (int) (j9 >> 32);
        aVar.f2451a += f6;
        aVar.f2453c += f6;
        float f8 = (int) (j9 & 4294967295L);
        aVar.f2452b += f8;
        aVar.f2454d += f8;
    }

    public final void X0() {
        if (this.L != null) {
            b1(null, false);
            this.f7614r.T(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [o0.e] */
    public final void Y0(u1.f0 f0Var) {
        d1 d1Var;
        u1.f0 f0Var2 = this.A;
        if (f0Var != f0Var2) {
            this.A = f0Var;
            f0 f0Var3 = this.f7614r;
            int i = 0;
            if (f0Var2 == null || f0Var.e() != f0Var2.e() || f0Var.c() != f0Var2.c()) {
                int e8 = f0Var.e();
                int c8 = f0Var.c();
                j1 j1Var = this.L;
                if (j1Var != null) {
                    ((x1.j1) j1Var).e((e8 << 32) | (c8 & 4294967295L));
                } else if (f0Var3.H() && (d1Var = this.f7616t) != null) {
                    d1Var.L0();
                }
                W((c8 & 4294967295L) | (e8 << 32));
                if (this.f7619w != null) {
                    c1(false);
                }
                boolean g3 = e1.g(4);
                y0.l E0 = E0();
                if (g3 || (E0 = E0.f8710h) != null) {
                    for (y0.l G0 = G0(g3); G0 != null && (G0.f8709g & 4) != 0; G0 = G0.i) {
                        if ((G0.f8708f & 4) != 0) {
                            l lVar = G0;
                            ?? r9 = 0;
                            while (lVar != 0) {
                                if (lVar instanceof m) {
                                    ((m) lVar).X();
                                } else if ((lVar.f8708f & 4) != 0 && (lVar instanceof l)) {
                                    y0.l lVar2 = lVar.f7707s;
                                    int i8 = 0;
                                    lVar = lVar;
                                    r9 = r9;
                                    while (lVar2 != null) {
                                        if ((lVar2.f8708f & 4) != 0) {
                                            i8++;
                                            r9 = r9;
                                            if (i8 == 1) {
                                                lVar = lVar2;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar != 0) {
                                                    r9.b(lVar);
                                                    lVar = 0;
                                                }
                                                r9.b(lVar2);
                                            }
                                        }
                                        lVar2 = lVar2.i;
                                        lVar = lVar;
                                        r9 = r9;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                lVar = f.f(r9);
                            }
                        }
                        if (G0 == E0) {
                            break;
                        }
                    }
                }
                k1 k1Var = f0Var3.f7650p;
                if (k1Var != null) {
                    ((x1.t) k1Var).w(f0Var3);
                }
            }
            o.d0 d0Var = this.B;
            if ((d0Var == null || d0Var.f5438e == 0) && f0Var.a().isEmpty()) {
                return;
            }
            o.d0 d0Var2 = this.B;
            Map a8 = f0Var.a();
            if (d0Var2 != null && d0Var2.f5438e == a8.size()) {
                Object[] objArr = d0Var2.f5435b;
                int[] iArr = d0Var2.f5436c;
                long[] jArr = d0Var2.f5434a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i9 = 0;
                loop0: while (true) {
                    long j7 = jArr[i9];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = i; i11 < i10; i11++) {
                            if ((255 & j7) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj = objArr[i12];
                                int i13 = iArr[i12];
                                Integer num = (Integer) a8.get((u1.a) obj);
                                if (num == null || num.intValue() != i13) {
                                    break loop0;
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i10 != 8) {
                            return;
                        }
                    }
                    if (i9 == length) {
                        return;
                    }
                    i9++;
                    i = 0;
                }
            }
            f0Var3.G.f7700p.f7816z.f();
            o.d0 d0Var3 = this.B;
            if (d0Var3 == null) {
                o.d0 d0Var4 = o.o0.f5516a;
                d0Var3 = new o.d0();
                this.B = d0Var3;
            }
            d0Var3.a();
            for (Map.Entry entry : f0Var.a().entrySet()) {
                d0Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final long Z0(long j7) {
        j1 j1Var = this.L;
        if (j1Var != null) {
            j7 = ((x1.j1) j1Var).c(j7, false);
        }
        long j8 = this.C;
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) + ((int) (j8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) + ((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final e1.c a1() {
        if (E0().f8718q) {
            u1.p g3 = u1.s0.g(this);
            e1.a aVar = this.E;
            if (aVar == null) {
                aVar = new e1.a();
                this.E = aVar;
            }
            long v02 = v0(D0());
            int i = (int) (v02 >> 32);
            aVar.f2451a = -Float.intBitsToFloat(i);
            int i8 = (int) (v02 & 4294967295L);
            aVar.f2452b = -Float.intBitsToFloat(i8);
            aVar.f2453c = Float.intBitsToFloat(i) + S();
            aVar.f2454d = Float.intBitsToFloat(i8) + Q();
            d1 d1Var = this;
            while (d1Var != g3) {
                d1Var.W0(aVar, false, true);
                if (!aVar.b()) {
                    d1Var = d1Var.f7616t;
                    q6.i.b(d1Var);
                }
            }
            return new e1.c(aVar.f2451a, aVar.f2452b, aVar.f2453c, aVar.f2454d);
        }
        return e1.c.f2456e;
    }

    @Override // r2.c
    public final float b() {
        return this.f7614r.f7659y.b();
    }

    public final void b1(p6.c cVar, boolean z3) {
        k1 k1Var;
        o0.e eVar;
        Reference poll;
        a1.g gVar;
        o0.e eVar2;
        Reference poll2;
        Object obj;
        f0 f0Var = this.f7614r;
        boolean z7 = (!z3 && this.f7619w == cVar && q6.i.a(this.f7620x, f0Var.f7659y) && this.f7621y == f0Var.f7660z) ? false : true;
        this.f7620x = f0Var.f7659y;
        this.f7621y = f0Var.f7660z;
        boolean G = f0Var.G();
        c1 c1Var = this.J;
        if (!G || cVar == null) {
            this.f7619w = null;
            j1 j1Var = this.L;
            if (j1Var != null) {
                x1.j1 j1Var2 = (x1.j1) j1Var;
                x1.t tVar = j1Var2.f8467f;
                if (!f1.p.l(j1Var2.b())) {
                    f0Var.M();
                }
                j1Var2.f8468g = null;
                j1Var2.f8469h = null;
                j1Var2.f8470j = true;
                if (j1Var2.f8473m) {
                    j1Var2.f8473m = false;
                    tVar.u(j1Var2, false);
                }
                f1.x xVar = j1Var2.f8466e;
                if (xVar != null) {
                    xVar.a(j1Var2.f8465d);
                    a0.a0 a0Var = tVar.f8580v0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) a0Var.f12f;
                        eVar = (o0.e) a0Var.f11e;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            eVar.j(poll);
                        }
                    } while (poll != null);
                    eVar.b(new WeakReference(j1Var2, (ReferenceQueue) a0Var.f12f));
                    tVar.A.remove(j1Var2);
                }
                f0Var.J = true;
                c1Var.b();
                if (E0().f8718q && f0Var.H() && (k1Var = f0Var.f7650p) != null) {
                    ((x1.t) k1Var).w(f0Var);
                }
            }
            this.L = null;
            this.K = false;
            return;
        }
        this.f7619w = cVar;
        if (this.L != null) {
            if (z7 && c1(true)) {
                f0Var.M();
                ((x1.t) i0.a(f0Var)).getRectManager().f(f0Var);
                return;
            }
            return;
        }
        k1 a8 = i0.a(f0Var);
        a1.g gVar2 = this.I;
        if (gVar2 == null) {
            a1.g gVar3 = new a1.g(3, this, new c1(this, 0));
            this.I = gVar3;
            gVar = gVar3;
        } else {
            gVar = gVar2;
        }
        x1.t tVar2 = (x1.t) a8;
        a0.a0 a0Var2 = tVar2.f8580v0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) a0Var2.f12f;
            eVar2 = (o0.e) a0Var2.f11e;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                eVar2.j(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i = eVar2.f5580f;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eVar2.k(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        j1 j1Var3 = (j1) obj;
        if (j1Var3 != null) {
            x1.j1 j1Var4 = (x1.j1) j1Var3;
            f1.x xVar2 = j1Var4.f8466e;
            if (xVar2 == null) {
                throw a0.q.f("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!j1Var4.f8465d.f3311s) {
                t1.a.a("layer should have been released before reuse");
            }
            j1Var4.f8465d = xVar2.b();
            j1Var4.f8470j = false;
            j1Var4.f8468g = gVar;
            j1Var4.f8469h = c1Var;
            j1Var4.f8480t = false;
            j1Var4.f8481u = false;
            j1Var4.f8482v = true;
            f1.p.o(j1Var4.f8471k);
            float[] fArr = j1Var4.f8472l;
            if (fArr != null) {
                f1.p.o(fArr);
            }
            j1Var4.f8478r = f1.l0.f2683b;
            j1Var4.f8483w = false;
            long j7 = Integer.MAX_VALUE;
            j1Var4.i = (j7 & 4294967295L) | (j7 << 32);
            j1Var4.f8479s = null;
            j1Var4.f8477q = 0;
        } else {
            j1Var3 = new x1.j1(tVar2.getGraphicsContext().b(), tVar2.getGraphicsContext(), tVar2, gVar, c1Var);
        }
        x1.j1 j1Var5 = (x1.j1) j1Var3;
        j1Var5.e(this.f7232f);
        j1Var5.d(this.C);
        this.L = j1Var3;
        c1(true);
        f0Var.J = true;
        c1Var.b();
    }

    public final boolean c1(boolean z3) {
        boolean z7;
        boolean z8;
        k1 k1Var;
        p6.a aVar;
        p6.a aVar2;
        j1 j1Var = this.L;
        if (j1Var == null) {
            if (this.f7619w == null) {
                return false;
            }
            t1.a.b("null layer with a non-null layerBlock");
            return false;
        }
        p6.c cVar = this.f7619w;
        if (cVar == null) {
            throw a0.q.f("updateLayerParameters requires a non-null layerBlock");
        }
        f1.g0 g0Var = M;
        g0Var.d(1.0f);
        g0Var.e(1.0f);
        g0Var.a(1.0f);
        if (g0Var.f2648h != 0.0f) {
            g0Var.f2644d |= 32;
            g0Var.f2648h = 0.0f;
        }
        long j7 = f1.y.f2709a;
        if (!f1.s.c(g0Var.i, j7)) {
            g0Var.f2644d |= 64;
            g0Var.i = j7;
        }
        if (!f1.s.c(g0Var.f2649j, j7)) {
            g0Var.f2644d |= 128;
            g0Var.f2649j = j7;
        }
        if (g0Var.f2650k != 8.0f) {
            g0Var.f2644d |= 2048;
            g0Var.f2650k = 8.0f;
        }
        long j8 = f1.l0.f2683b;
        g0Var.f(j8);
        f1.f0 f0Var = f1.p.f2693a;
        if (!q6.i.a(g0Var.f2652m, f0Var)) {
            g0Var.f2644d |= 8192;
            g0Var.f2652m = f0Var;
        }
        if (g0Var.f2653n) {
            g0Var.f2644d |= 16384;
            g0Var.f2653n = false;
        }
        if (g0Var.f2657r != 3) {
            g0Var.f2644d |= 524288;
            g0Var.f2657r = 3;
        }
        g0Var.f2654o = 9205357640488583168L;
        g0Var.f2658s = null;
        g0Var.f2644d = 0;
        f0 f0Var2 = this.f7614r;
        g0Var.f2655p = f0Var2.f7659y;
        g0Var.f2656q = f0Var2.f7660z;
        g0Var.f2654o = m.a.R(this.f7232f);
        ((x1.t) i0.a(f0Var2)).getSnapshotObserver().a(this, e.i, new d1.o(12, cVar));
        t tVar = this.F;
        if (tVar == null) {
            tVar = new t();
            this.F = tVar;
        }
        t tVar2 = N;
        tVar2.getClass();
        tVar2.f7779a = tVar.f7779a;
        tVar2.f7780b = tVar.f7780b;
        tVar2.f7781c = tVar.f7781c;
        tVar2.f7782d = tVar.f7782d;
        float f6 = g0Var.f2645e;
        tVar.f7779a = f6;
        tVar.f7780b = g0Var.f2646f;
        tVar.f7781c = g0Var.f2650k;
        long j9 = g0Var.f2651l;
        tVar.f7782d = j9;
        x1.j1 j1Var2 = (x1.j1) j1Var;
        x1.t tVar3 = j1Var2.f8467f;
        int i = g0Var.f2644d | j1Var2.f8477q;
        j1Var2.f8475o = g0Var.f2656q;
        j1Var2.f8474n = g0Var.f2655p;
        int i8 = i & 4096;
        if (i8 != 0) {
            j1Var2.f8478r = j9;
        }
        if ((i & 1) != 0) {
            i1.d dVar = j1Var2.f8465d.f3294a;
            if (dVar.e() != f6) {
                dVar.n(f6);
            }
        }
        if ((i & 2) != 0) {
            i1.b bVar = j1Var2.f8465d;
            float f8 = g0Var.f2646f;
            i1.d dVar2 = bVar.f3294a;
            if (dVar2.I() != f8) {
                dVar2.A(f8);
            }
        }
        if ((i & 4) != 0) {
            i1.b bVar2 = j1Var2.f8465d;
            float f9 = g0Var.f2647g;
            i1.d dVar3 = bVar2.f3294a;
            if (dVar3.a() != f9) {
                dVar3.d(f9);
            }
        }
        if ((i & 8) != 0) {
            i1.d dVar4 = j1Var2.f8465d.f3294a;
            if (dVar4.r() != 0.0f) {
                dVar4.s();
            }
        }
        if ((i & 16) != 0) {
            i1.d dVar5 = j1Var2.f8465d.f3294a;
            if (dVar5.g() != 0.0f) {
                dVar5.h();
            }
        }
        if ((i & 32) != 0) {
            i1.b bVar3 = j1Var2.f8465d;
            float f10 = g0Var.f2648h;
            i1.d dVar6 = bVar3.f3294a;
            if (dVar6.F() != f10) {
                dVar6.f(f10);
                bVar3.f3300g = true;
                bVar3.a();
            }
            if (g0Var.f2648h > 0.0f && !j1Var2.f8483w && (aVar2 = j1Var2.f8469h) != null) {
                aVar2.b();
            }
        }
        if ((i & 64) != 0) {
            i1.b bVar4 = j1Var2.f8465d;
            long j10 = g0Var.i;
            i1.d dVar7 = bVar4.f3294a;
            if (!f1.s.c(j10, dVar7.M())) {
                dVar7.k(j10);
            }
        }
        if ((i & 128) != 0) {
            i1.b bVar5 = j1Var2.f8465d;
            long j11 = g0Var.f2649j;
            i1.d dVar8 = bVar5.f3294a;
            if (!f1.s.c(j11, dVar8.j())) {
                dVar8.z(j11);
            }
        }
        if ((i & 1024) != 0) {
            i1.d dVar9 = j1Var2.f8465d.f3294a;
            if (dVar9.J() != 0.0f) {
                dVar9.y();
            }
        }
        if ((i & 256) != 0) {
            i1.d dVar10 = j1Var2.f8465d.f3294a;
            if (dVar10.v() != 0.0f) {
                dVar10.b();
            }
        }
        if ((i & 512) != 0) {
            i1.d dVar11 = j1Var2.f8465d.f3294a;
            if (dVar11.D() != 0.0f) {
                dVar11.i();
            }
        }
        if ((i & 2048) != 0) {
            i1.b bVar6 = j1Var2.f8465d;
            float f11 = g0Var.f2650k;
            i1.d dVar12 = bVar6.f3294a;
            if (dVar12.p() != f11) {
                dVar12.E(f11);
            }
        }
        if (i8 != 0) {
            if (f1.l0.a(j1Var2.f8478r, j8)) {
                i1.b bVar7 = j1Var2.f8465d;
                if (!e1.b.b(bVar7.f3314v, 9205357640488583168L)) {
                    bVar7.f3314v = 9205357640488583168L;
                    bVar7.f3294a.L(9205357640488583168L);
                }
            } else {
                i1.b bVar8 = j1Var2.f8465d;
                long floatToRawIntBits = (Float.floatToRawIntBits(f1.l0.c(j1Var2.f8478r) * ((int) (j1Var2.i & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(f1.l0.b(j1Var2.f8478r) * ((int) (j1Var2.i >> 32))) << 32);
                if (!e1.b.b(bVar8.f3314v, floatToRawIntBits)) {
                    bVar8.f3314v = floatToRawIntBits;
                    bVar8.f3294a.L(floatToRawIntBits);
                }
            }
        }
        if ((i & 16384) != 0) {
            i1.b bVar9 = j1Var2.f8465d;
            boolean z9 = g0Var.f2653n;
            if (bVar9.f3315w != z9) {
                bVar9.f3315w = z9;
                bVar9.f3300g = true;
                bVar9.a();
            }
        }
        if ((131072 & i) != 0) {
            i1.d dVar13 = j1Var2.f8465d.f3294a;
        }
        if ((262144 & i) != 0) {
            i1.d dVar14 = j1Var2.f8465d.f3294a;
            if (!q6.i.a(dVar14.w(), null)) {
                dVar14.m();
            }
        }
        if ((i & 524288) != 0) {
            i1.b bVar10 = j1Var2.f8465d;
            int i9 = g0Var.f2657r;
            i1.d dVar15 = bVar10.f3294a;
            if (dVar15.K() != i9) {
                dVar15.o(i9);
            }
        }
        if ((32768 & i) != 0) {
            i1.d dVar16 = j1Var2.f8465d.f3294a;
            if (dVar16.u() != 0) {
                dVar16.x(0);
            }
        }
        if ((i & 7963) != 0) {
            j1Var2.f8480t = true;
            j1Var2.f8481u = true;
        }
        if (q6.i.a(j1Var2.f8479s, g0Var.f2658s)) {
            z7 = true;
            z8 = false;
        } else {
            f1.p pVar = g0Var.f2658s;
            j1Var2.f8479s = pVar;
            if (pVar == null) {
                z7 = true;
            } else {
                i1.b bVar11 = j1Var2.f8465d;
                if (pVar instanceof f1.d0) {
                    e1.c cVar2 = ((f1.d0) pVar).f2632e;
                    float f12 = cVar2.f2457a;
                    float f13 = cVar2.f2458b;
                    bVar11.e(0.0f, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(cVar2.f2459c - f12) << 32) | (Float.floatToRawIntBits(cVar2.f2460d - f13) & 4294967295L));
                } else if (pVar instanceof f1.c0) {
                    f1.j jVar = ((f1.c0) pVar).f2630e;
                    bVar11.f3303k = null;
                    bVar11.i = 9205357640488583168L;
                    bVar11.f3301h = 0L;
                    bVar11.f3302j = 0.0f;
                    bVar11.f3300g = true;
                    bVar11.f3306n = false;
                    bVar11.f3304l = jVar;
                    bVar11.a();
                } else {
                    if (!(pVar instanceof f1.e0)) {
                        throw new a5.c();
                    }
                    f1.e0 e0Var = (f1.e0) pVar;
                    f1.j jVar2 = e0Var.f2636f;
                    if (jVar2 != null) {
                        bVar11.f3303k = null;
                        bVar11.i = 9205357640488583168L;
                        bVar11.f3301h = 0L;
                        bVar11.f3302j = 0.0f;
                        z7 = true;
                        bVar11.f3300g = true;
                        bVar11.f3306n = false;
                        bVar11.f3304l = jVar2;
                        bVar11.a();
                    } else {
                        z7 = true;
                        bVar11.e(Float.intBitsToFloat((int) (e0Var.f2635e.f2468h >> 32)), (Float.floatToRawIntBits(r9.f2461a) << 32) | (Float.floatToRawIntBits(r9.f2462b) & 4294967295L), (Float.floatToRawIntBits(r9.b()) << 32) | (Float.floatToRawIntBits(r9.a()) & 4294967295L));
                    }
                    if ((pVar instanceof f1.c0) && Build.VERSION.SDK_INT < 33 && (aVar = j1Var2.f8469h) != null) {
                        aVar.b();
                    }
                }
                z7 = true;
                if (pVar instanceof f1.c0) {
                    aVar.b();
                }
            }
            z8 = z7;
        }
        j1Var2.f8477q = g0Var.f2644d;
        if (i != 0 || z8) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = tVar3.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(tVar3, tVar3);
                }
            } else {
                tVar3.invalidate();
            }
            if (tVar3.i) {
                tVar3.I(0.0f);
            }
        }
        boolean z10 = this.f7618v;
        this.f7618v = g0Var.f2653n;
        this.f7622z = g0Var.f2647g;
        boolean z11 = (tVar2.f7779a == tVar.f7779a && tVar2.f7780b == tVar.f7780b && tVar2.f7781c == tVar.f7781c && f1.l0.a(tVar2.f7782d, tVar.f7782d)) ? z7 : false;
        boolean z12 = !z11;
        if (z3 && ((!z11 || z10 != this.f7618v) && (k1Var = f0Var2.f7650p) != null)) {
            ((x1.t) k1Var).w(f0Var2);
        }
        return z12;
    }

    @Override // u1.p
    public final long d(long j7) {
        if (!E0().f8718q) {
            t1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((x1.t) i0.a(this.f7614r)).r(O0(j7));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d1(long j7) {
        boolean z3;
        boolean z7;
        boolean z8;
        if ((((9187343241974906880L ^ (j7 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        j1 j1Var = this.L;
        if (j1Var == null || !this.f7618v) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        i1.b bVar = ((x1.j1) j1Var).f8465d;
        if (bVar.f3315w) {
            f1.p d8 = bVar.d();
            if (!(d8 instanceof f1.d0)) {
                if (d8 instanceof f1.e0) {
                    e1.d dVar = ((f1.e0) d8).f2635e;
                    float f6 = dVar.f2461a;
                    long j8 = dVar.f2466f;
                    long j9 = dVar.f2468h;
                    long j10 = dVar.f2467g;
                    z3 = false;
                    float f8 = dVar.f2464d;
                    z7 = true;
                    float f9 = dVar.f2462b;
                    float f10 = dVar.f2463c;
                    long j11 = dVar.f2465e;
                    if (intBitsToFloat >= f6 && intBitsToFloat < f10 && intBitsToFloat2 >= f9 && intBitsToFloat2 < f8) {
                        int i = (int) (j11 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        int i8 = (int) (j8 >> 32);
                        if (Float.intBitsToFloat(i8) + intBitsToFloat3 <= dVar.b()) {
                            int i9 = (int) (j9 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i9);
                            int i10 = (int) (j10 >> 32);
                            if (Float.intBitsToFloat(i10) + intBitsToFloat4 <= dVar.b()) {
                                int i11 = (int) (j11 & 4294967295L);
                                int i12 = (int) (j9 & 4294967295L);
                                if (Float.intBitsToFloat(i12) + Float.intBitsToFloat(i11) <= dVar.a()) {
                                    int i13 = (int) (j8 & 4294967295L);
                                    int i14 = (int) (j10 & 4294967295L);
                                    if (Float.intBitsToFloat(i14) + Float.intBitsToFloat(i13) <= dVar.a()) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i) + f6;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i11) + f9;
                                        float intBitsToFloat7 = f10 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i13) + f9;
                                        float intBitsToFloat9 = f10 - Float.intBitsToFloat(i10);
                                        float intBitsToFloat10 = f8 - Float.intBitsToFloat(i14);
                                        float intBitsToFloat11 = f8 - Float.intBitsToFloat(i12);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i9) + f6;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z8 = x1.g0.p(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, dVar.f2465e);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z8 = x1.g0.p(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, dVar.f2468h);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z8 = x1.g0.p(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, dVar.f2467g);
                                            }
                                            z8 = z7;
                                        } else {
                                            z8 = x1.g0.p(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, dVar.f2466f);
                                        }
                                    }
                                }
                            }
                        }
                        f1.j a8 = f1.l.a();
                        f1.j.a(a8, dVar);
                        z8 = x1.g0.o(intBitsToFloat, intBitsToFloat2, a8);
                    }
                } else {
                    z3 = false;
                    z7 = true;
                    if (!(d8 instanceof f1.c0)) {
                        throw new a5.c();
                    }
                    z8 = x1.g0.o(intBitsToFloat, intBitsToFloat2, ((f1.c0) d8).f2630e);
                }
                return z8 ? z7 : z3;
            }
            e1.c cVar = ((f1.d0) d8).f2632e;
            if (cVar.f2457a > intBitsToFloat || intBitsToFloat >= cVar.f2459c || cVar.f2458b > intBitsToFloat2 || intBitsToFloat2 >= cVar.f2460d) {
                z3 = false;
                z7 = true;
            }
            z8 = z3;
            if (z8) {
            }
        }
        z3 = false;
        z7 = true;
        z8 = z7;
        if (z8) {
        }
    }

    @Override // u1.p
    public final long f(long j7) {
        long O0 = O0(j7);
        x1.t tVar = (x1.t) i0.a(this.f7614r);
        tVar.A();
        return f1.p.m(tVar.T, O0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    @Override // u1.l0, u1.d0
    public final Object g() {
        f0 f0Var = this.f7614r;
        if (!f0Var.F.d(64)) {
            return null;
        }
        E0();
        Object obj = null;
        for (y0.l lVar = f0Var.F.f7599e; lVar != null; lVar = lVar.f8710h) {
            if ((lVar.f8708f & 64) != 0) {
                l lVar2 = lVar;
                ?? r52 = 0;
                while (lVar2 != 0) {
                    if (lVar2 instanceof n1) {
                        obj = ((n1) lVar2).W(obj);
                    } else if ((lVar2.f8708f & 64) != 0 && (lVar2 instanceof l)) {
                        y0.l lVar3 = lVar2.f7707s;
                        int i = 0;
                        lVar2 = lVar2;
                        r52 = r52;
                        while (lVar3 != null) {
                            if ((lVar3.f8708f & 64) != 0) {
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
                    lVar2 = f.f(r52);
                }
            }
        }
        return obj;
    }

    @Override // u1.g0
    public final r2.l getLayoutDirection() {
        return this.f7614r.f7660z;
    }

    @Override // u1.p
    public final u1.p h() {
        if (!E0().f8718q) {
            t1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        P0();
        return this.f7614r.F.f7598d.f7616t;
    }

    @Override // r2.c
    public final float i() {
        return this.f7614r.f7659y.i();
    }

    @Override // w1.n0
    public final n0 i0() {
        return this.f7615s;
    }

    @Override // w1.n0
    public final boolean k0() {
        return this.A != null;
    }

    @Override // w1.n0
    public final f0 l0() {
        return this.f7614r;
    }

    @Override // w1.n0
    public final u1.f0 m0() {
        u1.f0 f0Var = this.A;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // w1.n0
    public final n0 n0() {
        return this.f7616t;
    }

    @Override // w1.n0
    public final long o0() {
        return this.C;
    }

    @Override // w1.n0
    public final void s0() {
        U(this.C, this.D, this.f7619w);
    }

    public final void t0(d1 d1Var, e1.a aVar, boolean z3) {
        if (d1Var == this) {
            return;
        }
        d1 d1Var2 = this.f7616t;
        if (d1Var2 != null) {
            d1Var2.t0(d1Var, aVar, z3);
        }
        long j7 = this.C;
        float f6 = (int) (j7 >> 32);
        aVar.f2451a -= f6;
        aVar.f2453c -= f6;
        float f8 = (int) (j7 & 4294967295L);
        aVar.f2452b -= f8;
        aVar.f2454d -= f8;
        j1 j1Var = this.L;
        if (j1Var != null) {
            x1.j1 j1Var2 = (x1.j1) j1Var;
            float[] a8 = j1Var2.a();
            if (!j1Var2.f8482v) {
                if (a8 == null) {
                    aVar.f2451a = 0.0f;
                    aVar.f2452b = 0.0f;
                    aVar.f2453c = 0.0f;
                    aVar.f2454d = 0.0f;
                } else {
                    f1.p.n(a8, aVar);
                }
            }
            if (this.f7618v && z3) {
                long j8 = this.f7232f;
                aVar.a(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L));
            }
        }
    }

    public final long u0(d1 d1Var, long j7) {
        if (d1Var == this) {
            return j7;
        }
        d1 d1Var2 = this.f7616t;
        return (d1Var2 == null || q6.i.a(d1Var, d1Var2)) ? B0(j7) : B0(d1Var2.u0(d1Var, j7));
    }

    @Override // w1.l1
    public final boolean v() {
        return (this.L == null || this.f7617u || !this.f7614r.G()) ? false : true;
    }

    public final long v0(long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - S();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Q();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float w0(long j7, long j8) {
        if (S() >= Float.intBitsToFloat((int) (j8 >> 32)) && Q() >= Float.intBitsToFloat((int) (j8 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long v02 = v0(j8);
        float intBitsToFloat = Float.intBitsToFloat((int) (v02 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (v02 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - S());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j7 & 4294967295L)) < 0.0f ? -r9 : r9 - Q())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i8 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i8) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i8);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void x0(f1.q qVar, i1.b bVar) {
        i1.d dVar;
        Canvas canvas;
        Canvas canvas2;
        boolean z3;
        boolean z7;
        boolean z8;
        float f6;
        j1 j1Var = this.L;
        if (j1Var == null) {
            long j7 = this.C;
            float f8 = (int) (j7 >> 32);
            float f9 = (int) (j7 & 4294967295L);
            qVar.d(f8, f9);
            y0(qVar, bVar);
            qVar.d(-f8, -f9);
            return;
        }
        x1.j1 j1Var2 = (x1.j1) j1Var;
        h1.b bVar2 = j1Var2.f8476p;
        j1Var2.f();
        j1Var2.f8483w = j1Var2.f8465d.f3294a.F() > 0.0f;
        a0.g1 g1Var = bVar2.f3075e;
        g1Var.J(qVar);
        g1Var.f85c = bVar;
        i1.b bVar3 = j1Var2.f8465d;
        f1.q m7 = bVar2.y().m();
        i1.b bVar4 = (i1.b) bVar2.y().f85c;
        i1.d dVar2 = bVar3.f3294a;
        if (bVar3.f3311s) {
            return;
        }
        bVar3.a();
        if (!dVar2.G()) {
            try {
                bVar3.f3294a.c(bVar3.f3295b, bVar3.f3296c, bVar3, bVar3.f3298e);
            } catch (Throwable unused) {
            }
        }
        boolean z9 = dVar2.F() > 0.0f;
        if (z9) {
            m7.m();
        }
        Canvas a8 = f1.c.a(m7);
        boolean isHardwareAccelerated = a8.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            dVar = dVar2;
            canvas = a8;
        } else {
            long j8 = bVar3.f3312t;
            float f10 = (int) (j8 >> 32);
            float f11 = (int) (j8 & 4294967295L);
            dVar = dVar2;
            long j9 = bVar3.f3313u;
            float f12 = ((int) (j9 >> 32)) + f10;
            float f13 = f11 + ((int) (j9 & 4294967295L));
            float a9 = dVar.a();
            f1.m w7 = dVar.w();
            int K = dVar.K();
            if (a9 < 1.0f || K != 3 || w7 != null || dVar.u() == 1) {
                f1.h hVar = bVar3.f3308p;
                if (hVar == null) {
                    hVar = f1.p.f();
                    bVar3.f3308p = hVar;
                }
                hVar.c(a9);
                hVar.d(K);
                hVar.f(w7);
                f6 = f10;
                a8.saveLayer(f6, f11, f12, f13, (Paint) hVar.f2660b);
            } else {
                a8.save();
                f6 = f10;
            }
            canvas = a8;
            canvas.translate(f6, f11);
            canvas.concat(dVar.B());
        }
        boolean z10 = !isHardwareAccelerated && bVar3.f3315w;
        if (z10) {
            m7.h();
            f1.p d8 = bVar3.d();
            if (d8 instanceof f1.d0) {
                e1.c cVar = ((f1.d0) d8).f2632e;
                m7.c(cVar.f2457a, cVar.f2458b, cVar.f2459c, cVar.f2460d, 1);
            } else if (d8 instanceof f1.e0) {
                f1.j jVar = bVar3.f3305m;
                if (jVar != null) {
                    jVar.f2669a.rewind();
                } else {
                    jVar = f1.l.a();
                    bVar3.f3305m = jVar;
                }
                f1.j.a(jVar, ((f1.e0) d8).f2635e);
                m7.g(jVar);
            } else {
                if (!(d8 instanceof f1.c0)) {
                    throw new a5.c();
                }
                m7.g(((f1.c0) d8).f2630e);
            }
        }
        if (bVar4 != null) {
            i0.h hVar2 = bVar4.f3310r;
            if (!hVar2.f3282a) {
                f1.a0.a("Only add dependencies during a tracking");
            }
            o.k0 k0Var = (o.k0) hVar2.f3285d;
            if (k0Var != null) {
                k0Var.a(bVar3);
            } else if (((i1.b) hVar2.f3283b) != null) {
                o.k0 k0Var2 = o.s0.f5536a;
                o.k0 k0Var3 = new o.k0();
                i1.b bVar5 = (i1.b) hVar2.f3283b;
                q6.i.b(bVar5);
                k0Var3.a(bVar5);
                k0Var3.a(bVar3);
                hVar2.f3285d = k0Var3;
                hVar2.f3283b = null;
            } else {
                hVar2.f3283b = bVar3;
            }
            o.k0 k0Var4 = (o.k0) hVar2.f3286e;
            if (k0Var4 != null) {
                z8 = !k0Var4.l(bVar3);
            } else if (((i1.b) hVar2.f3284c) != bVar3) {
                z8 = true;
            } else {
                hVar2.f3284c = null;
                z8 = false;
            }
            if (z8) {
                bVar3.f3309q++;
            }
        }
        if (f1.c.a(m7).isHardwareAccelerated()) {
            i1.d dVar3 = dVar;
            canvas2 = canvas;
            z3 = z10;
            z7 = z9;
            dVar3.H(m7);
        } else {
            h1.b bVar6 = bVar3.f3307o;
            if (bVar6 == null) {
                bVar6 = new h1.b();
                bVar3.f3307o = bVar6;
            }
            a0.g1 g1Var2 = bVar6.f3075e;
            r2.c cVar2 = bVar3.f3295b;
            r2.l lVar = bVar3.f3296c;
            long R = m.a.R(bVar3.f3313u);
            h1.a aVar = ((h1.b) g1Var2.f86d).f3074d;
            r2.c cVar3 = aVar.f3070a;
            r2.l lVar2 = aVar.f3071b;
            f1.q m8 = g1Var2.m();
            canvas2 = canvas;
            z3 = z10;
            long u7 = g1Var2.u();
            z7 = z9;
            i1.b bVar7 = (i1.b) g1Var2.f85c;
            g1Var2.K(cVar2);
            g1Var2.L(lVar);
            g1Var2.J(m7);
            g1Var2.M(R);
            g1Var2.f85c = bVar3;
            m7.h();
            try {
                bVar3.c(bVar6);
            } finally {
                m7.f();
                g1Var2.K(cVar3);
                g1Var2.L(lVar2);
                g1Var2.J(m8);
                g1Var2.M(u7);
                g1Var2.f85c = bVar7;
            }
        }
        if (z3) {
            m7.f();
        }
        if (z7) {
            m7.k();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas2.restore();
    }

    public final void y0(f1.q qVar, i1.b bVar) {
        f1.q qVar2;
        i1.b bVar2;
        y0.l F0 = F0(4);
        if (F0 == null) {
            U0(qVar, bVar);
            return;
        }
        f0 f0Var = this.f7614r;
        f0Var.getClass();
        h0 sharedDrawScope = ((x1.t) i0.a(f0Var)).getSharedDrawScope();
        long R = m.a.R(this.f7232f);
        sharedDrawScope.getClass();
        o0.e eVar = null;
        while (F0 != null) {
            if (F0 instanceof m) {
                qVar2 = qVar;
                bVar2 = bVar;
                sharedDrawScope.d(qVar2, R, this, (m) F0, bVar2);
            } else {
                qVar2 = qVar;
                bVar2 = bVar;
                if ((F0.f8708f & 4) != 0 && (F0 instanceof l)) {
                    int i = 0;
                    for (y0.l lVar = ((l) F0).f7707s; lVar != null; lVar = lVar.i) {
                        if ((lVar.f8708f & 4) != 0) {
                            i++;
                            if (i == 1) {
                                F0 = lVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new o0.e(new y0.l[16]);
                                }
                                if (F0 != null) {
                                    eVar.b(F0);
                                    F0 = null;
                                }
                                eVar.b(lVar);
                            }
                        }
                    }
                    if (i == 1) {
                        qVar = qVar2;
                        bVar = bVar2;
                    }
                }
            }
            F0 = f.f(eVar);
            qVar = qVar2;
            bVar = bVar2;
        }
    }

    public abstract void z0();

    @Override // w1.n0
    public final u1.p j0() {
        return this;
    }
}
