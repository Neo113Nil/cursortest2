package X0;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1016a;

    static {
        j jVar = null;
        try {
            jVar = (j) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (jVar == null) {
            jVar = new j();
        }
        f1016a = jVar;
    }

    public static c a(Class cls) {
        f1016a.getClass();
        return new c(cls);
    }
}
