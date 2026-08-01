package f;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class v {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, b0 b0Var) {
        Objects.requireNonNull(b0Var);
        androidx.activity.d0 d0Var = new androidx.activity.d0(1, b0Var);
        androidx.activity.p.f(obj).registerOnBackInvokedCallback(1000000, d0Var);
        return d0Var;
    }

    public static void c(Object obj, Object obj2) {
        androidx.activity.p.f(obj).unregisterOnBackInvokedCallback(androidx.activity.p.c(obj2));
    }
}
