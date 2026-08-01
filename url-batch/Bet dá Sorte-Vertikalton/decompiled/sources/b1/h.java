package b1;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1588a;

    static {
        i iVar = null;
        try {
            iVar = (i) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (iVar == null) {
            iVar = new i();
        }
        f1588a = iVar;
    }

    public static b a(Class cls) {
        f1588a.getClass();
        return new b(cls);
    }
}
