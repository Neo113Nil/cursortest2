package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0190a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3838a;

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f3839b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f3840c;

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f3841d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f3838a = cls;
        f3839b = A(false);
        f3840c = A(true);
        f3841d = new k0();
    }

    public static k0 A(boolean z3) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (k0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z3));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(k0 k0Var, Object obj, Object obj2) {
        k0Var.getClass();
        AbstractC0211v abstractC0211v = (AbstractC0211v) obj;
        j0 j0Var = abstractC0211v.unknownFields;
        j0 j0Var2 = ((AbstractC0211v) obj2).unknownFields;
        j0 j0Var3 = j0.f3890f;
        if (!j0Var3.equals(j0Var2)) {
            if (j0Var3.equals(j0Var)) {
                int i3 = j0Var.f3891a + j0Var2.f3891a;
                int[] copyOf = Arrays.copyOf(j0Var.f3892b, i3);
                System.arraycopy(j0Var2.f3892b, 0, copyOf, j0Var.f3891a, j0Var2.f3891a);
                Object[] copyOf2 = Arrays.copyOf(j0Var.f3893c, i3);
                System.arraycopy(j0Var2.f3893c, 0, copyOf2, j0Var.f3891a, j0Var2.f3891a);
                j0Var = new j0(i3, copyOf, copyOf2, true);
            } else {
                j0Var.getClass();
                if (!j0Var2.equals(j0Var3)) {
                    if (!j0Var.f3895e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = j0Var.f3891a + j0Var2.f3891a;
                    j0Var.a(i4);
                    System.arraycopy(j0Var2.f3892b, 0, j0Var.f3892b, j0Var.f3891a, j0Var2.f3891a);
                    System.arraycopy(j0Var2.f3893c, 0, j0Var.f3893c, j0Var.f3891a, j0Var2.f3891a);
                    j0Var.f3891a = i4;
                }
            }
        }
        abstractC0211v.unknownFields = j0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.M(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            Logger logger = C0202l.f3896h;
            i5++;
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.K(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static void E(int i3, List list, H h3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h3.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((C0202l) h3.f3798a).N(i3, (C0197g) list.get(i4));
        }
    }

    public static void F(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                double doubleValue = ((Double) list.get(i4)).doubleValue();
                c0202l.getClass();
                c0202l.R(Double.doubleToRawLongBits(doubleValue), i3);
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            Logger logger = C0202l.f3896h;
            i5 += 8;
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.S(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void G(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.T(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0202l.v(((Integer) list.get(i6)).intValue());
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.U(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void H(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.P(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0202l.f3896h;
            i5 += 4;
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.Q(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void I(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.R(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0202l.f3896h;
            i5 += 8;
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.S(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void J(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                float floatValue = ((Float) list.get(i4)).floatValue();
                c0202l.getClass();
                c0202l.P(i3, Float.floatToRawIntBits(floatValue));
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            Logger logger = C0202l.f3896h;
            i5 += 4;
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.Q(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void K(int i3, List list, H h3, Z z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h3.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            h3.h(i3, list.get(i4), z3);
        }
    }

    public static void L(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.T(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0202l.v(((Integer) list.get(i6)).intValue());
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.U(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void M(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.a0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0202l.H(((Long) list.get(i6)).longValue());
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.b0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void N(int i3, List list, H h3, Z z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h3.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            h3.k(i3, list.get(i4), z3);
        }
    }

    public static void O(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.P(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0202l.f3896h;
            i5 += 4;
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.Q(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void P(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.R(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0202l.f3896h;
            i5 += 8;
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.S(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void Q(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int intValue = ((Integer) list.get(i4)).intValue();
                c0202l.Y(i3, (intValue >> 31) ^ (intValue << 1));
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue2 = ((Integer) list.get(i6)).intValue();
            i5 += C0202l.F((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            int intValue3 = ((Integer) list.get(i4)).intValue();
            c0202l.Z((intValue3 >> 31) ^ (intValue3 << 1));
            i4++;
        }
    }

    public static void R(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                c0202l.a0((longValue >> 63) ^ (longValue << 1), i3);
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long longValue2 = ((Long) list.get(i6)).longValue();
            i5 += C0202l.H((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            c0202l.b0((longValue3 >> 63) ^ (longValue3 << 1));
            i4++;
        }
    }

    public static void S(int i3, List list, H h3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h3.getClass();
        boolean z3 = list instanceof C;
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.V((String) list.get(i4), i3);
                i4++;
            }
            return;
        }
        C c3 = (C) list;
        while (i4 < list.size()) {
            Object e3 = c3.e(i4);
            if (e3 instanceof String) {
                c0202l.V((String) e3, i3);
            } else {
                c0202l.N(i3, (C0197g) e3);
            }
            i4++;
        }
    }

    public static void T(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.Y(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0202l.F(((Integer) list.get(i6)).intValue());
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.Z(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void U(int i3, List list, H h3, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0202l c0202l = (C0202l) h3.f3798a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0202l.a0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0202l.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0202l.H(((Long) list.get(i6)).longValue());
        }
        c0202l.Z(i5);
        while (i4 < list.size()) {
            c0202l.b0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static int a(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0202l.l(i3) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C0202l.D(i3) * size;
        for (int i4 = 0; i4 < list.size(); i4++) {
            D += C0202l.n((C0197g) list.get(i4));
        }
        return D;
    }

    public static int d(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0202l.D(i3) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0202l.v(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int f(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0202l.q(i3) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0202l.r(i3) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i3, List list, Z z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0202l.t(i3, (AbstractC0189a) list.get(i5), z3);
        }
        return i4;
    }

    public static int k(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0202l.D(i3) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0202l.v(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int m(int i3, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0202l.D(i3) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0202l.H(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int o(int i3, Object obj, Z z3) {
        int D = C0202l.D(i3);
        int a3 = ((AbstractC0189a) obj).a(z3);
        return C0202l.F(a3) + a3 + D;
    }

    public static int p(int i3, List list, Z z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C0202l.D(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            int a3 = ((AbstractC0189a) list.get(i4)).a(z3);
            D += C0202l.F(a3) + a3;
        }
        return D;
    }

    public static int q(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0202l.D(i3) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i3 += C0202l.F((intValue >> 31) ^ (intValue << 1));
        }
        return i3;
    }

    public static int s(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0202l.D(i3) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i3 += C0202l.H((longValue >> 63) ^ (longValue << 1));
        }
        return i3;
    }

    public static int u(int i3, List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = C0202l.D(i3) * size;
        if (list instanceof C) {
            C c3 = (C) list;
            while (i4 < size) {
                Object e3 = c3.e(i4);
                D = (e3 instanceof C0197g ? C0202l.n((C0197g) e3) : C0202l.C((String) e3)) + D;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                D = (obj instanceof C0197g ? C0202l.n((C0197g) obj) : C0202l.C((String) obj)) + D;
                i4++;
            }
        }
        return D;
    }

    public static int v(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0202l.D(i3) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0202l.F(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int x(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0202l.D(i3) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0202l.H(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static Object z(Object obj, int i3, List list, Object obj2, k0 k0Var) {
        return obj2;
    }
}
