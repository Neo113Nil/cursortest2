package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, z zVar) {
        Objects.requireNonNull(zVar);
        a.q qVar = new a.q(1, zVar);
        L.d.e(obj).registerOnBackInvokedCallback(1000000, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        L.d.e(obj).unregisterOnBackInvokedCallback(L.d.b(obj2));
    }
}
