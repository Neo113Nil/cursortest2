package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f4120a = new A();

    public final OnBackInvokedCallback a(final Y1.a aVar) {
        Z1.i.f(aVar, "onBackInvoked");
        return new OnBackInvokedCallback() { // from class: b.z
            public final void onBackInvoked() {
                Y1.a aVar2 = Y1.a.this;
                Z1.i.f(aVar2, "$onBackInvoked");
                aVar2.b();
            }
        };
    }

    public final void b(Object obj, int i3, Object obj2) {
        Z1.i.f(obj, "dispatcher");
        Z1.i.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        Z1.i.f(obj, "dispatcher");
        Z1.i.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
