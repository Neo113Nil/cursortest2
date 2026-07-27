package D;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0977m;
import q.InterfaceC1021Z;
import z2.C1412P;

/* loaded from: classes.dex */
public final class U0 implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1658a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1659b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1660c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1021Z f1661d;

    public U0(Function1 function1, boolean z4, float f4, InterfaceC1021Z interfaceC1021Z) {
        this.f1658a = function1;
        this.f1659b = z4;
        this.f1660c = f4;
        this.f1661d = interfaceC1021Z;
    }

    @Override // p0.InterfaceC0945F
    public final int a(InterfaceC0977m interfaceC0977m, List list, int i2) {
        return c(interfaceC0977m, list, i2, O.f1533p);
    }

    public final int b(InterfaceC0977m interfaceC0977m, List list, int i2, Function2 function2) {
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
            if (Intrinsics.a(E.v.d((InterfaceC0944E) obj), "Leading")) {
                break;
            }
            i9++;
        }
        InterfaceC0944E interfaceC0944E = (InterfaceC0944E) obj;
        if (interfaceC0944E != null) {
            i4 = i2 == Integer.MAX_VALUE ? i2 : i2 - interfaceC0944E.X(Integer.MAX_VALUE);
            i5 = ((Number) function2.h(interfaceC0944E, Integer.valueOf(i2))).intValue();
        } else {
            i4 = i2;
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
            if (Intrinsics.a(E.v.d((InterfaceC0944E) obj2), "Trailing")) {
                break;
            }
            i10++;
        }
        InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) obj2;
        if (interfaceC0944E2 != null) {
            int X3 = interfaceC0944E2.X(Integer.MAX_VALUE);
            if (i4 != Integer.MAX_VALUE) {
                i4 -= X3;
            }
            i6 = ((Number) function2.h(interfaceC0944E2, Integer.valueOf(i2))).intValue();
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
            if (Intrinsics.a(E.v.d((InterfaceC0944E) obj3), "Label")) {
                break;
            }
            i11++;
        }
        Object obj8 = (InterfaceC0944E) obj3;
        int intValue = obj8 != null ? ((Number) function2.h(obj8, Integer.valueOf(u3.d.O(this.f1660c, i4, i2)))).intValue() : 0;
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (Intrinsics.a(E.v.d((InterfaceC0944E) obj4), "Prefix")) {
                break;
            }
            i12++;
        }
        InterfaceC0944E interfaceC0944E3 = (InterfaceC0944E) obj4;
        if (interfaceC0944E3 != null) {
            i7 = ((Number) function2.h(interfaceC0944E3, Integer.valueOf(i4))).intValue();
            int X4 = interfaceC0944E3.X(Integer.MAX_VALUE);
            if (i4 != Integer.MAX_VALUE) {
                i4 -= X4;
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
            if (Intrinsics.a(E.v.d((InterfaceC0944E) obj5), "Suffix")) {
                break;
            }
            i13++;
        }
        InterfaceC0944E interfaceC0944E4 = (InterfaceC0944E) obj5;
        if (interfaceC0944E4 != null) {
            int intValue2 = ((Number) function2.h(interfaceC0944E4, Integer.valueOf(i4))).intValue();
            int X5 = interfaceC0944E4.X(Integer.MAX_VALUE);
            if (i4 != Integer.MAX_VALUE) {
                i4 -= X5;
            }
            i8 = intValue2;
        } else {
            i8 = 0;
        }
        int size6 = list.size();
        for (int i14 = 0; i14 < size6; i14++) {
            Object obj9 = list.get(i14);
            if (Intrinsics.a(E.v.d((InterfaceC0944E) obj9), "TextField")) {
                int intValue3 = ((Number) function2.h(obj9, Integer.valueOf(i4))).intValue();
                int size7 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i15);
                    if (Intrinsics.a(E.v.d((InterfaceC0944E) obj6), "Hint")) {
                        break;
                    }
                    i15++;
                }
                Object obj10 = (InterfaceC0944E) obj6;
                int intValue4 = obj10 != null ? ((Number) function2.h(obj10, Integer.valueOf(i4))).intValue() : 0;
                int size8 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i16);
                    if (Intrinsics.a(E.v.d((InterfaceC0944E) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i16++;
                }
                Object obj12 = (InterfaceC0944E) obj7;
                return S0.c(i5, i6, i7, i8, intValue3, intValue, intValue4, obj12 != null ? ((Number) function2.h(obj12, Integer.valueOf(i2))).intValue() : 0, this.f1660c, E.v.f2251a, interfaceC0977m.e(), this.f1661d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int c(InterfaceC0977m interfaceC0977m, List list, int i2, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj7 = list.get(i4);
            if (Intrinsics.a(E.v.d((InterfaceC0944E) obj7), "TextField")) {
                int intValue = ((Number) function2.h(obj7, Integer.valueOf(i2))).intValue();
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    obj = null;
                    if (i5 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i5);
                    if (Intrinsics.a(E.v.d((InterfaceC0944E) obj2), "Label")) {
                        break;
                    }
                    i5++;
                }
                InterfaceC0944E interfaceC0944E = (InterfaceC0944E) obj2;
                int intValue2 = interfaceC0944E != null ? ((Number) function2.h(interfaceC0944E, Integer.valueOf(i2))).intValue() : 0;
                int size3 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i6);
                    if (Intrinsics.a(E.v.d((InterfaceC0944E) obj3), "Trailing")) {
                        break;
                    }
                    i6++;
                }
                InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) obj3;
                int intValue3 = interfaceC0944E2 != null ? ((Number) function2.h(interfaceC0944E2, Integer.valueOf(i2))).intValue() : 0;
                int size4 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i7);
                    if (Intrinsics.a(E.v.d((InterfaceC0944E) obj4), "Leading")) {
                        break;
                    }
                    i7++;
                }
                InterfaceC0944E interfaceC0944E3 = (InterfaceC0944E) obj4;
                int intValue4 = interfaceC0944E3 != null ? ((Number) function2.h(interfaceC0944E3, Integer.valueOf(i2))).intValue() : 0;
                int size5 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i8);
                    if (Intrinsics.a(E.v.d((InterfaceC0944E) obj5), "Prefix")) {
                        break;
                    }
                    i8++;
                }
                InterfaceC0944E interfaceC0944E4 = (InterfaceC0944E) obj5;
                int intValue5 = interfaceC0944E4 != null ? ((Number) function2.h(interfaceC0944E4, Integer.valueOf(i2))).intValue() : 0;
                int size6 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i9);
                    if (Intrinsics.a(E.v.d((InterfaceC0944E) obj6), "Suffix")) {
                        break;
                    }
                    i9++;
                }
                InterfaceC0944E interfaceC0944E5 = (InterfaceC0944E) obj6;
                int intValue6 = interfaceC0944E5 != null ? ((Number) function2.h(interfaceC0944E5, Integer.valueOf(i2))).intValue() : 0;
                int size7 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i10);
                    if (Intrinsics.a(E.v.d((InterfaceC0944E) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i10++;
                }
                InterfaceC0944E interfaceC0944E6 = (InterfaceC0944E) obj;
                return S0.d(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, interfaceC0944E6 != null ? ((Number) function2.h(interfaceC0944E6, Integer.valueOf(i2))).intValue() : 0, this.f1660c, E.v.f2251a, interfaceC0977m.e(), this.f1661d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p0.InterfaceC0945F
    public final int e(InterfaceC0977m interfaceC0977m, List list, int i2) {
        return b(interfaceC0977m, list, i2, O.f1532o);
    }

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC0954O abstractC0954O;
        AbstractC0954O abstractC0954O2;
        Object obj4;
        AbstractC0954O abstractC0954O3;
        Object obj5;
        Object obj6;
        Object obj7;
        InterfaceC0946G t4;
        InterfaceC1021Z interfaceC1021Z = this.f1661d;
        int l4 = interfaceC0947H.l(interfaceC1021Z.c());
        long b4 = M0.a.b(j4, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj), "Leading")) {
                break;
            }
            i2++;
        }
        InterfaceC0944E interfaceC0944E = (InterfaceC0944E) obj;
        AbstractC0954O a4 = interfaceC0944E != null ? interfaceC0944E.a(b4) : null;
        int f4 = E.v.f(a4);
        int max = Math.max(0, E.v.e(a4));
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) obj2;
        AbstractC0954O a5 = interfaceC0944E2 != null ? interfaceC0944E2.a(u3.d.R(b4, -f4, 0, 2)) : null;
        int f5 = E.v.f(a5) + f4;
        int max2 = Math.max(max, E.v.e(a5));
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj3), "Prefix")) {
                break;
            }
            i5++;
        }
        InterfaceC0944E interfaceC0944E3 = (InterfaceC0944E) obj3;
        if (interfaceC0944E3 != null) {
            abstractC0954O = a4;
            abstractC0954O2 = interfaceC0944E3.a(u3.d.R(b4, -f5, 0, 2));
        } else {
            abstractC0954O = a4;
            abstractC0954O2 = null;
        }
        int f6 = E.v.f(abstractC0954O2) + f5;
        int max3 = Math.max(max2, E.v.e(abstractC0954O2));
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            int i7 = size4;
            if (Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj4), "Suffix")) {
                break;
            }
            i6++;
            size4 = i7;
        }
        InterfaceC0944E interfaceC0944E4 = (InterfaceC0944E) obj4;
        AbstractC0954O a6 = interfaceC0944E4 != null ? interfaceC0944E4.a(u3.d.R(b4, -f6, 0, 2)) : null;
        int f7 = E.v.f(a6) + f6;
        int max4 = Math.max(max3, E.v.e(a6));
        InterfaceC0947H interfaceC0947H2 = interfaceC0947H;
        int l5 = interfaceC0947H2.l(interfaceC1021Z.a(interfaceC0947H.getLayoutDirection())) + interfaceC0947H2.l(interfaceC1021Z.b(interfaceC0947H.getLayoutDirection()));
        int i8 = -f7;
        U0 u02 = this;
        int O3 = u3.d.O(u02.f1660c, i8 - l5, -l5);
        int i9 = -l4;
        AbstractC0954O abstractC0954O4 = a6;
        long Q3 = u3.d.Q(O3, i9, b4);
        int size5 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size5) {
                abstractC0954O3 = abstractC0954O4;
                obj5 = null;
                break;
            }
            obj5 = list.get(i10);
            int i11 = size5;
            abstractC0954O3 = abstractC0954O4;
            if (Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj5), "Label")) {
                break;
            }
            i10++;
            abstractC0954O4 = abstractC0954O3;
            size5 = i11;
        }
        InterfaceC0944E interfaceC0944E5 = (InterfaceC0944E) obj5;
        AbstractC0954O a7 = interfaceC0944E5 != null ? interfaceC0944E5.a(Q3) : null;
        u02.f1658a.invoke(new Y.f(a7 != null ? u3.l.N(a7.f9005d, a7.f9006e) : 0L));
        int size6 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i12);
            int i13 = size6;
            if (Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj6), "Supporting")) {
                break;
            }
            i12++;
            size6 = i13;
        }
        InterfaceC0944E interfaceC0944E6 = (InterfaceC0944E) obj6;
        int Z3 = interfaceC0944E6 != null ? interfaceC0944E6.Z(M0.a.k(j4)) : 0;
        int max5 = Math.max(E.v.e(a7) / 2, interfaceC0947H2.l(interfaceC1021Z.d()));
        long b5 = M0.a.b(u3.d.Q(i8, (i9 - max5) - Z3, j4), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i14 = 0;
        while (i14 < size7) {
            int i15 = size7;
            InterfaceC0944E interfaceC0944E7 = (InterfaceC0944E) list.get(i14);
            int i16 = i14;
            if (Intrinsics.a(androidx.compose.ui.layout.a.a(interfaceC0944E7), "TextField")) {
                AbstractC0954O a8 = interfaceC0944E7.a(b5);
                long b6 = M0.a.b(b5, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i17);
                    int i18 = size8;
                    if (Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj7), "Hint")) {
                        break;
                    }
                    i17++;
                    size8 = i18;
                }
                InterfaceC0944E interfaceC0944E8 = (InterfaceC0944E) obj7;
                AbstractC0954O a9 = interfaceC0944E8 != null ? interfaceC0944E8.a(b6) : null;
                int max6 = Math.max(max4, Math.max(E.v.e(a8), E.v.e(a9)) + max5 + l4);
                int d4 = S0.d(E.v.f(abstractC0954O), E.v.f(a5), E.v.f(abstractC0954O2), E.v.f(abstractC0954O3), a8.f9005d, E.v.f(a7), E.v.f(a9), u02.f1660c, j4, interfaceC0947H.e(), u02.f1661d);
                AbstractC0954O a10 = interfaceC0944E6 != null ? interfaceC0944E6.a(M0.a.b(u3.d.R(b4, 0, -max6, 1), 0, d4, 0, 0, 9)) : null;
                int e4 = E.v.e(a10);
                int c4 = S0.c(E.v.e(abstractC0954O), E.v.e(a5), E.v.e(abstractC0954O2), E.v.e(abstractC0954O3), a8.f9006e, E.v.e(a7), E.v.e(a9), E.v.e(a10), u02.f1660c, j4, interfaceC0947H.e(), u02.f1661d);
                int i19 = c4 - e4;
                int size9 = list.size();
                for (int i20 = 0; i20 < size9; i20++) {
                    InterfaceC0944E interfaceC0944E9 = (InterfaceC0944E) list.get(i20);
                    if (Intrinsics.a(androidx.compose.ui.layout.a.a(interfaceC0944E9), "Container")) {
                        t4 = interfaceC0947H.t(d4, c4, C1412P.c(), new T0(c4, d4, abstractC0954O, a5, abstractC0954O2, abstractC0954O3, a8, a7, a9, interfaceC0944E9.a(u3.d.a(d4 != Integer.MAX_VALUE ? d4 : 0, d4, i19 != Integer.MAX_VALUE ? i19 : 0, i19)), a10, this, interfaceC0947H));
                        return t4;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i14 = i16 + 1;
            size7 = i15;
            u02 = this;
            interfaceC0947H2 = interfaceC0947H2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p0.InterfaceC0945F
    public final int g(InterfaceC0977m interfaceC0977m, List list, int i2) {
        return b(interfaceC0977m, list, i2, O.f1530m);
    }

    @Override // p0.InterfaceC0945F
    public final int h(InterfaceC0977m interfaceC0977m, List list, int i2) {
        return c(interfaceC0977m, list, i2, O.f1531n);
    }
}
