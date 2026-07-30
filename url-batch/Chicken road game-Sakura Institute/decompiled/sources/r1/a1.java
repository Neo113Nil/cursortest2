package r1;

import android.os.Build;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import s1.b2;
import s1.n2;
import s1.o2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a1 extends o0 implements p1.e0, p1.p, h1 {
    public static final z0.n0 J;
    public static final u K;
    public static final float[] L;
    public static final d M;
    public static final d N;
    public LinkedHashMap A;
    public float C;
    public y0.b D;
    public u E;
    public boolean H;
    public f1 I;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f7700q;

    /* renamed from: r, reason: collision with root package name */
    public a1 f7701r;

    /* renamed from: s, reason: collision with root package name */
    public a1 f7702s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7703t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7704u;

    /* renamed from: v, reason: collision with root package name */
    public q6.c f7705v;

    /* renamed from: w, reason: collision with root package name */
    public m2.b f7706w;

    /* renamed from: x, reason: collision with root package name */
    public m2.k f7707x;

    /* renamed from: z, reason: collision with root package name */
    public p1.g0 f7709z;

    /* renamed from: y, reason: collision with root package name */
    public float f7708y = 0.8f;
    public long B = 0;
    public final a2.a F = new a2.a(14, this);
    public final androidx.lifecycle.r0 G = new androidx.lifecycle.r0(29, this);

    static {
        z0.n0 n0Var = new z0.n0();
        n0Var.f10015g = 1.0f;
        n0Var.f10016h = 1.0f;
        n0Var.f10017i = 1.0f;
        long j8 = z0.d0.f9987a;
        n0Var.f10019k = j8;
        n0Var.f10020l = j8;
        n0Var.f10021m = 8.0f;
        n0Var.f10022n = z0.s0.f10047b;
        n0Var.f10023o = z0.l0.f10006a;
        n0Var.f10025q = 9205357640488583168L;
        n0Var.f10026r = t6.a.b();
        n0Var.f10027s = m2.k.f6322f;
        J = n0Var;
        K = new u();
        L = z0.f0.a();
        M = new d(1);
        N = new d(2);
    }

    public a1(d0 d0Var) {
        this.f7700q = d0Var;
        this.f7706w = d0Var.f7735v;
        this.f7707x = d0Var.f7736w;
    }

    public static a1 d1(p1.p pVar) {
        a1 a1Var;
        p1.d0 d0Var = pVar instanceof p1.d0 ? (p1.d0) pVar : null;
        if (d0Var != null && (a1Var = d0Var.f7038f.f7870q) != null) {
            return a1Var;
        }
        r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (a1) pVar;
    }

    public final void A0(a1 a1Var, y0.b bVar, boolean z8) {
        if (a1Var == this) {
            return;
        }
        a1 a1Var2 = this.f7702s;
        if (a1Var2 != null) {
            a1Var2.A0(a1Var, bVar, z8);
        }
        long j8 = this.B;
        float f9 = (int) (j8 >> 32);
        bVar.f9774a -= f9;
        bVar.f9776c -= f9;
        float f10 = (int) (j8 & 4294967295L);
        bVar.f9775b -= f10;
        bVar.f9777d -= f10;
        f1 f1Var = this.I;
        if (f1Var != null) {
            f1Var.g(bVar, true);
            if (this.f7704u && z8) {
                long j9 = this.f7065h;
                bVar.a(0.0f, 0.0f, (int) (j9 >> 32), (int) (j9 & 4294967295L));
            }
        }
    }

    public final long B0(a1 a1Var, long j8) {
        if (a1Var == this) {
            return j8;
        }
        a1 a1Var2 = this.f7702s;
        return (a1Var2 == null || r6.k.a(a1Var, a1Var2)) ? J0(j8) : J0(a1Var2.B0(a1Var, j8));
    }

    public final long C0(long j8) {
        return v0.d.a(Math.max(0.0f, (y0.f.d(j8) - h0()) / 2.0f), Math.max(0.0f, (y0.f.b(j8) - ((int) (this.f7065h & 4294967295L))) / 2.0f));
    }

    public final float D0(long j8, long j9) {
        if (h0() >= y0.f.d(j9) && ((int) (this.f7065h & 4294967295L)) >= y0.f.b(j9)) {
            return Float.POSITIVE_INFINITY;
        }
        long C0 = C0(j9);
        float d8 = y0.f.d(C0);
        float b9 = y0.f.b(C0);
        float d9 = y0.c.d(j8);
        float max = Math.max(0.0f, d9 < 0.0f ? -d9 : d9 - h0());
        float e9 = y0.c.e(j8);
        long a3 = u3.r.a(max, Math.max(0.0f, e9 < 0.0f ? -e9 : e9 - ((int) (this.f7065h & 4294967295L))));
        if ((d8 <= 0.0f && b9 <= 0.0f) || y0.c.d(a3) > d8 || y0.c.e(a3) > b9) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (a3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (a3 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public final void E0(z0.r rVar, c1.c cVar) {
        f1 f1Var = this.I;
        if (f1Var != null) {
            f1Var.j(rVar, cVar);
            return;
        }
        long j8 = this.B;
        float f9 = (int) (j8 >> 32);
        float f10 = (int) (j8 & 4294967295L);
        rVar.k(f9, f10);
        G0(rVar, cVar);
        rVar.k(-f9, -f10);
    }

    public final void F0(z0.r rVar, f7.i0 i0Var) {
        long j8 = this.f7065h;
        rVar.getClass();
        rVar.g(0.5f, 0.5f, ((int) (j8 >> 32)) - 0.5f, ((int) (j8 & 4294967295L)) - 0.5f, i0Var);
    }

    public final void G0(z0.r rVar, c1.c cVar) {
        z0.r rVar2;
        c1.c cVar2;
        s0.n N0 = N0(4);
        if (N0 == null) {
            Y0(rVar, cVar);
            return;
        }
        d0 d0Var = this.f7700q;
        d0Var.getClass();
        f0 sharedDrawScope = ((s1.r) g0.a(d0Var)).getSharedDrawScope();
        long o02 = j1.c.o0(this.f7065h);
        sharedDrawScope.getClass();
        i0.d dVar = null;
        while (N0 != null) {
            if (N0 instanceof o) {
                rVar2 = rVar;
                cVar2 = cVar;
                sharedDrawScope.c(rVar2, o02, this, (o) N0, cVar2);
            } else {
                rVar2 = rVar;
                cVar2 = cVar;
                if ((N0.f8106h & 4) != 0 && (N0 instanceof m)) {
                    int i7 = 0;
                    for (s0.n nVar = ((m) N0).f7853t; nVar != null; nVar = nVar.f8109k) {
                        if ((nVar.f8106h & 4) != 0) {
                            i7++;
                            if (i7 == 1) {
                                N0 = nVar;
                            } else {
                                if (dVar == null) {
                                    dVar = new i0.d(new s0.n[16]);
                                }
                                if (N0 != null) {
                                    dVar.b(N0);
                                    N0 = null;
                                }
                                dVar.b(nVar);
                            }
                        }
                    }
                    if (i7 == 1) {
                        rVar = rVar2;
                        cVar = cVar2;
                    }
                }
            }
            N0 = f.f(dVar);
            rVar = rVar2;
            cVar = cVar2;
        }
    }

    public abstract void H0();

    public final a1 I0(a1 a1Var) {
        d0 d0Var = a1Var.f7700q;
        d0 d0Var2 = this.f7700q;
        if (d0Var == d0Var2) {
            s0.n M0 = a1Var.M0();
            s0.n nVar = M0().f8104f;
            if (!nVar.f8116r) {
                a.a.M("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (s0.n nVar2 = nVar.f8108j; nVar2 != null; nVar2 = nVar2.f8108j) {
                if ((nVar2.f8106h & 2) != 0 && nVar2 == M0) {
                    return a1Var;
                }
            }
            return this;
        }
        while (d0Var.f7728o > d0Var2.f7728o) {
            d0Var = d0Var.s();
            r6.k.c(d0Var);
        }
        d0 d0Var3 = d0Var2;
        while (d0Var3.f7728o > d0Var.f7728o) {
            d0Var3 = d0Var3.s();
            r6.k.c(d0Var3);
        }
        while (d0Var != d0Var3) {
            d0Var = d0Var.s();
            d0Var3 = d0Var3.s();
            if (d0Var == null || d0Var3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (d0Var3 != d0Var2) {
            if (d0Var != a1Var.f7700q) {
                return (t) d0Var.A.f3892c;
            }
            return a1Var;
        }
        return this;
    }

    public final long J0(long j8) {
        long j9 = this.B;
        long a3 = u3.r.a(y0.c.d(j8) - ((int) (j9 >> 32)), y0.c.e(j8) - ((int) (j9 & 4294967295L)));
        f1 f1Var = this.I;
        return f1Var != null ? f1Var.b(a3, true) : a3;
    }

    public abstract p0 K0();

    public final long L0() {
        return this.f7706w.U(this.f7700q.f7737x.g());
    }

    @Override // p1.p
    public final long M(long j8) {
        if (M0().f8116r) {
            return U0(p1.s0.f(this), ((s1.r) g0.a(this.f7700q)).D(j8));
        }
        a.a.M("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public abstract s0.n M0();

    public final s0.n N0(int i7) {
        boolean h3 = b1.h(i7);
        s0.n M0 = M0();
        if (!h3 && (M0 = M0.f8108j) == null) {
            return null;
        }
        for (s0.n O0 = O0(h3); O0 != null && (O0.f8107i & i7) != 0; O0 = O0.f8109k) {
            if ((O0.f8106h & i7) != 0) {
                return O0;
            }
            if (O0 == M0) {
                return null;
            }
        }
        return null;
    }

    @Override // p1.p
    public final boolean O() {
        return M0().f8116r;
    }

    public final s0.n O0(boolean z8) {
        s0.n M0;
        g0.t tVar = this.f7700q.A;
        if (((a1) tVar.f3893d) == this) {
            return (s0.n) tVar.f3895f;
        }
        if (!z8) {
            a1 a1Var = this.f7702s;
            if (a1Var != null) {
                return a1Var.M0();
            }
            return null;
        }
        a1 a1Var2 = this.f7702s;
        if (a1Var2 == null || (M0 = a1Var2.M0()) == null) {
            return null;
        }
        return M0.f8109k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void P0(s0.n nVar, d dVar, long j8, r rVar, boolean z8, boolean z9) {
        if (nVar == null) {
            R0(dVar, j8, rVar, z8, z9);
            return;
        }
        rVar.g(nVar, -1.0f, z9, new x0(this, nVar, dVar, j8, rVar, z8, z9));
        a1 a1Var = nVar.f8111m;
        if (a1Var != null) {
            s0.n O0 = a1Var.O0(b1.h(16));
            if (O0 != null && O0.f8116r) {
                s0.n nVar2 = O0.f8104f;
                if (!nVar2.f8116r) {
                    a.a.M("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((nVar2.f8107i & 16) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f8106h & 16) != 0) {
                            m mVar = nVar2;
                            ?? r12 = 0;
                            while (mVar != 0) {
                                if (mVar instanceof l1) {
                                    if (((l1) mVar).R()) {
                                        return;
                                    }
                                } else if ((mVar.f8106h & 16) != 0 && (mVar instanceof m)) {
                                    s0.n nVar3 = mVar.f7853t;
                                    int i7 = 0;
                                    r12 = r12;
                                    mVar = mVar;
                                    while (nVar3 != null) {
                                        if ((nVar3.f8106h & 16) != 0) {
                                            i7++;
                                            r12 = r12;
                                            if (i7 == 1) {
                                                mVar = nVar3;
                                            } else {
                                                if (r12 == 0) {
                                                    r12 = new i0.d(new s0.n[16]);
                                                }
                                                if (mVar != 0) {
                                                    r12.b(mVar);
                                                    mVar = 0;
                                                }
                                                r12.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f8109k;
                                        r12 = r12;
                                        mVar = mVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                mVar = f.f(r12);
                            }
                        }
                        nVar2 = nVar2.f8109k;
                    }
                }
            }
            rVar.f7890j = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r1.f.h(r18.a(), r1.f.a(r9, r20)) > 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(d dVar, long j8, r rVar, boolean z8, boolean z9) {
        s0.n N0 = N0(dVar.a());
        if (!j1(j8)) {
            if (z8) {
                float D0 = D0(j8, L0());
                if (Float.isInfinite(D0) || Float.isNaN(D0)) {
                    return;
                }
                if (rVar.f7888h != e6.m.W(rVar)) {
                    if (f.h(rVar.a(), f.a(D0, false)) <= 0) {
                        return;
                    }
                }
                boolean z10 = false;
                if (N0 == null) {
                    R0(dVar, j8, rVar, z8, false);
                    return;
                } else {
                    rVar.g(N0, D0, false, new y0(this, N0, dVar, j8, rVar, z8, z10, D0, 0));
                    return;
                }
            }
            return;
        }
        if (N0 == null) {
            R0(dVar, j8, rVar, z8, z9);
            return;
        }
        float d8 = y0.c.d(j8);
        float e9 = y0.c.e(j8);
        if (d8 >= 0.0f && e9 >= 0.0f && d8 < h0() && e9 < ((int) (this.f7065h & 4294967295L))) {
            P0(N0, dVar, j8, rVar, z8, z9);
            return;
        }
        float D02 = !z8 ? Float.POSITIVE_INFINITY : D0(j8, L0());
        if (!Float.isInfinite(D02) && !Float.isNaN(D02)) {
            if (rVar.f7888h != e6.m.W(rVar)) {
            }
            rVar.g(N0, D02, z9, new y0(this, N0, dVar, j8, rVar, z8, z9, D02, 0));
            return;
        }
        c1(N0, dVar, j8, rVar, z8, z9, D02);
    }

    @Override // p1.p
    public final void R(float[] fArr) {
        g1 a3 = g0.a(this.f7700q);
        g1(d1(p1.s0.f(this)), fArr);
        s1.r rVar = (s1.r) a3;
        rVar.A();
        z0.f0.g(fArr, rVar.Q);
        float d8 = y0.c.d(rVar.U);
        float e9 = y0.c.e(rVar.U);
        float[] fArr2 = rVar.P;
        z0.f0.d(fArr2);
        z0.f0.h(fArr2, d8, e9);
        s1.j0.x(fArr, fArr2);
    }

    public void R0(d dVar, long j8, r rVar, boolean z8, boolean z9) {
        a1 a1Var = this.f7701r;
        if (a1Var != null) {
            a1Var.Q0(dVar, a1Var.J0(j8), rVar, z8, z9);
        }
    }

    public final void S0() {
        f1 f1Var = this.I;
        if (f1Var != null) {
            f1Var.invalidate();
            return;
        }
        a1 a1Var = this.f7702s;
        if (a1Var != null) {
            a1Var.S0();
        }
    }

    public final boolean T0() {
        if (this.I != null && this.f7708y <= 0.0f) {
            return true;
        }
        a1 a1Var = this.f7702s;
        if (a1Var != null) {
            return a1Var.T0();
        }
        return false;
    }

    public final long U0(p1.p pVar, long j8) {
        if (pVar instanceof p1.d0) {
            p1.d0 d0Var = (p1.d0) pVar;
            d0Var.f7038f.f7870q.V0();
            return d0Var.b(this, j8 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        a1 d12 = d1(pVar);
        d12.V0();
        a1 I0 = I0(d12);
        while (d12 != I0) {
            j8 = d12.e1(j8);
            d12 = d12.f7702s;
            r6.k.c(d12);
        }
        return B0(I0, j8);
    }

    @Override // p1.p
    public final long V() {
        return this.f7065h;
    }

    public final void V0() {
        l0 l0Var = this.f7700q.B;
        int i7 = l0Var.f7831a.B.f7833c;
        if (i7 == 3 || i7 == 4) {
            if (l0Var.f7848r.B) {
                l0Var.e(true);
            } else {
                l0Var.d(true);
            }
        }
        if (i7 == 4) {
            i0 i0Var = l0Var.f7849s;
            if (i0Var == null || !i0Var.f7800y) {
                l0Var.f(true);
            } else {
                l0Var.g(true);
            }
        }
    }

    @Override // p1.p
    public final long W(long j8) {
        if (!M0().f8116r) {
            a.a.M("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        V0();
        for (a1 a1Var = this; a1Var != null; a1Var = a1Var.f7702s) {
            j8 = a1Var.e1(j8);
        }
        return j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v7, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void W0() {
        s0.n nVar;
        boolean h3 = b1.h(128);
        s0.n O0 = O0(h3);
        if (O0 == null || (O0.f8104f.f8107i & 128) == 0) {
            return;
        }
        q0.g c4 = q0.r.c();
        q6.c f9 = c4 != null ? c4.f() : null;
        q0.g d8 = q0.r.d(c4);
        try {
            if (h3) {
                nVar = M0();
            } else {
                nVar = M0().f8108j;
                if (nVar == null) {
                }
            }
            for (s0.n O02 = O0(h3); O02 != null; O02 = O02.f8109k) {
                if ((O02.f8107i & 128) == 0) {
                    break;
                }
                if ((O02.f8106h & 128) != 0) {
                    m mVar = O02;
                    ?? r8 = 0;
                    while (mVar != 0) {
                        if (mVar instanceof v) {
                            ((v) mVar).u(this.f7065h);
                        } else if ((mVar.f8106h & 128) != 0 && (mVar instanceof m)) {
                            s0.n nVar2 = mVar.f7853t;
                            int i7 = 0;
                            mVar = mVar;
                            r8 = r8;
                            while (nVar2 != null) {
                                if ((nVar2.f8106h & 128) != 0) {
                                    i7++;
                                    r8 = r8;
                                    if (i7 == 1) {
                                        mVar = nVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new i0.d(new s0.n[16]);
                                        }
                                        if (mVar != 0) {
                                            r8.b(mVar);
                                            mVar = 0;
                                        }
                                        r8.b(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f8109k;
                                mVar = mVar;
                                r8 = r8;
                            }
                            if (i7 == 1) {
                            }
                        }
                        mVar = f.f(r8);
                    }
                }
                if (O02 == nVar) {
                    break;
                }
            }
        } finally {
            q0.r.f(c4, d8, f9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [s0.n] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void X0() {
        boolean h3 = b1.h(128);
        s0.n M0 = M0();
        if (!h3 && (M0 = M0.f8108j) == null) {
            return;
        }
        for (s0.n O0 = O0(h3); O0 != null && (O0.f8107i & 128) != 0; O0 = O0.f8109k) {
            if ((O0.f8106h & 128) != 0) {
                m mVar = O0;
                ?? r52 = 0;
                while (mVar != 0) {
                    if (mVar instanceof v) {
                        ((v) mVar).M(this);
                    } else if ((mVar.f8106h & 128) != 0 && (mVar instanceof m)) {
                        s0.n nVar = mVar.f7853t;
                        int i7 = 0;
                        mVar = mVar;
                        r52 = r52;
                        while (nVar != null) {
                            if ((nVar.f8106h & 128) != 0) {
                                i7++;
                                r52 = r52;
                                if (i7 == 1) {
                                    mVar = nVar;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new i0.d(new s0.n[16]);
                                    }
                                    if (mVar != 0) {
                                        r52.b(mVar);
                                        mVar = 0;
                                    }
                                    r52.b(nVar);
                                }
                            }
                            nVar = nVar.f8109k;
                            mVar = mVar;
                            r52 = r52;
                        }
                        if (i7 == 1) {
                        }
                    }
                    mVar = f.f(r52);
                }
            }
            if (O0 == M0) {
                return;
            }
        }
    }

    public abstract void Y0(z0.r rVar, c1.c cVar);

    public final void Z0(long j8, float f9, q6.c cVar) {
        h1(cVar, false);
        if (!m2.h.a(this.B, j8)) {
            this.B = j8;
            d0 d0Var = this.f7700q;
            d0Var.B.f7848r.s0();
            f1 f1Var = this.I;
            if (f1Var != null) {
                f1Var.h(j8);
            } else {
                a1 a1Var = this.f7702s;
                if (a1Var != null) {
                    a1Var.S0();
                }
            }
            o0.y0(this);
            g1 g1Var = d0Var.f7727n;
            if (g1Var != null) {
                ((s1.r) g1Var).w(d0Var);
            }
        }
        this.C = f9;
        if (this.f7865m) {
            return;
        }
        q0(new k1(v0(), this));
    }

    @Override // m2.b
    public final float a() {
        return this.f7700q.f7735v.a();
    }

    public final void a1(y0.b bVar, boolean z8, boolean z9) {
        f1 f1Var = this.I;
        if (f1Var != null) {
            if (this.f7704u) {
                if (z9) {
                    long L0 = L0();
                    float d8 = y0.f.d(L0) / 2.0f;
                    float b9 = y0.f.b(L0) / 2.0f;
                    long j8 = this.f7065h;
                    bVar.a(-d8, -b9, ((int) (j8 >> 32)) + d8, ((int) (j8 & 4294967295L)) + b9);
                } else if (z8) {
                    long j9 = this.f7065h;
                    bVar.a(0.0f, 0.0f, (int) (j9 >> 32), (int) (j9 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            f1Var.g(bVar, false);
        }
        long j10 = this.B;
        float f9 = (int) (j10 >> 32);
        bVar.f9774a += f9;
        bVar.f9776c += f9;
        float f10 = (int) (j10 & 4294967295L);
        bVar.f9775b += f10;
        bVar.f9777d += f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void b1(p1.g0 g0Var) {
        a1 a1Var;
        p1.g0 g0Var2 = this.f7709z;
        if (g0Var != g0Var2) {
            this.f7709z = g0Var;
            d0 d0Var = this.f7700q;
            if (g0Var2 == null || g0Var.n() != g0Var2.n() || g0Var.f() != g0Var2.f()) {
                int n8 = g0Var.n();
                int f9 = g0Var.f();
                f1 f1Var = this.I;
                if (f1Var != null) {
                    f1Var.d(j1.c.G(n8, f9));
                } else if (d0Var.F() && (a1Var = this.f7702s) != null) {
                    a1Var.S0();
                }
                m0(j1.c.G(n8, f9));
                if (this.f7705v != null) {
                    i1(false);
                }
                boolean h3 = b1.h(4);
                s0.n M0 = M0();
                if (h3 || (M0 = M0.f8108j) != null) {
                    for (s0.n O0 = O0(h3); O0 != null && (O0.f8107i & 4) != 0; O0 = O0.f8109k) {
                        if ((O0.f8106h & 4) != 0) {
                            m mVar = O0;
                            ?? r72 = 0;
                            while (mVar != 0) {
                                if (mVar instanceof o) {
                                    ((o) mVar).i0();
                                } else if ((mVar.f8106h & 4) != 0 && (mVar instanceof m)) {
                                    s0.n nVar = mVar.f7853t;
                                    int i7 = 0;
                                    mVar = mVar;
                                    r72 = r72;
                                    while (nVar != null) {
                                        if ((nVar.f8106h & 4) != 0) {
                                            i7++;
                                            r72 = r72;
                                            if (i7 == 1) {
                                                mVar = nVar;
                                            } else {
                                                if (r72 == 0) {
                                                    r72 = new i0.d(new s0.n[16]);
                                                }
                                                if (mVar != 0) {
                                                    r72.b(mVar);
                                                    mVar = 0;
                                                }
                                                r72.b(nVar);
                                            }
                                        }
                                        nVar = nVar.f8109k;
                                        mVar = mVar;
                                        r72 = r72;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                mVar = f.f(r72);
                            }
                        }
                        if (O0 == M0) {
                            break;
                        }
                    }
                }
                g1 g1Var = d0Var.f7727n;
                if (g1Var != null) {
                    ((s1.r) g1Var).w(d0Var);
                }
            }
            LinkedHashMap linkedHashMap = this.A;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && g0Var.o().isEmpty()) || r6.k.a(g0Var.o(), this.A)) {
                return;
            }
            d0Var.B.f7848r.f7825y.f();
            LinkedHashMap linkedHashMap2 = this.A;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.A = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(g0Var.o());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void c1(s0.n nVar, d dVar, long j8, r rVar, boolean z8, boolean z9, float f9) {
        boolean z10;
        if (nVar == null) {
            R0(dVar, j8, rVar, z8, z9);
            return;
        }
        switch (dVar.f7718f) {
            case 1:
                m mVar = nVar;
                ?? r32 = 0;
                while (true) {
                    int i7 = 0;
                    if (mVar == 0) {
                        z10 = false;
                        break;
                    } else {
                        if (mVar instanceof l1) {
                            if (((l1) mVar).j0()) {
                                z10 = true;
                                break;
                            }
                        } else if ((mVar.f8106h & 16) != 0 && (mVar instanceof m)) {
                            s0.n nVar2 = mVar.f7853t;
                            mVar = mVar;
                            r32 = r32;
                            while (nVar2 != null) {
                                if ((nVar2.f8106h & 16) != 0) {
                                    i7++;
                                    r32 = r32;
                                    if (i7 == 1) {
                                        mVar = nVar2;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new i0.d(new s0.n[16]);
                                        }
                                        if (mVar != 0) {
                                            r32.b(mVar);
                                            mVar = 0;
                                        }
                                        r32.b(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f8109k;
                                mVar = mVar;
                                r32 = r32;
                            }
                            if (i7 == 1) {
                            }
                        }
                        mVar = f.f(r32);
                    }
                }
                break;
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            c1(f.e(nVar, dVar.a()), dVar, j8, rVar, z8, z9, f9);
            return;
        }
        y0 y0Var = new y0(this, nVar, dVar, j8, rVar, z8, z9, f9, 1);
        if (rVar.f7888h == e6.m.W(rVar)) {
            rVar.g(nVar, f9, z9, y0Var);
            if (rVar.f7888h + 1 == e6.m.W(rVar)) {
                rVar.m();
                return;
            }
            return;
        }
        long a3 = rVar.a();
        int i8 = rVar.f7888h;
        rVar.f7888h = e6.m.W(rVar);
        rVar.g(nVar, f9, z9, y0Var);
        if (rVar.f7888h + 1 < e6.m.W(rVar) && f.h(a3, rVar.a()) > 0) {
            int i9 = rVar.f7888h + 1;
            int i10 = i8 + 1;
            Object[] objArr = rVar.f7886f;
            e6.k.X(objArr, objArr, i10, i9, rVar.f7889i);
            long[] jArr = rVar.f7887g;
            System.arraycopy(jArr, i9, jArr, i10, rVar.f7889i - i9);
            rVar.f7888h = ((rVar.f7889i + i8) - rVar.f7888h) - 1;
        }
        rVar.m();
        rVar.f7888h = i8;
    }

    @Override // p1.p
    public final long e(long j8) {
        if (!M0().f8116r) {
            a.a.M("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        p1.p f9 = p1.s0.f(this);
        s1.r rVar = (s1.r) g0.a(this.f7700q);
        rVar.A();
        return U0(f9, y0.c.g(z0.f0.b(j8, rVar.R), f9.W(0L)));
    }

    public final long e1(long j8) {
        f1 f1Var = this.I;
        if (f1Var != null) {
            j8 = f1Var.b(j8, false);
        }
        long j9 = this.B;
        return u3.r.a(y0.c.d(j8) + ((int) (j9 >> 32)), y0.c.e(j8) + ((int) (j9 & 4294967295L)));
    }

    @Override // p1.p
    public final long f(long j8) {
        long W = W(j8);
        s1.r rVar = (s1.r) g0.a(this.f7700q);
        rVar.A();
        return z0.f0.b(W, rVar.Q);
    }

    public final void f1(a1 a1Var, float[] fArr) {
        if (r6.k.a(a1Var, this)) {
            return;
        }
        a1 a1Var2 = this.f7702s;
        r6.k.c(a1Var2);
        a1Var2.f1(a1Var, fArr);
        if (!m2.h.a(this.B, 0L)) {
            float[] fArr2 = L;
            z0.f0.d(fArr2);
            long j8 = this.B;
            z0.f0.h(fArr2, -((int) (j8 >> 32)), -((int) (j8 & 4294967295L)));
            z0.f0.g(fArr, fArr2);
        }
        f1 f1Var = this.I;
        if (f1Var != null) {
            f1Var.f(fArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // p1.n0, p1.e0
    public final Object g() {
        d0 d0Var = this.f7700q;
        if (!d0Var.A.f(64)) {
            return null;
        }
        M0();
        Object obj = null;
        for (s0.n nVar = (o1) d0Var.A.f3894e; nVar != null; nVar = nVar.f8108j) {
            if ((nVar.f8106h & 64) != 0) {
                m mVar = nVar;
                ?? r52 = 0;
                while (mVar != 0) {
                    if (mVar instanceof j1) {
                        obj = ((j1) mVar).h0(obj);
                    } else if ((mVar.f8106h & 64) != 0 && (mVar instanceof m)) {
                        s0.n nVar2 = mVar.f7853t;
                        int i7 = 0;
                        mVar = mVar;
                        r52 = r52;
                        while (nVar2 != null) {
                            if ((nVar2.f8106h & 64) != 0) {
                                i7++;
                                r52 = r52;
                                if (i7 == 1) {
                                    mVar = nVar2;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new i0.d(new s0.n[16]);
                                    }
                                    if (mVar != 0) {
                                        r52.b(mVar);
                                        mVar = 0;
                                    }
                                    r52.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f8109k;
                            mVar = mVar;
                            r52 = r52;
                        }
                        if (i7 == 1) {
                        }
                    }
                    mVar = f.f(r52);
                }
            }
        }
        return obj;
    }

    public final void g1(a1 a1Var, float[] fArr) {
        a1 a1Var2 = this;
        while (!a1Var2.equals(a1Var)) {
            f1 f1Var = a1Var2.I;
            if (f1Var != null) {
                f1Var.e(fArr);
            }
            if (!m2.h.a(a1Var2.B, 0L)) {
                float[] fArr2 = L;
                z0.f0.d(fArr2);
                z0.f0.h(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                z0.f0.g(fArr, fArr2);
            }
            a1Var2 = a1Var2.f7702s;
            r6.k.c(a1Var2);
        }
    }

    @Override // p1.m
    public final m2.k getLayoutDirection() {
        return this.f7700q.f7736w;
    }

    @Override // p1.p
    public final y0.d h(p1.p pVar, boolean z8) {
        if (!M0().f8116r) {
            a.a.M("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!pVar.O()) {
            a.a.M("LayoutCoordinates " + pVar + " is not attached!");
            throw null;
        }
        a1 d12 = d1(pVar);
        d12.V0();
        a1 I0 = I0(d12);
        y0.b bVar = this.D;
        if (bVar == null) {
            bVar = new y0.b();
            bVar.f9774a = 0.0f;
            bVar.f9775b = 0.0f;
            bVar.f9776c = 0.0f;
            bVar.f9777d = 0.0f;
            this.D = bVar;
        }
        bVar.f9774a = 0.0f;
        bVar.f9775b = 0.0f;
        bVar.f9776c = (int) (pVar.V() >> 32);
        bVar.f9777d = (int) (pVar.V() & 4294967295L);
        while (d12 != I0) {
            d12.a1(bVar, z8, false);
            if (bVar.b()) {
                return y0.d.f9779e;
            }
            d12 = d12.f7702s;
            r6.k.c(d12);
        }
        A0(I0, bVar, z8);
        return new y0.d(bVar.f9774a, bVar.f9775b, bVar.f9776c, bVar.f9777d);
    }

    public final void h1(q6.c cVar, boolean z8) {
        g1 g1Var;
        Reference poll;
        Object obj;
        d0 d0Var = this.f7700q;
        boolean z9 = (!z8 && this.f7705v == cVar && r6.k.a(this.f7706w, d0Var.f7735v) && this.f7707x == d0Var.f7736w) ? false : true;
        this.f7706w = d0Var.f7735v;
        this.f7707x = d0Var.f7736w;
        boolean E = d0Var.E();
        androidx.lifecycle.r0 r0Var = this.G;
        if (!E || cVar == null) {
            this.f7705v = null;
            f1 f1Var = this.I;
            if (f1Var != null) {
                f1Var.destroy();
                d0Var.E = true;
                r0Var.a();
                if (M0().f8116r && (g1Var = d0Var.f7727n) != null) {
                    ((s1.r) g1Var).w(d0Var);
                }
            }
            this.I = null;
            this.H = false;
            return;
        }
        this.f7705v = cVar;
        if (this.I != null) {
            if (z9) {
                i1(true);
                return;
            }
            return;
        }
        s1.r rVar = (s1.r) g0.a(d0Var);
        q5.g gVar = rVar.f8392t0;
        i0.d dVar = (i0.d) gVar.f7527g;
        do {
            poll = ((ReferenceQueue) gVar.f7528h).poll();
            if (poll != null) {
                ((i0.d) gVar.f7527g).n(poll);
            }
        } while (poll != null);
        while (true) {
            if (!dVar.m()) {
                obj = null;
                break;
            } else {
                obj = ((Reference) dVar.o(dVar.f4842h - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        f1 f1Var2 = (f1) obj;
        a2.a aVar = this.F;
        if (f1Var2 != null) {
            f1Var2.a(aVar, r0Var);
        } else if (!rVar.isHardwareAccelerated() || Build.VERSION.SDK_INT == 28) {
            if (rVar.isHardwareAccelerated() && rVar.V) {
                try {
                    f1Var2 = new b2(rVar, aVar, r0Var);
                } catch (Throwable unused) {
                    rVar.V = false;
                }
            }
            if (rVar.I == null) {
                if (!n2.f8315x) {
                    s1.j0.B(new View(rVar.getContext()));
                }
                s1.l1 l1Var = n2.f8316y ? new s1.l1(rVar.getContext()) : new o2(rVar.getContext());
                rVar.I = l1Var;
                rVar.addView(l1Var, -1);
            }
            s1.l1 l1Var2 = rVar.I;
            r6.k.c(l1Var2);
            f1Var2 = new n2(rVar, l1Var2, aVar, r0Var);
        } else {
            f1Var2 = new s1.n1(rVar.getGraphicsContext().b(), rVar.getGraphicsContext(), rVar, aVar, r0Var);
        }
        f1Var2.d(this.f7065h);
        f1Var2.h(this.B);
        this.I = f1Var2;
        i1(true);
        d0Var.E = true;
        r0Var.a();
    }

    @Override // p1.p
    public final p1.p i() {
        if (M0().f8116r) {
            V0();
            return ((a1) this.f7700q.A.f3893d).f7702s;
        }
        a.a.M("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final void i1(boolean z8) {
        g1 g1Var;
        f1 f1Var = this.I;
        if (f1Var == null) {
            if (this.f7705v == null) {
                return;
            }
            a.a.M("null layer with a non-null layerBlock");
            throw null;
        }
        q6.c cVar = this.f7705v;
        if (cVar == null) {
            a.a.N("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        z0.n0 n0Var = J;
        n0Var.f(1.0f);
        n0Var.g(1.0f);
        n0Var.b(1.0f);
        n0Var.h(0.0f);
        long j8 = z0.d0.f9987a;
        n0Var.c(j8);
        n0Var.j(j8);
        if (n0Var.f10021m != 8.0f) {
            n0Var.f10014f |= 2048;
            n0Var.f10021m = 8.0f;
        }
        n0Var.k(z0.s0.f10047b);
        n0Var.i(z0.l0.f10006a);
        n0Var.e(false);
        n0Var.f10025q = 9205357640488583168L;
        n0Var.f10028t = null;
        n0Var.f10014f = 0;
        d0 d0Var = this.f7700q;
        n0Var.f10026r = d0Var.f7735v;
        n0Var.f10027s = d0Var.f7736w;
        n0Var.f10025q = j1.c.o0(this.f7065h);
        ((s1.r) g0.a(d0Var)).getSnapshotObserver().a(this, e.f7744k, new z0(0, cVar));
        u uVar = this.E;
        if (uVar == null) {
            uVar = new u();
            this.E = uVar;
        }
        uVar.f7900a = n0Var.f10015g;
        uVar.f7901b = n0Var.f10016h;
        uVar.f7902c = n0Var.f10021m;
        uVar.f7903d = n0Var.f10022n;
        f1Var.c(n0Var);
        this.f7704u = n0Var.f10024p;
        this.f7708y = n0Var.f10017i;
        if (!z8 || (g1Var = d0Var.f7727n) == null) {
            return;
        }
        ((s1.r) g1Var).w(d0Var);
    }

    public final boolean j1(long j8) {
        long j9 = 9187343241974906880L ^ (j8 & 9187343241974906880L);
        if (((~j9) & (j9 - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        f1 f1Var = this.I;
        return f1Var == null || !this.f7704u || f1Var.k(j8);
    }

    @Override // p1.p
    public final void k(p1.p pVar, float[] fArr) {
        a1 d12 = d1(pVar);
        d12.V0();
        a1 I0 = I0(d12);
        z0.f0.d(fArr);
        d12.g1(I0, fArr);
        f1(I0, fArr);
    }

    @Override // m2.b
    public final float m() {
        return this.f7700q.f7735v.m();
    }

    @Override // r1.o0
    public final o0 r0() {
        return this.f7701r;
    }

    @Override // r1.o0
    public final boolean t0() {
        return this.f7709z != null;
    }

    @Override // p1.p
    public final long u(p1.p pVar, long j8) {
        return U0(pVar, j8);
    }

    @Override // r1.o0
    public final d0 u0() {
        return this.f7700q;
    }

    @Override // r1.o0
    public final p1.g0 v0() {
        p1.g0 g0Var = this.f7709z;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // r1.o0
    public final o0 w0() {
        return this.f7702s;
    }

    @Override // r1.o0
    public final long x0() {
        return this.B;
    }

    @Override // r1.h1
    public final boolean z() {
        return (this.I == null || this.f7703t || !this.f7700q.E()) ? false : true;
    }

    @Override // r1.o0
    public final void z0() {
        j0(this.B, this.C, this.f7705v);
    }

    @Override // r1.o0
    public final p1.p s0() {
        return this;
    }
}
