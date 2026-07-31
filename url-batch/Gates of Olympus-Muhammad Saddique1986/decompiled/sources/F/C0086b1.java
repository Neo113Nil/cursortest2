package F;

import a.AbstractC0235a;
import a0.C0241f;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.List;
import java.util.NoSuchElementException;
import r.InterfaceC0849K;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0916m;

/* renamed from: F.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086b1 implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f1481a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1482b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1483c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0849K f1484d;

    public C0086b1(InterfaceC0424c interfaceC0424c, boolean z3, float f3, InterfaceC0849K interfaceC0849K) {
        this.f1481a = interfaceC0424c;
        this.f1482b = z3;
        this.f1483c = f3;
        this.f1484d = interfaceC0849K;
    }

    @Override // r0.InterfaceC0885G
    public final int a(InterfaceC0916m interfaceC0916m, List list, int i3) {
        return c(interfaceC0916m, list, i3, Q.f1316k);
    }

    @Override // r0.InterfaceC0885G
    public final int b(InterfaceC0916m interfaceC0916m, List list, int i3) {
        return c(interfaceC0916m, list, i3, Q.f1318m);
    }

    public final int c(InterfaceC0916m interfaceC0916m, List list, int i3, InterfaceC0426e interfaceC0426e) {
        Object obj;
        int i4;
        int i5;
        Object obj2;
        int i6;
        Object obj3;
        Object obj4;
        int i7;
        Object obj5;
        int i8;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i9);
            if (f2.j.a(G.z.d((InterfaceC0884F) obj), "Leading")) {
                break;
            }
            i9++;
        }
        InterfaceC0884F interfaceC0884F = (InterfaceC0884F) obj;
        if (interfaceC0884F != null) {
            i4 = i3 == Integer.MAX_VALUE ? i3 : i3 - interfaceC0884F.U(Integer.MAX_VALUE);
            i5 = ((Number) interfaceC0426e.h(interfaceC0884F, Integer.valueOf(i3))).intValue();
        } else {
            i4 = i3;
            i5 = 0;
        }
        int size2 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i10);
            if (f2.j.a(G.z.d((InterfaceC0884F) obj2), "Trailing")) {
                break;
            }
            i10++;
        }
        InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) obj2;
        if (interfaceC0884F2 != null) {
            int U3 = interfaceC0884F2.U(Integer.MAX_VALUE);
            if (i4 != Integer.MAX_VALUE) {
                i4 -= U3;
            }
            i6 = ((Number) interfaceC0426e.h(interfaceC0884F2, Integer.valueOf(i3))).intValue();
        } else {
            i6 = 0;
        }
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i11);
            if (f2.j.a(G.z.d((InterfaceC0884F) obj3), "Label")) {
                break;
            }
            i11++;
        }
        Object obj8 = (InterfaceC0884F) obj3;
        int intValue = obj8 != null ? ((Number) interfaceC0426e.h(obj8, Integer.valueOf(l0.c.H(this.f1483c, i4, i3)))).intValue() : 0;
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (f2.j.a(G.z.d((InterfaceC0884F) obj4), "Prefix")) {
                break;
            }
            i12++;
        }
        InterfaceC0884F interfaceC0884F3 = (InterfaceC0884F) obj4;
        if (interfaceC0884F3 != null) {
            i7 = ((Number) interfaceC0426e.h(interfaceC0884F3, Integer.valueOf(i4))).intValue();
            int U4 = interfaceC0884F3.U(Integer.MAX_VALUE);
            if (i4 != Integer.MAX_VALUE) {
                i4 -= U4;
            }
        } else {
            i7 = 0;
        }
        int size5 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i13);
            if (f2.j.a(G.z.d((InterfaceC0884F) obj5), "Suffix")) {
                break;
            }
            i13++;
        }
        InterfaceC0884F interfaceC0884F4 = (InterfaceC0884F) obj5;
        if (interfaceC0884F4 != null) {
            int intValue2 = ((Number) interfaceC0426e.h(interfaceC0884F4, Integer.valueOf(i4))).intValue();
            int U5 = interfaceC0884F4.U(Integer.MAX_VALUE);
            if (i4 != Integer.MAX_VALUE) {
                i4 -= U5;
            }
            i8 = intValue2;
        } else {
            i8 = 0;
        }
        int size6 = list.size();
        for (int i14 = 0; i14 < size6; i14++) {
            Object obj9 = list.get(i14);
            if (f2.j.a(G.z.d((InterfaceC0884F) obj9), "TextField")) {
                int intValue3 = ((Number) interfaceC0426e.h(obj9, Integer.valueOf(i4))).intValue();
                int size7 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i15);
                    if (f2.j.a(G.z.d((InterfaceC0884F) obj6), "Hint")) {
                        break;
                    }
                    i15++;
                }
                Object obj10 = (InterfaceC0884F) obj6;
                int intValue4 = obj10 != null ? ((Number) interfaceC0426e.h(obj10, Integer.valueOf(i4))).intValue() : 0;
                int size8 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i16);
                    if (f2.j.a(G.z.d((InterfaceC0884F) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i16++;
                }
                Object obj12 = (InterfaceC0884F) obj7;
                return Z0.c(i5, i6, i7, i8, intValue3, intValue, intValue4, obj12 != null ? ((Number) interfaceC0426e.h(obj12, Integer.valueOf(i3))).intValue() : 0, this.f1483c, G.z.f2063a, interfaceC0916m.a(), this.f1484d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int d(InterfaceC0916m interfaceC0916m, List list, int i3, InterfaceC0426e interfaceC0426e) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj7 = list.get(i4);
            if (f2.j.a(G.z.d((InterfaceC0884F) obj7), "TextField")) {
                int intValue = ((Number) interfaceC0426e.h(obj7, Integer.valueOf(i3))).intValue();
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    obj = null;
                    if (i5 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i5);
                    if (f2.j.a(G.z.d((InterfaceC0884F) obj2), "Label")) {
                        break;
                    }
                    i5++;
                }
                InterfaceC0884F interfaceC0884F = (InterfaceC0884F) obj2;
                int intValue2 = interfaceC0884F != null ? ((Number) interfaceC0426e.h(interfaceC0884F, Integer.valueOf(i3))).intValue() : 0;
                int size3 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i6);
                    if (f2.j.a(G.z.d((InterfaceC0884F) obj3), "Trailing")) {
                        break;
                    }
                    i6++;
                }
                InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) obj3;
                int intValue3 = interfaceC0884F2 != null ? ((Number) interfaceC0426e.h(interfaceC0884F2, Integer.valueOf(i3))).intValue() : 0;
                int size4 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i7);
                    if (f2.j.a(G.z.d((InterfaceC0884F) obj4), "Leading")) {
                        break;
                    }
                    i7++;
                }
                InterfaceC0884F interfaceC0884F3 = (InterfaceC0884F) obj4;
                int intValue4 = interfaceC0884F3 != null ? ((Number) interfaceC0426e.h(interfaceC0884F3, Integer.valueOf(i3))).intValue() : 0;
                int size5 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i8);
                    if (f2.j.a(G.z.d((InterfaceC0884F) obj5), "Prefix")) {
                        break;
                    }
                    i8++;
                }
                InterfaceC0884F interfaceC0884F4 = (InterfaceC0884F) obj5;
                int intValue5 = interfaceC0884F4 != null ? ((Number) interfaceC0426e.h(interfaceC0884F4, Integer.valueOf(i3))).intValue() : 0;
                int size6 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i9);
                    if (f2.j.a(G.z.d((InterfaceC0884F) obj6), "Suffix")) {
                        break;
                    }
                    i9++;
                }
                InterfaceC0884F interfaceC0884F5 = (InterfaceC0884F) obj6;
                int intValue6 = interfaceC0884F5 != null ? ((Number) interfaceC0426e.h(interfaceC0884F5, Integer.valueOf(i3))).intValue() : 0;
                int size7 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i10);
                    if (f2.j.a(G.z.d((InterfaceC0884F) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i10++;
                }
                InterfaceC0884F interfaceC0884F6 = (InterfaceC0884F) obj;
                return Z0.d(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, interfaceC0884F6 != null ? ((Number) interfaceC0426e.h(interfaceC0884F6, Integer.valueOf(i3))).intValue() : 0, this.f1483c, G.z.f2063a, interfaceC0916m.a(), this.f1484d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // r0.InterfaceC0885G
    public final int e(InterfaceC0916m interfaceC0916m, List list, int i3) {
        return d(interfaceC0916m, list, i3, Q.f1319n);
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC0893O abstractC0893O;
        AbstractC0893O abstractC0893O2;
        Object obj4;
        AbstractC0893O abstractC0893O3;
        Object obj5;
        Object obj6;
        Object obj7;
        InterfaceC0849K interfaceC0849K = this.f1484d;
        int l3 = interfaceC0887I.l(interfaceC0849K.c());
        long a3 = O0.a.a(j3, 0, 0, 0, 0, 10);
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (f2.j.a(androidx.compose.ui.layout.a.a((InterfaceC0884F) obj), "Leading")) {
                break;
            }
            i3++;
        }
        InterfaceC0884F interfaceC0884F = (InterfaceC0884F) obj;
        AbstractC0893O b3 = interfaceC0884F != null ? interfaceC0884F.b(a3) : null;
        int f3 = G.z.f(b3);
        int max = Math.max(0, G.z.e(b3));
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (f2.j.a(androidx.compose.ui.layout.a.a((InterfaceC0884F) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) obj2;
        AbstractC0893O b4 = interfaceC0884F2 != null ? interfaceC0884F2.b(O2.d.Z(a3, -f3, 0, 2)) : null;
        int f4 = G.z.f(b4) + f3;
        int max2 = Math.max(max, G.z.e(b4));
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (f2.j.a(androidx.compose.ui.layout.a.a((InterfaceC0884F) obj3), "Prefix")) {
                break;
            }
            i5++;
        }
        InterfaceC0884F interfaceC0884F3 = (InterfaceC0884F) obj3;
        if (interfaceC0884F3 != null) {
            abstractC0893O = b3;
            abstractC0893O2 = interfaceC0884F3.b(O2.d.Z(a3, -f4, 0, 2));
        } else {
            abstractC0893O = b3;
            abstractC0893O2 = null;
        }
        int f5 = G.z.f(abstractC0893O2) + f4;
        int max3 = Math.max(max2, G.z.e(abstractC0893O2));
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            int i7 = size4;
            if (f2.j.a(androidx.compose.ui.layout.a.a((InterfaceC0884F) obj4), "Suffix")) {
                break;
            }
            i6++;
            size4 = i7;
        }
        InterfaceC0884F interfaceC0884F4 = (InterfaceC0884F) obj4;
        AbstractC0893O b5 = interfaceC0884F4 != null ? interfaceC0884F4.b(O2.d.Z(a3, -f5, 0, 2)) : null;
        int f6 = G.z.f(b5) + f5;
        int max4 = Math.max(max3, G.z.e(b5));
        InterfaceC0887I interfaceC0887I2 = interfaceC0887I;
        int l4 = interfaceC0887I2.l(interfaceC0849K.a(interfaceC0887I.getLayoutDirection())) + interfaceC0887I2.l(interfaceC0849K.b(interfaceC0887I.getLayoutDirection()));
        int i8 = -f6;
        C0086b1 c0086b1 = this;
        int H3 = l0.c.H(c0086b1.f1483c, i8 - l4, -l4);
        int i9 = -l3;
        AbstractC0893O abstractC0893O4 = b5;
        long Y2 = O2.d.Y(H3, i9, a3);
        int size5 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size5) {
                abstractC0893O3 = abstractC0893O4;
                obj5 = null;
                break;
            }
            obj5 = list.get(i10);
            int i11 = size5;
            abstractC0893O3 = abstractC0893O4;
            if (f2.j.a(androidx.compose.ui.layout.a.a((InterfaceC0884F) obj5), "Label")) {
                break;
            }
            i10++;
            abstractC0893O4 = abstractC0893O3;
            size5 = i11;
        }
        InterfaceC0884F interfaceC0884F5 = (InterfaceC0884F) obj5;
        AbstractC0893O b6 = interfaceC0884F5 != null ? interfaceC0884F5.b(Y2) : null;
        c0086b1.f1481a.n(new C0241f(b6 != null ? AbstractC0235a.e(b6.f8126d, b6.f8127e) : 0L));
        int size6 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i12);
            int i13 = size6;
            if (f2.j.a(androidx.compose.ui.layout.a.a((InterfaceC0884F) obj6), "Supporting")) {
                break;
            }
            i12++;
            size6 = i13;
        }
        InterfaceC0884F interfaceC0884F6 = (InterfaceC0884F) obj6;
        int V2 = interfaceC0884F6 != null ? interfaceC0884F6.V(O0.a.j(j3)) : 0;
        int max5 = Math.max(G.z.e(b6) / 2, interfaceC0887I2.l(interfaceC0849K.d()));
        long a4 = O0.a.a(O2.d.Y(i8, (i9 - max5) - V2, j3), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i14 = 0;
        while (i14 < size7) {
            int i15 = size7;
            InterfaceC0884F interfaceC0884F7 = (InterfaceC0884F) list.get(i14);
            int i16 = i14;
            if (f2.j.a(androidx.compose.ui.layout.a.a(interfaceC0884F7), "TextField")) {
                AbstractC0893O b7 = interfaceC0884F7.b(a4);
                long a5 = O0.a.a(a4, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i17);
                    int i18 = size8;
                    if (f2.j.a(androidx.compose.ui.layout.a.a((InterfaceC0884F) obj7), "Hint")) {
                        break;
                    }
                    i17++;
                    size8 = i18;
                }
                InterfaceC0884F interfaceC0884F8 = (InterfaceC0884F) obj7;
                AbstractC0893O b8 = interfaceC0884F8 != null ? interfaceC0884F8.b(a5) : null;
                int max6 = Math.max(max4, Math.max(G.z.e(b7), G.z.e(b8)) + max5 + l3);
                int d3 = Z0.d(G.z.f(abstractC0893O), G.z.f(b4), G.z.f(abstractC0893O2), G.z.f(abstractC0893O3), b7.f8126d, G.z.f(b6), G.z.f(b8), c0086b1.f1483c, j3, interfaceC0887I.a(), c0086b1.f1484d);
                AbstractC0893O b9 = interfaceC0884F6 != null ? interfaceC0884F6.b(O0.a.a(O2.d.Z(a3, 0, -max6, 1), 0, d3, 0, 0, 9)) : null;
                int e3 = G.z.e(b9);
                int c2 = Z0.c(G.z.e(abstractC0893O), G.z.e(b4), G.z.e(abstractC0893O2), G.z.e(abstractC0893O3), b7.f8127e, G.z.e(b6), G.z.e(b8), G.z.e(b9), c0086b1.f1483c, j3, interfaceC0887I.a(), c0086b1.f1484d);
                int i19 = c2 - e3;
                int size9 = list.size();
                for (int i20 = 0; i20 < size9; i20++) {
                    InterfaceC0884F interfaceC0884F9 = (InterfaceC0884F) list.get(i20);
                    if (f2.j.a(androidx.compose.ui.layout.a.a(interfaceC0884F9), "Container")) {
                        return interfaceC0887I.i0(d3, c2, S1.v.f4321d, new C0083a1(c2, d3, abstractC0893O, b4, abstractC0893O2, abstractC0893O3, b7, b6, b8, interfaceC0884F9.b(O2.d.a(d3 != Integer.MAX_VALUE ? d3 : 0, d3, i19 != Integer.MAX_VALUE ? i19 : 0, i19)), b9, this, interfaceC0887I));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i14 = i16 + 1;
            size7 = i15;
            c0086b1 = this;
            interfaceC0887I2 = interfaceC0887I2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // r0.InterfaceC0885G
    public final int h(InterfaceC0916m interfaceC0916m, List list, int i3) {
        return d(interfaceC0916m, list, i3, Q.f1317l);
    }
}
