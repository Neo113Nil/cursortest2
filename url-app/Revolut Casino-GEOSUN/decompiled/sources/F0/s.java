package F0;

import u0.InterfaceC0241a;

/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i2, Object obj) {
        if (obj == null || b(i2, obj)) {
            return;
        }
        String e2 = h.e("kotlin.jvm.functions.Function", i2);
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + e2);
        i.f(classCastException, s.class.getName());
        throw classCastException;
    }

    public static boolean b(int i2, Object obj) {
        if (obj instanceof InterfaceC0241a) {
            return (obj instanceof f ? ((f) obj).h() : obj instanceof E0.a ? 0 : obj instanceof E0.l ? 1 : obj instanceof E0.p ? 2 : obj instanceof E0.q ? 3 : -1) == i2;
        }
        return false;
    }
}
