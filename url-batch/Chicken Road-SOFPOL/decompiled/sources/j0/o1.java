package j0;

import java.util.WeakHashMap;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3811a = l0.m.f4570h;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3812b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3813c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final float f3814d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f3815e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f3816f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f3817g;

    /* renamed from: h, reason: collision with root package name */
    public static final m0.b0 f3818h;

    static {
        float f6 = l0.n.f4572b;
        float f8 = l0.n.f4573c;
        float f9 = 2;
        f3814d = (f6 - f8) / f9;
        f3815e = (l0.n.f4571a - f8) / f9;
        f3816f = 12;
        f3817g = 44;
        f3818h = new m0.b0(new c.e(11));
    }

    public static final void a(y0.m mVar, long j7, long j8, float f6, x.r0 r0Var, final u0.c cVar, m0.s sVar, final int i) {
        final y0.m mVar2;
        final long j9;
        final long j10;
        final float f8;
        final x.r0 r0Var2;
        long j11;
        float f9;
        long j12;
        y0.m mVar3;
        x.r0 r0Var3;
        sVar.W(1054099326);
        int i8 = i | 11414;
        if (sVar.N(i8 & 1, (74899 & i8) != 74898)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                float f10 = e1.f3625a;
                long d8 = c0.d(l0.m.f4563a, sVar);
                long a8 = c0.a((b0) sVar.j(c0.f3599a), d8);
                float f11 = e1.f3625a;
                WeakHashMap weakHashMap = x.s0.f8273u;
                x.d0 d0Var = new x.d0(new x.o0(x.c.e(sVar).f8280g, x.c.e(sVar).f8275b), x.v0.f8308f | 32);
                j11 = d8;
                f9 = f11;
                j12 = a8;
                mVar3 = y0.j.f8705a;
                r0Var3 = d0Var;
            } else {
                sVar.Q();
                mVar3 = mVar;
                j11 = j7;
                j12 = j8;
                f9 = f6;
                r0Var3 = r0Var;
            }
            sVar.q();
            ((k0) sVar.j(f3818h)).a(new p1(mVar3, j11, j12, f9, r0Var3, cVar), sVar, 0);
            mVar2 = mVar3;
            j9 = j11;
            j10 = j12;
            f8 = f9;
            r0Var2 = r0Var3;
        } else {
            sVar.Q();
            mVar2 = mVar;
            j9 = j7;
            j10 = j8;
            f8 = f6;
            r0Var2 = r0Var;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(j9, j10, f8, r0Var2, cVar, i) { // from class: j0.i1

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f3701e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f3702f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f3703g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ x.r0 f3704h;
                public final /* synthetic */ u0.c i;

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(196609);
                    o1.a(y0.m.this, this.f3701e, this.f3702f, this.f3703g, this.f3704h, this.i, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void b(final x.m0 m0Var, final boolean z3, final p6.a aVar, final u0.c cVar, y0.m mVar, boolean z7, final p6.e eVar, boolean z8, f1 f1Var, m0.s sVar, final int i) {
        int i8;
        m0.s sVar2;
        y0.m mVar2;
        final boolean z9;
        final boolean z10;
        final f1 f1Var2;
        int i9;
        f1 f1Var3;
        int i10;
        y0.m mVar3;
        f1 f1Var4;
        boolean z11;
        boolean z12;
        u0.c d8;
        sVar.W(974293026);
        if ((i & 6) == 0) {
            i8 = (sVar.f(m0Var) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.g(z3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.h(cVar) ? 2048 : 1024;
        }
        int i11 = i8 | 221184;
        if ((1572864 & i) == 0) {
            i11 |= sVar.h(eVar) ? 1048576 : 524288;
        }
        int i12 = 12582912 | i11;
        if ((100663296 & i) == 0) {
            i12 = 46137344 | i11;
        }
        int i13 = 805306368 | i12;
        if (sVar.N(i13 & 1, (306783379 & i13) != 306783378)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                b0 b0Var = (b0) sVar.j(c0.f3599a);
                f1 f1Var5 = b0Var.f3558b0;
                if (f1Var5 == null) {
                    long c8 = c0.c(b0Var, l0.m.f4564b);
                    long c9 = c0.c(b0Var, l0.m.f4567e);
                    long c10 = c0.c(b0Var, l0.m.f4565c);
                    l0.e eVar2 = l0.m.f4568f;
                    long c11 = c0.c(b0Var, eVar2);
                    i9 = -234881025;
                    l0.e eVar3 = l0.m.f4569g;
                    f1Var3 = new f1(c8, c9, c10, c11, c0.c(b0Var, eVar3), f1.s.b(c0.c(b0Var, eVar2), 0.38f), f1.s.b(c0.c(b0Var, eVar3), 0.38f));
                    b0Var.f3558b0 = f1Var3;
                } else {
                    i9 = -234881025;
                    f1Var3 = f1Var5;
                }
                i10 = i13 & i9;
                mVar3 = y0.j.f8705a;
                f1Var4 = f1Var3;
                z11 = true;
                z12 = true;
            } else {
                sVar.Q();
                i10 = i13 & (-234881025);
                mVar3 = mVar;
                z11 = z7;
                z12 = z8;
                f1Var4 = f1Var;
            }
            int i14 = i10;
            sVar.q();
            sVar.V(-224963495);
            Object K = sVar.K();
            Object obj = m0.n.f5019a;
            if (K == obj) {
                K = new v.j();
                sVar.f0(K);
            }
            v.j jVar = (v.j) K;
            sVar.p(false);
            l0.k kVar = l0.k.f4560e;
            boolean z13 = z12;
            r.u0 l3 = m.l(kVar, sVar);
            u0.c d9 = u0.h.d(-876637252, new l1(f1Var4, z3, z11, l3, eVar, z13, cVar), sVar);
            if (eVar == null) {
                sVar.V(-224036658);
                sVar.p(false);
                d8 = null;
            } else {
                sVar.V(-224036657);
                d8 = u0.h.d(802208206, new m1(f1Var4, z3, z11, l3, eVar), sVar);
                sVar.p(false);
            }
            u0.c cVar2 = d8;
            Object K2 = sVar.K();
            if (K2 == obj) {
                K2 = new m0.e1(0);
                sVar.f0(K2);
            }
            m0.e1 e1Var = (m0.e1) K2;
            f1 f1Var6 = f1Var4;
            y0.m mVar4 = mVar3;
            mVar2 = mVar4;
            boolean z14 = z11;
            y0.m a8 = x.m0.a(m0Var, androidx.compose.foundation.layout.a.c(androidx.compose.foundation.selection.a.a(mVar4, z3, jVar, z11, new d2.g(4), aVar), Float.NaN, f3811a));
            Object K3 = sVar.K();
            if (K3 == obj) {
                K3 = new a0.t(9, e1Var);
                sVar.f0(K3);
            }
            y0.m d10 = androidx.compose.ui.layout.a.d(a8, (p6.c) K3);
            u1.e0 d11 = x.k.d(y0.b.f8685h, true);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l7 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, d10);
            w1.i.f7684c.getClass();
            p6.a aVar2 = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(aVar2);
            } else {
                sVar.i0();
            }
            m0.b.u(d11, sVar, w1.h.f7678e);
            m0.b.u(l7, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            t2 a9 = r.f.a(z3 ? 1.0f : 0.0f, m.l(kVar, sVar), null, sVar, 0, 28);
            t2 a10 = r.f.a(z3 ? 1.0f : 0.0f, m.l(l0.k.f4559d, sVar), null, sVar, 0, 28);
            r2.c cVar3 = (r2.c) sVar.j(x1.b1.f8370h);
            float g3 = (e1Var.g() - cVar3.H(l0.n.f4572b)) / 2;
            long floatToRawIntBits = (Float.floatToRawIntBits(cVar3.u(f3816f)) & 4294967295L) | (Float.floatToRawIntBits(g3) << 32);
            boolean f6 = sVar.f(jVar) | sVar.e(floatToRawIntBits);
            Object K4 = sVar.K();
            if (f6 || K4 == obj) {
                K4 = new k0.g(jVar, floatToRawIntBits);
                sVar.f0(K4);
            }
            u0.c d12 = u0.h.d(-2082182507, new i0(2, (k0.g) K4), sVar);
            u0.c d13 = u0.h.d(-799524251, new a0.v(4, a9, f1Var6), sVar);
            boolean f8 = sVar.f(a9);
            Object K5 = sVar.K();
            if (f8 || K5 == obj) {
                K5 = new j1(a9, 0);
                sVar.f0(K5);
            }
            p6.a aVar3 = (p6.a) K5;
            boolean f9 = sVar.f(a10);
            Object K6 = sVar.K();
            if (f9 || K6 == obj) {
                K6 = new j1(a10, 1);
                sVar.f0(K6);
            }
            c(d12, d13, d9, cVar2, z13, aVar3, (p6.a) K6, sVar, ((i14 >> 9) & 57344) | 438);
            z10 = z13;
            sVar2 = sVar;
            sVar2.p(true);
            f1Var2 = f1Var6;
            z9 = z14;
        } else {
            sVar2 = sVar;
            sVar2.Q();
            mVar2 = mVar;
            z9 = z7;
            z10 = z8;
            f1Var2 = f1Var;
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            final y0.m mVar5 = mVar2;
            r7.f5121d = new p6.e() { // from class: j0.k1
                @Override // p6.e
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    o1.b(x.m0.this, z3, aVar, cVar, mVar5, z9, eVar, z10, f1Var2, (m0.s) obj2, m0.b.w(i | 1));
                    return c6.m.f1757a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x011d, code lost:
    
        if (q6.i.a(r26.K(), java.lang.Integer.valueOf(r13)) == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(u0.c cVar, u0.c cVar2, u0.c cVar3, p6.e eVar, boolean z3, p6.a aVar, p6.a aVar2, m0.s sVar, int i) {
        int i8;
        int i9;
        w1.g gVar;
        boolean z7;
        sVar.W(-1019541078);
        if ((i & 6) == 0) {
            i8 = (sVar.h(cVar) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(cVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.h(cVar3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.h(eVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= sVar.g(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= sVar.h(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= sVar.h(aVar2) ? 1048576 : 524288;
        }
        if (sVar.N(i8 & 1, (599187 & i8) != 599186)) {
            y0.m b8 = androidx.compose.ui.layout.a.b(new b6.j(11));
            int i10 = 57344 & i8;
            boolean z8 = ((i8 & 7168) == 2048) | ((3670016 & i8) == 1048576) | (i10 == 16384);
            Object K = sVar.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (z8 || K == v0Var) {
                K = new n1(aVar2, eVar, z3);
                sVar.f0(K);
            }
            u1.e0 e0Var = (u1.e0) K;
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, b8);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            w1.g gVar2 = w1.h.f7678e;
            m0.b.u(e0Var, sVar, gVar2);
            w1.g gVar3 = w1.h.f7677d;
            m0.b.u(l3, sVar, gVar3);
            w1.g gVar4 = w1.h.f7679f;
            if (sVar.S) {
                i9 = i8;
            } else {
                i9 = i8;
            }
            a0.q.n(hashCode, sVar, hashCode, gVar4);
            w1.g gVar5 = w1.h.f7676c;
            m0.b.u(a02, sVar, gVar5);
            cVar.g(sVar, Integer.valueOf(i9 & 14));
            cVar2.g(sVar, Integer.valueOf((i9 >> 3) & 14));
            y0.m c8 = androidx.compose.ui.layout.a.c("icon");
            y0.e eVar2 = y0.b.f8681d;
            u1.e0 d8 = x.k.d(eVar2, false);
            int hashCode2 = Long.hashCode(sVar.T);
            m0.o1 l7 = sVar.l();
            y0.m a03 = r2.o.a0(sVar, c8);
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(d8, sVar, gVar2);
            m0.b.u(l7, sVar, gVar3);
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode2))) {
                gVar = gVar4;
                a0.q.n(hashCode2, sVar, hashCode2, gVar);
            } else {
                gVar = gVar4;
            }
            m0.b.u(a03, sVar, gVar5);
            cVar3.g(sVar, Integer.valueOf((i9 >> 6) & 14));
            sVar.p(true);
            if (eVar != null) {
                sVar.V(-660471321);
                y0.m c9 = androidx.compose.ui.layout.a.c("label");
                boolean z9 = (i10 == 16384) | ((i9 & 458752) == 131072);
                Object K2 = sVar.K();
                if (z9 || K2 == v0Var) {
                    K2 = new c.h(z3, aVar);
                    sVar.f0(K2);
                }
                y0.m a8 = androidx.compose.ui.graphics.a.a(c9, (p6.c) K2);
                u1.e0 d9 = x.k.d(eVar2, false);
                int hashCode3 = Long.hashCode(sVar.T);
                m0.o1 l8 = sVar.l();
                y0.m a04 = r2.o.a0(sVar, a8);
                sVar.Y();
                if (sVar.S) {
                    sVar.k(yVar);
                } else {
                    sVar.i0();
                }
                m0.b.u(d9, sVar, gVar2);
                m0.b.u(l8, sVar, gVar3);
                if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode3))) {
                    a0.q.n(hashCode3, sVar, hashCode3, gVar);
                }
                m0.b.u(a04, sVar, gVar5);
                eVar.g(sVar, Integer.valueOf((i9 >> 9) & 14));
                z7 = true;
                sVar.p(true);
                sVar.p(false);
            } else {
                z7 = true;
                sVar.V(-660200319);
                sVar.p(false);
            }
            sVar.p(z7);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new t(cVar, cVar2, cVar3, eVar, z3, aVar, aVar2, i);
        }
    }
}
