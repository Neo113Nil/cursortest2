package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class gs3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f5742a;

    /* renamed from: b, reason: collision with root package name */
    private static final ws3<?, ?> f5743b;

    /* renamed from: c, reason: collision with root package name */
    private static final ws3<?, ?> f5744c;

    /* renamed from: d, reason: collision with root package name */
    private static final ws3<?, ?> f5745d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f5742a = cls;
        f5743b = C(false);
        f5744c = C(true);
        f5745d = new ys3();
    }

    static int A(int i7, List<?> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (hp3.a(i7 << 3) + 1);
    }

    public static void B(int i7, List<Long> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.k(i7, list, z6);
    }

    private static ws3<?, ?> C(boolean z6) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (ws3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z6));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int D(List<?> list) {
        return list.size();
    }

    static int E(int i7, List<uo3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * hp3.D(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            D += hp3.x(list.get(i8));
        }
        return D;
    }

    static int F(int i7, List<Integer> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * hp3.D(i7));
    }

    static int G(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq3) {
            bq3 bq3Var = (bq3) list;
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.z(bq3Var.j(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.z(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    static int H(int i7, List<?> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (hp3.a(i7 << 3) + 4);
    }

    static int I(List<?> list) {
        return list.size() * 4;
    }

    static int J(int i7, List<?> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (hp3.a(i7 << 3) + 8);
    }

    static int K(List<?> list) {
        return list.size() * 8;
    }

    static int L(int i7, List<kr3> list, es3 es3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += hp3.y(i7, list.get(i9), es3Var);
        }
        return i8;
    }

    static int M(int i7, List<Integer> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * hp3.D(i7));
    }

    static int N(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq3) {
            bq3 bq3Var = (bq3) list;
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.z(bq3Var.j(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.z(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    static int O(int i7, List<Long> list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * hp3.D(i7));
    }

    static int P(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zq3) {
            zq3 zq3Var = (zq3) list;
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.b(zq3Var.j(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.b(list.get(i8).longValue());
                i8++;
            }
        }
        return i7;
    }

    static int Q(int i7, Object obj, es3 es3Var) {
        if (!(obj instanceof qq3)) {
            return hp3.a(i7 << 3) + hp3.B((kr3) obj, es3Var);
        }
        int a7 = hp3.a(i7 << 3);
        int a8 = ((qq3) obj).a();
        return a7 + hp3.a(a8) + a8;
    }

    static int R(int i7, List<?> list, es3 es3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = hp3.D(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            D += obj instanceof qq3 ? hp3.A((qq3) obj) : hp3.B((kr3) obj, es3Var);
        }
        return D;
    }

    static int S(int i7, List<Integer> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * hp3.D(i7));
    }

    static int T(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq3) {
            bq3 bq3Var = (bq3) list;
            i7 = 0;
            while (i8 < size) {
                int j7 = bq3Var.j(i8);
                i7 += hp3.a((j7 >> 31) ^ (j7 + j7));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                int intValue = list.get(i8).intValue();
                i7 += hp3.a((intValue >> 31) ^ (intValue + intValue));
                i8++;
            }
        }
        return i7;
    }

    static int U(int i7, List<Long> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * hp3.D(i7));
    }

    static int V(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zq3) {
            zq3 zq3Var = (zq3) list;
            i7 = 0;
            while (i8 < size) {
                long j7 = zq3Var.j(i8);
                i7 += hp3.b((j7 >> 63) ^ (j7 + j7));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                long longValue = list.get(i8).longValue();
                i7 += hp3.b((longValue >> 63) ^ (longValue + longValue));
                i8++;
            }
        }
        return i7;
    }

    static int W(int i7, List<?> list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int D = hp3.D(i7) * size;
        if (list instanceof sq3) {
            sq3 sq3Var = (sq3) list;
            while (i8 < size) {
                Object E = sq3Var.E(i8);
                D += E instanceof uo3 ? hp3.x((uo3) E) : hp3.C((String) E);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                D += obj instanceof uo3 ? hp3.x((uo3) obj) : hp3.C((String) obj);
                i8++;
            }
        }
        return D;
    }

    static int X(int i7, List<Integer> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * hp3.D(i7));
    }

    static int Y(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq3) {
            bq3 bq3Var = (bq3) list;
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.a(bq3Var.j(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.a(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    static int Z(int i7, List<Long> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * hp3.D(i7));
    }

    public static ws3<?, ?> a() {
        return f5744c;
    }

    static int a0(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zq3) {
            zq3 zq3Var = (zq3) list;
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.b(zq3Var.j(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += hp3.b(list.get(i8).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static ws3<?, ?> b() {
        return f5745d;
    }

    public static ws3<?, ?> b0() {
        return f5743b;
    }

    static <UT, UB> UB c(int i7, List<Integer> list, eq3 eq3Var, UB ub, ws3<UT, UB> ws3Var) {
        if (eq3Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                int intValue = list.get(i9).intValue();
                if (eq3Var.d(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, Integer.valueOf(intValue));
                    }
                    i8++;
                } else {
                    ub = (UB) d(i7, intValue, ub, ws3Var);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eq3Var.d(intValue2)) {
                    ub = (UB) d(i7, intValue2, ub, ws3Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB d(int i7, int i8, UB ub, ws3<UT, UB> ws3Var) {
        if (ub == null) {
            ub = ws3Var.f();
        }
        ws3Var.l(ub, i7, i8);
        return ub;
    }

    static <T, FT extends rp3<FT>> void e(np3<FT> np3Var, T t6, T t7) {
        np3Var.a(t7);
        throw null;
    }

    static <T, UT, UB> void f(ws3<UT, UB> ws3Var, T t6, T t7) {
        ws3Var.o(t6, ws3Var.e(ws3Var.d(t6), ws3Var.d(t7)));
    }

    public static void g(Class<?> cls) {
        Class<?> cls2;
        if (!aq3.class.isAssignableFrom(cls) && (cls2 = f5742a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void i(fr3 fr3Var, T t6, T t7, long j7) {
        gt3.D(t6, j7, fr3.c(gt3.p(t6, j7), gt3.p(t7, j7)));
    }

    public static void j(int i7, List<Boolean> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.n(i7, list, z6);
    }

    public static void k(int i7, List<uo3> list, ip3 ip3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.p(i7, list);
    }

    public static void l(int i7, List<Double> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.r(i7, list, z6);
    }

    public static void m(int i7, List<Integer> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.u(i7, list, z6);
    }

    public static void n(int i7, List<Integer> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.w(i7, list, z6);
    }

    public static void o(int i7, List<Long> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.y(i7, list, z6);
    }

    public static void p(int i7, List<Float> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.A(i7, list, z6);
    }

    public static void q(int i7, List<?> list, ip3 ip3Var, es3 es3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ip3Var.B(i7, list.get(i8), es3Var);
        }
    }

    public static void r(int i7, List<Integer> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.D(i7, list, z6);
    }

    public static void s(int i7, List<Long> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.F(i7, list, z6);
    }

    public static void t(int i7, List<?> list, ip3 ip3Var, es3 es3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ip3Var.G(i7, list.get(i8), es3Var);
        }
    }

    public static void u(int i7, List<Integer> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.I(i7, list, z6);
    }

    public static void v(int i7, List<Long> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.K(i7, list, z6);
    }

    public static void w(int i7, List<Integer> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.b(i7, list, z6);
    }

    public static void x(int i7, List<Long> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.d(i7, list, z6);
    }

    public static void y(int i7, List<String> list, ip3 ip3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.g(i7, list);
    }

    public static void z(int i7, List<Integer> list, ip3 ip3Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip3Var.i(i7, list, z6);
    }
}
