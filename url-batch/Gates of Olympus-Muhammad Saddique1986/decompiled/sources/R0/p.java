package R0;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public abstract class p {
    public static final OnBackInvokedCallback a(InterfaceC0422a interfaceC0422a) {
        return new o(interfaceC0422a, 0);
    }

    public static final void b(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void c(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
