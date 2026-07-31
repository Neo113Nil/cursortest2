package t0;

import F.C0036e;
import I.C0120t;
import a.AbstractC0157a;
import android.os.Build;
import android.view.View;
import b0.AbstractC0252C;
import b0.AbstractC0259J;
import b0.C0261L;
import b0.C0266Q;
import b0.C0276i;
import b0.C0288u;
import b0.InterfaceC0285r;
import e0.C0336b;
import e2.AbstractC0381e;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import r0.InterfaceC0838k;
import u0.C0973g0;
import u0.C0979j0;
import u0.C0997t;
import u0.C1000u0;
import u0.F0;
import u0.G0;

/* loaded from: classes.dex */
public abstract class a0 extends O implements r0.z, InterfaceC0838k, h0 {

    /* renamed from: H, reason: collision with root package name */
    public static final C0261L f7869H;

    /* renamed from: I, reason: collision with root package name */
    public static final C0912u f7870I;

    /* renamed from: J, reason: collision with root package name */
    public static final C0896d f7871J;

    /* renamed from: K, reason: collision with root package name */
    public static final C0896d f7872K;

    /* renamed from: A, reason: collision with root package name */
    public float f7873A;
    public a0.b B;
    public C0912u C;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7875F;

    /* renamed from: G, reason: collision with root package name */
    public f0 f7876G;

    /* renamed from: o, reason: collision with root package name */
    public final D f7877o;
    public a0 p;

    /* renamed from: q, reason: collision with root package name */
    public a0 f7878q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7879r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7880s;

    /* renamed from: t, reason: collision with root package name */
    public Y1.c f7881t;

    /* renamed from: u, reason: collision with root package name */
    public M0.b f7882u;

    /* renamed from: v, reason: collision with root package name */
    public M0.j f7883v;

    /* renamed from: x, reason: collision with root package name */
    public r0.B f7885x;

    /* renamed from: y, reason: collision with root package name */
    public LinkedHashMap f7886y;

    /* renamed from: w, reason: collision with root package name */
    public float f7884w = 0.8f;

    /* renamed from: z, reason: collision with root package name */
    public long f7887z = 0;
    public final C0036e D = new C0036e(10, this);

    /* renamed from: E, reason: collision with root package name */
    public final r1.r f7874E = new r1.r(5, this);

    static {
        C0261L c0261l = new C0261L();
        c0261l.f4220e = 1.0f;
        c0261l.f4221f = 1.0f;
        c0261l.f4222g = 1.0f;
        long j3 = AbstractC0252C.f4209a;
        c0261l.f4226k = j3;
        c0261l.f4227l = j3;
        c0261l.p = 8.0f;
        c0261l.f4231q = C0266Q.f4258b;
        c0261l.f4232r = AbstractC0259J.f4215a;
        c0261l.f4234t = 0;
        c0261l.f4235u = 9205357640488583168L;
        c0261l.f4236v = AbstractC0157a.a();
        c0261l.f4237w = M0.j.f2775d;
        f7869H = c0261l;
        f7870I = new C0912u();
        AbstractC0259J.l();
        f7871J = new C0896d(1);
        f7872K = new C0896d(2);
    }

    public a0(D d3) {
        this.f7877o = d3;
        this.f7882u = d3.f7730s;
        this.f7883v = d3.f7731t;
    }

    public final long A0() {
        return this.f7882u.C(this.f7877o.f7732u.c());
    }

    public abstract U.k B0();

    public final U.k C0(int i3) {
        boolean h3 = b0.h(i3);
        U.k B02 = B0();
        if (!h3 && (B02 = B02.f3307h) == null) {
            return null;
        }
        for (U.k D02 = D0(h3); D02 != null && (D02.f3306g & i3) != 0; D02 = D02.f3308i) {
            if ((D02.f3305f & i3) != 0) {
                return D02;
            }
            if (D02 == B02) {
                return null;
            }
        }
        return null;
    }

