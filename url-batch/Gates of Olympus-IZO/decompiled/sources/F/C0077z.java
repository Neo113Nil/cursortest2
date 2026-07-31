package F;

import I.C0089d;
import I.C0113p;
import b0.InterfaceC0263N;
import h.AbstractC0416e;
import h1.C0438i;
import java.util.ArrayList;
import java.util.List;
import n.C0665u;
import r.C0791C;
import r.C0797I;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077z extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f1434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1435h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1436i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1437j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1438k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1439l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077z(int i3, Y1.e eVar, Q.a aVar, Y1.e eVar2, Y1.e eVar3, G.f fVar, Y1.e eVar4) {
        super(2);
        this.f1432e = 1;
        this.f1433f = i3;
        this.f1435h = eVar;
        this.f1434g = aVar;
        this.f1436i = eVar2;
        this.f1437j = eVar3;
        this.f1438k = fVar;
        this.f1439l = eVar4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        ArrayList arrayList2;
        T t3;
        Object obj6;
        Integer num2;
        int k3;
        int c3;
        Object obj7;
        Object obj8;
        int k4;
        int k5;
        switch (this.f1432e) {
            case 0:
                ((Number) obj2).intValue();
                A0.b((U.l) this.f1435h, (InterfaceC0263N) this.f1436i, (C0067u) this.f1437j, (C0073x) this.f1438k, (C0665u) this.f1439l, this.f1434g, (C0113p) obj, C0089d.T(this.f1433f | 1));
                return L1.z.f2729a;
            case 1:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    H0.b(this.f1433f, (Y1.e) this.f1435h, this.f1434g, (Y1.e) this.f1436i, (Y1.e) this.f1437j, (G.f) this.f1438k, (Y1.e) this.f1439l, c0113p, 0);
                }
                return L1.z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    r.U u3 = (r.U) this.f1435h;
                    r0.Q q2 = (r0.Q) this.f1436i;
                    C0791C c0791c = new C0791C(u3, q2);
                    this.f1434g.f(new C0797I(androidx.compose.foundation.layout.a.e(c0791c, q2.getLayoutDirection()), ((ArrayList) this.f1437j).isEmpty() ? c0791c.d() : q2.Z(this.f1433f), androidx.compose.foundation.layout.a.d(c0791c, q2.getLayoutDirection()), (((ArrayList) this.f1438k).isEmpty() || (num = (Integer) this.f1439l) == null) ? c0791c.c() : q2.Z(num.intValue())), c0113p2, 0);
                }
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                r0.Q q3 = (r0.Q) obj;
                long j3 = ((M0.a) obj2).f2760a;
                int h3 = M0.a.h(j3);
                int g3 = M0.a.g(j3);
                long a3 = M0.a.a(j3, 0, 0, 0, 0, 10);
                List X2 = q3.X(I0.f972d, (Y1.e) this.f1435h);
                ArrayList arrayList3 = new ArrayList(X2.size());
                int size = X2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList3.add(((r0.z) X2.get(i3)).b(a3));
                }
                if (arrayList3.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i4 = ((r0.H) obj3).f7115e;
                    int b02 = M1.m.b0(arrayList3);
                    if (1 <= b02) {
                        int i5 = 1;
                        while (true) {
                            Object obj9 = arrayList3.get(i5);
                            int i6 = ((r0.H) obj9).f7115e;
                            if (i4 < i6) {
                                obj3 = obj9;
                                i4 = i6;
                            }
                            if (i5 != b02) {
                                i5++;
                            }
                        }
                    }
                }
                r0.H h4 = (r0.H) obj3;
                int i7 = h4 != null ? h4.f7115e : 0;
                List X3 = q3.X(I0.f974f, (Y1.e) this.f1436i);
                ArrayList arrayList4 = new ArrayList(X3.size());
                int size2 = X3.size();
                int i8 = 0;
                while (true) {
                    r.U u4 = (r.U) this.f1438k;
                    if (i8 >= size2) {
                        if (arrayList4.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList4.get(0);
                            int i9 = ((r0.H) obj4).f7115e;
                            int b03 = M1.m.b0(arrayList4);
                            if (1 <= b03) {
                                Object obj10 = obj4;
                                int i10 = i9;
                                int i11 = 1;
                                while (true) {
                                    Object obj11 = arrayList4.get(i11);
                                    int i12 = ((r0.H) obj11).f7115e;
                                    if (i10 < i12) {
                                        obj10 = obj11;
                                        i10 = i12;
                                    }
                                    if (i11 != b03) {
                                        i11++;
                                    } else {
                                        obj4 = obj10;
                                    }
                                }
                            }
                        }
                        r0.H h5 = (r0.H) obj4;
                        int i13 = h5 != null ? h5.f7115e : 0;
                        if (arrayList4.isEmpty()) {
                            arrayList = arrayList4;
                            obj5 = null;
                        } else {
                            obj5 = arrayList4.get(0);
                            int i14 = ((r0.H) obj5).f7114d;
                            int b04 = M1.m.b0(arrayList4);
                            if (1 <= b04) {
                                Object obj12 = obj5;
                                int i15 = i14;
                                int i16 = 1;
                                while (true) {
                                    Object obj13 = arrayList4.get(i16);
                                    arrayList = arrayList4;
                                    int i17 = ((r0.H) obj13).f7114d;
                                    if (i15 < i17) {
                                        i15 = i17;
                                        obj12 = obj13;
                                    }
                                    if (i16 != b04) {
                                        i16++;
                                        arrayList4 = arrayList;
                                    } else {
                                        obj5 = obj12;
                                    }
                                }
                            } else {
                                arrayList = arrayList4;
                            }
                        }
                        r0.H h6 = (r0.H) obj5;
                        int i18 = h6 != null ? h6.f7114d : 0;
                        List X4 = q3.X(I0.f975g, (Y1.e) this.f1437j);
                        ArrayList arrayList5 = new ArrayList(X4.size());
                        int size3 = X4.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            List list = X4;
                            int i20 = size3;
                            r0.H b2 = ((r0.z) X4.get(i19)).b(I2.l.J((-u4.d(q3, q3.getLayoutDirection())) - u4.b(q3, q3.getLayoutDirection()), -u4.c(q3), a3));
                            if (b2.f7115e == 0 || b2.f7114d == 0) {
                                b2 = null;
                            }
                            if (b2 != null) {
                                arrayList5.add(b2);
                            }
                            i19++;
                            X4 = list;
                            size3 = i20;
                        }
                        boolean isEmpty = arrayList5.isEmpty();
                        int i21 = this.f1433f;
                        if (isEmpty) {
                            arrayList2 = arrayList5;
                            t3 = null;
                        } else {
                            if (arrayList5.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList5.get(0);
                                int i22 = ((r0.H) obj7).f7114d;
                                int b05 = M1.m.b0(arrayList5);
                                if (1 <= b05) {
                                    int i23 = i22;
                                    int i24 = 1;
                                    while (true) {
                                        Object obj14 = arrayList5.get(i24);
                                        Object obj15 = obj7;
                                        int i25 = ((r0.H) obj14).f7114d;
                                        if (i23 < i25) {
                                            i23 = i25;
                                            obj7 = obj14;
                                        } else {
                                            obj7 = obj15;
                                        }
                                        if (i24 != b05) {
                                            i24++;
                                        }
                                    }
                                }
                            }
                            Z1.i.c(obj7);
                            int i26 = ((r0.H) obj7).f7114d;
                            if (arrayList5.isEmpty()) {
                                arrayList2 = arrayList5;
                                obj8 = null;
                            } else {
                                obj8 = arrayList5.get(0);
                                int i27 = ((r0.H) obj8).f7115e;
                                int b06 = M1.m.b0(arrayList5);
                                if (1 <= b06) {
                                    int i28 = 1;
                                    Object obj16 = obj8;
                                    int i29 = i27;
                                    while (true) {
                                        Object obj17 = arrayList5.get(i28);
                                        arrayList2 = arrayList5;
                                        int i30 = ((r0.H) obj17).f7115e;
                                        if (i29 < i30) {
                                            i29 = i30;
                                            obj16 = obj17;
                                        }
                                        if (i28 != b06) {
                                            i28++;
                                            arrayList5 = arrayList2;
                                        } else {
                                            obj8 = obj16;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList5;
                                }
                            }
                            Z1.i.c(obj8);
                            int i31 = ((r0.H) obj8).f7115e;
                            boolean z3 = i21 == 0;
                            M0.j jVar = M0.j.f2775d;
                            if (!z3) {
                                if (i21 != 2 && i21 != 3) {
                                    k4 = (h3 - i26) / 2;
                                } else if (q3.getLayoutDirection() == jVar) {
                                    k5 = q3.k(H0.f969a);
                                    k4 = (h3 - k5) - i26;
                                } else {
                                    k4 = q3.k(H0.f969a);
                                }
                                t3 = new T(k4, i31);
                            } else if (q3.getLayoutDirection() == jVar) {
                                k4 = q3.k(H0.f969a);
                                t3 = new T(k4, i31);
                            } else {
                                k5 = q3.k(H0.f969a);
                                k4 = (h3 - k5) - i26;
                                t3 = new T(k4, i31);
                            }
                        }
                        List X5 = q3.X(I0.f976h, new Q.a(-2146438447, new C0036e(2, (Y1.e) this.f1439l), true));
                        ArrayList arrayList6 = new ArrayList(X5.size());
                        int size4 = X5.size();
                        for (int i32 = 0; i32 < size4; i32++) {
                            arrayList6.add(((r0.z) X5.get(i32)).b(a3));
                        }
                        if (arrayList6.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList6.get(0);
                            int i33 = ((r0.H) obj6).f7115e;
                            int b07 = M1.m.b0(arrayList6);
                            int i34 = 1;
                            if (1 <= b07) {
                                while (true) {
                                    Object obj18 = arrayList6.get(i34);
                                    Object obj19 = obj6;
                                    int i35 = ((r0.H) obj18).f7115e;
                                    if (i33 < i35) {
                                        i33 = i35;
                                        obj6 = obj18;
                                    } else {
                                        obj6 = obj19;
                                    }
                                    if (i34 != b07) {
                                        i34++;
                                    }
                                }
                            }
                        }
                        r0.H h7 = (r0.H) obj6;
                        Integer valueOf = h7 != null ? Integer.valueOf(h7.f7115e) : null;
                        if (t3 != null) {
                            int i36 = t3.f1106b;
                            if (valueOf == null || i21 == 3) {
                                k3 = q3.k(H0.f969a) + i36;
                                c3 = u4.c(q3);
                            } else {
                                k3 = valueOf.intValue() + i36;
                                c3 = q3.k(H0.f969a);
                            }
                            num2 = Integer.valueOf(c3 + k3);
                        } else {
                            num2 = null;
                        }
                        int intValue = i13 != 0 ? i13 + (num2 != null ? num2.intValue() : valueOf != null ? valueOf.intValue() : u4.c(q3)) : 0;
                        T t4 = t3;
                        List X6 = q3.X(I0.f973e, new Q.a(-1213360416, new C0077z((r.U) this.f1438k, q3, arrayList3, i7, arrayList6, valueOf, this.f1434g, 2), true));
                        ArrayList arrayList7 = new ArrayList(X6.size());
                        int size5 = X6.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            arrayList7.add(((r0.z) X6.get(i37)).b(a3));
                        }
                        return q3.Y(h3, g3, M1.v.f2804d, new F0(arrayList7, arrayList3, arrayList, arrayList6, t4, h3, i18, (r.U) this.f1438k, q3, g3, intValue, valueOf, arrayList2, num2));
                    }
                    arrayList4.add(((r0.z) X3.get(i8)).b(I2.l.J((-u4.d(q3, q3.getLayoutDirection())) - u4.b(q3, q3.getLayoutDirection()), -u4.c(q3), a3)));
                    i8++;
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC0416e.b((m.s0) this.f1436i, (U.l) this.f1435h, (Y1.c) this.f1437j, (U.d) this.f1438k, (Y1.c) this.f1439l, this.f1434g, (C0113p) obj, C0089d.T(this.f1433f | 1));
                return L1.z.f2729a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077z(U.l lVar, InterfaceC0263N interfaceC0263N, C0067u c0067u, C0073x c0073x, C0665u c0665u, Q.a aVar, int i3) {
        super(2);
        this.f1432e = 0;
        this.f1435h = lVar;
        this.f1436i = interfaceC0263N;
        this.f1437j = c0067u;
        this.f1438k = c0073x;
        this.f1439l = c0665u;
        this.f1434g = aVar;
        this.f1433f = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0077z(Object obj, Object obj2, Object obj3, int i3, Object obj4, Object obj5, Q.a aVar, int i4) {
        super(2);
        this.f1432e = i4;
        this.f1435h = obj;
        this.f1436i = obj2;
        this.f1437j = obj3;
        this.f1433f = i3;
        this.f1438k = obj4;
        this.f1439l = obj5;
        this.f1434g = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077z(m.s0 s0Var, U.l lVar, Y1.c cVar, U.d dVar, Y1.c cVar2, Q.a aVar, int i3) {
        super(2);
        this.f1432e = 4;
        this.f1436i = s0Var;
        this.f1435h = lVar;
        this.f1437j = cVar;
        this.f1438k = dVar;
        this.f1439l = cVar2;
        this.f1434g = aVar;
        this.f1433f = i3;
    }
}
