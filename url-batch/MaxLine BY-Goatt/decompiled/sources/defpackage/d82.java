package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class d82 {
    public static final f82 a;

    static {
        f82 f82Var = null;
        try {
            f82Var = (f82) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (f82Var == null) {
            f82Var = new f82();
        }
        a = f82Var;
    }

    public static gu a(Class cls) {
        a.getClass();
        return new gu(cls);
    }
}
