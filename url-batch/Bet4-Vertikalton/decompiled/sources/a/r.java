package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c1.InterfaceC0085a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1201a = new r();

    public final OnBackInvokedCallback a(InterfaceC0085a interfaceC0085a) {
        d1.d.e(interfaceC0085a, "onBackInvoked");
        return new q(0, interfaceC0085a);
    }

    public final void b(Object obj, int i, Object obj2) {
        d1.d.e(obj, "dispatcher");
        d1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        d1.d.e(obj, "dispatcher");
        d1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
