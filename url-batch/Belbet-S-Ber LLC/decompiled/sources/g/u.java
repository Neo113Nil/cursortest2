package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class u {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, a0 a0Var) {
        Objects.requireNonNull(a0Var);
        d1.k kVar = new d1.k(1, a0Var);
        a.a.g(obj).registerOnBackInvokedCallback(1000000, kVar);
        return kVar;
    }

    public static void c(Object obj, Object obj2) {
        a.a.g(obj).unregisterOnBackInvokedCallback(a.a.c(obj2));
    }
}
