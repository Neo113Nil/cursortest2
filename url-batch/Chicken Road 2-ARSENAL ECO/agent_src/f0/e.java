package f0;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import b0.C0262a;
import b0.C0263b;
import c0.AbstractC0272e;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f4181a;

    /* renamed from: b, reason: collision with root package name */
    public final C0263b f4182b;

    /* renamed from: c, reason: collision with root package name */
    public final C0263b f4183c;

    public e(ClassLoader classLoader, C0263b c0263b) {
        this.f4181a = classLoader;
        this.f4182b = c0263b;
        this.f4183c = new C0263b(classLoader);
    }

    public final WindowLayoutComponent a() {
        C0263b c0263b = this.f4183c;
        c0263b.getClass();
        boolean z5 = false;
        try {
            new C0262a(c0263b, 0).invoke();
            if (A3.c.m0("WindowExtensionsProvider#getWindowExtensions is not valid", new C0262a(c0263b, 1)) && A3.c.m0("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && A3.c.m0("FoldingFeature class is not valid", new d(this, 0))) {
                int a7 = AbstractC0272e.a();
                if (a7 == 1) {
                    z5 = b();
                } else if (2 <= a7 && a7 <= Integer.MAX_VALUE && b()) {
                    if (A3.c.m0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        z5 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z5) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return A3.c.m0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
