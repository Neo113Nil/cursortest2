package W;

import F.U;
import android.app.Activity;
import android.content.Context;
import androidx.datastore.preferences.protobuf.k0;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f885a;

    /* renamed from: b, reason: collision with root package name */
    public final S.a f886b;

    /* renamed from: c, reason: collision with root package name */
    public final S.a f887c;

    public e(ClassLoader classLoader, S.a aVar) {
        this.f885a = classLoader;
        this.f886b = aVar;
        this.f887c = new S.a(classLoader);
    }

    public final WindowLayoutComponent a() {
        S.a aVar = this.f887c;
        aVar.getClass();
        boolean z2 = false;
        try {
            P0.h.d(aVar.f822a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (k0.J("WindowExtensionsProvider#getWindowExtensions is not valid", new U(2, aVar)) && k0.J("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && k0.J("FoldingFeature class is not valid", new d(this, 0))) {
                int a2 = T.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (k0.J("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        z2 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z2) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return k0.J("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
