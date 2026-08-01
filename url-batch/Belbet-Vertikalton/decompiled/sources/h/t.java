package h;

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
        I0.d dVar = new I0.d(2, zVar);
        I0.c.f(obj).registerOnBackInvokedCallback(1000000, dVar);
        return dVar;
    }

    public static void c(Object obj, Object obj2) {
        I0.c.f(obj).unregisterOnBackInvokedCallback(I0.c.b(obj2));
    }
}
