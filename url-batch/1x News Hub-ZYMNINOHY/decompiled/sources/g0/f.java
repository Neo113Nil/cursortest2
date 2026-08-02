package g0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import b0.s;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final f f5024e = new f(0);

    @Override // l2.a
    public final Object invoke() {
        WindowLayoutComponent a3;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new s(loader)) : null;
            if (eVar != null && (a3 = eVar.a()) != null) {
                kotlin.jvm.internal.j.d(loader, "loader");
                s sVar = new s(loader);
                int a4 = d0.e.a();
                return a4 >= 2 ? new i0.d(a3) : a4 == 1 ? new i0.c(a3, sVar) : new i0.a();
            }
        } catch (Throwable unused) {
            g gVar = g.f5025a;
        }
        return null;
    }
}
