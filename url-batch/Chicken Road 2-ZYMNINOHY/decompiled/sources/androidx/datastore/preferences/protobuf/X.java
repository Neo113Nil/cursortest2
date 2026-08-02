package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4601a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f4602b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f4603c;

    static {
        Class<?> cls;
        Class<?> cls2;
        T t4 = T.f4591c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4601a = cls;
        try {
            T t5 = T.f4591c;
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
        f4602b = e0Var;
        f4603c = new e0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0180m.c0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int b(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0180m.a0(i4) + 4) * size;
    }

    public static int c(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0180m.a0(i4) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0180m.c0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0180m.c0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Integer) list.get(i5)).intValue();
            i4 += C0180m.b0((intValue >> 31) ^ (intValue << 1));
        }
        return i4;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i4 += C0180m.c0((longValue >> 63) ^ (longValue << 1));
        }
        return i4;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0180m.b0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0180m.c0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static void k(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0189w abstractC0189w = (AbstractC0189w) obj;
        d0 d0Var = abstractC0189w.unknownFields;
        d0 d0Var2 = ((AbstractC0189w) obj2).unknownFields;
        d0 d0Var3 = d0.f4626f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i4 = d0Var.f4627a + d0Var2.f4627a;
                int[] copyOf = Arrays.copyOf(d0Var.f4628b, i4);
                System.arraycopy(d0Var2.f4628b, 0, copyOf, d0Var.f4627a, d0Var2.f4627a);
                Object[] copyOf2 = Arrays.copyOf(d0Var.f4629c, i4);
                System.arraycopy(d0Var2.f4629c, 0, copyOf2, d0Var.f4627a, d0Var2.f4627a);
                d0Var = new d0(i4, copyOf, copyOf2, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f4631e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = d0Var.f4627a + d0Var2.f4627a;
                    d0Var.a(i5);
                    System.arraycopy(d0Var2.f4628b, 0, d0Var.f4628b, d0Var.f4627a, d0Var2.f4627a);
                    System.arraycopy(d0Var2.f4629c, 0, d0Var.f4629c, d0Var.f4627a, d0Var2.f4627a);
                    d0Var.f4627a = i5;
                }
            }
        }
        abstractC0189w.unknownFields = d0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.h0(i4, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = C0180m.f4670f;
            i6++;
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.f0(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void n(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                double doubleValue = ((Double) list.get(i5)).doubleValue();
                c0180m.getClass();
                c0180m.m0(i4, Double.doubleToRawLongBits(doubleValue));
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = C0180m.f4670f;
            i6 += 8;
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.n0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void o(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.o0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0180m.c0(((Integer) list.get(i7)).intValue());
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.p0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void p(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.k0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0180m.f4670f;
            i6 += 4;
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.l0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void q(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.m0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0180m.f4670f;
            i6 += 8;
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.n0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void r(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                float floatValue = ((Float) list.get(i5)).floatValue();
                c0180m.getClass();
                c0180m.k0(i4, Float.floatToRawIntBits(floatValue));
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = C0180m.f4670f;
            i6 += 4;
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.l0(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void s(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.o0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0180m.c0(((Integer) list.get(i7)).intValue());
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.p0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void t(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.w0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0180m.c0(((Long) list.get(i7)).longValue());
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.x0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void u(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.k0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0180m.f4670f;
            i6 += 4;
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.l0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void v(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.m0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0180m.f4670f;
            i6 += 8;
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.n0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void w(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                int intValue = ((Integer) list.get(i5)).intValue();
                c0180m.u0(i4, (intValue >> 31) ^ (intValue << 1));
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue2 = ((Integer) list.get(i7)).intValue();
            i6 += C0180m.b0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            int intValue3 = ((Integer) list.get(i5)).intValue();
            c0180m.v0((intValue3 >> 31) ^ (intValue3 << 1));
            i5++;
        }
    }

    public static void x(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                long longValue = ((Long) list.get(i5)).longValue();
                c0180m.w0(i4, (longValue >> 63) ^ (longValue << 1));
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += C0180m.c0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            long longValue3 = ((Long) list.get(i5)).longValue();
            c0180m.x0((longValue3 >> 63) ^ (longValue3 << 1));
            i5++;
        }
    }

    public static void y(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.u0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0180m.b0(((Integer) list.get(i7)).intValue());
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.v0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void z(int i4, List list, F f4, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0180m c0180m = (C0180m) f4.f4562a;
        int i5 = 0;
        if (!z) {
            while (i5 < list.size()) {
                c0180m.w0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0180m.t0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0180m.c0(((Long) list.get(i7)).longValue());
        }
        c0180m.v0(i6);
        while (i5 < list.size()) {
            c0180m.x0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static Object j(Object obj, int i4, InterfaceC0190x interfaceC0190x, Object obj2, e0 e0Var) {
        return obj2;
    }
}
