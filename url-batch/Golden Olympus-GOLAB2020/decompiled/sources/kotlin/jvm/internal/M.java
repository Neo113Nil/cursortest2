package kotlin.jvm.internal;

import i2.InterfaceC2471a;
import i2.InterfaceC2472b;
import i2.InterfaceC2473c;
import i2.InterfaceC2474d;
import i2.InterfaceC2475e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class M {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC2471a) && !(obj instanceof InterfaceC2472b)) {
            p(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC2471a) && !(obj instanceof InterfaceC2473c)) {
            p(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof InterfaceC2471a) && !(obj instanceof InterfaceC2474d)) {
            p(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof InterfaceC2471a) && !(obj instanceof InterfaceC2475e)) {
            p(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i4) {
        if (obj != null && !k(obj, i4)) {
            p(obj, "kotlin.jvm.functions.Function" + i4);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e4) {
            throw o(e4);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e4) {
            throw o(e4);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e4) {
            throw o(e4);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e4) {
            throw o(e4);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof InterfaceC3248n) {
            return ((InterfaceC3248n) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof h2.n) {
            return 3;
        }
        return obj instanceof h2.p ? 5 : -1;
    }

    public static boolean k(Object obj, int i4) {
        return (obj instanceof W1.e) && j(obj) == i4;
    }

    public static boolean l(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC2471a) || (obj instanceof InterfaceC2474d);
        }
        return false;
    }

    public static boolean m(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof InterfaceC2471a) || (obj instanceof InterfaceC2475e);
        }
        return false;
    }

    private static Throwable n(Throwable th) {
        return Intrinsics.sanitizeStackTrace(th, M.class.getName());
    }

    public static ClassCastException o(ClassCastException classCastException) {
        throw ((ClassCastException) n(classCastException));
    }

    public static void p(Object obj, String str) {
        q((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void q(String str) {
        throw o(new ClassCastException(str));
    }
}
