package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class o4 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, v4 v4Var) {
        Objects.requireNonNull(v4Var);
        n4 n4Var = new n4(0, v4Var);
        e0.h(obj).registerOnBackInvokedCallback(1000000, n4Var);
        return n4Var;
    }

    public static void c(Object obj, Object obj2) {
        e0.h(obj).unregisterOnBackInvokedCallback(e0.c(obj2));
    }
}
