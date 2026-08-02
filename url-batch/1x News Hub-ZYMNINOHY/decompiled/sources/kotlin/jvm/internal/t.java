package kotlin.jvm.internal;

import E1.AbstractC0033i;
import b2.InterfaceC0187a;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t {
    public static Map a(Object obj) {
        if (obj instanceof m2.a) {
            d(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e3) {
            j.f(e3, t.class.getName());
            throw e3;
        }
    }

    public static void b(int i3, Object obj) {
        if (obj == null || c(i3, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i3);
        throw null;
    }

    public static boolean c(int i3, Object obj) {
        if (obj instanceof InterfaceC0187a) {
            if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof l2.a ? 0 : obj instanceof l2.l ? 1 : obj instanceof l2.p ? 2 : obj instanceof l2.q ? 3 : -1) == i3) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC0033i.k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        j.f(classCastException, t.class.getName());
        throw classCastException;
    }
}
