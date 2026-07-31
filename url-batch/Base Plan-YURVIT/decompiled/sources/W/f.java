package W;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class f extends P0.i implements O0.a {

    /* renamed from: f, reason: collision with root package name */
    public static final f f888f = new f(0);

    @Override // O0.a
    public final Object h() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new S.a(classLoader)) : null;
            if (eVar == null || (a2 = eVar.a()) == null) {
                return null;
            }
            P0.h.d(classLoader, "loader");
            S.a aVar = new S.a(classLoader);
            int a3 = T.e.a();
            return a3 >= 2 ? new Y.d(a2) : a3 == 1 ? new Y.c(a2, aVar) : new Y.a();
        } catch (Throwable unused) {
            g gVar = g.f889a;
            return null;
        }
    }
}
