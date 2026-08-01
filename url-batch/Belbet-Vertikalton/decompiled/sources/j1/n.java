package j1;

import i1.InterfaceC0181a;
import i1.InterfaceC0192l;
import i1.p;
import i1.q;

/* loaded from: classes.dex */
public abstract class n {
    public static void a(int i, Object obj) {
        if (obj == null || b(i, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean b(int i, Object obj) {
        if (obj instanceof W0.a) {
            return (obj instanceof f ? ((f) obj).f() : obj instanceof InterfaceC0181a ? 0 : obj instanceof InterfaceC0192l ? 1 : obj instanceof p ? 2 : obj instanceof q ? 3 : obj instanceof l0.b ? 4 : -1) == i;
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        h.g(classCastException, n.class.getName());
        throw classCastException;
    }
}
