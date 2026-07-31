package Z1;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final v f3481a;

    static {
        v vVar = null;
        try {
            vVar = (v) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (vVar == null) {
            vVar = new v();
        }
        f3481a = vVar;
    }

    public static d a(Class cls) {
        f3481a.getClass();
        return new d(cls);
    }
}
