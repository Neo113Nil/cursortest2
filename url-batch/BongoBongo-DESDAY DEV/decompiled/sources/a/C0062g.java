package a;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: a.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0062g f1236a = new C0062g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        h1.d.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        h1.d.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
