package b;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0247g f4155a = new C0247g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        Z1.i.f(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        Z1.i.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
