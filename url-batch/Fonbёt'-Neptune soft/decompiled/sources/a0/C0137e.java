package a0;

import I.U;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1268a;

    /* renamed from: b, reason: collision with root package name */
    public final W.a f1269b;

    /* renamed from: c, reason: collision with root package name */
    public final W.a f1270c;

    public C0137e(ClassLoader classLoader, W.a aVar) {
        this.f1268a = classLoader;
        this.f1269b = aVar;
        this.f1270c = new W.a(classLoader);
    }

    public final WindowLayoutComponent a() {
        W.a aVar = this.f1270c;
        aVar.getClass();
        boolean z2 = false;
        try {
            Q0.h.d(aVar.f1113a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (i1.a.I("WindowExtensionsProvider#getWindowExtensions is not valid", new U(2, aVar)) && i1.a.I("WindowExtensions#getWindowLayoutComponent is not valid", new C0136d(this, 3)) && i1.a.I("FoldingFeature class is not valid", new C0136d(this, 0))) {
                int a2 = X.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (i1.a.I("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0136d(this, 2))) {
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
        return i1.a.I("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0136d(this, 1));
    }
}
