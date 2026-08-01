package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class b90 {
    public static final c90 a;

    static {
        c90 c90Var = null;
        try {
            c90Var = (c90) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c90Var == null) {
            c90Var = new c90();
        }
        a = c90Var;
    }

    public static dc a(Class cls) {
        a.getClass();
        return new dc(cls);
    }
}
