package U;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class f extends F0.j implements E0.a {

    /* renamed from: f, reason: collision with root package name */
    public static final f f1010f = new f(0);

    @Override // E0.a
    public final Object d() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new Q.a(classLoader)) : null;
            if (eVar == null || (a2 = eVar.a()) == null) {
                return null;
            }
            F0.i.d(classLoader, "loader");
            Q.a aVar = new Q.a(classLoader);
            int a3 = R.e.a();
            return a3 >= 2 ? new W.d(a2) : a3 == 1 ? new W.c(a2, aVar) : new W.a();
        } catch (Throwable unused) {
            g gVar = g.f1011a;
            return null;
        }
    }
}
