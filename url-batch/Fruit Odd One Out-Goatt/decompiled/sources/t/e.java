package t;

import androidx.window.extensions.WindowExtensionsProvider;
import d1.l;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class e {
    static {
        l.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
