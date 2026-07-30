package d1;

import c1.p;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class n {
    public static void a(int i2, Object obj) {
        if (obj == null || b(i2, obj)) {
            return;
        }
        String name = obj.getClass().getName();
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + ("kotlin.jvm.functions.Function" + i2));
        h.b(classCastException, n.class.getName());
        throw classCastException;
    }

    public static boolean b(int i2, Object obj) {
        if (obj instanceof t0.a) {
            if ((obj instanceof f ? ((f) obj).c() : obj instanceof c1.a ? 0 : obj instanceof c1.l ? 1 : obj instanceof p ? 2 : obj instanceof m1.b ? 3 : -1) == i2) {
                return true;
            }
        }
        return false;
    }
}
