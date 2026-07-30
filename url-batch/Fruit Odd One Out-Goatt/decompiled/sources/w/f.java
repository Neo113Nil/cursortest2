package w;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f extends d1.i implements c1.a {

    /* renamed from: c, reason: collision with root package name */
    public static final f f1215c = new f(0);

    @Override // c1.a
    public final Object a() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new s.b(classLoader)) : null;
            if (eVar == null || (a2 = eVar.a()) == null) {
                return null;
            }
            classLoader.getClass();
            s.b bVar = new s.b(classLoader);
            int a3 = t.e.a();
            return a3 >= 2 ? new y.d(a2) : a3 == 1 ? new y.c(a2, bVar) : new y.a();
        } catch (Throwable unused) {
            g gVar = g.f1216a;
            return null;
        }
    }
}
