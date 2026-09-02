package f0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import b0.C0263b;
import c0.AbstractC0272e;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public static final f f4184f = new f(0);

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        WindowLayoutComponent a7;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new C0263b(loader)) : null;
            if (eVar == null || (a7 = eVar.a()) == null) {
                return null;
            }
            kotlin.jvm.internal.i.d(loader, "loader");
            C0263b c0263b = new C0263b(loader);
            int a8 = AbstractC0272e.a();
            return a8 >= 2 ? new h0.d(a7) : a8 == 1 ? new h0.c(a7, c0263b) : new h0.a();
        } catch (Throwable unused) {
            g gVar = g.f4185a;
            return null;
        }
    }
}
