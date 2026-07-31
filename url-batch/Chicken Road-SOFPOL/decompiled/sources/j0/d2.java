package j0;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3616a = 16;

    public static final void a(final y0.m mVar, p6.e eVar, final u0.c cVar, p6.e eVar2, p6.e eVar3, int i, long j7, long j8, x.r0 r0Var, final u0.c cVar2, m0.s sVar, final int i8) {
        int i9;
        u0.c cVar3;
        final p6.e eVar4;
        final p6.e eVar5;
        final p6.e eVar6;
        final int i10;
        final long j9;
        final long j10;
        final x.r0 r0Var2;
        p6.e eVar7;
        p6.e eVar8;
        p6.e eVar9;
        long j11;
        long b8;
        x.r0 o0Var;
        int i11;
        sVar.W(-1211482744);
        if ((i8 & 6) == 0) {
            i9 = (sVar.f(mVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        int i12 = i9 | 48;
        if ((i8 & 384) == 0) {
            cVar3 = cVar;
            i12 |= sVar.h(cVar3) ? 256 : 128;
        } else {
            cVar3 = cVar;
        }
        int i13 = 224256 | i12;
        if ((1572864 & i8) == 0) {
            i13 = 748544 | i12;
        }
        if ((12582912 & i8) == 0) {
            i13 |= 4194304;
        }
        if ((100663296 & i8) == 0) {
            i13 |= 33554432;
        }
        if ((805306368 & i8) == 0) {
            i13 |= sVar.h(cVar2) ? 536870912 : 268435456;
        }
        if (sVar.N(i13 & 1, (306783379 & i13) != 306783378)) {
            sVar.S();
            if ((i8 & 1) == 0 || sVar.x()) {
                eVar7 = e0.f3622a;
                eVar8 = e0.f3623b;
                eVar9 = e0.f3624c;
                j11 = ((b0) sVar.j(c0.f3599a)).f3569n;
                b8 = c0.b(j11, sVar);
                WeakHashMap weakHashMap = x.s0.f8273u;
                o0Var = new x.o0(x.c.e(sVar).f8280g, x.c.e(sVar).f8275b);
                i11 = 2;
            } else {
                sVar.Q();
                eVar7 = eVar;
                eVar8 = eVar2;
                eVar9 = eVar3;
                i11 = i;
                j11 = j7;
                b8 = j8;
                o0Var = r0Var;
            }
            sVar.q();
            boolean f6 = sVar.f(o0Var);
            Object K = sVar.K();
            Object obj = m0.n.f5019a;
            if (f6 || K == obj) {
                K = new k0.h(o0Var);
                sVar.f0(K);
            }
            k0.h hVar = (k0.h) K;
            boolean f8 = sVar.f(hVar) | sVar.f(o0Var);
            Object K2 = sVar.K();
            if (f8 || K2 == obj) {
                K2 = new a0.v0(5, hVar, o0Var);
                sVar.f0(K2);
            }
            y0.m d8 = mVar.d(new y0.h(new x.u0(0, (p6.c) K2)));
            p6.e eVar10 = eVar7;
            p6.e eVar11 = eVar8;
            p6.e eVar12 = eVar9;
            int i14 = i11;
            u0.c d9 = u0.h.d(848889571, new b2(i14, eVar10, cVar2, eVar11, eVar12, hVar, cVar3), sVar);
            long j12 = b8;
            long j13 = j11;
            l2.a(d8, null, j13, j12, 0.0f, 0.0f, d9, sVar, 12582912, 114);
            j10 = j12;
            r0Var2 = o0Var;
            eVar4 = eVar10;
            i10 = i14;
            j9 = j13;
            eVar5 = eVar11;
            eVar6 = eVar12;
        } else {
            sVar.Q();
            eVar4 = eVar;
            eVar5 = eVar2;
            eVar6 = eVar3;
            i10 = i;
            j9 = j7;
            j10 = j8;
            r0Var2 = r0Var;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: j0.y1
                @Override // p6.e
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    d2.a(y0.m.this, eVar4, cVar, eVar5, eVar6, i10, j9, j10, r0Var2, cVar2, (m0.s) obj2, m0.b.w(i8 | 1));
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void b(final int i, p6.e eVar, u0.c cVar, p6.e eVar2, p6.e eVar3, final x.r0 r0Var, u0.c cVar2, m0.s sVar, int i8) {
        int i9;
        sVar.W(-280287501);
        int i10 = i8 | (sVar.d(i) ? 4 : 2) | (sVar.h(eVar) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128) | (sVar.h(eVar2) ? 2048 : 1024) | (sVar.h(eVar3) ? 16384 : 8192) | (sVar.f(r0Var) ? 131072 : 65536) | (sVar.h(cVar2) ? 1048576 : 524288);
        if (sVar.N(i10 & 1, (599187 & i10) != 599186)) {
            Object K = sVar.K();
            Object obj = m0.n.f5019a;
            if (K == obj) {
                K = new c2();
                sVar.f0(K);
            }
            final c2 c2Var = (c2) K;
            boolean z3 = (i10 & 112) == 32;
            Object K2 = sVar.K();
            if (z3 || K2 == obj) {
                K2 = new u0.c(605195056, true, new d(4, eVar));
                sVar.f0(K2);
            }
            final p6.e eVar4 = (p6.e) K2;
            boolean z7 = (i10 & 7168) == 2048;
            Object K3 = sVar.K();
            if (z7 || K3 == obj) {
                K3 = new u0.c(418899191, true, new d(3, eVar2));
                sVar.f0(K3);
            }
            final p6.e eVar5 = (p6.e) K3;
            boolean z8 = (57344 & i10) == 16384;
            Object K4 = sVar.K();
            if (z8 || K4 == obj) {
                K4 = new u0.c(338600263, true, new d(2, eVar3));
                sVar.f0(K4);
            }
            final p6.e eVar6 = (p6.e) K4;
            boolean z9 = (i10 & 896) == 256;
            Object K5 = sVar.K();
            if (z9 || K5 == obj) {
                i9 = i10;
                K5 = new u0.c(-1776388365, true, new a0.v(5, cVar, c2Var));
                sVar.f0(K5);
            } else {
                i9 = i10;
            }
            final p6.e eVar7 = (p6.e) K5;
            boolean z10 = (i9 & 3670016) == 1048576;
            Object K6 = sVar.K();
            if (z10 || K6 == obj) {
                K6 = new u0.c(-1731662488, true, new a0(cVar2, 2));
                sVar.f0(K6);
            }
            final p6.e eVar8 = (p6.e) K6;
            boolean f6 = ((i9 & 458752) == 131072) | sVar.f(eVar4) | sVar.f(eVar5) | sVar.f(eVar6) | ((i9 & 14) == 4) | sVar.f(eVar8) | sVar.f(eVar7);
            Object K7 = sVar.K();
            if (f6 || K7 == obj) {
                Object obj2 = new p6.e() { // from class: j0.z1
                    @Override // p6.e
                    public final Object g(Object obj3, Object obj4) {
                        int H;
                        int H2;
                        int i11;
                        o0 o0Var;
                        o0 o0Var2;
                        final Integer num;
                        int i12;
                        int intValue;
                        int H3;
                        int a8;
                        final u1.x0 x0Var = (u1.x0) obj3;
                        r2.a aVar = (r2.a) obj4;
                        float f8 = d2.f3616a;
                        final int h8 = r2.a.h(aVar.f6514a);
                        final int g3 = r2.a.g(aVar.f6514a);
                        long a9 = r2.a.a(aVar.f6514a, 0, 0, 0, 0, 10);
                        r2.l layoutDirection = x0Var.getLayoutDirection();
                        final x.r0 r0Var2 = x.r0.this;
                        int b8 = r0Var2.b(x0Var, layoutDirection);
                        int c8 = r0Var2.c(x0Var, x0Var.getLayoutDirection());
                        int a10 = r0Var2.a(x0Var);
                        final u1.l0 e8 = ((u1.d0) d6.m.R(x0Var.z(e2.f3626d, eVar4))).e(a9);
                        int i13 = (-b8) - c8;
                        int i14 = -a10;
                        final u1.l0 e9 = ((u1.d0) d6.m.R(x0Var.z(e2.f3628f, eVar5))).e(r2.b.h(i13, i14, a9));
                        final u1.l0 e10 = ((u1.d0) d6.m.R(x0Var.z(e2.f3629g, eVar6))).e(r2.b.h(i13, i14, a9));
                        int i15 = e10.f7230d;
                        r2.l lVar = r2.l.f6529d;
                        int i16 = i;
                        if (i15 == 0 && e10.f7231e == 0) {
                            o0Var = null;
                        } else {
                            int i17 = e10.f7231e;
                            if (i16 == 0) {
                                if (x0Var.getLayoutDirection() == lVar) {
                                    H = x0Var.H(f8);
                                    i11 = H + b8;
                                } else {
                                    H2 = x0Var.H(f8);
                                    i11 = ((h8 - H2) - i15) - c8;
                                }
                            } else if (i16 != 2 && i16 != 3) {
                                i11 = (((h8 - i15) + b8) - c8) / 2;
                            } else if (x0Var.getLayoutDirection() == lVar) {
                                H2 = x0Var.H(f8);
                                i11 = ((h8 - H2) - i15) - c8;
                            } else {
                                H = x0Var.H(f8);
                                i11 = H + b8;
                            }
                            o0Var = new o0();
                            o0Var.f3809a = i11;
                            o0Var.f3810b = i17;
                        }
                        final u1.l0 e11 = ((u1.d0) d6.m.R(x0Var.z(e2.f3630h, eVar8))).e(a9);
                        boolean z11 = e11.f7230d == 0 && e11.f7231e == 0;
                        if (o0Var != null) {
                            int i18 = o0Var.f3810b;
                            o0Var2 = o0Var;
                            if (z11 || i16 == 3) {
                                H3 = x0Var.H(f8) + i18;
                                a8 = r0Var2.a(x0Var);
                            } else {
                                H3 = e11.f7231e + i18;
                                a8 = x0Var.H(f8);
                            }
                            num = Integer.valueOf(a8 + H3);
                        } else {
                            o0Var2 = o0Var;
                            num = null;
                        }
                        int i19 = e9.f7231e;
                        if (i19 != 0) {
                            if (num != null) {
                                intValue = num.intValue();
                            } else {
                                Integer valueOf = !z11 ? Integer.valueOf(e11.f7231e) : null;
                                intValue = valueOf != null ? valueOf.intValue() : r0Var2.a(x0Var);
                            }
                            i12 = i19 + intValue;
                        } else {
                            i12 = 0;
                        }
                        float a02 = (e8.f7230d == 0 && e8.f7231e == 0) ? x0Var.a0(r0Var2.d(x0Var)) : x0Var.a0(e8.f7231e);
                        float a03 = z11 ? x0Var.a0(r0Var2.a(x0Var)) : x0Var.a0(e11.f7231e);
                        r2.l layoutDirection2 = x0Var.getLayoutDirection();
                        float a04 = layoutDirection2 == lVar ? x0Var.a0(r0Var2.b(x0Var, layoutDirection2)) : x0Var.a0(r0Var2.c(x0Var, layoutDirection2));
                        r2.l layoutDirection3 = x0Var.getLayoutDirection();
                        c2Var.f3608a.setValue(new x.g0(a04, a02, layoutDirection3 == lVar ? x0Var.a0(r0Var2.c(x0Var, layoutDirection3)) : x0Var.a0(r0Var2.b(x0Var, layoutDirection3)), a03));
                        final u1.l0 e12 = ((u1.d0) d6.m.R(x0Var.z(e2.f3627e, eVar7))).e(a9);
                        final int i20 = i12;
                        final o0 o0Var3 = o0Var2;
                        return x0Var.e0(h8, g3, d6.v.f2327d, new p6.c() { // from class: j0.a2
                            @Override // p6.c
                            public final Object i(Object obj5) {
                                u1.k0 k0Var = (u1.k0) obj5;
                                u1.k0.g(k0Var, u1.l0.this, 0, 0);
                                u1.k0.g(k0Var, e8, 0, 0);
                                u1.l0 l0Var = e9;
                                int i21 = h8 - l0Var.f7230d;
                                u1.x0 x0Var2 = x0Var;
                                r2.l layoutDirection4 = x0Var2.getLayoutDirection();
                                x.r0 r0Var3 = r0Var2;
                                int b9 = ((r0Var3.b(x0Var2, layoutDirection4) + i21) - r0Var3.c(x0Var2, x0Var2.getLayoutDirection())) / 2;
                                int i22 = g3;
                                u1.k0.g(k0Var, l0Var, b9, i22 - i20);
                                u1.l0 l0Var2 = e11;
                                u1.k0.g(k0Var, l0Var2, 0, i22 - l0Var2.f7231e);
                                o0 o0Var4 = o0Var3;
                                if (o0Var4 != null) {
                                    int i23 = o0Var4.f3809a;
                                    Integer num2 = num;
                                    q6.i.b(num2);
                                    u1.k0.g(k0Var, e10, i23, i22 - num2.intValue());
                                }
                                return c6.m.f1757a;
                            }
                        });
                    }
                };
                sVar.f0(obj2);
                K7 = obj2;
            }
            u1.s0.b(null, (p6.e) K7, sVar, 0);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new b6.z0(i, eVar, cVar, eVar2, eVar3, r0Var, cVar2, i8);
        }
    }
}
