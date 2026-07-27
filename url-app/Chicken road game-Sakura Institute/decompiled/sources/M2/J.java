package M2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC1332g;

/* loaded from: classes.dex */
public abstract class J {
    public static Collection a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof N2.a) || (abstractCollection instanceof N2.b)) {
            return abstractCollection;
        }
        g(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static List b(Object obj) {
        if ((obj instanceof N2.a) && !(obj instanceof N2.c)) {
            g(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e4) {
            Intrinsics.f(e4, J.class.getName());
            throw e4;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof N2.a) && !(obj instanceof N2.e)) {
            g(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e4) {
            Intrinsics.f(e4, J.class.getName());
            throw e4;
        }
    }

    public static void d(int i2, Object obj) {
        if (obj == null || e(i2, obj)) {
            return;
        }
        g(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static boolean e(int i2, Object obj) {
        int i4;
        if (!(obj instanceof InterfaceC1332g)) {
            return false;
        }
        if (obj instanceof l) {
            i4 = ((l) obj).getArity();
        } else if (obj instanceof Function0) {
            i4 = 0;
        } else if (obj instanceof Function1) {
            i4 = 1;
        } else if (obj instanceof Function2) {
            i4 = 2;
        } else if (obj instanceof L2.c) {
            i4 = 3;
        } else if (obj instanceof L2.d) {
            i4 = 4;
        } else {
            boolean z4 = obj instanceof O.a;
            i4 = z4 ? 5 : z4 ? 6 : z4 ? 7 : z4 ? 8 : z4 ? 9 : z4 ? 10 : z4 ? 11 : z4 ? 13 : z4 ? 14 : z4 ? 15 : z4 ? 16 : z4 ? 17 : z4 ? 18 : z4 ? 19 : z4 ? 20 : z4 ? 21 : -1;
        }
        return i4 == i2;
    }

    public static final C0249a f(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new C0249a(array);
    }

    public static void g(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        Intrinsics.f(classCastException, J.class.getName());
        throw classCastException;
    }
}
