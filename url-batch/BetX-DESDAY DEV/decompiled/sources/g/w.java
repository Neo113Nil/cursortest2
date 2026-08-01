package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C) {
        Objects.requireNonNull(layoutInflaterFactory2C0142C);
        a.u uVar = new a.u(1, layoutInflaterFactory2C0142C);
        L.d.e(obj).registerOnBackInvokedCallback(1000000, uVar);
        return uVar;
    }

    public static void c(Object obj, Object obj2) {
        L.d.e(obj).unregisterOnBackInvokedCallback(L.d.b(obj2));
    }
}
