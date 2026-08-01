package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import g1.InterfaceC0110a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1277a = new r();

    public final OnBackInvokedCallback a(InterfaceC0110a interfaceC0110a) {
        h1.d.e(interfaceC0110a, "onBackInvoked");
        return new q(0, interfaceC0110a);
    }

    public final void b(Object obj, int i, Object obj2) {
        h1.d.e(obj, "dispatcher");
        h1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        h1.d.e(obj, "dispatcher");
        h1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
