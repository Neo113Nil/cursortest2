package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1605a = new r();

    public final OnBackInvokedCallback a(InterfaceC0170a interfaceC0170a) {
        k1.e.e(interfaceC0170a, "onBackInvoked");
        return new q(0, interfaceC0170a);
    }

    public final void b(Object obj, int i, Object obj2) {
        k1.e.e(obj, "dispatcher");
        k1.e.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        k1.e.e(obj, "dispatcher");
        k1.e.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
