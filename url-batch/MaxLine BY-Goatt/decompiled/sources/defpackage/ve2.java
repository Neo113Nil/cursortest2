package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ve2 {
    public static final Class a;
    public static final e23 b;
    public static final e23 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        q52 q52Var = q52.c;
        e23 e23Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            q52 q52Var2 = q52.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e23Var = (e23) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = e23Var;
        c = new e23();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += kv.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (kv.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (kv.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += kv.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += kv.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += kv.i((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += kv.j((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += kv.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += kv.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(e23 e23Var, Object obj, Object obj2) {
        e23Var.getClass();
        vu0 vu0Var = (vu0) obj;
        d23 d23Var = vu0Var.unknownFields;
        d23 d23Var2 = ((vu0) obj2).unknownFields;
        d23 d23Var3 = d23.f;
        if (!d23Var3.equals(d23Var2)) {
            if (d23Var3.equals(d23Var)) {
                int i = d23Var.a + d23Var2.a;
                int[] copyOf = Arrays.copyOf(d23Var.b, i);
                System.arraycopy(d23Var2.b, 0, copyOf, d23Var.a, d23Var2.a);
                Object[] copyOf2 = Arrays.copyOf(d23Var.c, i);
                System.arraycopy(d23Var2.c, 0, copyOf2, d23Var.a, d23Var2.a);
                d23Var = new d23(i, copyOf, copyOf2, true);
            } else {
                d23Var.getClass();
                if (!d23Var2.equals(d23Var3)) {
                    if (!d23Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = d23Var.a + d23Var2.a;
                    d23Var.a(i2);
                    System.arraycopy(d23Var2.b, 0, d23Var.b, d23Var.a, d23Var2.a);
                    System.arraycopy(d23Var2.c, 0, d23Var.c, d23Var.a, d23Var2.a);
                    d23Var.a = i2;
                }
            }
        }
        vu0Var.unknownFields = d23Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = kv.f;
            i3++;
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                kvVar.getClass();
                kvVar.t(Double.doubleToRawLongBits(doubleValue), i);
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = kv.f;
            i3 += 8;
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += kv.j(((Integer) list.get(i4)).intValue());
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = kv.f;
            i3 += 4;
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.t(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = kv.f;
            i3 += 8;
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                kvVar.getClass();
                kvVar.r(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = kv.f;
            i3 += 4;
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += kv.j(((Integer) list.get(i4)).intValue());
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.E(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += kv.j(((Long) list.get(i4)).longValue());
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = kv.f;
            i3 += 4;
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.t(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = kv.f;
            i3 += 8;
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                kvVar.C(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += kv.i((intValue2 >> 31) ^ (intValue2 << 1));
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            kvVar.D((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                kvVar.E((longValue >> 63) ^ (longValue << 1), i);
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += kv.j((longValue2 >> 63) ^ (longValue2 << 1));
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            kvVar.F((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += kv.i(((Integer) list.get(i4)).intValue());
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, ar0 ar0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kv kvVar = (kv) ar0Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kvVar.E(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        kvVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += kv.j(((Long) list.get(i4)).longValue());
        }
        kvVar.D(i3);
        while (i2 < list.size()) {
            kvVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, e41 e41Var, Object obj2, e23 e23Var) {
        return obj2;
    }
}
