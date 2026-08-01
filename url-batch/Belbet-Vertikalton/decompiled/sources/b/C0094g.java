package b;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0094g f2162a = new C0094g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        j1.h.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        j1.h.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
