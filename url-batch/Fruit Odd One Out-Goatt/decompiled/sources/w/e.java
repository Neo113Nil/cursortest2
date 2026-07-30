package w;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1212a;

    /* renamed from: b, reason: collision with root package name */
    public final s.b f1213b;

    /* renamed from: c, reason: collision with root package name */
    public final s.b f1214c;

    public e(ClassLoader classLoader, s.b bVar) {
        this.f1212a = classLoader;
        this.f1213b = bVar;
        this.f1214c = new s.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        s.b bVar = this.f1214c;
        bVar.getClass();
        boolean z2 = false;
        try {
            bVar.f1147a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (a.a.E("WindowExtensionsProvider#getWindowExtensions is not valid", new s.a(0, bVar)) && a.a.E("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && a.a.E("FoldingFeature class is not valid", new d(this, 0))) {
                int a2 = t.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (a.a.E("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
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
        return a.a.E("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
