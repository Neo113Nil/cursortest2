package z3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final r f12017a;

    static {
        r rVar;
        try {
            Class.forName("java.nio.file.Files");
            rVar = new s();
        } catch (ClassNotFoundException unused) {
            rVar = new r();
        }
        f12017a = rVar;
        String str = v.f12037e;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        E1.i.i(property, false);
        ClassLoader classLoader = A3.g.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        new A3.g(classLoader);
    }

    public final boolean a(v path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return b(path) != null;
    }

    public abstract l b(v vVar);

    public abstract q c(v vVar);
}
