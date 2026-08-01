package a;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1565a = new g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        k1.e.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        k1.e.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
