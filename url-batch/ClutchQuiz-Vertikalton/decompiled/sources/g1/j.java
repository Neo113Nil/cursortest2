package g1;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2571a;

    static {
        k kVar = null;
        try {
            kVar = (k) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kVar == null) {
            kVar = new k();
        }
        f2571a = kVar;
    }

    public static c a(Class cls) {
        f2571a.getClass();
        return new c(cls);
    }
}
