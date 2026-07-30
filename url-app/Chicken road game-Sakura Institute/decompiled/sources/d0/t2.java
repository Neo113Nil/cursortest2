package d0;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t2 implements p1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final q6.c f2402a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2403b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2404c;

    /* renamed from: d, reason: collision with root package name */
    public final q.h0 f2405d;

    public t2(q6.c cVar, boolean z8, float f9, q.h0 h0Var) {
        this.f2402a = cVar;
        this.f2403b = z8;
        this.f2404c = f9;
        this.f2405d = h0Var;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        Object obj;
        Object obj2;
        Object obj3;
        p1.n0 n0Var;
        p1.n0 n0Var2;
        Object obj4;
        int i7;
        p1.n0 n0Var3;
        int i8;
        Object obj5;
        Object obj6;
        Object obj7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        t2 t2Var = this;
        List list2 = list;
        q.h0 h0Var2 = t2Var.f2405d;
        int K = h0Var.K(h0Var2.a());
        long a3 = m2.a.a(j8, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i17);
            if (r6.k.a(androidx.compose.ui.layout.a.a((p1.e0) obj), "Leading")) {
                break;
            }
            i17++;
        }
        p1.e0 e0Var = (p1.e0) obj;
        p1.n0 b9 = e0Var != null ? e0Var.b(a3) : null;
        float f9 = e0.o.f2714b;
        int i18 = b9 != null ? b9.f7063f : 0;
        int max = Math.max(0, b9 != null ? b9.f7064g : 0);
        int size2 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i19);
            if (r6.k.a(androidx.compose.ui.layout.a.a((p1.e0) obj2), "Trailing")) {
                break;
            }
            i19++;
        }
        p1.e0 e0Var2 = (p1.e0) obj2;
        p1.n0 b10 = e0Var2 != null ? e0Var2.b(r4.a.N(a3, -i18, 0, 2)) : null;
        int i20 = i18 + (b10 != null ? b10.f7063f : 0);
        int max2 = Math.max(max, b10 != null ? b10.f7064g : 0);
        int size3 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i21);
            if (r6.k.a(androidx.compose.ui.layout.a.a((p1.e0) obj3), "Prefix")) {
                break;
            }
            i21++;
        }
        p1.e0 e0Var3 = (p1.e0) obj3;
        if (e0Var3 != null) {
            n0Var = b9;
            n0Var2 = e0Var3.b(r4.a.N(a3, -i20, 0, 2));
        } else {
            n0Var = b9;
            n0Var2 = null;
        }
        int i22 = i20 + (n0Var2 != null ? n0Var2.f7063f : 0);
        int max3 = Math.max(max2, n0Var2 != null ? n0Var2.f7064g : 0);
        int size4 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i23);
            if (r6.k.a(androidx.compose.ui.layout.a.a((p1.e0) obj4), "Suffix")) {
                break;
            }
            i23++;
        }
        p1.e0 e0Var4 = (p1.e0) obj4;
        if (e0Var4 != null) {
            i7 = i22;
            n0Var3 = e0Var4.b(r4.a.N(a3, -i22, 0, 2));
        } else {
            i7 = i22;
            n0Var3 = null;
        }
        int i24 = i7 + (n0Var3 != null ? n0Var3.f7063f : 0);
        int max4 = Math.max(max3, n0Var3 != null ? n0Var3.f7064g : 0);
        int K2 = h0Var.K(h0Var2.c(h0Var.getLayoutDirection())) + h0Var.K(h0Var2.b(h0Var.getLayoutDirection()));
        int i25 = -i24;
        int E = a8.m.E(t2Var.f2404c, i25 - K2, -K2);
        int i26 = -K;
        long M = r4.a.M(E, i26, a3);
        int size5 = list2.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size5) {
                i8 = K;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i27);
            int i28 = i27;
            i8 = K;
            if (r6.k.a(androidx.compose.ui.layout.a.a((p1.e0) obj5), "Label")) {
                break;
            }
            i27 = i28 + 1;
            K = i8;
        }
        p1.e0 e0Var5 = (p1.e0) obj5;
        p1.n0 b11 = e0Var5 != null ? e0Var5.b(M) : null;
        t2Var.f2402a.f(new y0.f(b11 != null ? v0.d.a(b11.f7063f, b11.f7064g) : 0L));
        int size6 = list2.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i29);
            int i30 = size6;
            if (r6.k.a(androidx.compose.ui.layout.a.a((p1.e0) obj6), "Supporting")) {
                break;
            }
            i29++;
            size6 = i30;
        }
        p1.e0 e0Var6 = (p1.e0) obj6;
        int e02 = e0Var6 != null ? e0Var6.e0(m2.a.j(j8)) : 0;
        int max5 = Math.max((b11 != null ? b11.f7064g : 0) / 2, h0Var.K(h0Var2.d()));
        long a9 = m2.a.a(r4.a.M(i25, (i26 - max5) - e02, j8), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i31 = 0;
        while (i31 < size7) {
            p1.e0 e0Var7 = (p1.e0) list2.get(i31);
            int i32 = i31;
            int i33 = size7;
            if (r6.k.a(androidx.compose.ui.layout.a.a(e0Var7), "TextField")) {
                p1.n0 b12 = e0Var7.b(a9);
                long a10 = m2.a.a(a9, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i34 = 0;
                while (true) {
                    if (i34 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i34);
                    int i35 = size8;
                    int i36 = i34;
                    if (r6.k.a(androidx.compose.ui.layout.a.a((p1.e0) obj7), "Hint")) {
                        break;
                    }
                    i34 = i36 + 1;
                    size8 = i35;
                }
                p1.e0 e0Var8 = (p1.e0) obj7;
                p1.n0 b13 = e0Var8 != null ? e0Var8.b(a10) : null;
                int max6 = Math.max(max4, Math.max(b12.f7064g, b13 != null ? b13.f7064g : 0) + max5 + i8);
                p1.n0 n0Var4 = n0Var;
                int i37 = n0Var != null ? n0Var4.f7063f : 0;
                int i38 = b10 != null ? b10.f7063f : 0;
                if (n0Var2 != null) {
                    i9 = n0Var2.f7063f;
                    i37 = i37;
                } else {
                    i9 = 0;
                }
                if (n0Var3 != null) {
                    i10 = i37;
                    i11 = n0Var3.f7063f;
                } else {
                    i10 = i37;
                    i11 = 0;
                }
                int i39 = b12.f7063f;
                if (b11 != null) {
                    i14 = b11.f7063f;
                    i13 = i10;
                    i12 = i39;
                } else {
                    int i40 = i10;
                    i12 = i39;
                    i13 = i40;
                    i14 = 0;
                }
                if (b13 != null) {
                    i15 = b13.f7063f;
                    i13 = i13;
                } else {
                    i15 = 0;
                }
                int d8 = r2.d(i13, i38, i9, i11, i12, i14, i15, t2Var.f2404c, j8, h0Var.a(), t2Var.f2405d);
                int i41 = 0;
                int i42 = d8;
                p1.n0 b14 = e0Var6 != null ? e0Var6.b(m2.a.a(r4.a.N(a3, 0, -max6, 1), 0, d8, 0, 0, 9)) : null;
                int i43 = b14 != null ? b14.f7064g : 0;
                int i44 = n0Var4 != null ? n0Var4.f7064g : 0;
                if (b10 != null) {
                    i16 = 0;
                    i41 = b10.f7064g;
                } else {
                    i16 = 0;
                }
                p1.n0 n0Var5 = n0Var2;
                p1.n0 n0Var6 = b11;
                int c4 = r2.c(i44, i41, n0Var2 != null ? n0Var2.f7064g : i16, n0Var3 != null ? n0Var3.f7064g : i16, b12.f7064g, b11 != null ? b11.f7064g : i16, b13 != null ? b13.f7064g : i16, b14 != null ? b14.f7064g : i16, t2Var.f2404c, j8, h0Var.a(), t2Var.f2405d);
                int i45 = c4 - i43;
                int size9 = list2.size();
                int i46 = i16;
                while (i46 < size9) {
                    p1.e0 e0Var9 = (p1.e0) list2.get(i46);
                    if (r6.k.a(androidx.compose.ui.layout.a.a(e0Var9), "Container")) {
                        p1.n0 b15 = e0Var9.b(r4.a.b(i42 != Integer.MAX_VALUE ? i42 : i16, i42, i45 != Integer.MAX_VALUE ? i45 : i16, i45));
                        p1.n0 n0Var7 = b12;
                        p1.n0 n0Var8 = b14;
                        int i47 = i42;
                        return h0Var.C(i47, c4, e6.v.f2827f, new s2(c4, i47, n0Var4, b10, n0Var5, n0Var3, n0Var7, n0Var6, b13, b15, n0Var8, t2Var, h0Var));
                    }
                    i46++;
                    i42 = i42;
                    b14 = b14;
                    b12 = b12;
                    n0Var5 = n0Var5;
                    n0Var3 = n0Var3;
                    n0Var4 = n0Var4;
                    t2Var = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i31 = i32 + 1;
            t2Var = this;
            list2 = list;
            n0Var3 = n0Var3;
            size7 = i33;
            a9 = a9;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p1.f0
    public final int b(p1.m mVar, List list, int i7) {
        return d(mVar, list, i7, u0.f2452o);
    }

    @Override // p1.f0
    public final int c(p1.m mVar, List list, int i7) {
        return f(mVar, list, i7, u0.f2453p);
    }

    public final int d(p1.m mVar, List list, int i7, q6.e eVar) {
        Object obj;
        int i8;
        int i9;
        Object obj2;
        int i10;
        Object obj3;
        Object obj4;
        int i11;
        Object obj5;
        int i12;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (r6.k.a(e0.o.c((p1.e0) obj), "Leading")) {
                break;
            }
            i13++;
        }
        p1.e0 e0Var = (p1.e0) obj;
        if (e0Var != null) {
            i8 = i7 == Integer.MAX_VALUE ? i7 : i7 - e0Var.d0(Integer.MAX_VALUE);
            i9 = ((Number) eVar.d(e0Var, Integer.valueOf(i7))).intValue();
        } else {
            i8 = i7;
            i9 = 0;
        }
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (r6.k.a(e0.o.c((p1.e0) obj2), "Trailing")) {
                break;
            }
            i14++;
        }
        p1.e0 e0Var2 = (p1.e0) obj2;
        if (e0Var2 != null) {
            int d02 = e0Var2.d0(Integer.MAX_VALUE);
            if (i8 != Integer.MAX_VALUE) {
                i8 -= d02;
            }
            i10 = ((Number) eVar.d(e0Var2, Integer.valueOf(i7))).intValue();
        } else {
            i10 = 0;
        }
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i15);
            if (r6.k.a(e0.o.c((p1.e0) obj3), "Label")) {
                break;
            }
            i15++;
        }
        Object obj8 = (p1.e0) obj3;
        int intValue = obj8 != null ? ((Number) eVar.d(obj8, Integer.valueOf(a8.m.E(this.f2404c, i8, i7)))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (r6.k.a(e0.o.c((p1.e0) obj4), "Prefix")) {
                break;
            }
            i16++;
        }
        p1.e0 e0Var3 = (p1.e0) obj4;
        if (e0Var3 != null) {
            i11 = ((Number) eVar.d(e0Var3, Integer.valueOf(i8))).intValue();
            int d03 = e0Var3.d0(Integer.MAX_VALUE);
            if (i8 != Integer.MAX_VALUE) {
                i8 -= d03;
            }
        } else {
            i11 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i17);
            if (r6.k.a(e0.o.c((p1.e0) obj5), "Suffix")) {
                break;
            }
            i17++;
        }
        p1.e0 e0Var4 = (p1.e0) obj5;
        if (e0Var4 != null) {
            int intValue2 = ((Number) eVar.d(e0Var4, Integer.valueOf(i8))).intValue();
            int d04 = e0Var4.d0(Integer.MAX_VALUE);
            if (i8 != Integer.MAX_VALUE) {
                i8 -= d04;
            }
            i12 = intValue2;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            Object obj9 = list.get(i18);
            if (r6.k.a(e0.o.c((p1.e0) obj9), "TextField")) {
                int intValue3 = ((Number) eVar.d(obj9, Integer.valueOf(i8))).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i19);
                    if (r6.k.a(e0.o.c((p1.e0) obj6), "Hint")) {
                        break;
                    }
                    i19++;
                }
                Object obj10 = (p1.e0) obj6;
                int intValue4 = obj10 != null ? ((Number) eVar.d(obj10, Integer.valueOf(i8))).intValue() : 0;
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i20);
                    if (r6.k.a(e0.o.c((p1.e0) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i20++;
                }
                Object obj12 = (p1.e0) obj7;
                return r2.c(i9, i10, i11, i12, intValue3, intValue, intValue4, obj12 != null ? ((Number) eVar.d(obj12, Integer.valueOf(i7))).intValue() : 0, this.f2404c, e0.o.f2713a, mVar.a(), this.f2405d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p1.f0
    public final int e(p1.m mVar, List list, int i7) {
        return f(mVar, list, i7, u0.f2451n);
    }

    public final int f(p1.m mVar, List list, int i7, q6.e eVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj7 = list.get(i8);
            if (r6.k.a(e0.o.c((p1.e0) obj7), "TextField")) {
                int intValue = ((Number) eVar.d(obj7, Integer.valueOf(i7))).intValue();
                int size2 = list.size();
                int i9 = 0;
                while (true) {
                    obj = null;
                    if (i9 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i9);
                    if (r6.k.a(e0.o.c((p1.e0) obj2), "Label")) {
                        break;
                    }
                    i9++;
                }
                p1.e0 e0Var = (p1.e0) obj2;
                int intValue2 = e0Var != null ? ((Number) eVar.d(e0Var, Integer.valueOf(i7))).intValue() : 0;
                int size3 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i10);
                    if (r6.k.a(e0.o.c((p1.e0) obj3), "Trailing")) {
                        break;
                    }
                    i10++;
                }
                p1.e0 e0Var2 = (p1.e0) obj3;
                int intValue3 = e0Var2 != null ? ((Number) eVar.d(e0Var2, Integer.valueOf(i7))).intValue() : 0;
                int size4 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i11);
                    if (r6.k.a(e0.o.c((p1.e0) obj4), "Leading")) {
                        break;
                    }
                    i11++;
                }
                p1.e0 e0Var3 = (p1.e0) obj4;
                int intValue4 = e0Var3 != null ? ((Number) eVar.d(e0Var3, Integer.valueOf(i7))).intValue() : 0;
                int size5 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i12);
                    if (r6.k.a(e0.o.c((p1.e0) obj5), "Prefix")) {
                        break;
                    }
                    i12++;
                }
                p1.e0 e0Var4 = (p1.e0) obj5;
                int intValue5 = e0Var4 != null ? ((Number) eVar.d(e0Var4, Integer.valueOf(i7))).intValue() : 0;
                int size6 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i13);
                    if (r6.k.a(e0.o.c((p1.e0) obj6), "Suffix")) {
                        break;
                    }
                    i13++;
                }
                p1.e0 e0Var5 = (p1.e0) obj6;
                int intValue6 = e0Var5 != null ? ((Number) eVar.d(e0Var5, Integer.valueOf(i7))).intValue() : 0;
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i14);
                    if (r6.k.a(e0.o.c((p1.e0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i14++;
                }
                p1.e0 e0Var6 = (p1.e0) obj;
                return r2.d(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, e0Var6 != null ? ((Number) eVar.d(e0Var6, Integer.valueOf(i7))).intValue() : 0, this.f2404c, e0.o.f2713a, mVar.a(), this.f2405d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p1.f0
    public final int g(p1.m mVar, List list, int i7) {
        return d(mVar, list, i7, u0.f2450m);
    }
}
