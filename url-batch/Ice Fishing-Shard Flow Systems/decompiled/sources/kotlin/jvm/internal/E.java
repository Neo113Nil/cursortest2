package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public static final F f6153a;

    static {
        F f7 = null;
        try {
            f7 = (F) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (f7 == null) {
            f7 = new F();
        }
        f6153a = f7;
    }

    public static C0643h a(Class cls) {
        f6153a.getClass();
        return new C0643h(cls);
    }
}
