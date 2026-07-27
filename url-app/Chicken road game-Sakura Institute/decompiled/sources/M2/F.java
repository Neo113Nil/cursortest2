package M2;

/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    public static final G f3581a;

    static {
        G g4 = null;
        try {
            g4 = (G) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (g4 == null) {
            g4 = new G();
        }
        f3581a = g4;
    }

    public static C0256h a(Class cls) {
        f3581a.getClass();
        return new C0256h(cls);
    }
}
