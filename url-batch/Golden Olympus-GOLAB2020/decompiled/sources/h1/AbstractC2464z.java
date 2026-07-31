package h1;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;

/* renamed from: h1.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2464z {
    public static OnBackInvokedDispatcher a(Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (obj instanceof Activity) {
            onBackInvokedDispatcher2 = ((Activity) obj).getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher2;
        }
        if (obj instanceof Dialog) {
            onBackInvokedDispatcher = ((Dialog) obj).getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }
        throw new IllegalArgumentException("Unsupported context type when getting '" + obj.getClass().getName() + "' OnBackInvokedDispatcher");
    }

    public static void b(OnBackInvokedDispatcher onBackInvokedDispatcher, int i4, C2462x c2462x) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i4, c2462x);
    }

    public static void c(OnBackInvokedDispatcher onBackInvokedDispatcher, C2462x c2462x) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(c2462x);
    }
}
