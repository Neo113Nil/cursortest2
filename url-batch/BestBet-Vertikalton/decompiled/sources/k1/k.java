package k1;

import j1.InterfaceC0170a;
import j1.l;
import j1.p;
import l0.C0275b;

/* loaded from: classes.dex */
public abstract class k {
    public static void a(Object obj) {
        if (obj == null || b(2, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function2");
        throw null;
    }

    public static boolean b(int i, Object obj) {
        if (obj instanceof X0.a) {
            return (obj instanceof d ? ((d) obj).f() : obj instanceof InterfaceC0170a ? 0 : obj instanceof l ? 1 : obj instanceof p ? 2 : obj instanceof C0275b ? 4 : -1) == i;
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        e.g(classCastException, k.class.getName());
        throw classCastException;
    }
}
