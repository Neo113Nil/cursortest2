package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f1140a = new c0();

    public final OnBackInvokedCallback a(q6.a aVar) {
        r6.k.f(aVar, "onBackInvoked");
        return new b0(aVar, 0);
    }

    public final void b(Object obj, int i7, Object obj2) {
        r6.k.f(obj, "dispatcher");
        r6.k.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        r6.k.f(obj, "dispatcher");
        r6.k.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
