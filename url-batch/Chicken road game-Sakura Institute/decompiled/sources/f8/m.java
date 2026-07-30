package f8;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final s f3625a;

    static {
        s sVar;
        try {
            Class.forName("java.nio.file.Files");
            sVar = new t();
        } catch (ClassNotFoundException unused) {
            sVar = new s();
        }
        f3625a = sVar;
        String str = w.f3645g;
        String property = System.getProperty("java.io.tmpdir");
        r6.k.e(property, "getProperty(...)");
        j4.i.m(property, false);
        ClassLoader classLoader = g8.f.class.getClassLoader();
        r6.k.e(classLoader, "getClassLoader(...)");
        new g8.f(classLoader);
    }

    public abstract void a(w wVar, w wVar2);

    public abstract void b(w wVar);

    public abstract void c(w wVar);

    public final boolean d(w wVar) {
        r6.k.f(wVar, "path");
        return e(wVar) != null;
    }

    public abstract l e(w wVar);

    public abstract r f(w wVar);

    public abstract r g(w wVar);

    public abstract g0 h(w wVar);
}
