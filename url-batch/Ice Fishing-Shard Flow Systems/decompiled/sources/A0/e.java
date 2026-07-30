package A0;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.Intrinsics;
import w0.C0989a;
import x0.AbstractC0998e;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f63a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f64b;

    /* renamed from: c, reason: collision with root package name */
    public final L4.a f65c;

    public e(ClassLoader loader, l4.b consumerAdapter) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f63a = loader;
        this.f64b = consumerAdapter;
        this.f65c = new L4.a(loader, 1);
    }

    public final WindowLayoutComponent a() {
        L4.a aVar = this.f65c;
        aVar.getClass();
        C0989a classLoader = new C0989a(aVar, 0);
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        boolean z7 = false;
        try {
            classLoader.invoke();
            if (V6.b.Q("WindowExtensionsProvider#getWindowExtensions is not valid", new C0989a(aVar, 1)) && V6.b.Q("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && V6.b.Q("FoldingFeature class is not valid", new d(this, 0))) {
                int a7 = AbstractC0998e.a();
                if (a7 == 1) {
                    z7 = b();
                } else if (2 <= a7 && a7 <= Integer.MAX_VALUE && b()) {
                    if (V6.b.Q("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        z7 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z7) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return V6.b.Q("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
