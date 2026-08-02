package g0;

import a.AbstractC0129a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import b0.r;
import b0.s;
import c0.C0200a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f5021a;

    /* renamed from: b, reason: collision with root package name */
    public final s f5022b;

    /* renamed from: c, reason: collision with root package name */
    public final r f5023c;

    public e(ClassLoader classLoader, s sVar) {
        this.f5021a = classLoader;
        this.f5022b = sVar;
        this.f5023c = new r(classLoader);
    }

    public final WindowLayoutComponent a() {
        r rVar = this.f5023c;
        rVar.getClass();
        boolean z = false;
        try {
            new C0200a(rVar, 0).invoke();
            if (AbstractC0129a.H("WindowExtensionsProvider#getWindowExtensions is not valid", new C0200a(rVar, 1)) && AbstractC0129a.H("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && AbstractC0129a.H("FoldingFeature class is not valid", new d(this, 0))) {
                int a3 = d0.e.a();
                if (a3 == 1) {
                    z = b();
                } else if (2 <= a3 && a3 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0129a.H("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
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
        return AbstractC0129a.H("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
