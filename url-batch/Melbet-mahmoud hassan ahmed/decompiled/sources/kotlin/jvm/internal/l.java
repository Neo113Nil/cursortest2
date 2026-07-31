package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final m f18310a;

    /* renamed from: b, reason: collision with root package name */
    private static final j6.c[] f18311b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mVar == null) {
            mVar = new m();
        }
        f18310a = mVar;
        f18311b = new j6.c[0];
    }

    public static j6.e a(g gVar) {
        return f18310a.a(gVar);
    }

    public static j6.c b(Class cls) {
        return f18310a.b(cls);
    }

    public static j6.d c(Class cls) {
        return f18310a.c(cls, "");
    }

    public static String d(f fVar) {
        return f18310a.d(fVar);
    }

    public static String e(j jVar) {
        return f18310a.e(jVar);
    }
}
