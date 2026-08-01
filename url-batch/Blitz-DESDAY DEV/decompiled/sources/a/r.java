package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import f1.InterfaceC0099a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1286a = new r();

    public final OnBackInvokedCallback a(InterfaceC0099a interfaceC0099a) {
        g1.d.e(interfaceC0099a, "onBackInvoked");
        return new q(0, interfaceC0099a);
    }

    public final void b(Object obj, int i, Object obj2) {
        g1.d.e(obj, "dispatcher");
        g1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        g1.d.e(obj, "dispatcher");
        g1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
