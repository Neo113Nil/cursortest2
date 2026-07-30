package d0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g3 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1988g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1989h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0.a f1990i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1991j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1992k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1993l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1994m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1995n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(int i7, o0.a aVar, o0.a aVar2, q6.e eVar, q6.e eVar2, e0.g gVar, q6.e eVar3) {
        super(2);
        this.f1989h = i7;
        this.f1990i = aVar;
        this.f1991j = aVar2;
        this.f1992k = eVar;
        this.f1993l = eVar2;
        this.f1995n = gVar;
        this.f1994m = eVar3;
    }

    /* JADX WARN: Type inference failed for: r6v28, types: [q6.c, r6.l] */
    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        int i7;
        ArrayList arrayList;
        c1 c1Var;
        Object obj6;
        int i8;
        ArrayList arrayList2;
        Integer num2;
        int i9;
        int i10;
        int K;
        int b9;
        Object obj7;
        Object obj8;
        int i11;
        int K2;
        int K3;
        switch (this.f1988g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    k3.b(this.f1989h, this.f1990i, (o0.a) this.f1991j, (q6.e) this.f1992k, (q6.e) this.f1993l, (e0.g) this.f1995n, (q6.e) this.f1994m, pVar, 0);
                }
                return d6.z.f2639a;
            case 1:
                g0.p pVar2 = (g0.p) obj;
                int intValue = ((Number) obj2).intValue();
                p1.w0 w0Var = (p1.w0) this.f1992k;
                if ((intValue & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    q.s0 s0Var = (q.s0) this.f1991j;
                    float k02 = ((ArrayList) this.f1993l).isEmpty() ? w0Var.k0(s0Var.d(w0Var)) : w0Var.k0(this.f1989h);
                    float k03 = (((ArrayList) this.f1994m).isEmpty() || (num = (Integer) this.f1995n) == null) ? w0Var.k0(s0Var.b(w0Var)) : w0Var.k0(num.intValue());
                    m2.k layoutDirection = w0Var.getLayoutDirection();
                    m2.k kVar = m2.k.f6322f;
                    float k04 = layoutDirection == kVar ? w0Var.k0(s0Var.a(w0Var, layoutDirection)) : w0Var.k0(s0Var.c(w0Var, layoutDirection));
                    m2.k layoutDirection2 = w0Var.getLayoutDirection();
                    this.f1990i.c(new q.h0(k04, k02, layoutDirection2 == kVar ? w0Var.k0(s0Var.c(w0Var, layoutDirection2)) : w0Var.k0(s0Var.a(w0Var, layoutDirection2)), k03), pVar2, 0);
                }
                return d6.z.f2639a;
            case 2:
                p1.w0 w0Var2 = (p1.w0) obj;
                long j8 = ((m2.a) obj2).f6306a;
                q.s0 s0Var2 = (q.s0) this.f1995n;
                int h3 = m2.a.h(j8);
                int g9 = m2.a.g(j8);
                long a3 = m2.a.a(j8, 0, 0, 0, 0, 10);
                List D = w0Var2.D(l3.f2149f, this.f1990i);
                ArrayList arrayList3 = new ArrayList(D.size());
                int size = D.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList3.add(((p1.e0) D.get(i12)).b(a3));
                }
                if (arrayList3.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i13 = ((p1.n0) obj3).f7064g;
                    int W = e6.m.W(arrayList3);
                    if (1 <= W) {
                        int i14 = 1;
                        while (true) {
                            Object obj9 = arrayList3.get(i14);
                            int i15 = ((p1.n0) obj9).f7064g;
                            if (i13 < i15) {
                                i13 = i15;
                                obj3 = obj9;
                            }
                            if (i14 != W) {
                                i14++;
                            }
                        }
                    }
                }
                p1.n0 n0Var = (p1.n0) obj3;
                int i16 = n0Var != null ? n0Var.f7064g : 0;
                List D2 = w0Var2.D(l3.f2151h, (q6.e) this.f1992k);
                ArrayList arrayList4 = new ArrayList(D2.size());
                int size2 = D2.size();
                int i17 = 0;
                while (i17 < size2) {
                    arrayList4.add(((p1.e0) D2.get(i17)).b(r4.a.M((-s0Var2.a(w0Var2, w0Var2.getLayoutDirection())) - s0Var2.c(w0Var2, w0Var2.getLayoutDirection()), -s0Var2.b(w0Var2), a3)));
                    i17++;
                    D2 = D2;
                }
                if (arrayList4.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList4.get(0);
                    int i18 = ((p1.n0) obj4).f7064g;
                    int W2 = e6.m.W(arrayList4);
                    if (1 <= W2) {
                        Object obj10 = obj4;
                        int i19 = i18;
                        int i20 = 1;
                        while (true) {
                            Object obj11 = arrayList4.get(i20);
                            int i21 = ((p1.n0) obj11).f7064g;
                            if (i19 < i21) {
                                obj10 = obj11;
                                i19 = i21;
                            }
                            if (i20 != W2) {
                                i20++;
                            } else {
                                obj4 = obj10;
                            }
                        }
                    }
                }
                p1.n0 n0Var2 = (p1.n0) obj4;
                int i22 = n0Var2 != null ? n0Var2.f7064g : 0;
                if (arrayList4.isEmpty()) {
                    i7 = i22;
                    obj5 = null;
                } else {
                    obj5 = arrayList4.get(0);
                    int i23 = ((p1.n0) obj5).f7063f;
                    int W3 = e6.m.W(arrayList4);
                    if (1 <= W3) {
                        Object obj12 = obj5;
                        int i24 = i23;
                        int i25 = 1;
                        while (true) {
                            Object obj13 = arrayList4.get(i25);
                            i7 = i22;
                            int i26 = ((p1.n0) obj13).f7063f;
                            if (i24 < i26) {
                                i24 = i26;
                                obj12 = obj13;
                            }
                            if (i25 != W3) {
                                i25++;
                                i22 = i7;
                            } else {
                                obj5 = obj12;
                            }
                        }
                    } else {
                        i7 = i22;
                    }
                }
                p1.n0 n0Var3 = (p1.n0) obj5;
                int i27 = n0Var3 != null ? n0Var3.f7063f : 0;
                List D3 = w0Var2.D(l3.f2152i, (q6.e) this.f1993l);
                ArrayList arrayList5 = new ArrayList(D3.size());
                int size3 = D3.size();
                int i28 = 0;
                while (i28 < size3) {
                    List list = D3;
                    ArrayList arrayList6 = arrayList4;
                    p1.n0 b10 = ((p1.e0) D3.get(i28)).b(r4.a.M((-s0Var2.a(w0Var2, w0Var2.getLayoutDirection())) - s0Var2.c(w0Var2, w0Var2.getLayoutDirection()), -s0Var2.b(w0Var2), a3));
                    if (b10.f7064g == 0 || b10.f7063f == 0) {
                        b10 = null;
                    }
                    if (b10 != null) {
                        arrayList5.add(b10);
                    }
                    i28++;
                    D3 = list;
                    arrayList4 = arrayList6;
                }
                ArrayList arrayList7 = arrayList4;
                boolean isEmpty = arrayList5.isEmpty();
                int i29 = this.f1989h;
                if (isEmpty) {
                    arrayList = arrayList3;
                    c1Var = null;
                } else {
                    if (arrayList5.isEmpty()) {
                        arrayList = arrayList3;
                        obj7 = null;
                    } else {
                        obj7 = arrayList5.get(0);
                        int i30 = ((p1.n0) obj7).f7063f;
                        int W4 = e6.m.W(arrayList5);
                        if (1 <= W4) {
                            int i31 = i30;
                            int i32 = 1;
                            while (true) {
                                Object obj14 = arrayList5.get(i32);
                                arrayList = arrayList3;
                                int i33 = ((p1.n0) obj14).f7063f;
                                if (i31 < i33) {
                                    i31 = i33;
                                    obj7 = obj14;
                                }
                                if (i32 != W4) {
                                    i32++;
                                    arrayList3 = arrayList;
                                }
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                    }
                    r6.k.c(obj7);
                    int i34 = ((p1.n0) obj7).f7063f;
                    if (arrayList5.isEmpty()) {
                        i11 = i34;
                        obj8 = null;
                    } else {
                        obj8 = arrayList5.get(0);
                        int i35 = ((p1.n0) obj8).f7064g;
                        int W5 = e6.m.W(arrayList5);
                        if (1 <= W5) {
                            Object obj15 = obj8;
                            int i36 = i35;
                            int i37 = 1;
                            while (true) {
                                Object obj16 = arrayList5.get(i37);
                                i11 = i34;
                                int i38 = ((p1.n0) obj16).f7064g;
                                if (i36 < i38) {
                                    i36 = i38;
                                    obj15 = obj16;
                                }
                                if (i37 != W5) {
                                    i37++;
                                    i34 = i11;
                                } else {
                                    obj8 = obj15;
                                }
                            }
                        } else {
                            i11 = i34;
                        }
                    }
                    r6.k.c(obj8);
                    int i39 = ((p1.n0) obj8).f7064g;
                    m2.k kVar2 = m2.k.f6322f;
                    if (i29 != 0) {
                        if (i29 != 2 && i29 != 3) {
                            K2 = (h3 - i11) / 2;
                        } else if (w0Var2.getLayoutDirection() == kVar2) {
                            K3 = w0Var2.K(k3.f2133a);
                            K2 = (h3 - K3) - i11;
                        } else {
                            K2 = w0Var2.K(k3.f2133a);
                        }
                        c1Var = new c1(K2, i39);
                    } else if (w0Var2.getLayoutDirection() == kVar2) {
                        K2 = w0Var2.K(k3.f2133a);
                        c1Var = new c1(K2, i39);
                    } else {
                        K3 = w0Var2.K(k3.f2133a);
                        K2 = (h3 - K3) - i11;
                        c1Var = new c1(K2, i39);
                    }
                }
                List D4 = w0Var2.D(l3.f2153j, new o0.a(-2146438447, new b((q6.e) this.f1994m, 2), true));
                ArrayList arrayList8 = new ArrayList(D4.size());
                int size4 = D4.size();
                int i40 = 0;
                while (i40 < size4) {
                    arrayList8.add(((p1.e0) D4.get(i40)).b(a3));
                    i40++;
                    D4 = D4;
                }
                if (arrayList8.isEmpty()) {
                    arrayList2 = arrayList8;
                    i8 = i16;
                    obj6 = null;
                } else {
                    obj6 = arrayList8.get(0);
                    int i41 = ((p1.n0) obj6).f7064g;
                    int W6 = e6.m.W(arrayList8);
                    i8 = i16;
                    if (1 <= W6) {
                        int i42 = i41;
                        int i43 = 1;
                        while (true) {
                            Object obj17 = arrayList8.get(i43);
                            arrayList2 = arrayList8;
                            int i44 = ((p1.n0) obj17).f7064g;
                            if (i42 < i44) {
                                i42 = i44;
                                obj6 = obj17;
                            }
                            if (i43 != W6) {
                                i43++;
                                arrayList8 = arrayList2;
                            }
                        }
                    } else {
                        arrayList2 = arrayList8;
                    }
                }
                p1.n0 n0Var4 = (p1.n0) obj6;
                Integer valueOf = n0Var4 != null ? Integer.valueOf(n0Var4.f7064g) : null;
                if (c1Var != null) {
                    int i45 = c1Var.f1877b;
                    if (valueOf == null || i29 == 3) {
                        K = w0Var2.K(k3.f2133a) + i45;
                        b9 = s0Var2.b(w0Var2);
                    } else {
                        K = valueOf.intValue() + i45;
                        b9 = w0Var2.K(k3.f2133a);
                    }
                    num2 = Integer.valueOf(b9 + K);
                } else {
                    num2 = null;
                }
                if (i7 != 0) {
                    i10 = i7 + (num2 != null ? num2.intValue() : valueOf != null ? valueOf.intValue() : s0Var2.b(w0Var2));
                    i9 = h3;
                } else {
                    i9 = h3;
                    i10 = 0;
                }
                c1 c1Var2 = c1Var;
                ArrayList arrayList9 = arrayList;
                ArrayList arrayList10 = arrayList2;
                List D5 = w0Var2.D(l3.f2150g, new o0.a(-1213360416, new g3((q.s0) this.f1995n, w0Var2, arrayList9, i8, arrayList10, valueOf, (o0.a) this.f1991j), true));
                ArrayList arrayList11 = new ArrayList(D5.size());
                int size5 = D5.size();
                int i46 = 0;
                while (i46 < size5) {
                    arrayList11.add(((p1.e0) D5.get(i46)).b(a3));
                    i46++;
                    i9 = i9;
                }
                int i47 = i9;
                return w0Var2.C(i47, g9, e6.v.f2827f, new i3(arrayList11, arrayList9, arrayList7, arrayList10, c1Var2, i47, i27, (q.s0) this.f1995n, w0Var2, g9, i10, valueOf, arrayList5, num2));
            default:
                ((Number) obj2).intValue();
                a8.d.a((l.p1) this.f1991j, (s0.o) this.f1992k, (q6.c) this.f1993l, (s0.c) this.f1994m, (r6.l) this.f1995n, this.f1990i, (g0.p) obj, g0.d.T(this.f1989h | 1));
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g3(l.p1 p1Var, s0.o oVar, q6.c cVar, s0.c cVar2, q6.c cVar3, o0.a aVar, int i7) {
        super(2);
        this.f1991j = p1Var;
        this.f1992k = oVar;
        this.f1993l = cVar;
        this.f1994m = cVar2;
        this.f1995n = (r6.l) cVar3;
        this.f1990i = aVar;
        this.f1989h = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(o0.a aVar, q6.e eVar, q6.e eVar2, int i7, q.s0 s0Var, q6.e eVar3, o0.a aVar2) {
        super(2);
        this.f1990i = aVar;
        this.f1992k = eVar;
        this.f1993l = eVar2;
        this.f1989h = i7;
        this.f1995n = s0Var;
        this.f1994m = eVar3;
        this.f1991j = aVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(q.s0 s0Var, p1.w0 w0Var, ArrayList arrayList, int i7, ArrayList arrayList2, Integer num, o0.a aVar) {
        super(2);
        this.f1991j = s0Var;
        this.f1992k = w0Var;
        this.f1993l = arrayList;
        this.f1989h = i7;
        this.f1994m = arrayList2;
        this.f1995n = num;
        this.f1990i = aVar;
    }
}
