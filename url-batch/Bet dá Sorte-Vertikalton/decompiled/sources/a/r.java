package a;

import a1.InterfaceC0058a;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1158a = new r();

    public final OnBackInvokedCallback a(InterfaceC0058a interfaceC0058a) {
        b1.d.e(interfaceC0058a, "onBackInvoked");
        return new q(0, interfaceC0058a);
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
