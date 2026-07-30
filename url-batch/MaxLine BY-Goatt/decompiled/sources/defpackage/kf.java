package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class kf {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, qf qfVar) {
        Objects.requireNonNull(qfVar);
        he heVar = new he(1, qfVar);
        w6.d(obj).registerOnBackInvokedCallback(1000000, heVar);
        return heVar;
    }

    public static void c(Object obj, Object obj2) {
        w6.d(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
