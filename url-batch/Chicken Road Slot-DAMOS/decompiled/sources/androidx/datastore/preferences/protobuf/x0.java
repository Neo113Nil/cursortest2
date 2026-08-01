package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f649a;

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f650b;

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f651c;

    static {
        Class<?> cls;
        Class<?> cls2;
        t0 t0Var = t0.f636c;
        e1 e1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f649a = cls;
        try {
            t0 t0Var2 = t0.f636c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e1Var = (e1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f650b = e1Var;
        f651c = new e1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += l.j(((Integer) list.get(i10)).intValue());
        }
        return i3;
    }

    public static int b(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h(i3) + 4) * size;
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h(i3) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += l.j(((Integer) list.get(i10)).intValue());
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += l.j(((Long) list.get(i10)).longValue());
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) list.get(i10)).intValue();
            i3 += l.i((intValue >> 31) ^ (intValue << 1));
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i3 += l.j((longValue >> 63) ^ (longValue << 1));
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += l.i(((Integer) list.get(i10)).intValue());
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += l.j(((Long) list.get(i10)).longValue());
        }
        return i3;
    }

    public static void k(e1 e1Var, Object obj, Object obj2) {
        e1Var.getClass();
        v vVar = (v) obj;
        d1 d1Var = vVar.unknownFields;
        d1 d1Var2 = ((v) obj2).unknownFields;
        d1 d1Var3 = d1.f524f;
        if (!d1Var3.equals(d1Var2)) {
            if (d1Var3.equals(d1Var)) {
                int i3 = d1Var.f525a + d1Var2.f525a;
                int[] copyOf = Arrays.copyOf(d1Var.f526b, i3);
                System.arraycopy(d1Var2.f526b, 0, copyOf, d1Var.f525a, d1Var2.f525a);
                Object[] copyOf2 = Arrays.copyOf(d1Var.f527c, i3);
                System.arraycopy(d1Var2.f527c, 0, copyOf2, d1Var.f525a, d1Var2.f525a);
                d1Var = new d1(i3, copyOf, copyOf2, true);
            } else {
                d1Var.getClass();
                if (!d1Var2.equals(d1Var3)) {
                    if (!d1Var.f529e) {
                        a2.r.a();
                        return;
                    }
                    int i10 = d1Var.f525a + d1Var2.f525a;
                    d1Var.a(i10);
                    System.arraycopy(d1Var2.f526b, 0, d1Var.f526b, d1Var.f525a, d1Var2.f525a);
                    System.arraycopy(d1Var2.f527c, 0, d1Var.f527c, d1Var.f525a, d1Var2.f525a);
                    d1Var.f525a = i10;
                }
            }
        }
        vVar.unknownFields = d1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.o(i3, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = l.f577f;
            i11++;
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.m(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void n(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                lVar.getClass();
                lVar.t(i3, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = l.f577f;
            i11 += 8;
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.u(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void o(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.v(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += l.j(((Integer) list.get(i12)).intValue());
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.w(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void p(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.r(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = l.f577f;
            i11 += 4;
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.s(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void q(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.t(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = l.f577f;
            i11 += 8;
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.u(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void r(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                lVar.getClass();
                lVar.r(i3, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = l.f577f;
            i11 += 4;
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.s(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void s(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.v(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += l.j(((Integer) list.get(i12)).intValue());
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.w(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.E(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += l.j(((Long) list.get(i12)).longValue());
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.F(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.r(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = l.f577f;
            i11 += 4;
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.s(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void v(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.t(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = l.f577f;
            i11 += 8;
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.u(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void w(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                lVar.C(i3, (intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += l.i((intValue2 >> 31) ^ (intValue2 << 1));
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            lVar.D((intValue3 >> 31) ^ (intValue3 << 1));
            i10++;
        }
    }

    public static void x(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                lVar.E(i3, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += l.j((longValue2 >> 63) ^ (longValue2 << 1));
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            lVar.F((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void y(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.C(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += l.i(((Integer) list.get(i12)).intValue());
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.D(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void z(int i3, List list, f0 f0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) f0Var.f538a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                lVar.E(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        lVar.B(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += l.j(((Long) list.get(i12)).longValue());
        }
        lVar.D(i11);
        while (i10 < list.size()) {
            lVar.F(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static Object j(Object obj, int i3, w wVar, Object obj2, e1 e1Var) {
        return obj2;
    }
}
