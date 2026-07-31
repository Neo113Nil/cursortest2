package f2;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final w f5833a;

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (wVar == null) {
            wVar = new w();
        }
        f5833a = wVar;
    }

    public static d a(Class cls) {
        f5833a.getClass();
        return new d(cls);
    }
}
