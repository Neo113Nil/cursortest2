package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class x61 {
    public static final Class a;
    public static final fl1 b;
    public static final fl1 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        i01 i01Var = i01.c;
        fl1 fl1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            i01 i01Var2 = i01.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                fl1Var = (fl1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = fl1Var;
        c = new fl1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += wh.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (wh.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (wh.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += wh.j(((Integer) list.get(i2)).intValue());
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
            i += wh.j(((Long) list.get(i2)).longValue());
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
            i += wh.i((intValue >> 31) ^ (intValue << 1));
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
            i += wh.j((longValue >> 63) ^ (longValue << 1));
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
            i += wh.i(((Integer) list.get(i2)).intValue());
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
            i += wh.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(fl1 fl1Var, Object obj, Object obj2) {
        fl1Var.getClass();
        m40 m40Var = (m40) obj;
        el1 el1Var = m40Var.unknownFields;
        el1 el1Var2 = ((m40) obj2).unknownFields;
        el1 el1Var3 = el1.f;
        if (!el1Var3.equals(el1Var2)) {
            if (el1Var3.equals(el1Var)) {
                int i = el1Var.a + el1Var2.a;
                int[] copyOf = Arrays.copyOf(el1Var.b, i);
                System.arraycopy(el1Var2.b, 0, copyOf, el1Var.a, el1Var2.a);
                Object[] copyOf2 = Arrays.copyOf(el1Var.c, i);
                System.arraycopy(el1Var2.c, 0, copyOf2, el1Var.a, el1Var2.a);
                el1Var = new el1(i, copyOf, copyOf2, true);
            } else {
                el1Var.getClass();
                if (!el1Var2.equals(el1Var3)) {
                    if (!el1Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = el1Var.a + el1Var2.a;
                    el1Var.a(i2);
                    System.arraycopy(el1Var2.b, 0, el1Var.b, el1Var.a, el1Var2.a);
                    System.arraycopy(el1Var2.c, 0, el1Var.c, el1Var.a, el1Var2.a);
                    el1Var.a = i2;
                }
            }
        }
        m40Var.unknownFields = el1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = wh.f;
            i3++;
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                whVar.getClass();
                whVar.t(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = wh.f;
            i3 += 8;
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += wh.j(((Integer) list.get(i4)).intValue());
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = wh.f;
            i3 += 4;
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = wh.f;
            i3 += 8;
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                whVar.getClass();
                whVar.r(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = wh.f;
            i3 += 4;
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += wh.j(((Integer) list.get(i4)).intValue());
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += wh.j(((Long) list.get(i4)).longValue());
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = wh.f;
            i3 += 4;
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = wh.f;
            i3 += 8;
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                whVar.C(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += wh.i((intValue2 >> 31) ^ (intValue2 << 1));
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            whVar.D((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                whVar.E(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += wh.j((longValue2 >> 63) ^ (longValue2 << 1));
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            whVar.F((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += wh.i(((Integer) list.get(i4)).intValue());
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, s40 s40Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        wh whVar = (wh) s40Var.e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                whVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        whVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += wh.j(((Long) list.get(i4)).longValue());
        }
        whVar.D(i3);
        while (i2 < list.size()) {
            whVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, ha0 ha0Var, Object obj2, fl1 fl1Var) {
        return obj2;
    }
}
