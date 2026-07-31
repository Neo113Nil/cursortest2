package T2;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final r f4427a;

    static {
        r rVar;
        try {
            Class.forName("java.nio.file.Files");
            rVar = new s();
        } catch (ClassNotFoundException unused) {
            rVar = new r();
        }
        f4427a = rVar;
        String str = v.f4446e;
        String property = System.getProperty("java.io.tmpdir");
        f2.j.e(property, "getProperty(...)");
        A1.i.l(property, false);
        ClassLoader classLoader = U2.e.class.getClassLoader();
        f2.j.e(classLoader, "getClassLoader(...)");
        new U2.e(classLoader);
    }

    public final boolean a(v vVar) {
        f2.j.f(vVar, "path");
        return b(vVar) != null;
    }

    public abstract l b(v vVar);

    public abstract q c(v vVar);
}
