package b;

import android.window.OnBackInvokedCallback;
import i1.InterfaceC0181a;
import i1.InterfaceC0192l;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f2206a = new s();

    public final OnBackInvokedCallback a(InterfaceC0192l interfaceC0192l, InterfaceC0192l interfaceC0192l2, InterfaceC0181a interfaceC0181a, InterfaceC0181a interfaceC0181a2) {
        j1.h.e(interfaceC0192l, "onBackStarted");
        j1.h.e(interfaceC0192l2, "onBackProgressed");
        j1.h.e(interfaceC0181a, "onBackInvoked");
        j1.h.e(interfaceC0181a2, "onBackCancelled");
        return new r(interfaceC0192l, interfaceC0192l2, interfaceC0181a, interfaceC0181a2);
    }
}
