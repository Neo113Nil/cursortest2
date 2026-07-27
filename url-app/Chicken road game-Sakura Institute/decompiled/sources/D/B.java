package D;

import G.C0192d;
import G.C0216p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.C0847u;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0964Z;
import q.C1014S;
import z2.C1412P;
import z2.C1441y;

/* loaded from: classes.dex */
public final class B extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1182e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O.a f1183i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1184j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1185k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1186l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1187m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1188n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(int i2, Function2 function2, O.a aVar, Function2 function22, Function2 function23, E.g gVar, Function2 function24) {
        super(2);
        this.f1181d = 1;
        this.f1182e = i2;
        this.f1184j = function2;
        this.f1183i = aVar;
        this.f1185k = function22;
        this.f1186l = function23;
        this.f1187m = gVar;
        this.f1188n = function24;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        ArrayList arrayList2;
        Z z4;
        Object obj6;
        Integer num2;
        InterfaceC0946G t4;
        int l4;
        int c4;
        Object obj7;
        Object obj8;
        int l5;
        int l6;
        switch (this.f1181d) {
            case 0:
                ((Number) obj2).intValue();
                W0.c((S.o) this.f1184j, (Z.P) this.f1185k, (C0182y) this.f1186l, (C0184z) this.f1187m, (C0847u) this.f1188n, this.f1183i, (C0216p) obj, C0192d.U(this.f1182e | 1));
                return Unit.f7487a;
            case 1:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    AbstractC0122c1.b(this.f1182e, (Function2) this.f1184j, this.f1183i, (Function2) this.f1185k, (Function2) this.f1186l, (E.g) this.f1187m, (Function2) this.f1188n, c0216p, 0);
                }
                return Unit.f7487a;
            case 2:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    q.m0 m0Var = (q.m0) this.f1184j;
                    InterfaceC0964Z interfaceC0964Z = (InterfaceC0964Z) this.f1185k;
                    C1014S c1014s = new C1014S(m0Var, interfaceC0964Z);
                    this.f1183i.g(new q.a0(androidx.compose.foundation.layout.b.e(c1014s, interfaceC0964Z.getLayoutDirection()), ((ArrayList) this.f1186l).isEmpty() ? c1014s.d() : interfaceC0964Z.i0(this.f1182e), androidx.compose.foundation.layout.b.d(c1014s, interfaceC0964Z.getLayoutDirection()), (((ArrayList) this.f1187m).isEmpty() || (num = (Integer) this.f1188n) == null) ? c1014s.c() : interfaceC0964Z.i0(num.intValue())), c0216p2, 0);
                }
                return Unit.f7487a;
            case 3:
                InterfaceC0964Z interfaceC0964Z2 = (InterfaceC0964Z) obj;
                long j4 = ((M0.a) obj2).f3539a;
                int i2 = M0.a.i(j4);
                int h4 = M0.a.h(j4);
                long b4 = M0.a.b(j4, 0, 0, 0, 0, 10);
                List v4 = interfaceC0964Z2.v(EnumC0125d1.f1743d, (Function2) this.f1184j);
                ArrayList arrayList3 = new ArrayList(v4.size());
                int size = v4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList3.add(((InterfaceC0944E) v4.get(i4)).a(b4));
                }
                if (arrayList3.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i5 = ((AbstractC0954O) obj3).f9006e;
                    int d4 = C1441y.d(arrayList3);
                    if (1 <= d4) {
                        int i6 = 1;
                        while (true) {
                            Object obj9 = arrayList3.get(i6);
                            int i7 = ((AbstractC0954O) obj9).f9006e;
                            if (i5 < i7) {
                                obj3 = obj9;
                                i5 = i7;
                            }
                            if (i6 != d4) {
                                i6++;
                            }
                        }
                    }
                }
                AbstractC0954O abstractC0954O = (AbstractC0954O) obj3;
                int i8 = abstractC0954O != null ? abstractC0954O.f9006e : 0;
                List v5 = interfaceC0964Z2.v(EnumC0125d1.f1745i, (Function2) this.f1185k);
                ArrayList arrayList4 = new ArrayList(v5.size());
                int size2 = v5.size();
                int i9 = 0;
                while (true) {
                    q.m0 m0Var2 = (q.m0) this.f1187m;
                    if (i9 >= size2) {
                        if (arrayList4.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList4.get(0);
                            int i10 = ((AbstractC0954O) obj4).f9006e;
                            int d5 = C1441y.d(arrayList4);
                            if (1 <= d5) {
                                Object obj10 = obj4;
                                int i11 = i10;
                                int i12 = 1;
                                while (true) {
                                    Object obj11 = arrayList4.get(i12);
                                    int i13 = ((AbstractC0954O) obj11).f9006e;
                                    if (i11 < i13) {
                                        obj10 = obj11;
                                        i11 = i13;
                                    }
                                    if (i12 != d5) {
                                        i12++;
                                    } else {
                                        obj4 = obj10;
                                    }
                                }
                            }
                        }
                        AbstractC0954O abstractC0954O2 = (AbstractC0954O) obj4;
                        int i14 = abstractC0954O2 != null ? abstractC0954O2.f9006e : 0;
                        if (arrayList4.isEmpty()) {
                            arrayList = arrayList4;
                            obj5 = null;
                        } else {
                            obj5 = arrayList4.get(0);
                            int i15 = ((AbstractC0954O) obj5).f9005d;
                            int d6 = C1441y.d(arrayList4);
                            if (1 <= d6) {
                                Object obj12 = obj5;
                                int i16 = i15;
                                int i17 = 1;
                                while (true) {
                                    Object obj13 = arrayList4.get(i17);
                                    arrayList = arrayList4;
                                    int i18 = ((AbstractC0954O) obj13).f9005d;
                                    if (i16 < i18) {
                                        i16 = i18;
                                        obj12 = obj13;
                                    }
                                    if (i17 != d6) {
                                        i17++;
                                        arrayList4 = arrayList;
                                    } else {
                                        obj5 = obj12;
                                    }
                                }
                            } else {
                                arrayList = arrayList4;
                            }
                        }
                        AbstractC0954O abstractC0954O3 = (AbstractC0954O) obj5;
                        int i19 = abstractC0954O3 != null ? abstractC0954O3.f9005d : 0;
                        List v6 = interfaceC0964Z2.v(EnumC0125d1.f1746j, (Function2) this.f1186l);
                        ArrayList arrayList5 = new ArrayList(v6.size());
                        int size3 = v6.size();
                        int i20 = 0;
                        while (i20 < size3) {
                            List list = v6;
                            int i21 = size3;
                            AbstractC0954O a4 = ((InterfaceC0944E) v6.get(i20)).a(u3.d.Q((-m0Var2.d(interfaceC0964Z2, interfaceC0964Z2.getLayoutDirection())) - m0Var2.b(interfaceC0964Z2, interfaceC0964Z2.getLayoutDirection()), -m0Var2.c(interfaceC0964Z2), b4));
                            if (a4.f9006e == 0 || a4.f9005d == 0) {
                                a4 = null;
                            }
                            if (a4 != null) {
                                arrayList5.add(a4);
                            }
                            i20++;
                            v6 = list;
                            size3 = i21;
                        }
                        boolean isEmpty = arrayList5.isEmpty();
                        int i22 = this.f1182e;
                        if (isEmpty) {
                            arrayList2 = arrayList5;
                            z4 = null;
                        } else {
                            if (arrayList5.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList5.get(0);
                                int i23 = ((AbstractC0954O) obj7).f9005d;
                                int d7 = C1441y.d(arrayList5);
                                if (1 <= d7) {
                                    int i24 = i23;
                                    int i25 = 1;
                                    while (true) {
                                        Object obj14 = arrayList5.get(i25);
                                        Object obj15 = obj7;
                                        int i26 = ((AbstractC0954O) obj14).f9005d;
                                        if (i24 < i26) {
                                            i24 = i26;
                                            obj7 = obj14;
                                        } else {
                                            obj7 = obj15;
                                        }
                                        if (i25 != d7) {
                                            i25++;
                                        }
                                    }
                                }
                            }
                            Intrinsics.c(obj7);
                            int i27 = ((AbstractC0954O) obj7).f9005d;
                            if (arrayList5.isEmpty()) {
                                arrayList2 = arrayList5;
                                obj8 = null;
                            } else {
                                obj8 = arrayList5.get(0);
                                int i28 = ((AbstractC0954O) obj8).f9006e;
                                int d8 = C1441y.d(arrayList5);
                                if (1 <= d8) {
                                    int i29 = 1;
                                    Object obj16 = obj8;
                                    int i30 = i28;
                                    while (true) {
                                        Object obj17 = arrayList5.get(i29);
                                        arrayList2 = arrayList5;
                                        int i31 = ((AbstractC0954O) obj17).f9006e;
                                        if (i30 < i31) {
                                            i30 = i31;
                                            obj16 = obj17;
                                        }
                                        if (i29 != d8) {
                                            i29++;
                                            arrayList5 = arrayList2;
                                        } else {
                                            obj8 = obj16;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList5;
                                }
                            }
                            Intrinsics.c(obj8);
                            int i32 = ((AbstractC0954O) obj8).f9006e;
                            boolean z5 = i22 == 0;
                            M0.k kVar = M0.k.f3555d;
                            if (!z5) {
                                if (i22 != 2 && i22 != 3) {
                                    l5 = (i2 - i27) / 2;
                                } else if (interfaceC0964Z2.getLayoutDirection() == kVar) {
                                    l6 = interfaceC0964Z2.l(AbstractC0122c1.f1731a);
                                    l5 = (i2 - l6) - i27;
                                } else {
                                    l5 = interfaceC0964Z2.l(AbstractC0122c1.f1731a);
                                }
                                z4 = new Z(l5, i32);
                            } else if (interfaceC0964Z2.getLayoutDirection() == kVar) {
                                l5 = interfaceC0964Z2.l(AbstractC0122c1.f1731a);
                                z4 = new Z(l5, i32);
                            } else {
                                l6 = interfaceC0964Z2.l(AbstractC0122c1.f1731a);
                                l5 = (i2 - l6) - i27;
                                z4 = new Z(l5, i32);
                            }
                        }
                        List v7 = interfaceC0964Z2.v(EnumC0125d1.f1747k, new O.a(-2146438447, true, new C0117b((Function2) this.f1188n, 2)));
                        ArrayList arrayList6 = new ArrayList(v7.size());
                        int size4 = v7.size();
                        for (int i33 = 0; i33 < size4; i33++) {
                            arrayList6.add(((InterfaceC0944E) v7.get(i33)).a(b4));
                        }
                        if (arrayList6.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList6.get(0);
                            int i34 = ((AbstractC0954O) obj6).f9006e;
                            int d9 = C1441y.d(arrayList6);
                            int i35 = 1;
                            if (1 <= d9) {
                                while (true) {
                                    Object obj18 = arrayList6.get(i35);
                                    Object obj19 = obj6;
                                    int i36 = ((AbstractC0954O) obj18).f9006e;
                                    if (i34 < i36) {
                                        i34 = i36;
                                        obj6 = obj18;
                                    } else {
                                        obj6 = obj19;
                                    }
                                    if (i35 != d9) {
                                        i35++;
                                    }
                                }
                            }
                        }
                        AbstractC0954O abstractC0954O4 = (AbstractC0954O) obj6;
                        Integer valueOf = abstractC0954O4 != null ? Integer.valueOf(abstractC0954O4.f9006e) : null;
                        if (z4 != null) {
                            int i37 = z4.f1686b;
                            if (valueOf == null || i22 == 3) {
                                l4 = interfaceC0964Z2.l(AbstractC0122c1.f1731a) + i37;
                                c4 = m0Var2.c(interfaceC0964Z2);
                            } else {
                                l4 = valueOf.intValue() + i37;
                                c4 = interfaceC0964Z2.l(AbstractC0122c1.f1731a);
                            }
                            num2 = Integer.valueOf(c4 + l4);
                        } else {
                            num2 = null;
                        }
                        int intValue = i14 != 0 ? i14 + (num2 != null ? num2.intValue() : valueOf != null ? valueOf.intValue() : m0Var2.c(interfaceC0964Z2)) : 0;
                        Z z6 = z4;
                        List v8 = interfaceC0964Z2.v(EnumC0125d1.f1744e, new O.a(-1213360416, true, new B((q.m0) this.f1187m, interfaceC0964Z2, arrayList3, i8, arrayList6, valueOf, this.f1183i, 2)));
                        ArrayList arrayList7 = new ArrayList(v8.size());
                        int size5 = v8.size();
                        for (int i38 = 0; i38 < size5; i38++) {
                            arrayList7.add(((InterfaceC0944E) v8.get(i38)).a(b4));
                        }
                        t4 = interfaceC0964Z2.t(i2, h4, C1412P.c(), new C0116a1(arrayList7, arrayList3, arrayList, arrayList6, z6, i2, i19, (q.m0) this.f1187m, interfaceC0964Z2, h4, intValue, valueOf, arrayList2, num2));
                        return t4;
                    }
                    arrayList4.add(((InterfaceC0944E) v5.get(i9)).a(u3.d.Q((-m0Var2.d(interfaceC0964Z2, interfaceC0964Z2.getLayoutDirection())) - m0Var2.b(interfaceC0964Z2, interfaceC0964Z2.getLayoutDirection()), -m0Var2.c(interfaceC0964Z2), b4)));
                    i9++;
                }
                break;
            default:
                ((Number) obj2).intValue();
                j0.c.b((l.m0) this.f1185k, (S.o) this.f1184j, (Function1) this.f1186l, (S.c) this.f1187m, (Function1) this.f1188n, this.f1183i, (C0216p) obj, C0192d.U(this.f1182e | 1));
                return Unit.f7487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(S.o oVar, Z.P p4, C0182y c0182y, C0184z c0184z, C0847u c0847u, O.a aVar, int i2) {
        super(2);
        this.f1181d = 0;
        this.f1184j = oVar;
        this.f1185k = p4;
        this.f1186l = c0182y;
        this.f1187m = c0184z;
        this.f1188n = c0847u;
        this.f1183i = aVar;
        this.f1182e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(Object obj, Object obj2, Object obj3, int i2, Object obj4, Object obj5, O.a aVar, int i4) {
        super(2);
        this.f1181d = i4;
        this.f1184j = obj;
        this.f1185k = obj2;
        this.f1186l = obj3;
        this.f1182e = i2;
        this.f1187m = obj4;
        this.f1188n = obj5;
        this.f1183i = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(l.m0 m0Var, S.o oVar, Function1 function1, S.c cVar, Function1 function12, O.a aVar, int i2) {
        super(2);
        this.f1181d = 4;
        this.f1185k = m0Var;
        this.f1184j = oVar;
        this.f1186l = function1;
        this.f1187m = cVar;
        this.f1188n = function12;
        this.f1183i = aVar;
        this.f1182e = i2;
    }
}
