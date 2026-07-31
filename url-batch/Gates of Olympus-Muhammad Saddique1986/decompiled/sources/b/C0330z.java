package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import e2.InterfaceC0422a;

/* renamed from: b.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330z {

    /* renamed from: a, reason: collision with root package name */
    public static final C0330z f5344a = new C0330z();

    public final OnBackInvokedCallback a(InterfaceC0422a interfaceC0422a) {
        f2.j.f(interfaceC0422a, "onBackInvoked");
        return new R0.o(interfaceC0422a, 1);
    }

    public final void b(Object obj, int i3, Object obj2) {
        f2.j.f(obj, "dispatcher");
        f2.j.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        f2.j.f(obj, "dispatcher");
        f2.j.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
