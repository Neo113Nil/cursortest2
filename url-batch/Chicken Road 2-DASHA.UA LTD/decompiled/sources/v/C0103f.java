package v;

import androidx.window.extensions.layout.WindowLayoutComponent;
import x.C0113a;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103f extends e0.i implements d0.a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0103f f1279c = new C0103f(0);

    @Override // d0.a
    public final Object a() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = InterfaceC0105h.class.getClassLoader();
            C0102e c0102e = classLoader != null ? new C0102e(classLoader, new r.b(classLoader)) : null;
            if (c0102e == null || (a2 = c0102e.a()) == null) {
                return null;
            }
            e0.h.d(classLoader, "loader");
            r.b bVar = new r.b(classLoader);
            int a3 = s.e.a();
            return a3 >= 2 ? new x.d(a2) : a3 == 1 ? new x.c(a2, bVar) : new C0113a();
        } catch (Throwable unused) {
            C0104g c0104g = C0104g.f1280a;
            return null;
        }
    }
}
