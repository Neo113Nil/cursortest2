package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class m4 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, t4 t4Var) {
        Objects.requireNonNull(t4Var);
        l4 l4Var = new l4(0, t4Var);
        a0.h(obj).registerOnBackInvokedCallback(1000000, l4Var);
        return l4Var;
    }

    public static void c(Object obj, Object obj2) {
        a0.h(obj).unregisterOnBackInvokedCallback(a0.c(obj2));
    }
}
