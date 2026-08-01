package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, c0 c0Var) {
        Objects.requireNonNull(c0Var);
        c1.k kVar = new c1.k(1, c0Var);
        a.a.g(obj).registerOnBackInvokedCallback(1000000, kVar);
        return kVar;
    }

    public static void c(Object obj, Object obj2) {
        a.a.g(obj).unregisterOnBackInvokedCallback(a.a.c(obj2));
    }
}
