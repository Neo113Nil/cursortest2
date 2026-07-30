package defpackage;

import androidx.compose.foundation.layout.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rc extends o81 implements Function2 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ int n;
    public final /* synthetic */ my o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(int i, Function2 function2, my myVar, Function2 function22, Function2 function23, go1 go1Var, my myVar2) {
        super(2);
        this.n = i;
        this.p = function2;
        this.o = myVar;
        this.q = function22;
        this.r = function23;
        this.s = go1Var;
        this.t = myVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        ak0 ak0Var;
        Object obj6;
        ArrayList arrayList;
        Integer num2;
        pj1 G;
        int R;
        int a;
        Object obj7;
        Object obj8;
        int i2;
        int R2;
        int R3;
        int i3 = this.m;
        my myVar = this.o;
        int i4 = this.n;
        Object obj9 = this.t;
        Object obj10 = this.r;
        Object obj11 = this.q;
        Object obj12 = this.p;
        Object obj13 = this.s;
        switch (i3) {
            case 0:
                ((Number) obj2).intValue();
                s93.b((fz2) obj12, (vl1) obj11, (Function1) obj10, (f6) obj9, (Function1) obj13, this.o, (a00) obj, s03.R(i4 | 1));
                return Unit.a;
            case 1:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    j8.h(this.n, (Function2) obj12, this.o, (Function2) obj11, (Function2) obj10, (go1) obj13, (my) obj9, a00Var, 0);
                }
                return Unit.a;
            case 2:
                a00 a00Var2 = (a00) obj;
                hq2 hq2Var = (hq2) obj11;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    e31 e31Var = new e31((z63) obj12, hq2Var);
                    myVar.a(new zx1(a.f(e31Var, hq2Var.getLayoutDirection()), ((ArrayList) obj10).isEmpty() ? e31Var.d() : hq2Var.p0(i4), a.e(e31Var, hq2Var.getLayoutDirection()), (((ArrayList) obj13).isEmpty() || (num = (Integer) obj9) == null) ? e31Var.c() : hq2Var.p0(num.intValue())), a00Var2, 0);
                }
                return Unit.a;
            default:
                hq2 hq2Var2 = (hq2) obj;
                long j = ((u10) obj2).a;
                z63 z63Var = (z63) obj13;
                int h = u10.h(j);
                int g = u10.g(j);
                long a2 = u10.a(j, 0, 0, 0, 0, 10);
                List s = hq2Var2.s(le2.m, (Function2) obj12);
                ArrayList arrayList2 = new ArrayList(s.size());
                int size = s.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(((jj1) s.get(i5)).c(a2));
                }
                if (arrayList2.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i6 = ((n12) obj3).n;
                    int size2 = arrayList2.size() - 1;
                    if (1 <= size2) {
                        int i7 = 1;
                        while (true) {
                            Object obj14 = arrayList2.get(i7);
                            int i8 = ((n12) obj14).n;
                            if (i6 < i8) {
                                i6 = i8;
                                obj3 = obj14;
                            }
                            if (i7 != size2) {
                                i7++;
                            }
                        }
                    }
                }
                n12 n12Var = (n12) obj3;
                int i9 = n12Var != null ? n12Var.n : 0;
                List s2 = hq2Var2.s(le2.o, (Function2) obj11);
                ArrayList arrayList3 = new ArrayList(s2.size());
                int size3 = s2.size();
                int i10 = 0;
                while (i10 < size3) {
                    arrayList3.add(((jj1) s2.get(i10)).c(v10.j((-z63Var.d(hq2Var2, hq2Var2.getLayoutDirection())) - z63Var.c(hq2Var2, hq2Var2.getLayoutDirection()), -z63Var.a(hq2Var2), a2)));
                    i10++;
                    i9 = i9;
                    s2 = s2;
                }
                int i11 = i9;
                if (arrayList3.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList3.get(0);
                    int i12 = ((n12) obj4).n;
                    int size4 = arrayList3.size() - 1;
                    if (1 <= size4) {
                        int i13 = 1;
                        while (true) {
                            Object obj15 = arrayList3.get(i13);
                            Object obj16 = obj4;
                            int i14 = ((n12) obj15).n;
                            if (i12 < i14) {
                                i12 = i14;
                                obj4 = obj15;
                            } else {
                                obj4 = obj16;
                            }
                            if (i13 != size4) {
                                i13++;
                            }
                        }
                    }
                }
                n12 n12Var2 = (n12) obj4;
                int i15 = n12Var2 != null ? n12Var2.n : 0;
                if (arrayList3.isEmpty()) {
                    i = i15;
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int i16 = ((n12) obj5).m;
                    int size5 = arrayList3.size() - 1;
                    if (1 <= size5) {
                        int i17 = 1;
                        while (true) {
                            Object obj17 = arrayList3.get(i17);
                            i = i15;
                            int i18 = ((n12) obj17).m;
                            if (i16 < i18) {
                                i16 = i18;
                                obj5 = obj17;
                            }
                            if (i17 != size5) {
                                i17++;
                                i15 = i;
                            }
                        }
                    } else {
                        i = i15;
                    }
                }
                n12 n12Var3 = (n12) obj5;
                int i19 = n12Var3 != null ? n12Var3.m : 0;
                List s3 = hq2Var2.s(le2.p, (Function2) obj10);
                ArrayList arrayList4 = new ArrayList(s3.size());
                int size6 = s3.size();
                int i20 = 0;
                while (i20 < size6) {
                    int i21 = i19;
                    List list = s3;
                    n12 c = ((jj1) s3.get(i20)).c(v10.j((-z63Var.d(hq2Var2, hq2Var2.getLayoutDirection())) - z63Var.c(hq2Var2, hq2Var2.getLayoutDirection()), -z63Var.a(hq2Var2), a2));
                    if (c.n == 0 || c.m == 0) {
                        c = null;
                    }
                    if (c != null) {
                        arrayList4.add(c);
                    }
                    i20++;
                    s3 = list;
                    i19 = i21;
                }
                int i22 = i19;
                if (arrayList4.isEmpty()) {
                    ak0Var = null;
                } else {
                    if (arrayList4.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList4.get(0);
                        int i23 = ((n12) obj7).m;
                        int size7 = arrayList4.size() - 1;
                        if (1 <= size7) {
                            int i24 = 1;
                            while (true) {
                                Object obj18 = arrayList4.get(i24);
                                int i25 = ((n12) obj18).m;
                                if (i23 < i25) {
                                    i23 = i25;
                                    obj7 = obj18;
                                }
                                if (i24 != size7) {
                                    i24++;
                                }
                            }
                        }
                    }
                    obj7.getClass();
                    int i26 = ((n12) obj7).m;
                    if (arrayList4.isEmpty()) {
                        i2 = i26;
                        obj8 = null;
                    } else {
                        obj8 = arrayList4.get(0);
                        int i27 = ((n12) obj8).n;
                        int size8 = arrayList4.size() - 1;
                        if (1 <= size8) {
                            int i28 = 1;
                            while (true) {
                                Object obj19 = arrayList4.get(i28);
                                i2 = i26;
                                int i29 = ((n12) obj19).n;
                                if (i27 < i29) {
                                    i27 = i29;
                                    obj8 = obj19;
                                }
                                if (i28 != size8) {
                                    i28++;
                                    i26 = i2;
                                }
                            }
                        } else {
                            i2 = i26;
                        }
                    }
                    obj8.getClass();
                    int i30 = ((n12) obj8).n;
                    if (i4 != 0) {
                        if (i4 != 2 && i4 != 3) {
                            R2 = (h - i2) / 2;
                        } else if (hq2Var2.getLayoutDirection() == u81.m) {
                            R3 = hq2Var2.R(16.0f);
                            R2 = (h - R3) - i2;
                        } else {
                            R2 = hq2Var2.R(16.0f);
                        }
                        ak0Var = new ak0(R2, i30);
                    } else if (hq2Var2.getLayoutDirection() == u81.m) {
                        R2 = hq2Var2.R(16.0f);
                        ak0Var = new ak0(R2, i30);
                    } else {
                        R3 = hq2Var2.R(16.0f);
                        R2 = (h - R3) - i2;
                        ak0Var = new ak0(R2, i30);
                    }
                }
                List s4 = hq2Var2.s(le2.q, new my(-2146438447, new x5(myVar, 3), true));
                ArrayList arrayList5 = new ArrayList(s4.size());
                int size9 = s4.size();
                for (int i31 = 0; i31 < size9; i31++) {
                    arrayList5.add(((jj1) s4.get(i31)).c(a2));
                }
                if (arrayList5.isEmpty()) {
                    arrayList = arrayList5;
                    obj6 = null;
                } else {
                    obj6 = arrayList5.get(0);
                    int i32 = ((n12) obj6).n;
                    int size10 = arrayList5.size() - 1;
                    if (1 <= size10) {
                        int i33 = 1;
                        while (true) {
                            Object obj20 = arrayList5.get(i33);
                            arrayList = arrayList5;
                            int i34 = ((n12) obj20).n;
                            if (i32 < i34) {
                                i32 = i34;
                                obj6 = obj20;
                            }
                            if (i33 != size10) {
                                i33++;
                                arrayList5 = arrayList;
                            }
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                }
                n12 n12Var4 = (n12) obj6;
                Integer valueOf = n12Var4 != null ? Integer.valueOf(n12Var4.n) : null;
                if (ak0Var != null) {
                    int i35 = ak0Var.n;
                    if (valueOf == null || i4 == 3) {
                        R = hq2Var2.R(16.0f) + i35;
                        a = z63Var.a(hq2Var2);
                    } else {
                        R = valueOf.intValue() + i35;
                        a = hq2Var2.R(16.0f);
                    }
                    num2 = Integer.valueOf(a + R);
                } else {
                    num2 = null;
                }
                int intValue = i != 0 ? i + (num2 != null ? num2.intValue() : valueOf != null ? valueOf.intValue() : z63Var.a(hq2Var2)) : 0;
                Integer num3 = valueOf;
                List s5 = hq2Var2.s(le2.n, new my(-1213360416, new rc((z63) obj13, hq2Var2, arrayList2, i11, arrayList, num3, (my) obj9), true));
                ArrayList arrayList6 = new ArrayList(s5.size());
                int size11 = s5.size();
                for (int i36 = 0; i36 < size11; i36++) {
                    arrayList6.add(((jj1) s5.get(i36)).c(a2));
                }
                G = hq2Var2.G(h, g, mi1.c(), new je2(arrayList6, arrayList2, arrayList3, arrayList, ak0Var, h, i22, (z63) obj13, hq2Var2, g, intValue, num3, arrayList4, num2));
                return G;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(fz2 fz2Var, vl1 vl1Var, Function1 function1, f6 f6Var, Function1 function12, my myVar, int i) {
        super(2);
        this.p = fz2Var;
        this.q = vl1Var;
        this.r = function1;
        this.t = f6Var;
        this.s = function12;
        this.o = myVar;
        this.n = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(z63 z63Var, hq2 hq2Var, ArrayList arrayList, int i, ArrayList arrayList2, Integer num, my myVar) {
        super(2);
        this.p = z63Var;
        this.q = hq2Var;
        this.r = arrayList;
        this.n = i;
        this.s = arrayList2;
        this.t = num;
        this.o = myVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(Function2 function2, Function2 function22, Function2 function23, int i, z63 z63Var, my myVar, my myVar2) {
        super(2);
        this.p = function2;
        this.q = function22;
        this.r = function23;
        this.n = i;
        this.s = z63Var;
        this.o = myVar;
        this.t = myVar2;
    }
}
