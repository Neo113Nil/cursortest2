package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0435a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5313a;

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f5314b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f5315c;

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f5316d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f5313a = cls;
        f5314b = A(false);
        f5315c = A(true);
        f5316d = new k0();
    }

    public static k0 A(boolean z4) {
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
            return (k0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(k0 k0Var, Object obj, Object obj2) {
        k0Var.getClass();
        AbstractC0456v abstractC0456v = (AbstractC0456v) obj;
        j0 j0Var = abstractC0456v.unknownFields;
        j0 j0Var2 = ((AbstractC0456v) obj2).unknownFields;
        j0 j0Var3 = j0.f5365f;
        if (!j0Var3.equals(j0Var2)) {
            if (j0Var3.equals(j0Var)) {
                int i2 = j0Var.f5366a + j0Var2.f5366a;
                int[] copyOf = Arrays.copyOf(j0Var.f5367b, i2);
                System.arraycopy(j0Var2.f5367b, 0, copyOf, j0Var.f5366a, j0Var2.f5366a);
                Object[] copyOf2 = Arrays.copyOf(j0Var.f5368c, i2);
                System.arraycopy(j0Var2.f5368c, 0, copyOf2, j0Var.f5366a, j0Var2.f5366a);
                j0Var = new j0(i2, copyOf, copyOf2, true);
            } else {
                j0Var.getClass();
                if (!j0Var2.equals(j0Var3)) {
                    if (!j0Var.f5370e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = j0Var.f5366a + j0Var2.f5366a;
                    j0Var.a(i4);
                    System.arraycopy(j0Var2.f5367b, 0, j0Var.f5367b, j0Var.f5366a, j0Var2.f5366a);
                    System.arraycopy(j0Var2.f5368c, 0, j0Var.f5368c, j0Var.f5366a, j0Var2.f5366a);
                    j0Var.f5366a = i4;
                }
            }
        }
        abstractC0456v.unknownFields = j0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.M(i2, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            Logger logger = C0447l.f5371h;
            i5++;
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.K(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static void E(int i2, List list, H h4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h4.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((C0447l) h4.f5272a).N(i2, (C0442g) list.get(i4));
        }
    }

    public static void F(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                double doubleValue = ((Double) list.get(i4)).doubleValue();
                c0447l.getClass();
                c0447l.R(Double.doubleToRawLongBits(doubleValue), i2);
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            Logger logger = C0447l.f5371h;
            i5 += 8;
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.S(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void G(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.T(i2, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0447l.v(((Integer) list.get(i6)).intValue());
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.U(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void H(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.P(i2, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0447l.f5371h;
            i5 += 4;
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.Q(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void I(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.R(((Long) list.get(i4)).longValue(), i2);
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0447l.f5371h;
            i5 += 8;
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.S(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void J(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                float floatValue = ((Float) list.get(i4)).floatValue();
                c0447l.getClass();
                c0447l.P(i2, Float.floatToRawIntBits(floatValue));
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            Logger logger = C0447l.f5371h;
            i5 += 4;
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.Q(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void K(int i2, List list, H h4, Z z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h4.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            h4.h(i2, list.get(i4), z4);
        }
    }

    public static void L(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.T(i2, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0447l.v(((Integer) list.get(i6)).intValue());
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.U(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void M(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.a0(((Long) list.get(i4)).longValue(), i2);
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0447l.H(((Long) list.get(i6)).longValue());
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.b0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void N(int i2, List list, H h4, Z z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h4.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            h4.k(i2, list.get(i4), z4);
        }
    }

    public static void O(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.P(i2, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0447l.f5371h;
            i5 += 4;
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.Q(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void P(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.R(((Long) list.get(i4)).longValue(), i2);
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0447l.f5371h;
            i5 += 8;
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.S(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void Q(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                int intValue = ((Integer) list.get(i4)).intValue();
                c0447l.Y(i2, (intValue >> 31) ^ (intValue << 1));
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue2 = ((Integer) list.get(i6)).intValue();
            i5 += C0447l.F((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            int intValue3 = ((Integer) list.get(i4)).intValue();
            c0447l.Z((intValue3 >> 31) ^ (intValue3 << 1));
            i4++;
        }
    }

    public static void R(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                c0447l.a0((longValue >> 63) ^ (longValue << 1), i2);
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long longValue2 = ((Long) list.get(i6)).longValue();
            i5 += C0447l.H((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            c0447l.b0((longValue3 >> 63) ^ (longValue3 << 1));
            i4++;
        }
    }

    public static void S(int i2, List list, H h4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h4.getClass();
        boolean z4 = list instanceof C;
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.V(i2, (String) list.get(i4));
                i4++;
            }
            return;
        }
        C c4 = (C) list;
        while (i4 < list.size()) {
            Object n2 = c4.n(i4);
            if (n2 instanceof String) {
                c0447l.V(i2, (String) n2);
            } else {
                c0447l.N(i2, (C0442g) n2);
            }
            i4++;
        }
    }

    public static void T(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.Y(i2, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0447l.F(((Integer) list.get(i6)).intValue());
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.Z(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void U(int i2, List list, H h4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0447l c0447l = (C0447l) h4.f5272a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c0447l.a0(((Long) list.get(i4)).longValue(), i2);
                i4++;
            }
            return;
        }
        c0447l.X(i2, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0447l.H(((Long) list.get(i6)).longValue());
        }
        c0447l.Z(i5);
        while (i4 < list.size()) {
            c0447l.b0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static int a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0447l.l(i2) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D3 = C0447l.D(i2) * size;
        for (int i4 = 0; i4 < list.size(); i4++) {
            D3 += C0447l.n((C0442g) list.get(i4));
        }
        return D3;
    }

    public static int d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0447l.D(i2) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i2 += C0447l.v(((Integer) list.get(i4)).intValue());
        }
        return i2;
    }

    public static int f(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0447l.q(i2) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0447l.r(i2) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i2, List list, Z z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0447l.t(i2, (AbstractC0434a) list.get(i5), z4);
        }
        return i4;
    }

    public static int k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0447l.D(i2) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i2 += C0447l.v(((Integer) list.get(i4)).intValue());
        }
        return i2;
    }

    public static int m(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0447l.D(i2) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i2 += C0447l.H(((Long) list.get(i4)).longValue());
        }
        return i2;
    }

    public static int o(int i2, Object obj, Z z4) {
        int D3 = C0447l.D(i2);
        int a4 = ((AbstractC0434a) obj).a(z4);
        return C0447l.F(a4) + a4 + D3;
    }

    public static int p(int i2, List list, Z z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D3 = C0447l.D(i2) * size;
        for (int i4 = 0; i4 < size; i4++) {
            int a4 = ((AbstractC0434a) list.get(i4)).a(z4);
            D3 += C0447l.F(a4) + a4;
        }
        return D3;
    }

    public static int q(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0447l.D(i2) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i2 += C0447l.F((intValue >> 31) ^ (intValue << 1));
        }
        return i2;
    }

    public static int s(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0447l.D(i2) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i2 += C0447l.H((longValue >> 63) ^ (longValue << 1));
        }
        return i2;
    }

    public static int u(int i2, List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D3 = C0447l.D(i2) * size;
        if (list instanceof C) {
            C c4 = (C) list;
            while (i4 < size) {
                Object n2 = c4.n(i4);
                D3 = (n2 instanceof C0442g ? C0447l.n((C0442g) n2) : C0447l.C((String) n2)) + D3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                D3 = (obj instanceof C0442g ? C0447l.n((C0442g) obj) : C0447l.C((String) obj)) + D3;
                i4++;
            }
        }
        return D3;
    }

    public static int v(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0447l.D(i2) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i2 += C0447l.F(((Integer) list.get(i4)).intValue());
        }
        return i2;
    }

    public static int x(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0447l.D(i2) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i2 += C0447l.H(((Long) list.get(i4)).longValue());
        }
        return i2;
    }

    public static Object z(Object obj, int i2, List list, Object obj2, k0 k0Var) {
        return obj2;
    }
}
