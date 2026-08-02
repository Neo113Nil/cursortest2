package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2263a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f2264b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f2265c;

    static {
        Class<?> cls;
        Class<?> cls2;
        T t3 = T.f2253c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2263a = cls;
        try {
            T t4 = T.f2253c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (e0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f2264b = e0Var;
        f2265c = new e0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0146m.Z(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int b(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0146m.X(i3) + 4) * size;
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0146m.X(i3) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0146m.Z(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0146m.Z(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i3 += C0146m.Y((intValue >> 31) ^ (intValue << 1));
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i3 += C0146m.Z((longValue >> 63) ^ (longValue << 1));
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0146m.Y(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0146m.Z(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static void k(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0155w abstractC0155w = (AbstractC0155w) obj;
        d0 d0Var = abstractC0155w.unknownFields;
        d0 d0Var2 = ((AbstractC0155w) obj2).unknownFields;
        d0 d0Var3 = d0.f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i3 = d0Var.f2287a + d0Var2.f2287a;
                int[] copyOf = Arrays.copyOf(d0Var.f2288b, i3);
                System.arraycopy(d0Var2.f2288b, 0, copyOf, d0Var.f2287a, d0Var2.f2287a);
                Object[] copyOf2 = Arrays.copyOf(d0Var.f2289c, i3);
                System.arraycopy(d0Var2.f2289c, 0, copyOf2, d0Var.f2287a, d0Var2.f2287a);
                d0Var = new d0(i3, copyOf, copyOf2, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f2291e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = d0Var.f2287a + d0Var2.f2287a;
                    d0Var.a(i4);
                    System.arraycopy(d0Var2.f2288b, 0, d0Var.f2288b, d0Var.f2287a, d0Var2.f2287a);
                    System.arraycopy(d0Var2.f2289c, 0, d0Var.f2289c, d0Var.f2287a, d0Var2.f2287a);
                    d0Var.f2287a = i4;
                }
            }
        }
        abstractC0155w.unknownFields = d0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.e0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            Logger logger = C0146m.f2326n;
            i5++;
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.c0(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static void n(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                double doubleValue = ((Double) list.get(i4)).doubleValue();
                c0146m.getClass();
                c0146m.j0(i3, Double.doubleToRawLongBits(doubleValue));
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            Logger logger = C0146m.f2326n;
            i5 += 8;
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.k0(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void o(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.l0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0146m.Z(((Integer) list.get(i6)).intValue());
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.m0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void p(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.h0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0146m.f2326n;
            i5 += 4;
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.i0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void q(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.j0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0146m.f2326n;
            i5 += 8;
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.k0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void r(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                float floatValue = ((Float) list.get(i4)).floatValue();
                c0146m.getClass();
                c0146m.h0(i3, Float.floatToRawIntBits(floatValue));
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            Logger logger = C0146m.f2326n;
            i5 += 4;
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.i0(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void s(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.l0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0146m.Z(((Integer) list.get(i6)).intValue());
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.m0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void t(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.t0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0146m.Z(((Long) list.get(i6)).longValue());
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.u0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void u(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.h0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0146m.f2326n;
            i5 += 4;
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.i0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void v(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.j0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0146m.f2326n;
            i5 += 8;
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.k0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void w(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                int intValue = ((Integer) list.get(i4)).intValue();
                c0146m.r0(i3, (intValue >> 31) ^ (intValue << 1));
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue2 = ((Integer) list.get(i6)).intValue();
            i5 += C0146m.Y((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            int intValue3 = ((Integer) list.get(i4)).intValue();
            c0146m.s0((intValue3 >> 31) ^ (intValue3 << 1));
            i4++;
        }
    }

    public static void x(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                c0146m.t0(i3, (longValue >> 63) ^ (longValue << 1));
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long longValue2 = ((Long) list.get(i6)).longValue();
            i5 += C0146m.Z((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            c0146m.u0((longValue3 >> 63) ^ (longValue3 << 1));
            i4++;
        }
    }

    public static void y(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.r0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0146m.Y(((Integer) list.get(i6)).intValue());
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.s0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void z(int i3, List list, F f, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0146m c0146m = (C0146m) f.f2225a;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                c0146m.t0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0146m.q0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0146m.Z(((Long) list.get(i6)).longValue());
        }
        c0146m.s0(i5);
        while (i4 < list.size()) {
            c0146m.u0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static Object j(Object obj, int i3, InterfaceC0156x interfaceC0156x, Object obj2, e0 e0Var) {
        return obj2;
    }
}
