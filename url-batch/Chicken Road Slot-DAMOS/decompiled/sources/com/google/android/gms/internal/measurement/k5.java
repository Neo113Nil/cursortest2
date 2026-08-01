package com.google.android.gms.internal.measurement;

import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2445a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2446b;

    public k5(int i3) {
        this.f2446b = i3;
    }

    public static e5 c(e7 e7Var, List list) {
        o5 o5Var = o5.ADD;
        ia.f("FN", list, 2);
        f5 e2 = ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(0));
        f5 e9 = ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(1));
        if (!(e9 instanceof n1)) {
            te.a1.e(v4.a.k("FN requires an ArrayValue of parameter names found ", e9.getClass().getCanonicalName()));
            return null;
        }
        List o6 = ((n1) e9).o();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new e5(e2.f(), (ArrayList) o6, arrayList, e7Var);
    }

    public static boolean d(f5 f5Var, f5 f5Var2) {
        if (f5Var instanceof b5) {
            f5Var = new i5(f5Var.f());
        }
        if (f5Var2 instanceof b5) {
            f5Var2 = new i5(f5Var2.f());
        }
        if ((f5Var instanceof i5) && (f5Var2 instanceof i5)) {
            return ((i5) f5Var).f2395d.compareTo(((i5) f5Var2).f2395d) < 0;
        }
        double doubleValue = f5Var.g().doubleValue();
        double doubleValue2 = f5Var2.g().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static f5 e(n5 n5Var, f5 f5Var, f5 f5Var2) {
        if (f5Var instanceof Iterable) {
            return g(n5Var, ((Iterable) f5Var).iterator(), f5Var2);
        }
        te.a1.e("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(f5 f5Var, f5 f5Var2) {
        if (f5Var.getClass().equals(f5Var2.getClass())) {
            if ((f5Var instanceof j5) || (f5Var instanceof d5)) {
                return true;
            }
            return f5Var instanceof l3 ? (Double.isNaN(f5Var.g().doubleValue()) || Double.isNaN(f5Var2.g().doubleValue()) || f5Var.g().doubleValue() != f5Var2.g().doubleValue()) ? false : true : f5Var instanceof i5 ? f5Var.f().equals(f5Var2.f()) : f5Var instanceof d2 ? f5Var.b().equals(f5Var2.b()) : f5Var == f5Var2;
        }
        if (((f5Var instanceof j5) || (f5Var instanceof d5)) && ((f5Var2 instanceof j5) || (f5Var2 instanceof d5))) {
            return true;
        }
        boolean z10 = f5Var instanceof l3;
        if (z10 && (f5Var2 instanceof i5)) {
            return f(f5Var, new l3(f5Var2.g()));
        }
        boolean z11 = f5Var instanceof i5;
        if (z11 && (f5Var2 instanceof l3)) {
            return f(new l3(f5Var.g()), f5Var2);
        }
        if (f5Var instanceof d2) {
            return f(new l3(f5Var.g()), f5Var2);
        }
        if (f5Var2 instanceof d2) {
            return f(f5Var, new l3(f5Var2.g()));
        }
        if ((z11 || z10) && (f5Var2 instanceof b5)) {
            return f(f5Var, new i5(f5Var2.f()));
        }
        if ((f5Var instanceof b5) && ((f5Var2 instanceof i5) || (f5Var2 instanceof l3))) {
            return f(new i5(f5Var.f()), f5Var2);
        }
        return false;
    }

    public static f5 g(n5 n5Var, Iterator it, f5 f5Var) {
        e7 d10;
        if (it != null) {
            while (it.hasNext()) {
                f5 f5Var2 = (f5) it.next();
                switch (n5Var.f2567a) {
                    case 0:
                        d10 = n5Var.f2568b.d();
                        String str = n5Var.f2569c;
                        d10.g(str, f5Var2);
                        ((HashMap) d10.f2262s).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        d10 = n5Var.f2568b.d();
                        d10.g(n5Var.f2569c, f5Var2);
                        break;
                    default:
                        d10 = n5Var.f2568b;
                        d10.g(n5Var.f2569c, f5Var2);
                        break;
                }
                f5 c10 = d10.c((n1) f5Var);
                if (c10 instanceof t2) {
                    t2 t2Var = (t2) c10;
                    String str2 = t2Var.f2806e;
                    if ("break".equals(str2)) {
                        return f5.f2280b;
                    }
                    if ("return".equals(str2)) {
                        return t2Var;
                    }
                }
            }
        }
        return f5.f2280b;
    }

    public static boolean h(f5 f5Var, f5 f5Var2) {
        if (f5Var instanceof b5) {
            f5Var = new i5(f5Var.f());
        }
        if (f5Var2 instanceof b5) {
            f5Var2 = new i5(f5Var2.f());
        }
        return (((f5Var instanceof i5) && (f5Var2 instanceof i5)) || !(Double.isNaN(f5Var.g().doubleValue()) || Double.isNaN(f5Var2.g().doubleValue()))) && !d(f5Var2, f5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:508:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v101, types: [com.google.android.gms.internal.measurement.f5] */
    /* JADX WARN: Type inference failed for: r12v104, types: [com.google.android.gms.internal.measurement.f5] */
    /* JADX WARN: Type inference failed for: r12v320 */
    /* JADX WARN: Type inference failed for: r12v325 */
    /* JADX WARN: Type inference failed for: r12v345, types: [com.google.android.gms.internal.measurement.n1] */
    /* JADX WARN: Type inference failed for: r12v352, types: [com.google.android.gms.internal.measurement.c5] */
    /* JADX WARN: Type inference failed for: r12v388 */
    /* JADX WARN: Type inference failed for: r12v389 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.gms.internal.measurement.e7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f5 a(String str, e7 e7Var, ArrayList arrayList) {
        boolean f3;
        boolean f10;
        j5 j5Var;
        j5 j5Var2;
        j5 j5Var3;
        t2 t2Var;
        f5 i5Var;
        f5 f5Var;
        String str2;
        int i3 = 0;
        switch (this.f2446b) {
            case 0:
                o5 o5Var = o5.ADD;
                switch (ia.m(str).ordinal()) {
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        ia.c("BITWISE_AND", arrayList, 2);
                        return new l3(Double.valueOf(ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()) & ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue())));
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        ia.c("BITWISE_LEFT_SHIFT", arrayList, 2);
                        return new l3(Double.valueOf(ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()) << ((int) (ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue()) & 31))));
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        ia.c("BITWISE_NOT", arrayList, 1);
                        return new l3(Double.valueOf(~ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue())));
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        ia.c("BITWISE_OR", arrayList, 2);
                        return new l3(Double.valueOf(ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()) | ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue())));
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        ia.c("BITWISE_RIGHT_SHIFT", arrayList, 2);
                        return new l3(Double.valueOf(ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()) >> ((int) (ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue()) & 31))));
                    case 9:
                        ia.c("BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList, 2);
                        return new l3(Double.valueOf((ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()) & 4294967295L) >>> ((int) (ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue()) & 31))));
                    case 10:
                        ia.c("BITWISE_XOR", arrayList, 2);
                        return new l3(Double.valueOf(ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()) ^ ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                ia.c(ia.m(str).name(), arrayList, 2);
                f5 e2 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                f5 e9 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                int ordinal = ia.m(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal == 48) {
                        f10 = f(e2, e9);
                    } else if (ordinal == 42) {
                        f3 = d(e2, e9);
                    } else if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                f3 = d(e9, e2);
                                break;
                            case 38:
                                f3 = h(e9, e2);
                                break;
                            case 39:
                                f3 = ia.o(e2, e9);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
                                f10 = ia.o(e2, e9);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        f3 = h(e2, e9);
                    }
                    f3 = !f10;
                } else {
                    f3 = f(e2, e9);
                }
                return f3 ? f5.j : f5.f2284k;
            case 2:
                o5 o5Var2 = o5.ADD;
                int ordinal2 = ia.m(str).ordinal();
                if (ordinal2 == 2) {
                    ia.c("APPLY", arrayList, 3);
                    f5 f5Var2 = (f5) arrayList.get(0);
                    l5 l5Var = (l5) e7Var.f2260i;
                    l5 l5Var2 = (l5) e7Var.f2260i;
                    f5 e10 = l5Var.e(e7Var, f5Var2);
                    String f11 = l5Var2.e(e7Var, (f5) arrayList.get(1)).f();
                    f5 e11 = l5Var2.e(e7Var, (f5) arrayList.get(2));
                    if (!(e11 instanceof n1)) {
                        te.a1.e(v4.a.k("Function arguments for Apply are not a list found ", e11.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!f11.isEmpty()) {
                        return e10.i(f11, e7Var, (ArrayList) ((n1) e11).o());
                    }
                    te.a1.e("Function name for apply is undefined");
                    return null;
                }
                if (ordinal2 == 15) {
                    ia.c("BREAK", arrayList, 0);
                    return f5.f2282f;
                }
                if (ordinal2 == 25) {
                    return c(e7Var, arrayList);
                }
                if (ordinal2 != 41) {
                    if (ordinal2 == 54) {
                        return new n1(arrayList);
                    }
                    if (ordinal2 == 57) {
                        if (arrayList.isEmpty()) {
                            return f5.f2283h;
                        }
                        ia.c("RETURN", arrayList, 1);
                        return new t2("return", ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)));
                    }
                    if (ordinal2 != 19) {
                        if (ordinal2 == 20) {
                            ia.f("DEFINE_FUNCTION", arrayList, 2);
                            e5 c10 = c(e7Var, arrayList);
                            String str3 = c10.f2253d;
                            if (str3 == null) {
                                e7Var.f("", c10);
                                return c10;
                            }
                            e7Var.f(str3, c10);
                            return c10;
                        }
                        if (ordinal2 == 60) {
                            ia.c("SWITCH", arrayList, 3);
                            f5 f5Var3 = (f5) arrayList.get(0);
                            l5 l5Var3 = (l5) e7Var.f2260i;
                            l5 l5Var4 = (l5) e7Var.f2260i;
                            f5 e12 = l5Var3.e(e7Var, f5Var3);
                            f5 e13 = l5Var4.e(e7Var, (f5) arrayList.get(1));
                            f5 e14 = l5Var4.e(e7Var, (f5) arrayList.get(2));
                            if (!(e13 instanceof n1)) {
                                te.a1.e("Malformed SWITCH statement, cases are not a list");
                                return null;
                            }
                            if (!(e14 instanceof n1)) {
                                te.a1.e("Malformed SWITCH statement, case statements are not a list");
                                return null;
                            }
                            n1 n1Var = (n1) e13;
                            n1 n1Var2 = (n1) e14;
                            boolean z10 = false;
                            for (int i10 = 0; i10 < n1Var.q(); i10++) {
                                if (z10 || e12.equals(l5Var4.e(e7Var, n1Var.r(i10)))) {
                                    f5 e15 = l5Var4.e(e7Var, n1Var2.r(i10));
                                    if (e15 instanceof t2) {
                                        return ((t2) e15).f2806e.equals("break") ? f5.f2280b : e15;
                                    }
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                            if (n1Var.q() + 1 == n1Var2.q()) {
                                f5 e16 = l5Var4.e(e7Var, n1Var2.r(n1Var.q()));
                                if (e16 instanceof t2) {
                                    String str4 = ((t2) e16).f2806e;
                                    if (str4.equals("return") || str4.equals("continue")) {
                                        return e16;
                                    }
                                }
                            }
                            return f5.f2280b;
                        }
                        if (ordinal2 == 61) {
                            ia.c("TERNARY", arrayList, 3);
                            f5 f5Var4 = (f5) arrayList.get(0);
                            l5 l5Var5 = (l5) e7Var.f2260i;
                            l5 l5Var6 = (l5) e7Var.f2260i;
                            return l5Var5.e(e7Var, f5Var4).b().booleanValue() ? l5Var6.e(e7Var, (f5) arrayList.get(1)) : l5Var6.e(e7Var, (f5) arrayList.get(2));
                        }
                        switch (ordinal2) {
                            case RequestError.STOP_TRACKING /* 11 */:
                                return e7Var.d().c(new n1(arrayList));
                            case 12:
                                ia.c("BREAK", arrayList, 0);
                                return f5.g;
                            case 13:
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return f5.f2280b;
                    }
                    f5 e17 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                    return e17 instanceof n1 ? e7Var.c((n1) e17) : f5.f2280b;
                }
                ia.f("IF", arrayList, 2);
                f5 f5Var5 = (f5) arrayList.get(0);
                l5 l5Var7 = (l5) e7Var.f2260i;
                l5 l5Var8 = (l5) e7Var.f2260i;
                f5 e18 = l5Var7.e(e7Var, f5Var5);
                f5 e19 = l5Var8.e(e7Var, (f5) arrayList.get(1));
                f5 e20 = arrayList.size() > 2 ? l5Var8.e(e7Var, (f5) arrayList.get(2)) : null;
                j5 j5Var4 = f5.f2280b;
                if (e18.b().booleanValue()) {
                    j5Var2 = e7Var.c((n1) e19);
                } else {
                    if (e20 == null) {
                        j5Var = j5Var4;
                        return true == (j5Var instanceof t2) ? j5Var4 : j5Var;
                    }
                    j5Var2 = e7Var.c((n1) e20);
                }
                j5Var = j5Var2;
                if (true == (j5Var instanceof t2)) {
                }
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                o5 o5Var3 = o5.ADD;
                int ordinal3 = ia.m(str).ordinal();
                if (ordinal3 == 1) {
                    ia.c("AND", arrayList, 2);
                    f5 e21 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                    if (e21.b().booleanValue()) {
                        return ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                    }
                    return e21;
                }
                if (ordinal3 == 47) {
                    ia.c("NOT", arrayList, 1);
                    return new d2(Boolean.valueOf(!((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).b().booleanValue()));
                }
                if (ordinal3 != 50) {
                    b(str);
                    throw null;
                }
                ia.c("OR", arrayList, 2);
                f5 e22 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                if (e22.b().booleanValue()) {
                    return e22;
                }
                return ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                o5 o5Var4 = o5.ADD;
                int ordinal4 = ia.m(str).ordinal();
                if (ordinal4 == 65) {
                    ia.c("WHILE", arrayList, 4);
                    f5 f5Var6 = (f5) arrayList.get(0);
                    f5 f5Var7 = (f5) arrayList.get(1);
                    f5 f5Var8 = (f5) arrayList.get(2);
                    f5 f5Var9 = (f5) arrayList.get(3);
                    l5 l5Var9 = (l5) e7Var.f2260i;
                    l5 l5Var10 = (l5) e7Var.f2260i;
                    f5 e23 = l5Var9.e(e7Var, f5Var9);
                    if (l5Var10.e(e7Var, f5Var8).b().booleanValue()) {
                        f5 c11 = e7Var.c((n1) e23);
                        if (c11 instanceof t2) {
                            t2 t2Var2 = (t2) c11;
                            String str5 = t2Var2.f2806e;
                            if ("break".equals(str5)) {
                                return f5.f2280b;
                            }
                            if ("return".equals(str5)) {
                                return t2Var2;
                            }
                        }
                    }
                    while (l5Var10.e(e7Var, f5Var6).b().booleanValue()) {
                        f5 c12 = e7Var.c((n1) e23);
                        if (c12 instanceof t2) {
                            t2 t2Var3 = (t2) c12;
                            String str6 = t2Var3.f2806e;
                            if ("break".equals(str6)) {
                                return f5.f2280b;
                            }
                            if ("return".equals(str6)) {
                                return t2Var3;
                            }
                        }
                        e7Var.a(f5Var7);
                    }
                    return f5.f2280b;
                }
                switch (ordinal4) {
                    case 26:
                        ia.c("FOR_IN", arrayList, 3);
                        if (!(arrayList.get(0) instanceof i5)) {
                            te.a1.e("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String f12 = ((f5) arrayList.get(0)).f();
                        f5 e24 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                        f5 e25 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(2));
                        Iterator e26 = e24.e();
                        if (e26 != null) {
                            while (e26.hasNext()) {
                                e7Var.g(f12, (f5) e26.next());
                                f5 c13 = e7Var.c((n1) e25);
                                if (c13 instanceof t2) {
                                    t2Var = (t2) c13;
                                    String str7 = t2Var.f2806e;
                                    if ("break".equals(str7)) {
                                        j5Var3 = f5.f2280b;
                                        return j5Var3;
                                    }
                                    if ("return".equals(str7)) {
                                        return t2Var;
                                    }
                                }
                            }
                        }
                        j5Var3 = f5.f2280b;
                        return j5Var3;
                    case 27:
                        ia.c("FOR_IN_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof i5) {
                            return g(new n5(e7Var, ((f5) arrayList.get(0)).f(), 0), ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).e(), ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(2)));
                        }
                        te.a1.e("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        ia.c("FOR_IN_LET", arrayList, 3);
                        if (!(arrayList.get(0) instanceof i5)) {
                            te.a1.e("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String f13 = ((f5) arrayList.get(0)).f();
                        f5 e27 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                        f5 e28 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(2));
                        Iterator e29 = e27.e();
                        if (e29 != null) {
                            while (e29.hasNext()) {
                                f5 f5Var10 = (f5) e29.next();
                                e7 d10 = e7Var.d();
                                d10.g(f13, f5Var10);
                                f5 c14 = d10.c((n1) e28);
                                if (c14 instanceof t2) {
                                    t2Var = (t2) c14;
                                    String str8 = t2Var.f2806e;
                                    if ("break".equals(str8)) {
                                        j5Var3 = f5.f2280b;
                                        return j5Var3;
                                    }
                                    if ("return".equals(str8)) {
                                        return t2Var;
                                    }
                                }
                            }
                        }
                        j5Var3 = f5.f2280b;
                        return j5Var3;
                    case 29:
                        ia.c("FOR_LET", arrayList, 4);
                        f5 f5Var11 = (f5) arrayList.get(0);
                        l5 l5Var11 = (l5) e7Var.f2260i;
                        l5 l5Var12 = (l5) e7Var.f2260i;
                        f5 e30 = l5Var11.e(e7Var, f5Var11);
                        if (!(e30 instanceof n1)) {
                            te.a1.e("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        n1 n1Var3 = (n1) e30;
                        f5 f5Var12 = (f5) arrayList.get(1);
                        f5 f5Var13 = (f5) arrayList.get(2);
                        f5 e31 = l5Var12.e(e7Var, (f5) arrayList.get(3));
                        e7 d11 = e7Var.d();
                        for (int i11 = 0; i11 < n1Var3.q(); i11++) {
                            String f14 = n1Var3.r(i11).f();
                            d11.f(f14, e7Var.h(f14));
                        }
                        while (l5Var12.e(e7Var, f5Var12).b().booleanValue()) {
                            f5 c15 = e7Var.c((n1) e31);
                            if (c15 instanceof t2) {
                                t2 t2Var4 = (t2) c15;
                                String str9 = t2Var4.f2806e;
                                if ("break".equals(str9)) {
                                    return f5.f2280b;
                                }
                                if ("return".equals(str9)) {
                                    return t2Var4;
                                }
                            }
                            e7 d12 = e7Var.d();
                            for (int i12 = 0; i12 < n1Var3.q(); i12++) {
                                String f15 = n1Var3.r(i12).f();
                                d12.f(f15, d11.h(f15));
                            }
                            d12.a(f5Var13);
                            d11 = d12;
                        }
                        return f5.f2280b;
                    case 30:
                        ia.c("FOR_OF", arrayList, 3);
                        if (arrayList.get(0) instanceof i5) {
                            return e(new n5(e7Var, ((f5) arrayList.get(0)).f(), 2), ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)), ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(2)));
                        }
                        te.a1.e("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        ia.c("FOR_OF_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof i5) {
                            return e(new n5(e7Var, ((f5) arrayList.get(0)).f(), 0), ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)), ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(2)));
                        }
                        te.a1.e("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        ia.c("FOR_OF_LET", arrayList, 3);
                        if (arrayList.get(0) instanceof i5) {
                            return e(new n5(e7Var, ((f5) arrayList.get(0)).f(), 1), ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)), ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(2)));
                        }
                        te.a1.e("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        b(str);
                        throw null;
                }
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                o5 o5Var5 = o5.ADD;
                int ordinal5 = ia.m(str).ordinal();
                if (ordinal5 == 0) {
                    ia.c("ADD", arrayList, 2);
                    f5 e32 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                    f5 e33 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                    i5Var = ((e32 instanceof b5) || (e32 instanceof i5) || (e33 instanceof b5) || (e33 instanceof i5)) ? new i5(String.valueOf(e32.f()).concat(String.valueOf(e33.f()))) : new l3(Double.valueOf(e33.g().doubleValue() + e32.g().doubleValue()));
                } else {
                    if (ordinal5 == 21) {
                        ia.c("DIVIDE", arrayList, 2);
                        return new l3(Double.valueOf(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue() / ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue()));
                    }
                    if (ordinal5 == 59) {
                        ia.c("SUBTRACT", arrayList, 2);
                        return new l3(Double.valueOf(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue() + (-((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue())));
                    }
                    if (ordinal5 == 52 || ordinal5 == 53) {
                        ia.c(str, arrayList, 2);
                        f5 e34 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                        e7Var.a((f5) arrayList.get(1));
                        return e34;
                    }
                    if (ordinal5 == 55 || ordinal5 == 56) {
                        ia.c(str, arrayList, 1);
                        return ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                    }
                    switch (ordinal5) {
                        case 44:
                            ia.c("MODULUS", arrayList, 2);
                            return new l3(Double.valueOf(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue() % ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue()));
                        case 45:
                            ia.c("MULTIPLY", arrayList, 2);
                            i5Var = new l3(Double.valueOf(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue() * ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()));
                            break;
                        case 46:
                            ia.c("NEGATE", arrayList, 1);
                            return new l3(Double.valueOf(-((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return i5Var;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (str == null || str.isEmpty() || !e7Var.e(str)) {
                    te.a1.e(v4.a.k("Command not found: ", str));
                    return null;
                }
                f5 h10 = e7Var.h(str);
                if (h10 instanceof e4) {
                    return ((e4) h10).a(e7Var, arrayList);
                }
                te.a1.e(n0.l.g("Function ", str, " is not defined"));
                return null;
            default:
                o5 o5Var6 = o5.ADD;
                int ordinal6 = ia.m(str).ordinal();
                if (ordinal6 == 3) {
                    ia.c("ASSIGN", arrayList, 2);
                    f5 e35 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                    if (!(e35 instanceof i5)) {
                        te.a1.e(v4.a.k("Expected string for assign var. got ", e35.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((i5) e35).f2395d;
                    if (!e7Var.e(str10)) {
                        te.a1.e(v4.a.k("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    f5 e36 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                    e7Var.f(str10, e36);
                    return e36;
                }
                if (ordinal6 == 14) {
                    ia.f("CONST", arrayList, 2);
                    if (arrayList.size() % 2 != 0) {
                        te.a1.e(v4.a.j(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i3 < arrayList.size() - 1) {
                        f5 e37 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(i3));
                        if (!(e37 instanceof i5)) {
                            te.a1.e(v4.a.k("Expected string for const name. got ", e37.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((i5) e37).f2395d;
                        e7Var.g(str11, ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(i3 + 1)));
                        ((HashMap) e7Var.f2262s).put(str11, Boolean.TRUE);
                        i3 += 2;
                    }
                    return f5.f2280b;
                }
                if (ordinal6 == 24) {
                    ia.f("EXPRESSION_LIST", arrayList, 1);
                    f5Var = f5.f2280b;
                    while (i3 < arrayList.size()) {
                        f5 e38 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(i3));
                        if (e38 instanceof t2) {
                            kotlin.collections.i0.l("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i3++;
                        f5Var = e38;
                    }
                } else {
                    if (ordinal6 == 33) {
                        ia.c("GET", arrayList, 1);
                        f5 e39 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                        if (e39 instanceof i5) {
                            return e7Var.h(((i5) e39).f2395d);
                        }
                        te.a1.e(v4.a.k("Expected string for get var. got ", e39.getClass().getCanonicalName()));
                        return null;
                    }
                    if (ordinal6 == 49) {
                        ia.c("NULL", arrayList, 0);
                        return f5.f2281c;
                    }
                    if (ordinal6 == 58) {
                        ia.c("SET_PROPERTY", arrayList, 3);
                        f5 f5Var14 = (f5) arrayList.get(0);
                        l5 l5Var13 = (l5) e7Var.f2260i;
                        l5 l5Var14 = (l5) e7Var.f2260i;
                        f5 e40 = l5Var13.e(e7Var, f5Var14);
                        f5 e41 = l5Var14.e(e7Var, (f5) arrayList.get(1));
                        f5 e42 = l5Var14.e(e7Var, (f5) arrayList.get(2));
                        if (e40 == f5.f2280b || e40 == f5.f2281c) {
                            throw new IllegalStateException("Can't set property " + e41.f() + " of " + e40.f());
                        }
                        if ((e40 instanceof n1) && (e41 instanceof l3)) {
                            ((n1) e40).s(((l3) e41).f2496d.intValue(), e42);
                            return e42;
                        }
                        if (!(e40 instanceof b5)) {
                            return e42;
                        }
                        ((b5) e40).k(e41.f(), e42);
                        return e42;
                    }
                    if (ordinal6 != 17) {
                        if (ordinal6 != 18) {
                            if (ordinal6 == 35 || ordinal6 == 36) {
                                ia.c("GET_PROPERTY", arrayList, 2);
                                f5 e43 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                                f5 e44 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                                if ((e43 instanceof n1) && ia.k(e44)) {
                                    return ((n1) e43).r(e44.g().intValue());
                                }
                                if (e43 instanceof b5) {
                                    return ((b5) e43).c(e44.f());
                                }
                                if (e43 instanceof i5) {
                                    if ("length".equals(e44.f())) {
                                        return new l3(Double.valueOf(((i5) e43).f2395d.length()));
                                    }
                                    if (ia.k(e44)) {
                                        double doubleValue = e44.g().doubleValue();
                                        String str12 = ((i5) e43).f2395d;
                                        if (doubleValue < str12.length()) {
                                            return new i5(String.valueOf(str12.charAt(e44.g().intValue())));
                                        }
                                    }
                                }
                                return f5.f2280b;
                            }
                            switch (ordinal6) {
                                case 62:
                                    ia.c("TYPEOF", arrayList, 1);
                                    f5 e45 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                                    if (e45 instanceof j5) {
                                        str2 = "undefined";
                                    } else if (e45 instanceof d2) {
                                        str2 = "boolean";
                                    } else if (e45 instanceof l3) {
                                        str2 = "number";
                                    } else if (e45 instanceof i5) {
                                        str2 = "string";
                                    } else if (e45 instanceof e5) {
                                        str2 = "function";
                                    } else {
                                        if ((e45 instanceof g5) || (e45 instanceof t2)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", e45));
                                        }
                                        str2 = "object";
                                    }
                                    return new i5(str2);
                                case 63:
                                    ia.c("UNDEFINED", arrayList, 0);
                                    return f5.f2280b;
                                case 64:
                                    ia.f("VAR", arrayList, 1);
                                    int size = arrayList.size();
                                    while (i3 < size) {
                                        Object obj = arrayList.get(i3);
                                        i3++;
                                        f5 e46 = ((l5) e7Var.f2260i).e(e7Var, (f5) obj);
                                        if (!(e46 instanceof i5)) {
                                            te.a1.e(v4.a.k("Expected string for var name. got ", e46.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        e7Var.g(((i5) e46).f2395d, f5.f2280b);
                                    }
                                    return f5.f2280b;
                                default:
                                    b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new c5();
                        }
                        if (arrayList.size() % 2 != 0) {
                            te.a1.e(v4.a.j(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        f5Var = new c5();
                        while (i3 < arrayList.size() - 1) {
                            f5 e47 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(i3));
                            f5 e48 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(i3 + 1));
                            if ((e47 instanceof t2) || (e48 instanceof t2)) {
                                kotlin.collections.i0.l("Failed to evaluate map entry");
                                return null;
                            }
                            f5Var.k(e47.f(), e48);
                            i3 += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new n1();
                        }
                        f5Var = new n1();
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            f5 e49 = ((l5) e7Var.f2260i).e(e7Var, (f5) obj2);
                            if (e49 instanceof t2) {
                                kotlin.collections.i0.l("Failed to evaluate array element");
                                return null;
                            }
                            f5Var.s(i3, e49);
                            i3++;
                        }
                    }
                }
                return f5Var;
        }
    }

    public final void b(String str) {
        if (!this.f2445a.contains(ia.m(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
