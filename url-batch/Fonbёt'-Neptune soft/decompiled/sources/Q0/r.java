package Q0;

/* loaded from: classes.dex */
public abstract class r {
    public static void a(int i2, Object obj) {
        if (obj == null || b(i2, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static boolean b(int i2, Object obj) {
        if (obj instanceof F0.a) {
            return (obj instanceof f ? ((f) obj).d() : obj instanceof P0.a ? 0 : obj instanceof P0.l ? 1 : obj instanceof P0.p ? 2 : obj instanceof P0.q ? 3 : -1) == i2;
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        h.f(classCastException, r.class.getName());
        throw classCastException;
    }
}
