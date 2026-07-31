package j0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3921a = 240;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3922b = l0.j.f4556a;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3923c = 6;

    static {
        int i = l0.l.f4562a;
    }

    public static final void a(final p6.a aVar, final y0.m mVar, final long j7, final long j8, int i, float f6, p6.c cVar, m0.s sVar, final int i8) {
        final int i9;
        final float f8;
        final p6.c cVar2;
        final int i10;
        float f9;
        p6.c cVar3;
        int i11;
        final int i12;
        final p6.c cVar4;
        final float f10;
        sVar.W(-339970038);
        int i13 = i8 | (sVar.h(aVar) ? 4 : 2) | (sVar.e(j7) ? 256 : 128) | (sVar.e(j8) ? 2048 : 1024) | 745472;
        if (sVar.N(i13 & 1, (599187 & i13) != 599186)) {
            sVar.S();
            int i14 = i8 & 1;
            Object obj = m0.n.f5019a;
            if (i14 == 0 || sVar.x()) {
                i10 = q1.f3865a;
                f9 = q1.f3867c;
                boolean z3 = (((i13 & 896) ^ 384) > 256 && sVar.e(j7)) || (i13 & 384) == 256;
                Object K = sVar.K();
                if (z3 || K == obj) {
                    K = new p6.c() { // from class: j0.r1
                        @Override // p6.c
                        public final Object i(Object obj2) {
                            h1.d dVar = (h1.d) obj2;
                            float min = Math.min(dVar.u(q1.f3866b), Float.intBitsToFloat((int) (dVar.c() & 4294967295L)));
                            float u7 = dVar.u(u1.f3923c);
                            float intBitsToFloat = (Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) - min) / 2;
                            float f11 = intBitsToFloat > u7 ? u7 : intBitsToFloat;
                            r2.l layoutDirection = dVar.getLayoutDirection();
                            r2.l lVar = r2.l.f6530e;
                            long j9 = j7;
                            int i15 = i10;
                            if (layoutDirection == lVar) {
                                long M = dVar.M();
                                a0.g1 y7 = dVar.y();
                                long u8 = y7.u();
                                y7.m().h();
                                try {
                                    ((b1.b) y7.f84b).w(-1.0f, 1.0f, M);
                                    q1.a(dVar, i15, j9, min, f11);
                                } finally {
                                    y7.m().f();
                                    y7.M(u8);
                                }
                            } else {
                                q1.a(dVar, i15, j9, min, f11);
                            }
                            return c6.m.f1757a;
                        }
                    };
                    sVar.f0(K);
                }
                cVar3 = (p6.c) K;
                i11 = i13 & (-3670017);
            } else {
                sVar.Q();
                i11 = i13 & (-3670017);
                i10 = i;
                f9 = f6;
                cVar3 = cVar;
            }
            sVar.q();
            boolean z7 = (i11 & 14) == 4;
            Object K2 = sVar.K();
            if (z7 || K2 == obj) {
                K2 = new androidx.lifecycle.m0(5, aVar);
                sVar.f0(K2);
            }
            final p6.a aVar2 = (p6.a) K2;
            y0.m d8 = mVar.d(k0.b.f4151c);
            boolean f11 = sVar.f(aVar2);
            Object K3 = sVar.K();
            if (f11 || K3 == obj) {
                K3 = new a0.t(11, aVar2);
                sVar.f0(K3);
            }
            y0.m k3 = androidx.compose.foundation.layout.a.k(d8.d(new AppendedSemanticsElement((p6.c) K3, true)), f3921a, f3922b);
            boolean f12 = ((((i11 & 7168) ^ 3072) > 2048 && sVar.e(j8)) || (i11 & 3072) == 2048) | sVar.f(aVar2) | ((((i11 & 896) ^ 384) > 256 && sVar.e(j7)) || (i11 & 384) == 256) | sVar.f(cVar3);
            Object K4 = sVar.K();
            if (f12 || K4 == obj) {
                i12 = i10;
                cVar4 = cVar3;
                f10 = f9;
                K4 = new p6.c() { // from class: j0.s1
                    @Override // p6.c
                    public final Object i(Object obj2) {
                        h1.d dVar = (h1.d) obj2;
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.c() & 4294967295L));
                        int i15 = i12;
                        float f13 = f10;
                        if (i15 != 0 && Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.c() >> 32))) {
                            f13 += dVar.c0(intBitsToFloat);
                        }
                        float c02 = f13 / dVar.c0(Float.intBitsToFloat((int) (dVar.c() >> 32)));
                        float floatValue = ((Number) aVar2.b()).floatValue();
                        float min = Math.min(floatValue, c02) + floatValue;
                        if (min <= 1.0f) {
                            u1.b(dVar, min, 1.0f, j8, intBitsToFloat, i15);
                        }
                        u1.b(dVar, 0.0f, floatValue, j7, intBitsToFloat, i15);
                        cVar4.i(dVar);
                        return c6.m.f1757a;
                    }
                };
                sVar.f0(K4);
            } else {
                i12 = i10;
                cVar4 = cVar3;
                f10 = f9;
            }
            r2.r.a(k3, (p6.c) K4, sVar, 0);
            i9 = i12;
            f8 = f10;
            cVar2 = cVar4;
        } else {
            sVar.Q();
            i9 = i;
            f8 = f6;
            cVar2 = cVar;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(mVar, j7, j8, i9, f8, cVar2, i8) { // from class: j0.t1

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ y0.m f3910e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f3911f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f3912g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f3913h;
                public final /* synthetic */ float i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ p6.c f3914j;

                @Override // p6.e
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int w7 = m0.b.w(49);
                    u1.a(p6.a.this, this.f3910e, this.f3911f, this.f3912g, this.f3913h, this.i, this.f3914j, (m0.s) obj2, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void b(h1.d dVar, float f6, float f8, long j7, float f9, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.c() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.c() & 4294967295L));
        float f10 = 2;
        float f11 = intBitsToFloat2 / f10;
        boolean z3 = dVar.getLayoutDirection() == r2.l.f6529d;
        float f12 = (z3 ? f6 : 1.0f - f8) * intBitsToFloat;
        float f13 = (z3 ? f8 : 1.0f - f6) * intBitsToFloat;
        if (i == 0 || intBitsToFloat2 > intBitsToFloat) {
            dVar.L(j7, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), f9, (r19 & 16) != 0 ? 0 : 0);
            return;
        }
        float f14 = f9 / f10;
        float f15 = intBitsToFloat - f14;
        if (f12 < f14) {
            f12 = f14;
        }
        if (f12 > f15) {
            f12 = f15;
        }
        if (f13 < f14) {
            f13 = f14;
        }
        if (f13 <= f15) {
            f15 = f13;
        }
        if (Math.abs(f8 - f6) > 0.0f) {
            dVar.L(j7, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), f9, (r19 & 16) != 0 ? 0 : i);
        }
    }
}
