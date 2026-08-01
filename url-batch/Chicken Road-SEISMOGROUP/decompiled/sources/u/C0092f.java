package u;

import androidx.window.extensions.layout.WindowLayoutComponent;
import w.C0095a;
import w.C0097c;
import w.C0098d;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092f extends e0.i implements d0.a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0092f f1276c = new C0092f(0);

    @Override // d0.a
    public final Object a() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            C0091e c0091e = classLoader != null ? new C0091e(classLoader, new q.b(classLoader)) : null;
            if (c0091e == null || (a2 = c0091e.a()) == null) {
                return null;
            }
            e0.h.d(classLoader, "loader");
            q.b bVar = new q.b(classLoader);
            int a3 = r.e.a();
            return a3 >= 2 ? new C0098d(a2) : a3 == 1 ? new C0097c(a2, bVar) : new C0095a();
        } catch (Throwable unused) {
            C0093g c0093g = C0093g.f1277a;
            return null;
        }
    }
}
