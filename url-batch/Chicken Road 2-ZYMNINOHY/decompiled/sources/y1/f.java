package y1;

import androidx.window.extensions.layout.WindowLayoutComponent;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public static final f f16245e = new f(0);

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        WindowLayoutComponent a3;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new u1.b(loader)) : null;
            if (eVar == null || (a3 = eVar.a()) == null) {
                return null;
            }
            kotlin.jvm.internal.i.d(loader, "loader");
            u1.b bVar = new u1.b(loader);
            int a4 = v1.e.a();
            return a4 >= 2 ? new A1.d(a3) : a4 == 1 ? new A1.c(a3, bVar) : new A1.a();
        } catch (Throwable unused) {
            g gVar = g.f16246a;
            return null;
        }
    }
}
