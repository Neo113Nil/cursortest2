package a;

import a1.InterfaceC0059a;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1144a = new r();

    public final OnBackInvokedCallback a(InterfaceC0059a interfaceC0059a) {
        b1.d.e(interfaceC0059a, "onBackInvoked");
        return new q(0, interfaceC0059a);
    }

    public final void b(Object obj, int i, Object obj2) {
        b1.d.e(obj, "dispatcher");
        b1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        b1.d.e(obj, "dispatcher");
        b1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
