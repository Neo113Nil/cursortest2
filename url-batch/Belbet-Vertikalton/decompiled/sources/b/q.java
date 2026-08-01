package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import i1.InterfaceC0181a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f2201a = new q();

    public final OnBackInvokedCallback a(InterfaceC0181a interfaceC0181a) {
        j1.h.e(interfaceC0181a, "onBackInvoked");
        return new I0.d(1, interfaceC0181a);
    }

    public final void b(Object obj, int i, Object obj2) {
        j1.h.e(obj, "dispatcher");
        j1.h.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        j1.h.e(obj, "dispatcher");
        j1.h.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
