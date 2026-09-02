package v;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import r.C0092a;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1276a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f1277b;

    /* renamed from: c, reason: collision with root package name */
    public final r.b f1278c;

    public C0102e(ClassLoader classLoader, r.b bVar) {
        this.f1276a = classLoader;
        this.f1277b = bVar;
        this.f1278c = new r.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        r.b bVar = this.f1278c;
        bVar.getClass();
        boolean z2 = false;
        try {
            e0.h.d(bVar.f1234a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (a.a.D("WindowExtensionsProvider#getWindowExtensions is not valid", new C0092a(0, bVar)) && a.a.D("WindowExtensions#getWindowLayoutComponent is not valid", new C0101d(this, 3)) && a.a.D("FoldingFeature class is not valid", new C0101d(this, 0))) {
                int a2 = s.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (a.a.D("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0101d(this, 2))) {
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
        return a.a.D("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0101d(this, 1));
    }
}
