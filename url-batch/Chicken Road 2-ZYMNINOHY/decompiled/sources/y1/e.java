package y1;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f16242a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.b f16243b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.b f16244c;

    public e(ClassLoader classLoader, u1.b bVar) {
        this.f16242a = classLoader;
        this.f16243b = bVar;
        this.f16244c = new u1.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        u1.b bVar = this.f16244c;
        bVar.getClass();
        boolean z = false;
        try {
            new u1.a(bVar, 0).invoke();
            if (U.i.F("WindowExtensionsProvider#getWindowExtensions is not valid", new u1.a(bVar, 1)) && U.i.F("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && U.i.F("FoldingFeature class is not valid", new d(this, 0))) {
                int a3 = v1.e.a();
                if (a3 == 1) {
                    z = b();
                } else if (2 <= a3 && a3 <= Integer.MAX_VALUE && b()) {
                    if (U.i.F("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
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
        return U.i.F("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
