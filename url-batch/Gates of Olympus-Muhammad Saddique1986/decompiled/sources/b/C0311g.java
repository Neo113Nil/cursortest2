package b;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0311g f5290a = new C0311g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        f2.j.f(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        f2.j.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
