package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3706a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3707b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3708c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f3709d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final x.g0 f3710e;

    /* renamed from: f, reason: collision with root package name */
    public static final x.g0 f3711f;

    /* renamed from: g, reason: collision with root package name */
    public static final x.g0 f3712g;

    /* renamed from: h, reason: collision with root package name */
    public static final m0.b0 f3713h;

    static {
        float f6 = 24;
        f3710e = new x.g0(f6, f6, f6, f6);
        float f8 = 16;
        androidx.compose.foundation.layout.a.b(f8);
        f3711f = androidx.compose.foundation.layout.a.b(f8);
        f3712g = androidx.compose.foundation.layout.a.b(f6);
        f3713h = new m0.b0(new c.e(4));
    }

    public static final void a(final u0.c cVar, y0.m mVar, final p6.e eVar, final p6.e eVar2, final f1.i0 i0Var, final long j7, final float f6, final long j8, final long j9, final long j10, final long j11, m0.s sVar, final int i) {
        final y0.m mVar2;
        sVar.W(1378716401);
        int i8 = i | 48 | (sVar.h(null) ? 256 : 128) | (sVar.h(eVar) ? 2048 : 1024) | (sVar.h(eVar2) ? 16384 : 8192) | (sVar.f(i0Var) ? 131072 : 65536) | (sVar.e(j7) ? 1048576 : 524288) | (sVar.c(f6) ? 8388608 : 4194304) | (sVar.e(j8) ? 67108864 : 33554432) | (sVar.e(j9) ? 536870912 : 268435456);
        if (sVar.N(i8 & 1, ((i8 & 306783379) == 306783378 && (((sVar.e(j10) ? (char) 4 : (char) 2) | (sVar.e(j11) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            u0.c d8 = u0.h.d(-652798794, new e(eVar, eVar2, j9, j10, j11, j8, cVar), sVar);
            int i9 = i8 >> 12;
            int i10 = (i9 & 896) | (i9 & 112) | 12582918 | ((i8 >> 9) & 57344);
            y0.j jVar = y0.j.f8705a;
            l2.a(jVar, i0Var, j7, 0L, f6, 0.0f, d8, sVar, i10, 104);
            mVar2 = jVar;
        } else {
            sVar.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(mVar2, eVar, eVar2, i0Var, j7, f6, j8, j9, j10, j11, i) { // from class: j0.c

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ y0.m f3590e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ p6.e f3591f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ p6.e f3592g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ f1.i0 f3593h;
                public final /* synthetic */ long i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ float f3594j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f3595k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f3596l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ long f3597m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ long f3598n;

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(7);
                    j.a(u0.c.this, this.f3590e, this.f3591f, this.f3592g, this.f3593h, this.i, this.f3594j, this.f3595k, this.f3596l, this.f3597m, this.f3598n, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void b(u0.c cVar, m0.s sVar, int i) {
        sVar.W(-917637668);
        if (sVar.N(i & 1, (i & 147) != 146)) {
            Object K = sVar.K();
            if (K == m0.n.f5019a) {
                K = new g();
                sVar.f0(K);
            }
            u1.e0 e0Var = (u1.e0) K;
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, y0.j.f8705a);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(e0Var, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            cVar.g(sVar, 6);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.a1(cVar, i, 1);
        }
    }

    public static final void c(final p6.a aVar, final u0.c cVar, final y0.m mVar, final p6.e eVar, final p6.e eVar2, final p6.e eVar3, final f1.i0 i0Var, final long j7, final long j8, final long j9, final long j10, final float f6, final u2.o oVar, m0.s sVar, final int i, final int i8) {
        int i9;
        u0.c cVar2;
        p6.e eVar4;
        int i10;
        sVar.W(-867616355);
        if ((i & 6) == 0) {
            i9 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            cVar2 = cVar;
            i9 |= sVar.h(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        if ((i & 384) == 0) {
            i9 |= sVar.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            eVar4 = eVar;
            i9 |= sVar.h(eVar4) ? 2048 : 1024;
        } else {
            eVar4 = eVar;
        }
        if ((i & 24576) == 0) {
            i9 |= sVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i9 |= sVar.h(eVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i9 |= sVar.h(eVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= sVar.f(i0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i9 |= sVar.e(j7) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i9 |= sVar.e(j8) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (sVar.e(j9) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= sVar.e(j10) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= sVar.c(f6) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= sVar.f(oVar) ? 2048 : 1024;
        }
        int i11 = i10;
        if (sVar.N(i9 & 1, ((i9 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
            d(aVar, mVar, oVar, u0.h.d(527420759, new i(eVar2, eVar3, i0Var, j7, f6, j8, j9, j10, eVar4, cVar2), sVar), sVar, (i9 & 14) | 3072 | ((i9 >> 3) & 112) | ((i11 >> 3) & 896));
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: j0.b
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(i | 1);
                    int w8 = m0.b.w(i8);
                    j.c(p6.a.this, cVar, mVar, eVar, eVar2, eVar3, i0Var, j7, j8, j9, j10, f6, oVar, (m0.s) obj, w7, w8);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void d(p6.a aVar, y0.m mVar, u2.o oVar, u0.c cVar, m0.s sVar, int i) {
        int i8;
        sVar.W(24925658);
        if ((i & 6) == 0) {
            i8 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.f(mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.f(oVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.N(i8 & 1, (i8 & 1171) != 1170)) {
            j0 j0Var = (j0) sVar.j(f3713h);
            c5.x xVar = new c5.x();
            xVar.f1737d = aVar;
            xVar.f1738e = mVar;
            xVar.f1739f = oVar;
            xVar.f1740g = cVar;
            j0Var.a(xVar, sVar, 0);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new b6.r1(aVar, mVar, oVar, cVar, i);
        }
    }
}
