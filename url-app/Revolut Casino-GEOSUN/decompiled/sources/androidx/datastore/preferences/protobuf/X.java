package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1405a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f1406b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f1407c;

    static {
        Class<?> cls;
        Class<?> cls2;
        T t2 = T.f1395c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1405a = cls;
        try {
            T t3 = T.f1395c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (e0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1406b = e0Var;
        f1407c = new e0();
    }

    public static void A(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0092w abstractC0092w = (AbstractC0092w) obj;
        d0 d0Var = abstractC0092w.unknownFields;
        d0 d0Var2 = ((AbstractC0092w) obj2).unknownFields;
        d0 d0Var3 = d0.f1428f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i2 = d0Var.f1429a + d0Var2.f1429a;
                int[] copyOf = Arrays.copyOf(d0Var.f1430b, i2);
                System.arraycopy(d0Var2.f1430b, 0, copyOf, d0Var.f1429a, d0Var2.f1429a);
                Object[] copyOf2 = Arrays.copyOf(d0Var.f1431c, i2);
                System.arraycopy(d0Var2.f1431c, 0, copyOf2, d0Var.f1429a, d0Var2.f1429a);
                d0Var = new d0(i2, copyOf, copyOf2, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f1433e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = d0Var.f1429a + d0Var2.f1429a;
                    d0Var.a(i3);
                    System.arraycopy(d0Var2.f1430b, 0, d0Var.f1430b, d0Var.f1429a, d0Var2.f1429a);
                    System.arraycopy(d0Var2.f1431c, 0, d0Var.f1431c, d0Var.f1429a, d0Var2.f1429a);
                    d0Var.f1429a = i3;
                }
            }
        }
        abstractC0092w.unknownFields = d0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.t0(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            Logger logger = C0083m.f1471n;
            i4++;
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.r0(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static void D(int i2, List list, F f2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C0083m) f2.f1365a).u0(i2, (C0077g) list.get(i3));
        }
    }

    public static void E(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                double doubleValue = ((Double) list.get(i3)).doubleValue();
                c0083m.getClass();
                c0083m.y0(Double.doubleToRawLongBits(doubleValue), i2);
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).getClass();
            Logger logger = C0083m.f1471n;
            i4 += 8;
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.z0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void F(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.A0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0083m.o0(((Integer) list.get(i5)).intValue());
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.B0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void G(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.w0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = C0083m.f1471n;
            i4 += 4;
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.x0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void H(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.y0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = C0083m.f1471n;
            i4 += 8;
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.z0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void I(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                float floatValue = ((Float) list.get(i3)).floatValue();
                c0083m.getClass();
                c0083m.w0(i2, Float.floatToRawIntBits(floatValue));
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).getClass();
            Logger logger = C0083m.f1471n;
            i4 += 4;
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.x0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void J(int i2, List list, F f2, W w2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2.h(i2, list.get(i3), w2);
        }
    }

    public static void K(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.A0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0083m.o0(((Integer) list.get(i5)).intValue());
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.B0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void L(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.H0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0083m.o0(((Long) list.get(i5)).longValue());
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.I0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void M(int i2, List list, F f2, W w2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2.k(i2, list.get(i3), w2);
        }
    }

    public static void N(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.w0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = C0083m.f1471n;
            i4 += 4;
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.x0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void O(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.y0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = C0083m.f1471n;
            i4 += 8;
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.z0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void P(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                int intValue = ((Integer) list.get(i3)).intValue();
                c0083m.F0(i2, (intValue >> 31) ^ (intValue << 1));
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = ((Integer) list.get(i5)).intValue();
            i4 += C0083m.m0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            int intValue3 = ((Integer) list.get(i3)).intValue();
            c0083m.G0((intValue3 >> 31) ^ (intValue3 << 1));
            i3++;
        }
    }

    public static void Q(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                long longValue = ((Long) list.get(i3)).longValue();
                c0083m.H0((longValue >> 63) ^ (longValue << 1), i2);
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = ((Long) list.get(i5)).longValue();
            i4 += C0083m.o0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            long longValue3 = ((Long) list.get(i3)).longValue();
            c0083m.I0((longValue3 >> 63) ^ (longValue3 << 1));
            i3++;
        }
    }

    public static void R(int i2, List list, F f2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C0083m) f2.f1365a).C0((String) list.get(i3), i2);
        }
    }

    public static void S(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.F0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0083m.m0(((Integer) list.get(i5)).intValue());
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.G0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void T(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0083m c0083m = (C0083m) f2.f1365a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0083m.H0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0083m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0083m.o0(((Long) list.get(i5)).longValue());
        }
        c0083m.G0(i4);
        while (i3 < list.size()) {
            c0083m.I0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static int a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0083m.U(i2) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k02 = C0083m.k0(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size2 = ((C0077g) list.get(i3)).size();
            k02 += C0083m.m0(size2) + size2;
        }
        return k02;
    }

    public static int d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0083m.k0(i2) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0083m.o0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int f(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0083m.Y(i2) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0083m.Z(i2) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i2, List list, W w2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0083m.b0(i2, (AbstractC0071a) list.get(i4), w2);
        }
        return i3;
    }

    public static int k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0083m.k0(i2) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0083m.o0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int m(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0083m.k0(i2) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0083m.o0(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static int o(int i2, Object obj, W w2) {
        int k02 = C0083m.k0(i2);
        int a2 = ((AbstractC0071a) obj).a(w2);
        return C0083m.m0(a2) + a2 + k02;
    }

    public static int p(int i2, List list, W w2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k02 = C0083m.k0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            int a2 = ((AbstractC0071a) list.get(i3)).a(w2);
            k02 += C0083m.m0(a2) + a2;
        }
        return k02;
    }

    public static int q(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0083m.k0(i2) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Integer) list.get(i3)).intValue();
            i2 += C0083m.m0((intValue >> 31) ^ (intValue << 1));
        }
        return i2;
    }

    public static int s(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0083m.k0(i2) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = ((Long) list.get(i3)).longValue();
            i2 += C0083m.o0((longValue >> 63) ^ (longValue << 1));
        }
        return i2;
    }

    public static int u(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k02 = C0083m.k0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C0077g) {
                int size2 = ((C0077g) obj).size();
                k02 = C0083m.m0(size2) + size2 + k02;
            } else {
                k02 = C0083m.j0((String) obj) + k02;
            }
        }
        return k02;
    }

    public static int v(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0083m.k0(i2) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0083m.m0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int x(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0083m.k0(i2) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0083m.o0(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static Object z(Object obj, int i2, InterfaceC0093x interfaceC0093x, Object obj2, e0 e0Var) {
        return obj2;
    }
}
