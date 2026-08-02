package a0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import c0.C0166a;
import c0.C0168c;
import c0.C0169d;

/* loaded from: classes.dex */
public final class f extends Q0.i implements P0.a {

    /* renamed from: f, reason: collision with root package name */
    public static final f f1271f = new f(0);

    @Override // P0.a
    public final Object g() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            C0137e c0137e = classLoader != null ? new C0137e(classLoader, new W.a(classLoader)) : null;
            if (c0137e == null || (a2 = c0137e.a()) == null) {
                return null;
            }
            Q0.h.d(classLoader, "loader");
            W.a aVar = new W.a(classLoader);
            int a3 = X.e.a();
            return a3 >= 2 ? new C0169d(a2) : a3 == 1 ? new C0168c(a2, aVar) : new C0166a();
        } catch (Throwable unused) {
            g gVar = g.f1272a;
            return null;
        }
    }
}
