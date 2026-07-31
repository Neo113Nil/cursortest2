package c0;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.t;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0272e {
    static {
        t.a(AbstractC0272e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
