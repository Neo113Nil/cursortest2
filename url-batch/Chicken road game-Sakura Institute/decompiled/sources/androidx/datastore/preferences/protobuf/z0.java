package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f929a;

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f930b;

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f931c;

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f932d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f929a = cls;
        f930b = w(false);
        f931c = w(true);
        f932d = new j1();
    }

    public static void A(int i7, List list, h0 h0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((l) h0Var.f831a).A(i7, (g) list.get(i8));
        }
    }

    public static void B(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                lVar.getClass();
                lVar.E(Double.doubleToRawLongBits(doubleValue), i7);
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = l.f855h;
            i9 += 8;
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.F(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void C(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.G(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += l.q(((Integer) list.get(i10)).intValue());
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.H(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void D(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.C(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = l.f855h;
            i9 += 4;
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.D(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void E(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.E(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = l.f855h;
            i9 += 8;
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.F(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void F(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                lVar.getClass();
                lVar.C(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = l.f855h;
            i9 += 4;
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.D(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    public static void G(int i7, List list, h0 h0Var, y0 y0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            h0Var.b(i7, list.get(i8), y0Var);
        }
    }

    public static void H(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.G(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += l.q(((Integer) list.get(i10)).intValue());
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.H(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void I(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.O(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += l.u(((Long) list.get(i10)).longValue());
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.P(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void J(int i7, List list, h0 h0Var, y0 y0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((l) h0Var.f831a).I(i7, (a) list.get(i8), y0Var);
        }
    }

    public static void K(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.C(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = l.f855h;
            i9 += 4;
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.D(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void L(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.E(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = l.f855h;
            i9 += 8;
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.F(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void M(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                int intValue = ((Integer) list.get(i8)).intValue();
                lVar.M(i7, (intValue >> 31) ^ (intValue << 1));
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            i9 += l.t((intValue2 >> 31) ^ (intValue2 << 1));
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            int intValue3 = ((Integer) list.get(i8)).intValue();
            lVar.N((intValue3 >> 31) ^ (intValue3 << 1));
            i8++;
        }
    }

    public static void N(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                long longValue = ((Long) list.get(i8)).longValue();
                lVar.O((longValue >> 63) ^ (longValue << 1), i7);
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = ((Long) list.get(i10)).longValue();
            i9 += l.u((longValue2 >> 63) ^ (longValue2 << 1));
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            long longValue3 = ((Long) list.get(i8)).longValue();
            lVar.P((longValue3 >> 63) ^ (longValue3 << 1));
            i8++;
        }
    }

    public static void O(int i7, List list, h0 h0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!(list instanceof c0)) {
            while (i8 < list.size()) {
                lVar.J((String) list.get(i8), i7);
                i8++;
            }
            return;
        }
        c0 c0Var = (c0) list;
        while (i8 < list.size()) {
            Object p6 = c0Var.p(i8);
            if (p6 instanceof String) {
                lVar.J((String) p6, i7);
            } else {
                lVar.A(i7, (g) p6);
            }
            i8++;
        }
    }

    public static void P(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.M(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += l.t(((Integer) list.get(i10)).intValue());
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.N(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void Q(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.O(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += l.u(((Long) list.get(i10)).longValue());
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.P(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s5 = l.s(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            s5 += l.m((g) list.get(i8));
        }
        return s5;
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.s(i7) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += l.q(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.n(i7) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.o(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.s(i7) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += l.q(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int j(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (l.s(i7) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += l.u(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int l(int i7, List list, y0 y0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s5 = l.s(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int a3 = ((a) list.get(i8)).a(y0Var);
            s5 += l.t(a3) + a3;
        }
        return s5;
    }

    public static int m(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.s(i7) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i7 += l.t((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int o(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.s(i7) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i7 += l.u((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int s5 = l.s(i7) * size;
        if (!(list instanceof c0)) {
            while (i8 < size) {
                Object obj = list.get(i8);
                if (obj instanceof g) {
                    int size2 = ((g) obj).size();
                    s5 = l.t(size2) + size2 + s5;
                } else {
                    s5 = l.r((String) obj) + s5;
                }
                i8++;
            }
            return s5;
        }
        c0 c0Var = (c0) list;
        while (i8 < size) {
            Object p6 = c0Var.p(i8);
            if (p6 instanceof g) {
                int size3 = ((g) p6).size();
                s5 = l.t(size3) + size3 + s5;
            } else {
                s5 = l.r((String) p6) + s5;
            }
            i8++;
        }
        return s5;
    }

    public static int r(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.s(i7) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += l.t(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int t(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.s(i7) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += l.u(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static j1 w(boolean z8) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (j1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z8));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void x(j1 j1Var, Object obj, Object obj2) {
        j1Var.getClass();
        v vVar = (v) obj;
        i1 i1Var = vVar.unknownFields;
        i1 i1Var2 = ((v) obj2).unknownFields;
        i1 i1Var3 = i1.f843f;
        if (!i1Var3.equals(i1Var2)) {
            if (i1Var3.equals(i1Var)) {
                int i7 = i1Var.f844a + i1Var2.f844a;
                int[] copyOf = Arrays.copyOf(i1Var.f845b, i7);
                System.arraycopy(i1Var2.f845b, 0, copyOf, i1Var.f844a, i1Var2.f844a);
                Object[] copyOf2 = Arrays.copyOf(i1Var.f846c, i7);
                System.arraycopy(i1Var2.f846c, 0, copyOf2, i1Var.f844a, i1Var2.f844a);
                i1Var = new i1(i7, copyOf, copyOf2, true);
            } else {
                i1Var.getClass();
                if (!i1Var2.equals(i1Var3)) {
                    if (!i1Var.f848e) {
                        throw new UnsupportedOperationException();
                    }
                    int i8 = i1Var.f844a + i1Var2.f844a;
                    i1Var.a(i8);
                    System.arraycopy(i1Var2.f845b, 0, i1Var.f845b, i1Var.f844a, i1Var2.f844a);
                    System.arraycopy(i1Var2.f846c, 0, i1Var.f846c, i1Var.f844a, i1Var2.f844a);
                    i1Var.f844a = i8;
                }
            }
        }
        vVar.unknownFields = i1Var;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i7, List list, h0 h0Var, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f831a;
        int i8 = 0;
        if (!z8) {
            while (i8 < list.size()) {
                lVar.z(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        lVar.L(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = l.f855h;
            i9++;
        }
        lVar.N(i9);
        while (i8 < list.size()) {
            lVar.x(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public static Object v(Object obj, int i7, List list, Object obj2, j1 j1Var) {
        return obj2;
    }
}
