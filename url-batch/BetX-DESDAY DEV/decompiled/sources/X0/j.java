package X0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f876a;

    static {
        k kVar = null;
        try {
            kVar = (k) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kVar == null) {
            kVar = new k();
        }
        f876a = kVar;
    }

    public static b a(Class cls) {
        f876a.getClass();
        return new b(cls);
    }
}
