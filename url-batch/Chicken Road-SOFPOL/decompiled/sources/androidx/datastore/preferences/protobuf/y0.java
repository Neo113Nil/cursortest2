package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f796a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f797b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f798c;

    static {
        Class<?> cls;
        Class<?> cls2;
        u0 u0Var = u0.f784c;
        f1 f1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f796a = cls;
        try {
            u0 u0Var2 = u0.f784c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                f1Var = (f1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f797b = f1Var;
        f798c = new f1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i += m.N(((Integer) list.get(i8)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.L(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.L(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i += m.N(((Integer) list.get(i8)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i += m.N(((Long) list.get(i8)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i += m.M((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i += m.N((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i += m.M(((Integer) list.get(i8)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i += m.N(((Long) list.get(i8)).longValue());
        }
        return i;
    }

    public static void k(f1 f1Var, Object obj, Object obj2) {
        f1Var.getClass();
        w wVar = (w) obj;
        e1 e1Var = wVar.unknownFields;
        e1 e1Var2 = ((w) obj2).unknownFields;
        e1 e1Var3 = e1.f674f;
        if (!e1Var3.equals(e1Var2)) {
            if (e1Var3.equals(e1Var)) {
                int i = e1Var.f675a + e1Var2.f675a;
                int[] copyOf = Arrays.copyOf(e1Var.f676b, i);
                System.arraycopy(e1Var2.f676b, 0, copyOf, e1Var.f675a, e1Var2.f675a);
                Object[] copyOf2 = Arrays.copyOf(e1Var.f677c, i);
                System.arraycopy(e1Var2.f677c, 0, copyOf2, e1Var.f675a, e1Var2.f675a);
                e1Var = new e1(i, copyOf, copyOf2, true);
            } else {
                e1Var.getClass();
                if (!e1Var2.equals(e1Var3)) {
                    if (!e1Var.f679e) {
                        throw new UnsupportedOperationException();
                    }
                    int i8 = e1Var.f675a + e1Var2.f675a;
                    e1Var.a(i8);
                    System.arraycopy(e1Var2.f676b, 0, e1Var.f676b, e1Var.f675a, e1Var2.f675a);
                    System.arraycopy(e1Var2.f677c, 0, e1Var.f677c, e1Var.f675a, e1Var2.f675a);
                    e1Var.f675a = i8;
                }
            }
        }
        wVar.unknownFields = e1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.S(i, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = m.f725p;
            i9++;
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.Q(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public static void n(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                mVar.getClass();
                mVar.X(i, Double.doubleToRawLongBits(doubleValue));
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = m.f725p;
            i9 += 8;
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.Y(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void o(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.Z(i, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += m.N(((Integer) list.get(i10)).intValue());
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.a0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void p(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.V(i, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = m.f725p;
            i9 += 4;
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.W(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void q(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.X(i, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = m.f725p;
            i9 += 8;
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.Y(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void r(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                mVar.getClass();
                mVar.V(i, Float.floatToRawIntBits(floatValue));
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = m.f725p;
            i9 += 4;
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.W(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    public static void s(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.Z(i, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += m.N(((Integer) list.get(i10)).intValue());
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.a0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void t(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.h0(i, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += m.N(((Long) list.get(i10)).longValue());
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.i0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void u(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.V(i, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = m.f725p;
            i9 += 4;
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.W(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void v(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.X(i, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = m.f725p;
            i9 += 8;
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.Y(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void w(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                int intValue = ((Integer) list.get(i8)).intValue();
                mVar.f0(i, (intValue >> 31) ^ (intValue << 1));
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            i9 += m.M((intValue2 >> 31) ^ (intValue2 << 1));
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            int intValue3 = ((Integer) list.get(i8)).intValue();
            mVar.g0((intValue3 >> 31) ^ (intValue3 << 1));
            i8++;
        }
    }

    public static void x(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                long longValue = ((Long) list.get(i8)).longValue();
                mVar.h0(i, (longValue >> 63) ^ (longValue << 1));
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = ((Long) list.get(i10)).longValue();
            i9 += m.N((longValue2 >> 63) ^ (longValue2 << 1));
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            long longValue3 = ((Long) list.get(i8)).longValue();
            mVar.i0((longValue3 >> 63) ^ (longValue3 << 1));
            i8++;
        }
    }

    public static void y(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.f0(i, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += m.M(((Integer) list.get(i10)).intValue());
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.g0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void z(int i, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f687a;
        int i8 = 0;
        if (!z3) {
            while (i8 < list.size()) {
                mVar.h0(i, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        mVar.e0(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += m.N(((Long) list.get(i10)).longValue());
        }
        mVar.g0(i9);
        while (i8 < list.size()) {
            mVar.i0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static Object j(Object obj, int i, x xVar, Object obj2, f1 f1Var) {
        return obj2;
    }
}
