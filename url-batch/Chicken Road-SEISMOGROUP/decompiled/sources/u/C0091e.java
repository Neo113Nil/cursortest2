package u;

import a.AbstractC0016a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import q.C0085a;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1273a;

    /* renamed from: b, reason: collision with root package name */
    public final q.b f1274b;

    /* renamed from: c, reason: collision with root package name */
    public final q.b f1275c;

    public C0091e(ClassLoader classLoader, q.b bVar) {
        this.f1273a = classLoader;
        this.f1274b = bVar;
        this.f1275c = new q.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        q.b bVar = this.f1275c;
        bVar.getClass();
        boolean z = false;
        try {
            e0.h.d(bVar.f1189a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (AbstractC0016a.F("WindowExtensionsProvider#getWindowExtensions is not valid", new C0085a(0, bVar)) && AbstractC0016a.F("WindowExtensions#getWindowLayoutComponent is not valid", new C0090d(this, 3)) && AbstractC0016a.F("FoldingFeature class is not valid", new C0090d(this, 0))) {
                int a2 = r.e.a();
                if (a2 == 1) {
                    z = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0016a.F("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0090d(this, 2))) {
                        z = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return AbstractC0016a.F("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0090d(this, 1));
    }
}
