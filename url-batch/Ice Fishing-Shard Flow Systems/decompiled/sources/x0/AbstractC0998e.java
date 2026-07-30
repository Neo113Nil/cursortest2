package x0;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.E;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0998e {
    static {
        E.a(AbstractC0998e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
