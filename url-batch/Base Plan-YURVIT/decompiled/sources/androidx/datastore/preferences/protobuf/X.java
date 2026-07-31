package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1493a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f1494b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f1495c;

    static {
        Class<?> cls;
        Class<?> cls2;
        T t = T.f1483c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1493a = cls;
        try {
            T t2 = T.f1483c;
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
        f1494b = e0Var;
        f1495c = new e0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0101m.X(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int b(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0101m.V(i2) + 4) * size;
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0101m.V(i2) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0101m.X(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0101m.X(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Integer) list.get(i3)).intValue();
            i2 += C0101m.W((intValue >> 31) ^ (intValue << 1));
        }
        return i2;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = ((Long) list.get(i3)).longValue();
            i2 += C0101m.X((longValue >> 63) ^ (longValue << 1));
        }
        return i2;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0101m.W(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0101m.X(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static void k(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0110w abstractC0110w = (AbstractC0110w) obj;
        d0 d0Var = abstractC0110w.unknownFields;
        d0 d0Var2 = ((AbstractC0110w) obj2).unknownFields;
        d0 d0Var3 = d0.f1516f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i2 = d0Var.f1517a + d0Var2.f1517a;
                int[] copyOf = Arrays.copyOf(d0Var.f1518b, i2);
                System.arraycopy(d0Var2.f1518b, 0, copyOf, d0Var.f1517a, d0Var2.f1517a);
                Object[] copyOf2 = Arrays.copyOf(d0Var.f1519c, i2);
                System.arraycopy(d0Var2.f1519c, 0, copyOf2, d0Var.f1517a, d0Var2.f1517a);
                d0Var = new d0(i2, copyOf, copyOf2, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f1521e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = d0Var.f1517a + d0Var2.f1517a;
                    d0Var.a(i3);
                    System.arraycopy(d0Var2.f1518b, 0, d0Var.f1518b, d0Var.f1517a, d0Var2.f1517a);
                    System.arraycopy(d0Var2.f1519c, 0, d0Var.f1519c, d0Var.f1517a, d0Var2.f1517a);
                    d0Var.f1517a = i3;
                }
            }
        }
        abstractC0110w.unknownFields = d0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.c0(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            Logger logger = C0101m.f1560j;
            i4++;
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.a0(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static void n(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                double doubleValue = ((Double) list.get(i3)).doubleValue();
                c0101m.getClass();
                c0101m.h0(Double.doubleToRawLongBits(doubleValue), i2);
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).getClass();
            Logger logger = C0101m.f1560j;
            i4 += 8;
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.i0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void o(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.j0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0101m.X(((Integer) list.get(i5)).intValue());
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.k0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void p(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.f0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = C0101m.f1560j;
            i4 += 4;
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.g0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void q(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.h0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = C0101m.f1560j;
            i4 += 8;
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.i0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void r(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                float floatValue = ((Float) list.get(i3)).floatValue();
                c0101m.getClass();
                c0101m.f0(i2, Float.floatToRawIntBits(floatValue));
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).getClass();
            Logger logger = C0101m.f1560j;
            i4 += 4;
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.g0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void s(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.j0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0101m.X(((Integer) list.get(i5)).intValue());
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.k0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void t(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.r0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0101m.X(((Long) list.get(i5)).longValue());
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.s0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void u(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.f0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = C0101m.f1560j;
            i4 += 4;
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.g0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void v(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.h0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = C0101m.f1560j;
            i4 += 8;
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.i0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void w(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                int intValue = ((Integer) list.get(i3)).intValue();
                c0101m.p0(i2, (intValue >> 31) ^ (intValue << 1));
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = ((Integer) list.get(i5)).intValue();
            i4 += C0101m.W((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            int intValue3 = ((Integer) list.get(i3)).intValue();
            c0101m.q0((intValue3 >> 31) ^ (intValue3 << 1));
            i3++;
        }
    }

    public static void x(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                long longValue = ((Long) list.get(i3)).longValue();
                c0101m.r0((longValue >> 63) ^ (longValue << 1), i2);
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = ((Long) list.get(i5)).longValue();
            i4 += C0101m.X((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            long longValue3 = ((Long) list.get(i3)).longValue();
            c0101m.s0((longValue3 >> 63) ^ (longValue3 << 1));
            i3++;
        }
    }

    public static void y(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.p0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0101m.W(((Integer) list.get(i5)).intValue());
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.q0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void z(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0101m c0101m = (C0101m) f2.f1452a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0101m.r0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0101m.o0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0101m.X(((Long) list.get(i5)).longValue());
        }
        c0101m.q0(i4);
        while (i3 < list.size()) {
            c0101m.s0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static Object j(Object obj, int i2, InterfaceC0111x interfaceC0111x, Object obj2, e0 e0Var) {
        return obj2;
    }
}
