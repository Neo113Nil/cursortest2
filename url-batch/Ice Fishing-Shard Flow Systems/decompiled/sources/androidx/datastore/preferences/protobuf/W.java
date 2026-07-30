package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3464a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f3465b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f3466c;

    static {
        Class<?> cls;
        Class<?> cls2;
        S s7 = S.f3454c;
        d0 d0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f3464a = cls;
        try {
            S s8 = S.f3454c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                d0Var = (d0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f3465b = d0Var;
        f3466c = new d0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0196l.c0(((Integer) list.get(i5)).intValue());
        }
        return i2;
    }

    public static int b(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0196l.a0(i2) + 4) * size;
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0196l.a0(i2) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0196l.c0(((Integer) list.get(i5)).intValue());
        }
        return i2;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0196l.c0(((Long) list.get(i5)).longValue());
        }
        return i2;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Integer) list.get(i5)).intValue();
            i2 += C0196l.b0((intValue >> 31) ^ (intValue << 1));
        }
        return i2;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i2 += C0196l.c0((longValue >> 63) ^ (longValue << 1));
        }
        return i2;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0196l.b0(((Integer) list.get(i5)).intValue());
        }
        return i2;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0196l.c0(((Long) list.get(i5)).longValue());
        }
        return i2;
    }

    public static void k(d0 d0Var, Object obj, Object obj2) {
        d0Var.getClass();
        AbstractC0205v abstractC0205v = (AbstractC0205v) obj;
        c0 c0Var = abstractC0205v.unknownFields;
        c0 c0Var2 = ((AbstractC0205v) obj2).unknownFields;
        c0 c0Var3 = c0.f3485f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i2 = c0Var.f3486a + c0Var2.f3486a;
                int[] copyOf = Arrays.copyOf(c0Var.f3487b, i2);
                System.arraycopy(c0Var2.f3487b, 0, copyOf, c0Var.f3486a, c0Var2.f3486a);
                Object[] copyOf2 = Arrays.copyOf(c0Var.f3488c, i2);
                System.arraycopy(c0Var2.f3488c, 0, copyOf2, c0Var.f3486a, c0Var2.f3486a);
                c0Var = new c0(i2, copyOf, copyOf2, true);
            } else {
                c0Var.getClass();
                if (!c0Var2.equals(c0Var3)) {
                    if (!c0Var.f3490e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = c0Var.f3486a + c0Var2.f3486a;
                    c0Var.a(i5);
                    System.arraycopy(c0Var2.f3487b, 0, c0Var.f3487b, c0Var.f3486a, c0Var2.f3486a);
                    System.arraycopy(c0Var2.f3488c, 0, c0Var.f3488c, c0Var.f3486a, c0Var2.f3486a);
                    c0Var.f3486a = i5;
                }
            }
        }
        abstractC0205v.unknownFields = c0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.h0(i2, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Boolean) list.get(i8)).getClass();
            Logger logger = C0196l.f3529h;
            i7++;
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.f0(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void n(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                double doubleValue = ((Double) list.get(i5)).doubleValue();
                c0196l.getClass();
                c0196l.m0(Double.doubleToRawLongBits(doubleValue), i2);
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Double) list.get(i8)).getClass();
            Logger logger = C0196l.f3529h;
            i7 += 8;
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.n0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void o(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.o0(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += C0196l.c0(((Integer) list.get(i8)).intValue());
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.p0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void p(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.k0(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Integer) list.get(i8)).getClass();
            Logger logger = C0196l.f3529h;
            i7 += 4;
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.l0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void q(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.m0(((Long) list.get(i5)).longValue(), i2);
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Long) list.get(i8)).getClass();
            Logger logger = C0196l.f3529h;
            i7 += 8;
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.n0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void r(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                float floatValue = ((Float) list.get(i5)).floatValue();
                c0196l.getClass();
                c0196l.k0(i2, Float.floatToRawIntBits(floatValue));
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Float) list.get(i8)).getClass();
            Logger logger = C0196l.f3529h;
            i7 += 4;
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.l0(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void s(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.o0(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += C0196l.c0(((Integer) list.get(i8)).intValue());
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.p0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void t(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.w0(((Long) list.get(i5)).longValue(), i2);
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += C0196l.c0(((Long) list.get(i8)).longValue());
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.x0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void u(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.k0(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Integer) list.get(i8)).getClass();
            Logger logger = C0196l.f3529h;
            i7 += 4;
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.l0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void v(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.m0(((Long) list.get(i5)).longValue(), i2);
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Long) list.get(i8)).getClass();
            Logger logger = C0196l.f3529h;
            i7 += 8;
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.n0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void w(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                int intValue = ((Integer) list.get(i5)).intValue();
                c0196l.u0(i2, (intValue >> 31) ^ (intValue << 1));
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int intValue2 = ((Integer) list.get(i8)).intValue();
            i7 += C0196l.b0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            int intValue3 = ((Integer) list.get(i5)).intValue();
            c0196l.v0((intValue3 >> 31) ^ (intValue3 << 1));
            i5++;
        }
    }

    public static void x(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                long longValue = ((Long) list.get(i5)).longValue();
                c0196l.w0((longValue >> 63) ^ (longValue << 1), i2);
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            long longValue2 = ((Long) list.get(i8)).longValue();
            i7 += C0196l.c0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            long longValue3 = ((Long) list.get(i5)).longValue();
            c0196l.x0((longValue3 >> 63) ^ (longValue3 << 1));
            i5++;
        }
    }

    public static void y(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.u0(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += C0196l.b0(((Integer) list.get(i8)).intValue());
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.v0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void z(int i2, List list, E e7, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0196l c0196l = (C0196l) e7.f3424a;
        int i5 = 0;
        if (!z7) {
            while (i5 < list.size()) {
                c0196l.w0(((Long) list.get(i5)).longValue(), i2);
                i5++;
            }
            return;
        }
        c0196l.t0(i2, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += C0196l.c0(((Long) list.get(i8)).longValue());
        }
        c0196l.v0(i7);
        while (i5 < list.size()) {
            c0196l.x0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static Object j(Object obj, int i2, InterfaceC0206w interfaceC0206w, Object obj2, d0 d0Var) {
        return obj2;
    }
}
