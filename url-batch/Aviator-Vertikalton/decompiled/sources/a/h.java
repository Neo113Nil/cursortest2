package a;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f911a = new h();

    public final OnBackInvokedDispatcher a(Activity activity) {
        X0.f.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        X0.f.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
