package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A) {
        Objects.requireNonNull(layoutInflaterFactory2C0115A);
        a.q qVar = new a.q(1, layoutInflaterFactory2C0115A);
        L.d.e(obj).registerOnBackInvokedCallback(1000000, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        L.d.e(obj).unregisterOnBackInvokedCallback(L.d.b(obj2));
    }
}
