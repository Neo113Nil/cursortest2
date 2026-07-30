package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: i.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0535v {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B) {
        Objects.requireNonNull(layoutInflaterFactory2C0500B);
        d.t tVar = new d.t(2, layoutInflaterFactory2C0500B);
        J.c.p(obj).registerOnBackInvokedCallback(1000000, tVar);
        return tVar;
    }

    public static void c(Object obj, Object obj2) {
        J.c.p(obj).unregisterOnBackInvokedCallback(J.c.l(obj2));
    }
}
