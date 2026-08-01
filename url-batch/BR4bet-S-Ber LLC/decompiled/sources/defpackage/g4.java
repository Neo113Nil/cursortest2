package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class g4 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, n4 n4Var) {
        Objects.requireNonNull(n4Var);
        f4 f4Var = new f4(0, n4Var);
        c0.h(obj).registerOnBackInvokedCallback(1000000, f4Var);
        return f4Var;
    }

    public static void c(Object obj, Object obj2) {
        c0.h(obj).unregisterOnBackInvokedCallback(c0.c(obj2));
    }
}
