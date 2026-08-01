package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d1.InterfaceC0081a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1188a = new r();

    public final OnBackInvokedCallback a(InterfaceC0081a interfaceC0081a) {
        e1.d.e(interfaceC0081a, "onBackInvoked");
        return new q(0, interfaceC0081a);
    }

    public final void b(Object obj, int i, Object obj2) {
        e1.d.e(obj, "dispatcher");
        e1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        e1.d.e(obj, "dispatcher");
        e1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