    public final U.k D0(boolean z3) {
        U.k B02;
        C0120t c0120t = this.f7877o.f7735x;
        if (((a0) c0120t.f2354d) == this) {
            return (U.k) c0120t.f2356f;
        }
        if (z3) {
            a0 a0Var = this.f7878q;
            if (a0Var != null && (B02 = a0Var.B0()) != null) {
                return B02.f3308i;
            }
        } else {
            a0 a0Var2 = this.f7878q;
            if (a0Var2 != null) {
                return a0Var2.B0();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [U.k] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void E0(U.k kVar, C0896d c0896d, long j3, r rVar, boolean z3, boolean z4) {
        if (kVar == null) {
            G0(c0896d, j3, rVar, z3, z4);
            return;
        }
        rVar.c(kVar, -1.0f, z4, new Y(this, kVar, c0896d, j3, rVar, z3, z4));
        a0 a0Var = kVar.f3310k;
        if (a0Var != null) {
            U.k D02 = a0Var.D0(b0.h(16));
            if (D02 != null && D02.p) {
                U.k kVar2 = D02.f3303d;
                if (!kVar2.p) {
                    AbstractC0381e.N("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((kVar2.f3306g & 16) != 0) {
                    while (kVar2 != null) {
                        if ((kVar2.f3305f & 16) != 0) {
                            AbstractC0905m abstractC0905m = kVar2;
                            ?? r5 = 0;
                            while (abstractC0905m != 0) {
                                if (abstractC0905m instanceof l0) {
                                    if (((l0) abstractC0905m).y()) {
                                        return;
                                    }
                                } else if ((abstractC0905m.f3305f & 16) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                    U.k kVar3 = abstractC0905m.f7937r;
                                    int i3 = 0;
                                    abstractC0905m = abstractC0905m;
                                    r5 = r5;
                                    while (kVar3 != null) {
                                        if ((kVar3.f3305f & 16) != 0) {
                                            i3++;
                                            r5 = r5;
                                            if (i3 == 1) {
                                                abstractC0905m = kVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new K.d(new U.k[16]);
                                                }
                                                if (abstractC0905m != 0) {
                                                    r5.b(abstractC0905m);
                                                    abstractC0905m = 0;
                                                }
                                                r5.b(kVar3);
                                            }
                                        }
                                        kVar3 = kVar3.f3308i;
                                        abstractC0905m = abstractC0905m;
                                        r5 = r5;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC0905m = AbstractC0898f.f(r5);
                            }
                        }
                        kVar2 = kVar2.f3308i;
                    }
                }
            }
            rVar.f7953h = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (t0.AbstractC0898f.h(r21.b(), t0.AbstractC0898f.a(r15, r23)) > 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(C0896d c0896d, long j3, r rVar, boolean z3, boolean z4) {
        a0 a0Var;
        U.k C02 = C0(c0896d.a());
        if (!W0(j3)) {
            if (z3) {
                float s02 = s0(j3, A0());
                if (Float.isInfinite(s02) || Float.isNaN(s02)) {
                    return;
                }
                if (rVar.f7951f != M1.m.b0(rVar)) {
                    if (AbstractC0898f.h(rVar.b(), AbstractC0898f.a(s02, false)) <= 0) {
                        return;
                    }
                }
                boolean z5 = false;
                if (C02 == null) {
                    G0(c0896d, j3, rVar, z3, false);
                    return;
                } else {
                    rVar.c(C02, s02, false, new Z(this, C02, c0896d, j3, rVar, z3, z5, s02, 0));
                    return;
                }
            }
            return;
        }
        if (C02 == null) {
            G0(c0896d, j3, rVar, z3, z4);
            return;
        }
        float d3 = a0.c.d(j3);
        float e3 = a0.c.e(j3);
        if (d3 < 0.0f || e3 < 0.0f || d3 >= N()) {
            a0Var = this;
        } else {
            a0Var = this;
            if (e3 < ((int) (a0Var.f7116f & 4294967295L))) {
                E0(C02, c0896d, j3, rVar, z3, z4);
                return;
            }
        }
        float s03 = !z3 ? Float.POSITIVE_INFINITY : a0Var.s0(j3, A0());
        if (!Float.isInfinite(s03) && !Float.isNaN(s03)) {
            if (rVar.f7951f != M1.m.b0(rVar)) {
            }
            rVar.c(C02, s03, z4, new Z(this, C02, c0896d, j3, rVar, z3, z4, s03, 0));
            return;
        }
        S0(C02, c0896d, j3, rVar, z3, z4, s03);
    }

    public void G0(C0896d c0896d, long j3, r rVar, boolean z3, boolean z4) {
        a0 a0Var = this.p;
        if (a0Var != null) {
            a0Var.F0(c0896d, a0Var.y0(j3, true), rVar, z3, z4);
        }
    }

    @Override // t0.h0
    public final boolean H() {
        return (this.f7876G == null || this.f7879r || !this.f7877o.B()) ? false : true;
    }

    public final void H0() {
        f0 f0Var = this.f7876G;
        if (f0Var != null) {
            f0Var.invalidate();
            return;
        }
        a0 a0Var = this.f7878q;
        if (a0Var != null) {
            a0Var.H0();
        }
    }

    public final boolean I0() {
        if (this.f7876G != null && this.f7884w <= 0.0f) {
            return true;
        }
        a0 a0Var = this.f7878q;
        if (a0Var != null) {
            return a0Var.I0();
        }
        return false;
    }

    public final long J0(InterfaceC0838k interfaceC0838k, long j3) {
        a0 a0Var;
        boolean z3 = interfaceC0838k instanceof r0.y;
        if (z3) {
            ((r0.y) interfaceC0838k).f7194d.f7829o.L0();
            return ((r0.y) interfaceC0838k).a(this, j3 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        r0.y yVar = z3 ? (r0.y) interfaceC0838k : null;
        if (yVar == null || (a0Var = yVar.f7194d.f7829o) == null) {
            Z1.i.d(interfaceC0838k, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            a0Var = (a0) interfaceC0838k;
        }
        a0Var.L0();
        a0 x02 = x0(a0Var);
        while (a0Var != x02) {
            j3 = a0Var.T0(j3, true);
            a0Var = a0Var.f7878q;
            Z1.i.c(a0Var);
        }
        return q0(x02, j3);
    }

    public final long K0(long j3) {
        if (!B0().p) {
            AbstractC0381e.N("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        L0();
        for (a0 a0Var = this; a0Var != null; a0Var = a0Var.f7878q) {
            j3 = a0Var.T0(j3, true);
        }
        return j3;
    }

    public final void L0() {
        L l3 = this.f7877o.f7736y;
        int i3 = l3.f7797a.f7736y.f7799c;
        if (i3 == 3 || i3 == 4) {
            if (l3.f7813r.f7794z) {
                l3.e(true);
            } else {
                l3.d(true);
            }
        }
        if (i3 == 4) {
            I i4 = l3.f7814s;
            if (i4 == null || !i4.f7768w) {
                l3.f(true);
            } else {
                l3.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v7, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void M0() {
        U.k kVar;
        U.k D02 = D0(b0.h(128));
        if (D02 == null || (D02.f3303d.f3306g & 128) == 0) {
            return;
        }
        S.i c3 = S.u.c();
        Y1.c f3 = c3 != null ? c3.f() : null;
        S.i d3 = S.u.d(c3);
        try {
            boolean h3 = b0.h(128);
            if (h3) {
                kVar = B0();
            } else {
                kVar = B0().f3307h;
                if (kVar == null) {
                }
            }
            for (U.k D03 = D0(h3); D03 != null; D03 = D03.f3308i) {
                if ((D03.f3306g & 128) == 0) {
                    break;
                }
                if ((D03.f3305f & 128) != 0) {
                    ?? r8 = 0;
                    AbstractC0905m abstractC0905m = D03;
                    while (abstractC0905m != 0) {
                        if (abstractC0905m instanceof InterfaceC0913v) {
                            ((InterfaceC0913v) abstractC0905m).A(this.f7116f);
                        } else if ((abstractC0905m.f3305f & 128) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                            U.k kVar2 = abstractC0905m.f7937r;
                            int i3 = 0;
                            abstractC0905m = abstractC0905m;
                            r8 = r8;
                            while (kVar2 != null) {
                                if ((kVar2.f3305f & 128) != 0) {
                                    i3++;
                                    r8 = r8;
                                    if (i3 == 1) {
                                        abstractC0905m = kVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new K.d(new U.k[16]);
                                        }
                                        if (abstractC0905m != 0) {
                                            r8.b(abstractC0905m);
                                            abstractC0905m = 0;
                                        }
                                        r8.b(kVar2);
                                    }
                                }
                                kVar2 = kVar2.f3308i;
                                abstractC0905m = abstractC0905m;
                                r8 = r8;
                            }
                            if (i3 == 1) {
                            }
                        }
                        abstractC0905m = AbstractC0898f.f(r8);
                    }
                }
                if (D03 == kVar) {
                    break;
                }
            }
        } finally {
            S.u.f(c3, d3, f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [U.k] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [U.k] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void N0() {
        boolean h3 = b0.h(128);
        U.k B02 = B0();
        if (!h3 && (B02 = B02.f3307h) == null) {
            return;
        }
        for (U.k D02 = D0(h3); D02 != null && (D02.f3306g & 128) != 0; D02 = D02.f3308i) {
            if ((D02.f3305f & 128) != 0) {
                AbstractC0905m abstractC0905m = D02;
                ?? r5 = 0;
                while (abstractC0905m != 0) {
                    if (abstractC0905m instanceof InterfaceC0913v) {
                        ((InterfaceC0913v) abstractC0905m).u(this);
                    } else if ((abstractC0905m.f3305f & 128) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                        U.k kVar = abstractC0905m.f7937r;
                        int i3 = 0;
                        abstractC0905m = abstractC0905m;
                        r5 = r5;
                        while (kVar != null) {
                            if ((kVar.f3305f & 128) != 0) {
                                i3++;
                                r5 = r5;
                                if (i3 == 1) {
                                    abstractC0905m = kVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new K.d(new U.k[16]);
                                    }
                                    if (abstractC0905m != 0) {
                                        r5.b(abstractC0905m);
                                        abstractC0905m = 0;
                                    }
                                    r5.b(kVar);
                                }
                            }
                            kVar = kVar.f3308i;
                            abstractC0905m = abstractC0905m;
                            r5 = r5;
                        }
                        if (i3 == 1) {
                        }
                    }
                    abstractC0905m = AbstractC0898f.f(r5);
                }
            }
            if (D02 == B02) {
                return;
            }
        }
    }

    public abstract void O0(InterfaceC0285r interfaceC0285r, C0336b c0336b);

    public final void P0(long j3, float f3, Y1.c cVar) {
        U0(cVar, false);
        if (!M0.g.a(this.f7887z, j3)) {
            this.f7887z = j3;
            D d3 = this.f7877o;
            d3.f7736y.f7813r.e0();
            f0 f0Var = this.f7876G;
            if (f0Var != null) {
                f0Var.e(j3);
            } else {
                a0 a0Var = this.f7878q;
                if (a0Var != null) {
                    a0Var.H0();
                }
            }
            O.n0(this);
            C0997t c0997t = d3.f7724l;
            if (c0997t != null) {
                c0997t.x(d3);
            }
        }
        this.f7873A = f3;
        if (this.f7825k) {
            return;
        }
        b0(new k0(k0(), this));
    }

    public final void Q0(a0.b bVar, boolean z3, boolean z4) {
        f0 f0Var = this.f7876G;
        if (f0Var != null) {
            if (this.f7880s) {
                if (z4) {
                    long A02 = A0();
                    float d3 = a0.f.d(A02) / 2.0f;
                    float b2 = a0.f.b(A02) / 2.0f;
                    long j3 = this.f7116f;
                    bVar.a(-d3, -b2, ((int) (j3 >> 32)) + d3, ((int) (j3 & 4294967295L)) + b2);
                } else if (z3) {
                    long j4 = this.f7116f;
                    bVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            f0Var.b(bVar, false);
        }
        long j5 = this.f7887z;
        float f3 = (int) (j5 >> 32);
        bVar.f3485a += f3;
        bVar.f3487c += f3;
        float f4 = (int) (j5 & 4294967295L);
        bVar.f3486b += f4;
        bVar.f3488d += f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [U.k] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [U.k] */
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
    /* JADX WARN: Type inference failed for: r7v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void R0(r0.B b2) {
        a0 a0Var;
        r0.B b3 = this.f7885x;
        if (b2 != b3) {
            this.f7885x = b2;
            D d3 = this.f7877o;
            if (b3 == null || b2.f() != b3.f() || b2.h() != b3.h()) {
                int f3 = b2.f();
                int h3 = b2.h();
                f0 f0Var = this.f7876G;
                if (f0Var != null) {
                    f0Var.g(I2.l.e(f3, h3));
                } else if (d3.C() && (a0Var = this.f7878q) != null) {
                    a0Var.H0();
                }
                T(I2.l.e(f3, h3));
                if (this.f7881t != null) {
                    V0(false);
                }
                boolean h4 = b0.h(4);
                U.k B02 = B0();
                if (h4 || (B02 = B02.f3307h) != null) {
                    for (U.k D02 = D0(h4); D02 != null && (D02.f3306g & 4) != 0; D02 = D02.f3308i) {
                        if ((D02.f3305f & 4) != 0) {
                            AbstractC0905m abstractC0905m = D02;
                            ?? r7 = 0;
                            while (abstractC0905m != 0) {
                                if (abstractC0905m instanceof InterfaceC0907o) {
                                    ((InterfaceC0907o) abstractC0905m).U();
                                } else if ((abstractC0905m.f3305f & 4) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                    U.k kVar = abstractC0905m.f7937r;
                                    int i3 = 0;
                                    abstractC0905m = abstractC0905m;
                                    r7 = r7;
                                    while (kVar != null) {
                                        if ((kVar.f3305f & 4) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                abstractC0905m = kVar;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new K.d(new U.k[16]);
                                                }
                                                if (abstractC0905m != 0) {
                                                    r7.b(abstractC0905m);
                                                    abstractC0905m = 0;
                                                }
                                                r7.b(kVar);
                                            }
                                        }
                                        kVar = kVar.f3308i;
                                        abstractC0905m = abstractC0905m;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC0905m = AbstractC0898f.f(r7);
                            }
                        }
                        if (D02 == B02) {
                            break;
                        }
                    }
                }
                C0997t c0997t = d3.f7724l;
                if (c0997t != null) {
                    c0997t.x(d3);
                }
            }
            LinkedHashMap linkedHashMap = this.f7886y;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && b2.i().isEmpty()) || Z1.i.a(b2.i(), this.f7886y)) {
                return;
            }
            d3.f7736y.f7813r.f7791w.f();
            LinkedHashMap linkedHashMap2 = this.f7886y;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f7886y = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(b2.i());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [K.d] */
    public final void S0(U.k kVar, C0896d c0896d, long j3, r rVar, boolean z3, boolean z4, float f3) {
        boolean z5;
        if (kVar == null) {
            G0(c0896d, j3, rVar, z3, z4);
            return;
        }
        switch (c0896d.f7894d) {
            case 1:
                ?? r22 = 0;
                AbstractC0905m abstractC0905m = kVar;
                while (true) {
                    int i3 = 0;
                    if (abstractC0905m == 0) {
                        z5 = false;
                        break;
                    } else {
                        if (abstractC0905m instanceof l0) {
                            if (((l0) abstractC0905m).W()) {
                                z5 = true;
                                break;
                            }
                        } else if ((abstractC0905m.f3305f & 16) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                            U.k kVar2 = abstractC0905m.f7937r;
                            abstractC0905m = abstractC0905m;
                            r22 = r22;
                            while (kVar2 != null) {
                                if ((kVar2.f3305f & 16) != 0) {
                                    i3++;
                                    r22 = r22;
                                    if (i3 == 1) {
                                        abstractC0905m = kVar2;
                                    } else {
                                        if (r22 == 0) {
                                            r22 = new K.d(new U.k[16]);
                                        }
                                        if (abstractC0905m != 0) {
                                            r22.b(abstractC0905m);
                                            abstractC0905m = 0;
                                        }
                                        r22.b(kVar2);
                                    }
                                }
                                kVar2 = kVar2.f3308i;
                                abstractC0905m = abstractC0905m;
                                r22 = r22;
                            }
                            if (i3 == 1) {
                            }
                        }
                        abstractC0905m = AbstractC0898f.f(r22);
                    }
                }
                break;
            default:
                z5 = false;
                break;
        }
        if (!z5) {
            S0(AbstractC0898f.e(kVar, c0896d.a()), c0896d, j3, rVar, z3, z4, f3);
            return;
        }
        Z z6 = new Z(this, kVar, c0896d, j3, rVar, z3, z4, f3, 1);
        if (rVar.f7951f == M1.m.b0(rVar)) {
            rVar.c(kVar, f3, z4, z6);
            if (rVar.f7951f + 1 == M1.m.b0(rVar)) {
                rVar.d();
                return;
            }
            return;
        }
        long b2 = rVar.b();
        int i4 = rVar.f7951f;
        rVar.f7951f = M1.m.b0(rVar);
        rVar.c(kVar, f3, z4, z6);
        if (rVar.f7951f + 1 < M1.m.b0(rVar) && AbstractC0898f.h(b2, rVar.b()) > 0) {
            int i5 = rVar.f7951f + 1;
            int i6 = i4 + 1;
            Object[] objArr = rVar.f7949d;
            M1.k.X(objArr, objArr, i6, i5, rVar.f7952g);
            long[] jArr = rVar.f7950e;
            System.arraycopy(jArr, i5, jArr, i6, rVar.f7952g - i5);
            rVar.f7951f = ((rVar.f7952g + i4) - rVar.f7951f) - 1;
        }
        rVar.d();
        rVar.f7951f = i4;
    }

    public final long T0(long j3, boolean z3) {
        f0 f0Var = this.f7876G;
        if (f0Var != null) {
            j3 = f0Var.d(j3, false);
        }
        if (!z3 && this.f7823i) {
            return j3;
        }
        long j4 = this.f7887z;
        return I2.l.f(a0.c.d(j3) + ((int) (j4 >> 32)), a0.c.e(j3) + ((int) (j4 & 4294967295L)));
    }

    public final void U0(Y1.c cVar, boolean z3) {
        C0997t c0997t;
        Reference poll;
        K.d dVar;
        Object obj;
        D d3 = this.f7877o;
        boolean z4 = (!z3 && this.f7881t == cVar && Z1.i.a(this.f7882u, d3.f7730s) && this.f7883v == d3.f7731t) ? false : true;
        this.f7882u = d3.f7730s;
        this.f7883v = d3.f7731t;
        boolean B = d3.B();
        r1.r rVar = this.f7874E;
        if (!B || cVar == null) {
            this.f7881t = null;
            f0 f0Var = this.f7876G;
            if (f0Var != null) {
                f0Var.c();
                d3.B = true;
                rVar.b();
                if (B0().p && (c0997t = d3.f7724l) != null) {
                    c0997t.x(d3);
                }
            }
            this.f7876G = null;
            this.f7875F = false;
            return;
        }
        this.f7881t = cVar;
        if (this.f7876G != null) {
            if (z4) {
                V0(true);
                return;
            }
            return;
        }
        C0997t c0997t2 = (C0997t) G.a(d3);
        C0036e c0036e = this.D;
        do {
            C2.c cVar2 = c0997t2.q0;
            poll = ((ReferenceQueue) cVar2.f485f).poll();
            dVar = (K.d) cVar2.f484e;
            if (poll != null) {
                dVar.n(poll);
            }
        } while (poll != null);
        while (true) {
            if (!dVar.m()) {
                obj = null;
                break;
            } else {
                obj = ((Reference) dVar.o(dVar.f2642f - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        f0 f0Var2 = (f0) obj;
        if (f0Var2 != null) {
            f0Var2.a(c0036e, rVar);
        } else if (!c0997t2.isHardwareAccelerated() || Build.VERSION.SDK_INT == 28) {
            if (c0997t2.isHardwareAccelerated() && c0997t2.f8425S) {
                try {
                    f0Var2 = new C1000u0(c0997t2, c0036e, rVar);
                } catch (Throwable unused) {
                    c0997t2.f8425S = false;
                }
            }
            if (c0997t2.f8413G == null) {
                if (!F0.f8161v) {
                    u0.L.x(new View(c0997t2.getContext()));
                }
                C0973g0 c0973g0 = F0.f8162w ? new C0973g0(c0997t2.getContext()) : new G0(c0997t2.getContext());
                c0997t2.f8413G = c0973g0;
                c0997t2.addView(c0973g0, -1);
            }
            C0973g0 c0973g02 = c0997t2.f8413G;
            Z1.i.c(c0973g02);
            f0Var2 = new F0(c0997t2, c0973g02, c0036e, rVar);
        } else {
            f0Var2 = new C0979j0(c0997t2.getGraphicsContext().b(), c0997t2.getGraphicsContext(), c0997t2, c0036e, rVar);
        }
        f0Var2.g(this.f7116f);
        f0Var2.e(this.f7887z);
        this.f7876G = f0Var2;
        V0(true);
        d3.B = true;
        rVar.b();
    }

    public final void V0(boolean z3) {
        C0997t c0997t;
        f0 f0Var = this.f7876G;
        if (f0Var == null) {
            if (this.f7881t == null) {
                return;
            }
            AbstractC0381e.N("null layer with a non-null layerBlock");
            throw null;
        }
        Y1.c cVar = this.f7881t;
        if (cVar == null) {
            AbstractC0381e.O("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        C0261L c0261l = f7869H;
        c0261l.d(1.0f);
        c0261l.e(1.0f);
        c0261l.b(1.0f);
        if (c0261l.f4223h != 0.0f) {
            c0261l.f4219d |= 8;
            c0261l.f4223h = 0.0f;
        }
        if (c0261l.f4224i != 0.0f) {
            c0261l.f4219d |= 16;
            c0261l.f4224i = 0.0f;
        }
        if (c0261l.f4225j != 0.0f) {
            c0261l.f4219d |= 32;
            c0261l.f4225j = 0.0f;
        }
        long j3 = AbstractC0252C.f4209a;
        if (!C0288u.c(c0261l.f4226k, j3)) {
            c0261l.f4219d |= 64;
            c0261l.f4226k = j3;
        }
        if (!C0288u.c(c0261l.f4227l, j3)) {
            c0261l.f4219d |= 128;
            c0261l.f4227l = j3;
        }
        if (c0261l.f4228m != 0.0f) {
            c0261l.f4219d |= 256;
            c0261l.f4228m = 0.0f;
        }
        if (c0261l.f4229n != 0.0f) {
            c0261l.f4219d |= 512;
            c0261l.f4229n = 0.0f;
        }
        if (c0261l.f4230o != 0.0f) {
            c0261l.f4219d |= 1024;
            c0261l.f4230o = 0.0f;
        }
        if (c0261l.p != 8.0f) {
            c0261l.f4219d |= 2048;
            c0261l.p = 8.0f;
        }
        c0261l.h(C0266Q.f4258b);
        F0.a aVar = AbstractC0259J.f4215a;
        if (!Z1.i.a(c0261l.f4232r, aVar)) {
            c0261l.f4219d |= 8192;
            c0261l.f4232r = aVar;
        }
        if (c0261l.f4233s) {
            c0261l.f4219d |= 16384;
            c0261l.f4233s = false;
        }
        if (!Z1.i.a(null, null)) {
            c0261l.f4219d |= 131072;
        }
        if (!AbstractC0259J.o(c0261l.f4234t, 0)) {
            c0261l.f4219d |= 32768;
            c0261l.f4234t = 0;
        }
        c0261l.f4235u = 9205357640488583168L;
        c0261l.f4238x = null;
        c0261l.f4219d = 0;
        D d3 = this.f7877o;
        c0261l.f4236v = d3.f7730s;
        c0261l.f4237w = d3.f7731t;
        c0261l.f4235u = I2.l.R(this.f7116f);
        ((C0997t) G.a(d3)).getSnapshotObserver().a(this, C0897e.f7899i, new r1.r(6, cVar));
        C0912u c0912u = this.C;
        if (c0912u == null) {
            c0912u = new C0912u();
            this.C = c0912u;
        }
        c0912u.f7957a = c0261l.f4220e;
        c0912u.f7958b = c0261l.f4221f;
        c0912u.f7959c = c0261l.f4223h;
        c0912u.f7960d = c0261l.f4224i;
        c0912u.f7961e = c0261l.f4228m;
        c0912u.f7962f = c0261l.f4229n;
        c0912u.f7963g = c0261l.f4230o;
        c0912u.f7964h = c0261l.p;
        c0912u.f7965i = c0261l.f4231q;
        f0Var.j(c0261l);
        this.f7880s = c0261l.f4233s;
        this.f7884w = c0261l.f4222g;
        if (!z3 || (c0997t = d3.f7724l) == null) {
            return;
        }
        c0997t.x(d3);
    }

    public final boolean W0(long j3) {
        long j4 = 9187343241974906880L ^ (j3 & 9187343241974906880L);
        if (((~j4) & (j4 - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        f0 f0Var = this.f7876G;
        return f0Var == null || !this.f7880s || f0Var.i(j3);
    }

    @Override // M0.b
    public final float a() {
        return this.f7877o.f7730s.a();
    }

    @Override // t0.O
    public final O d0() {
        return this.p;
    }

    @Override // t0.O
    public final boolean f0() {
        return this.f7885x != null;
    }

    @Override // r0.C
    public final M0.j getLayoutDirection() {
        return this.f7877o.f7731t;
    }

    @Override // t0.O
    public final D j0() {
        return this.f7877o;
    }

    @Override // t0.O
    public final r0.B k0() {
        r0.B b2 = this.f7885x;
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // t0.O
    public final O l0() {
        return this.f7878q;
    }

    @Override // r0.InterfaceC0838k
    public final long m(long j3) {
        long K02 = K0(j3);
        C0997t c0997t = (C0997t) G.a(this.f7877o);
        c0997t.B();
        return AbstractC0259J.u(c0997t.f8420N, K02);
    }

    @Override // t0.O
    public final long m0() {
        return this.f7887z;
    }

    @Override // r0.InterfaceC0838k
    public final boolean n() {
        return B0().p;
    }

    @Override // t0.O
    public final void o0() {
        Q(this.f7887z, this.f7873A, this.f7881t);
    }

    @Override // M0.b
    public final float p() {
        return this.f7877o.f7730s.p();
    }

    public final void p0(a0 a0Var, a0.b bVar, boolean z3) {
        if (a0Var == this) {
            return;
        }
        a0 a0Var2 = this.f7878q;
        if (a0Var2 != null) {
            a0Var2.p0(a0Var, bVar, z3);
        }
        long j3 = this.f7887z;
        float f3 = (int) (j3 >> 32);
        bVar.f3485a -= f3;
        bVar.f3487c -= f3;
        float f4 = (int) (j3 & 4294967295L);
        bVar.f3486b -= f4;
        bVar.f3488d -= f4;
        f0 f0Var = this.f7876G;
        if (f0Var != null) {
            f0Var.b(bVar, true);
            if (this.f7880s && z3) {
                long j4 = this.f7116f;
                bVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
        }
    }

    public final long q0(a0 a0Var, long j3) {
        if (a0Var == this) {
            return j3;
        }
        a0 a0Var2 = this.f7878q;
        return (a0Var2 == null || Z1.i.a(a0Var, a0Var2)) ? y0(j3, true) : y0(a0Var2.q0(a0Var, j3), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [U.k] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [U.k] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // r0.H, r0.z
    public final Object r() {
        D d3 = this.f7877o;
        if (!d3.f7735x.f(64)) {
            return null;
        }
        B0();
        Object obj = null;
        for (U.k kVar = (o0) d3.f7735x.f2355e; kVar != null; kVar = kVar.f3307h) {
            if ((kVar.f3305f & 64) != 0) {
                AbstractC0905m abstractC0905m = kVar;
                ?? r5 = 0;
                while (abstractC0905m != 0) {
                    if (abstractC0905m instanceof j0) {
                        obj = ((j0) abstractC0905m).T(obj);
                    } else if ((abstractC0905m.f3305f & 64) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                        U.k kVar2 = abstractC0905m.f7937r;
                        int i3 = 0;
                        abstractC0905m = abstractC0905m;
                        r5 = r5;
                        while (kVar2 != null) {
                            if ((kVar2.f3305f & 64) != 0) {
                                i3++;
                                r5 = r5;
                                if (i3 == 1) {
                                    abstractC0905m = kVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new K.d(new U.k[16]);
                                    }
                                    if (abstractC0905m != 0) {
                                        r5.b(abstractC0905m);
                                        abstractC0905m = 0;
                                    }
                                    r5.b(kVar2);
                                }
                            }
                            kVar2 = kVar2.f3308i;
                            abstractC0905m = abstractC0905m;
                            r5 = r5;
                        }
                        if (i3 == 1) {
                        }
                    }
                    abstractC0905m = AbstractC0898f.f(r5);
                }
            }
        }
        return obj;
    }

    public final long r0(long j3) {
        return I2.d.h(Math.max(0.0f, (a0.f.d(j3) - N()) / 2.0f), Math.max(0.0f, (a0.f.b(j3) - ((int) (this.f7116f & 4294967295L))) / 2.0f));
    }

    public final float s0(long j3, long j4) {
        if (N() >= a0.f.d(j4) && ((int) (this.f7116f & 4294967295L)) >= a0.f.b(j4)) {
            return Float.POSITIVE_INFINITY;
        }
        long r02 = r0(j4);
        float d3 = a0.f.d(r02);
        float b2 = a0.f.b(r02);
        float d4 = a0.c.d(j3);
        float max = Math.max(0.0f, d4 < 0.0f ? -d4 : d4 - N());
        float e3 = a0.c.e(j3);
        long f3 = I2.l.f(max, Math.max(0.0f, e3 < 0.0f ? -e3 : e3 - ((int) (this.f7116f & 4294967295L))));
        if ((d3 <= 0.0f && b2 <= 0.0f) || a0.c.d(f3) > d3 || a0.c.e(f3) > b2) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (f3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f3 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    @Override // r0.InterfaceC0838k
    public final InterfaceC0838k t() {
        if (B0().p) {
            L0();
            return ((a0) this.f7877o.f7735x.f2354d).f7878q;
        }
        AbstractC0381e.N("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final void t0(InterfaceC0285r interfaceC0285r, C0336b c0336b) {
        f0 f0Var = this.f7876G;
        if (f0Var != null) {
            f0Var.h(interfaceC0285r, c0336b);
            return;
        }
        long j3 = this.f7887z;
        float f3 = (int) (j3 >> 32);
        float f4 = (int) (j3 & 4294967295L);
        interfaceC0285r.r(f3, f4);
        v0(interfaceC0285r, c0336b);
        interfaceC0285r.r(-f3, -f4);
    }

    @Override // r0.InterfaceC0838k
    public final a0.d u(InterfaceC0838k interfaceC0838k, boolean z3) {
        a0 a0Var;
        if (!B0().p) {
            AbstractC0381e.N("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!interfaceC0838k.n()) {
            AbstractC0381e.N("LayoutCoordinates " + interfaceC0838k + " is not attached!");
            throw null;
        }
        r0.y yVar = interfaceC0838k instanceof r0.y ? (r0.y) interfaceC0838k : null;
        if (yVar == null || (a0Var = yVar.f7194d.f7829o) == null) {
            a0Var = (a0) interfaceC0838k;
        }
        a0Var.L0();
        a0 x02 = x0(a0Var);
        a0.b bVar = this.B;
        if (bVar == null) {
            bVar = new a0.b();
            bVar.f3485a = 0.0f;
            bVar.f3486b = 0.0f;
            bVar.f3487c = 0.0f;
            bVar.f3488d = 0.0f;
            this.B = bVar;
        }
        bVar.f3485a = 0.0f;
        bVar.f3486b = 0.0f;
        bVar.f3487c = (int) (interfaceC0838k.y() >> 32);
        bVar.f3488d = (int) (interfaceC0838k.y() & 4294967295L);
        while (a0Var != x02) {
            a0Var.Q0(bVar, z3, false);
            if (bVar.b()) {
                return a0.d.f3490e;
            }
            a0Var = a0Var.f7878q;
            Z1.i.c(a0Var);
        }
        p0(x02, bVar, z3);
        return new a0.d(bVar.f3485a, bVar.f3486b, bVar.f3487c, bVar.f3488d);
    }

    public final void u0(InterfaceC0285r interfaceC0285r, C0276i c0276i) {
        long j3 = this.f7116f;
        interfaceC0285r.getClass();
        interfaceC0285r.b(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, c0276i);
    }

    public final void v0(InterfaceC0285r interfaceC0285r, C0336b c0336b) {
        U.k C02 = C0(4);
        if (C02 == null) {
            O0(interfaceC0285r, c0336b);
            return;
        }
        D d3 = this.f7877o;
        d3.getClass();
        F sharedDrawScope = ((C0997t) G.a(d3)).getSharedDrawScope();
        long R2 = I2.l.R(this.f7116f);
        sharedDrawScope.getClass();
        K.d dVar = null;
        while (C02 != null) {
            if (C02 instanceof InterfaceC0907o) {
                sharedDrawScope.d(interfaceC0285r, R2, this, (InterfaceC0907o) C02, c0336b);
            } else if ((C02.f3305f & 4) != 0 && (C02 instanceof AbstractC0905m)) {
                int i3 = 0;
                for (U.k kVar = ((AbstractC0905m) C02).f7937r; kVar != null; kVar = kVar.f3308i) {
                    if ((kVar.f3305f & 4) != 0) {
                        i3++;
                        if (i3 == 1) {
                            C02 = kVar;
                        } else {
                            if (dVar == null) {
                                dVar = new K.d(new U.k[16]);
                            }
                            if (C02 != null) {
                                dVar.b(C02);
                                C02 = null;
                            }
                            dVar.b(kVar);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            C02 = AbstractC0898f.f(dVar);
        }
    }

    public abstract void w0();

    public final a0 x0(a0 a0Var) {
        D d3 = a0Var.f7877o;
        D d4 = this.f7877o;
        if (d3 == d4) {
            U.k B02 = a0Var.B0();
            U.k kVar = B0().f3303d;
            if (!kVar.p) {
                AbstractC0381e.N("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (U.k kVar2 = kVar.f3307h; kVar2 != null; kVar2 = kVar2.f3307h) {
                if ((kVar2.f3305f & 2) != 0 && kVar2 == B02) {
                    return a0Var;
                }
            }
            return this;
        }
        while (d3.f7725m > d4.f7725m) {
            d3 = d3.q();
            Z1.i.c(d3);
        }
        D d5 = d4;
        while (d5.f7725m > d3.f7725m) {
            d5 = d5.q();
            Z1.i.c(d5);
        }
        while (d3 != d5) {
            d3 = d3.q();
            d5 = d5.q();
            if (d3 == null || d5 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return d5 == d4 ? this : d3 == a0Var.f7877o ? a0Var : (C0911t) d3.f7735x.f2353c;
    }

    @Override // r0.InterfaceC0838k
    public final long y() {
        return this.f7116f;
    }

    public final long y0(long j3, boolean z3) {
        if (z3 || !this.f7823i) {
            long j4 = this.f7887z;
            j3 = I2.l.f(a0.c.d(j3) - ((int) (j4 >> 32)), a0.c.e(j3) - ((int) (j4 & 4294967295L)));
        }
        f0 f0Var = this.f7876G;
        return f0Var != null ? f0Var.d(j3, true) : j3;
    }

    public abstract P z0();

    @Override // t0.O
    public final InterfaceC0838k e0() {
        return this;
    }
}
