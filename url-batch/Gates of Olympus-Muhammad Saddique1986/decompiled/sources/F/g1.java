package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.List;
import r.C0843E;
import r.C0850L;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0902Y;

/* loaded from: classes.dex */
public final class g1 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1545e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f1547g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1548h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1549i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1550j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1551k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1552l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(int i3, InterfaceC0426e interfaceC0426e, Q.a aVar, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, G.l lVar, InterfaceC0426e interfaceC0426e4) {
        super(2);
        this.f1546f = i3;
        this.f1548h = interfaceC0426e;
        this.f1547g = aVar;
        this.f1549i = interfaceC0426e2;
        this.f1550j = interfaceC0426e3;
        this.f1552l = lVar;
        this.f1551k = interfaceC0426e4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        Z z3;
        Object obj6;
        Integer num2;
        int l3;
        int d3;
        Object obj7;
        Object obj8;
        int l4;
        int l5;
        switch (this.f1545e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    j1.b(this.f1546f, (InterfaceC0426e) this.f1548h, this.f1547g, (InterfaceC0426e) this.f1549i, (InterfaceC0426e) this.f1550j, (G.l) this.f1552l, (InterfaceC0426e) this.f1551k, c0167p, 0);
                }
                return R1.y.f4171a;
            case 1:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    r.X x3 = (r.X) this.f1548h;
                    InterfaceC0902Y interfaceC0902Y = (InterfaceC0902Y) this.f1549i;
                    C0843E c0843e = new C0843E(x3, interfaceC0902Y);
                    this.f1547g.g(new C0850L(androidx.compose.foundation.layout.b.d(c0843e, interfaceC0902Y.getLayoutDirection()), ((ArrayList) this.f1550j).isEmpty() ? c0843e.d() : interfaceC0902Y.Y(this.f1546f), androidx.compose.foundation.layout.b.c(c0843e, interfaceC0902Y.getLayoutDirection()), (((ArrayList) this.f1551k).isEmpty() || (num = (Integer) this.f1552l) == null) ? c0843e.c() : interfaceC0902Y.Y(num.intValue())), c0167p2, 0);
                }
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC0902Y interfaceC0902Y2 = (InterfaceC0902Y) obj;
                long j3 = ((O0.a) obj2).f3725a;
                int h3 = O0.a.h(j3);
                int g3 = O0.a.g(j3);
                long a3 = O0.a.a(j3, 0, 0, 0, 0, 10);
                List l02 = interfaceC0902Y2.l0(k1.f1638d, (InterfaceC0426e) this.f1548h);
                ArrayList arrayList2 = new ArrayList(l02.size());
                int size = l02.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add(((InterfaceC0884F) l02.get(i3)).b(a3));
                }
                if (arrayList2.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i4 = ((AbstractC0893O) obj3).f8127e;
                    int z02 = S1.m.z0(arrayList2);
                    if (1 <= z02) {
                        int i5 = 1;
                        while (true) {
                            Object obj9 = arrayList2.get(i5);
                            int i6 = ((AbstractC0893O) obj9).f8127e;
                            if (i4 < i6) {
                                obj3 = obj9;
                                i4 = i6;
                            }
                            if (i5 != z02) {
                                i5++;
                            }
                        }
                    }
                }
                AbstractC0893O abstractC0893O = (AbstractC0893O) obj3;
                int i7 = abstractC0893O != null ? abstractC0893O.f8127e : 0;
                List l03 = interfaceC0902Y2.l0(k1.f1640f, (InterfaceC0426e) this.f1549i);
                ArrayList arrayList3 = new ArrayList(l03.size());
                int size2 = l03.size();
                int i8 = 0;
                while (true) {
                    r.X x4 = (r.X) this.f1552l;
                    if (i8 >= size2) {
                        int i9 = g3;
                        if (arrayList3.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList3.get(0);
                            int i10 = ((AbstractC0893O) obj4).f8127e;
                            int z03 = S1.m.z0(arrayList3);
                            if (1 <= z03) {
                                Object obj10 = obj4;
                                int i11 = i10;
                                int i12 = 1;
                                while (true) {
                                    Object obj11 = arrayList3.get(i12);
                                    int i13 = ((AbstractC0893O) obj11).f8127e;
                                    if (i11 < i13) {
                                        obj10 = obj11;
                                        i11 = i13;
                                    }
                                    if (i12 != z03) {
                                        i12++;
                                    } else {
                                        obj4 = obj10;
                                    }
                                }
                            }
                        }
                        AbstractC0893O abstractC0893O2 = (AbstractC0893O) obj4;
                        int i14 = abstractC0893O2 != null ? abstractC0893O2.f8127e : 0;
                        if (arrayList3.isEmpty()) {
                            obj5 = null;
                        } else {
                            obj5 = arrayList3.get(0);
                            int i15 = ((AbstractC0893O) obj5).f8126d;
                            int z04 = S1.m.z0(arrayList3);
                            if (1 <= z04) {
                                Object obj12 = obj5;
                                int i16 = i15;
                                int i17 = 1;
                                while (true) {
                                    Object obj13 = arrayList3.get(i17);
                                    int i18 = ((AbstractC0893O) obj13).f8126d;
                                    if (i16 < i18) {
                                        obj12 = obj13;
                                        i16 = i18;
                                    }
                                    if (i17 != z04) {
                                        i17++;
                                    } else {
                                        obj5 = obj12;
                                    }
                                }
                            }
                        }
                        AbstractC0893O abstractC0893O3 = (AbstractC0893O) obj5;
                        int i19 = abstractC0893O3 != null ? abstractC0893O3.f8126d : 0;
                        List l04 = interfaceC0902Y2.l0(k1.f1641g, (InterfaceC0426e) this.f1550j);
                        ArrayList arrayList4 = new ArrayList(l04.size());
                        int size3 = l04.size();
                        int i20 = 0;
                        while (i20 < size3) {
                            List list = l04;
                            int i21 = size3;
                            ArrayList arrayList5 = arrayList3;
                            AbstractC0893O b3 = ((InterfaceC0884F) l04.get(i20)).b(O2.d.Y((-x4.a(interfaceC0902Y2, interfaceC0902Y2.getLayoutDirection())) - x4.c(interfaceC0902Y2, interfaceC0902Y2.getLayoutDirection()), -x4.d(interfaceC0902Y2), a3));
                            if (b3.f8127e == 0 || b3.f8126d == 0) {
                                b3 = null;
                            }
                            if (b3 != null) {
                                arrayList4.add(b3);
                            }
                            i20++;
                            l04 = list;
                            size3 = i21;
                            arrayList3 = arrayList5;
                        }
                        ArrayList arrayList6 = arrayList3;
                        boolean isEmpty = arrayList4.isEmpty();
                        int i22 = this.f1546f;
                        if (isEmpty) {
                            arrayList = arrayList4;
                            z3 = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList4.get(0);
                                int i23 = ((AbstractC0893O) obj7).f8126d;
                                int z05 = S1.m.z0(arrayList4);
                                if (1 <= z05) {
                                    int i24 = i23;
                                    int i25 = 1;
                                    while (true) {
                                        Object obj14 = arrayList4.get(i25);
                                        Object obj15 = obj7;
                                        int i26 = ((AbstractC0893O) obj14).f8126d;
                                        if (i24 < i26) {
                                            i24 = i26;
                                            obj7 = obj14;
                                        } else {
                                            obj7 = obj15;
                                        }
                                        if (i25 != z05) {
                                            i25++;
                                        }
                                    }
                                }
                            }
                            f2.j.c(obj7);
                            int i27 = ((AbstractC0893O) obj7).f8126d;
                            if (arrayList4.isEmpty()) {
                                arrayList = arrayList4;
                                obj8 = null;
                            } else {
                                obj8 = arrayList4.get(0);
                                int i28 = ((AbstractC0893O) obj8).f8127e;
                                int z06 = S1.m.z0(arrayList4);
                                if (1 <= z06) {
                                    int i29 = 1;
                                    Object obj16 = obj8;
                                    int i30 = i28;
                                    while (true) {
                                        Object obj17 = arrayList4.get(i29);
                                        arrayList = arrayList4;
                                        int i31 = ((AbstractC0893O) obj17).f8127e;
                                        if (i30 < i31) {
                                            i30 = i31;
                                            obj16 = obj17;
                                        }
                                        if (i29 != z06) {
                                            i29++;
                                            arrayList4 = arrayList;
                                        } else {
                                            obj8 = obj16;
                                        }
                                    }
                                } else {
                                    arrayList = arrayList4;
                                }
                            }
                            f2.j.c(obj8);
                            int i32 = ((AbstractC0893O) obj8).f8127e;
                            boolean z4 = i22 == 0;
                            O0.k kVar = O0.k.f3741d;
                            if (!z4) {
                                if (i22 != 2 && i22 != 3) {
                                    l4 = (h3 - i27) / 2;
                                } else if (interfaceC0902Y2.getLayoutDirection() == kVar) {
                                    l5 = interfaceC0902Y2.l(j1.f1609a);
                                    l4 = (h3 - l5) - i27;
                                } else {
                                    l4 = interfaceC0902Y2.l(j1.f1609a);
                                }
                                z3 = new Z(l4, i32);
                            } else if (interfaceC0902Y2.getLayoutDirection() == kVar) {
                                l4 = interfaceC0902Y2.l(j1.f1609a);
                                z3 = new Z(l4, i32);
                            } else {
                                l5 = interfaceC0902Y2.l(j1.f1609a);
                                l4 = (h3 - l5) - i27;
                                z3 = new Z(l4, i32);
                            }
                        }
                        int i33 = i19;
                        List l05 = interfaceC0902Y2.l0(k1.f1642h, new Q.a(-2146438447, new C0084b((InterfaceC0426e) this.f1551k, 4), true));
                        ArrayList arrayList7 = new ArrayList(l05.size());
                        int size4 = l05.size();
                        for (int i34 = 0; i34 < size4; i34++) {
                            arrayList7.add(((InterfaceC0884F) l05.get(i34)).b(a3));
                        }
                        if (arrayList7.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList7.get(0);
                            int i35 = ((AbstractC0893O) obj6).f8127e;
                            int z07 = S1.m.z0(arrayList7);
                            int i36 = 1;
                            if (1 <= z07) {
                                while (true) {
                                    Object obj18 = arrayList7.get(i36);
                                    Object obj19 = obj6;
                                    int i37 = ((AbstractC0893O) obj18).f8127e;
                                    if (i35 < i37) {
                                        i35 = i37;
                                        obj6 = obj18;
                                    } else {
                                        obj6 = obj19;
                                    }
                                    if (i36 != z07) {
                                        i36++;
                                    }
                                }
                            }
                        }
                        AbstractC0893O abstractC0893O4 = (AbstractC0893O) obj6;
                        Integer valueOf = abstractC0893O4 != null ? Integer.valueOf(abstractC0893O4.f8127e) : null;
                        if (z3 != null) {
                            int i38 = z3.f1458b;
                            if (valueOf == null || i22 == 3) {
                                l3 = interfaceC0902Y2.l(j1.f1609a) + i38;
                                d3 = x4.d(interfaceC0902Y2);
                            } else {
                                l3 = valueOf.intValue() + i38;
                                d3 = interfaceC0902Y2.l(j1.f1609a);
                            }
                            num2 = Integer.valueOf(d3 + l3);
                        } else {
                            num2 = null;
                        }
                        int intValue = i14 != 0 ? i14 + (num2 != null ? num2.intValue() : valueOf != null ? valueOf.intValue() : x4.d(interfaceC0902Y2)) : 0;
                        Z z5 = z3;
                        List l06 = interfaceC0902Y2.l0(k1.f1639e, new Q.a(-1213360416, new g1((r.X) this.f1552l, interfaceC0902Y2, arrayList2, i7, arrayList7, valueOf, this.f1547g), true));
                        ArrayList arrayList8 = new ArrayList(l06.size());
                        int size5 = l06.size();
                        for (int i39 = 0; i39 < size5; i39++) {
                            arrayList8.add(((InterfaceC0884F) l06.get(i39)).b(a3));
                        }
                        return interfaceC0902Y2.i0(h3, i9, S1.v.f4321d, new i1(arrayList8, arrayList2, arrayList6, arrayList7, z5, h3, i33, (r.X) this.f1552l, interfaceC0902Y2, i9, intValue, valueOf, arrayList, num2));
                    }
                    arrayList3.add(((InterfaceC0884F) l03.get(i8)).b(O2.d.Y((-x4.a(interfaceC0902Y2, interfaceC0902Y2.getLayoutDirection())) - x4.c(interfaceC0902Y2, interfaceC0902Y2.getLayoutDirection()), -x4.d(interfaceC0902Y2), a3)));
                    i8++;
                    g3 = g3;
                }
                break;
            default:
                ((Number) obj2).intValue();
                O2.l.F((m.l0) this.f1548h, (U.q) this.f1549i, (InterfaceC0424c) this.f1550j, (U.d) this.f1551k, (InterfaceC0424c) this.f1552l, this.f1547g, (C0167p) obj, C0143d.U(this.f1546f | 1));
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, int i3, r.X x3, InterfaceC0426e interfaceC0426e4, Q.a aVar) {
        super(2);
        this.f1548h = interfaceC0426e;
        this.f1549i = interfaceC0426e2;
        this.f1550j = interfaceC0426e3;
        this.f1546f = i3;
        this.f1552l = x3;
        this.f1551k = interfaceC0426e4;
        this.f1547g = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(m.l0 l0Var, U.q qVar, InterfaceC0424c interfaceC0424c, U.d dVar, InterfaceC0424c interfaceC0424c2, Q.a aVar, int i3) {
        super(2);
        this.f1548h = l0Var;
        this.f1549i = qVar;
        this.f1550j = interfaceC0424c;
        this.f1551k = dVar;
        this.f1552l = interfaceC0424c2;
        this.f1547g = aVar;
        this.f1546f = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(r.X x3, InterfaceC0902Y interfaceC0902Y, ArrayList arrayList, int i3, ArrayList arrayList2, Integer num, Q.a aVar) {
        super(2);
        this.f1548h = x3;
        this.f1549i = interfaceC0902Y;
        this.f1550j = arrayList;
        this.f1546f = i3;
        this.f1551k = arrayList2;
        this.f1552l = num;
        this.f1547g = aVar;
    }
}
