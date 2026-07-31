package N2;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final r f2947a;

    static {
        r rVar;
        try {
            Class.forName("java.nio.file.Files");
            rVar = new s();
        } catch (ClassNotFoundException unused) {
            rVar = new r();
        }
        f2947a = rVar;
        String str = v.f2966e;
        String property = System.getProperty("java.io.tmpdir");
        Z1.i.e(property, "getProperty(...)");
        F0.a.l(property, false);
        ClassLoader classLoader = O2.e.class.getClassLoader();
        Z1.i.e(classLoader, "getClassLoader(...)");
        new O2.e(classLoader);
    }

    public final boolean a(v vVar) {
        Z1.i.f(vVar, "path");
        return b(vVar) != null;
    }

    public abstract l b(v vVar);

    public abstract q c(v vVar);
}
