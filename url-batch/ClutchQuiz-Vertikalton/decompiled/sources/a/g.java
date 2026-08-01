package a;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1185a = new g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        g1.f.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        g1.f.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
