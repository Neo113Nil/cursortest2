package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1225a = new r();

    public final OnBackInvokedCallback a(f1.a aVar) {
        g1.f.e(aVar, "onBackInvoked");
        return new q(0, aVar);
    }

    public final void b(Object obj, int i, Object obj2) {
        g1.f.e(obj, "dispatcher");
        g1.f.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        g1.f.e(obj, "dispatcher");
        g1.f.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
