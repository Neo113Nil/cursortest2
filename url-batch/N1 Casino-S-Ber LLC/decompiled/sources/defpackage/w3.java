package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class w3 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, d4 d4Var) {
        Objects.requireNonNull(d4Var);
        v3 v3Var = new v3(0, d4Var);
        a0.h(obj).registerOnBackInvokedCallback(1000000, v3Var);
        return v3Var;
    }

    public static void c(Object obj, Object obj2) {
        a0.h(obj).unregisterOnBackInvokedCallback(a0.c(obj2));
    }
}
