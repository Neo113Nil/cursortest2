package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f5244a = new u();

    public final OnBackInvokedCallback a(final InterfaceC1328a onBackInvoked) {
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        return new OnBackInvokedCallback() { // from class: b.t
            public final void onBackInvoked() {
                InterfaceC1328a onBackInvoked2 = InterfaceC1328a.this;
                kotlin.jvm.internal.i.e(onBackInvoked2, "$onBackInvoked");
                onBackInvoked2.invoke();
            }
        };
    }

    public final void b(Object dispatcher, int i4, Object callback) {
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i4, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
