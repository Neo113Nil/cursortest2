package j0;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n1 implements u1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p6.a f3801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p6.e f3802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3803c;

    public n1(p6.a aVar, p6.e eVar, boolean z3) {
        this.f3801a = aVar;
        this.f3802b = eVar;
        this.f3803c = z3;
    }

    @Override // u1.e0
    public final u1.f0 e(final w1.n0 n0Var, List list, long j7) {
        Object obj;
        final u1.l0 l0Var;
        u1.l0 l0Var2;
        n1 n1Var = this;
        float floatValue = ((Number) n1Var.f3801a.b()).floatValue();
        float f6 = floatValue >= 0.0f ? floatValue : 0.0f;
        long a8 = r2.a.a(j7, 0, 0, 0, 0, 10);
        int size = list.size();
        int i = 0;
        while (i < size) {
            u1.d0 d0Var = (u1.d0) list.get(i);
            if (q6.i.a(androidx.compose.ui.layout.a.a(d0Var), "icon")) {
                final u1.l0 e8 = d0Var.e(a8);
                char c8 = 2;
                float f8 = 2;
                int H = n0Var.H(o1.f3814d * f8) + e8.f7230d;
                int B = s6.a.B(H * f6);
                int H2 = n0Var.H(o1.f3815e * f8) + e8.f7231e;
                int size2 = list.size();
                int i8 = 0;
                while (i8 < size2) {
                    u1.d0 d0Var2 = (u1.d0) list.get(i8);
                    char c9 = c8;
                    final float f9 = f6;
                    if (q6.i.a(androidx.compose.ui.layout.a.a(d0Var2), "indicatorRipple")) {
                        if (!((H >= 0) & (H2 >= 0))) {
                            r2.h.a("width and height must be >= 0");
                        }
                        final u1.l0 e9 = d0Var2.e(r2.b.g(H, H, H2, H2));
                        int size3 = list.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i9);
                            if (q6.i.a(androidx.compose.ui.layout.a.a((u1.d0) obj), "indicator")) {
                                break;
                            }
                            i9++;
                        }
                        u1.d0 d0Var3 = (u1.d0) obj;
                        if (d0Var3 != null) {
                            if (!((B >= 0) & (H2 >= 0))) {
                                r2.h.a("width and height must be >= 0");
                            }
                            l0Var = d0Var3.e(r2.b.g(B, B, H2, H2));
                        } else {
                            l0Var = null;
                        }
                        p6.e eVar = n1Var.f3802b;
                        if (eVar != null) {
                            int size4 = list.size();
                            for (int i10 = 0; i10 < size4; i10++) {
                                u1.d0 d0Var4 = (u1.d0) list.get(i10);
                                if (q6.i.a(androidx.compose.ui.layout.a.a(d0Var4), "label")) {
                                    l0Var2 = d0Var4.e(a8);
                                }
                            }
                            t2.a.b("Collection contains no element matching the predicate.");
                            throw new a5.c();
                        }
                        l0Var2 = null;
                        d6.v vVar = d6.v.f2327d;
                        if (eVar == null) {
                            final int H3 = r2.a.h(j7) == Integer.MAX_VALUE ? (n0Var.H(o1.f3817g) * 2) + e8.f7230d : r2.a.h(j7);
                            final int e10 = r2.b.e(n0Var.H(o1.f3811a), j7);
                            final int i11 = (H3 - e8.f7230d) / 2;
                            final int i12 = (e10 - e8.f7231e) / 2;
                            final int i13 = (H3 - e9.f7230d) / 2;
                            final int i14 = (e10 - e9.f7231e) / 2;
                            return n0Var.e0(H3, e10, vVar, new p6.c() { // from class: j0.h1
                                @Override // p6.c
                                public final Object i(Object obj2) {
                                    u1.k0 k0Var = (u1.k0) obj2;
                                    u1.l0 l0Var3 = u1.l0.this;
                                    if (l0Var3 != null) {
                                        u1.k0.k(k0Var, l0Var3, (H3 - l0Var3.f7230d) / 2, (e10 - l0Var3.f7231e) / 2);
                                    }
                                    u1.k0.k(k0Var, e8, i11, i12);
                                    u1.k0.k(k0Var, e9, i13, i14);
                                    return c6.m.f1757a;
                                }
                            });
                        }
                        q6.i.b(l0Var2);
                        float f10 = e8.f7231e;
                        float f11 = o1.f3815e;
                        float b8 = (n0Var.b() * f11) + f10;
                        float f12 = o1.f3813c;
                        float b9 = (n0Var.b() * f12) + b8 + l0Var2.f7231e;
                        float i15 = (r2.a.i(j7) - b9) / f8;
                        float b10 = n0Var.b() * f11;
                        if (i15 < b10) {
                            i15 = b10;
                        }
                        float f13 = (i15 * f8) + b9;
                        final boolean z3 = n1Var.f3803c;
                        final float f14 = (1 - f9) * ((z3 ? i15 : (f13 - e8.f7231e) / f8) - i15);
                        final float b11 = (n0Var.b() * f12) + (n0Var.b() * f11) + e8.f7231e + i15;
                        int H4 = r2.a.h(j7) == Integer.MAX_VALUE ? (n0Var.H(o1.f3817g) * 2) + e8.f7230d : r2.a.h(j7);
                        final int i16 = (H4 - l0Var2.f7230d) / 2;
                        final int i17 = (H4 - e8.f7230d) / 2;
                        final int i18 = (H4 - e9.f7230d) / 2;
                        final float b12 = i15 - (n0Var.b() * f11);
                        final int i19 = H4;
                        final float f15 = i15;
                        final u1.l0 l0Var3 = l0Var;
                        final u1.l0 l0Var4 = l0Var2;
                        return n0Var.e0(i19, s6.a.B(f13), vVar, new p6.c() { // from class: j0.g1
                            @Override // p6.c
                            public final Object i(Object obj2) {
                                u1.k0 k0Var = (u1.k0) obj2;
                                u1.l0 l0Var5 = u1.l0.this;
                                float f16 = f14;
                                float f17 = f15;
                                if (l0Var5 != null) {
                                    u1.k0.k(k0Var, l0Var5, (i19 - l0Var5.f7230d) / 2, s6.a.B((f17 - n0Var.H(o1.f3815e)) + f16));
                                }
                                if (z3 || f9 != 0.0f) {
                                    u1.k0.k(k0Var, l0Var4, i16, s6.a.B(b11 + f16));
                                }
                                u1.k0.k(k0Var, e8, i17, s6.a.B(f17 + f16));
                                u1.k0.k(k0Var, e9, i18, s6.a.B(b12 + f16));
                                return c6.m.f1757a;
                            }
                        });
                    }
                    i8++;
                    n1Var = this;
                    c8 = c9;
                    f6 = f9;
                }
                t2.a.b("Collection contains no element matching the predicate.");
                throw new a5.c();
            }
            i++;
            n1Var = this;
        }
        t2.a.b("Collection contains no element matching the predicate.");
        throw new a5.c();
    }
}
