package b;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0246g f5222a = new C0246g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        kotlin.jvm.internal.i.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
