package a;

import a1.InterfaceC0059a;
import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1148a = new t();

    public final OnBackInvokedCallback a(a1.l lVar, a1.l lVar2, InterfaceC0059a interfaceC0059a, InterfaceC0059a interfaceC0059a2) {
        b1.d.e(lVar, "onBackStarted");
        b1.d.e(lVar2, "onBackProgressed");
        b1.d.e(interfaceC0059a, "onBackInvoked");
        b1.d.e(interfaceC0059a2, "onBackCancelled");
        return new s(lVar, lVar2, interfaceC0059a, interfaceC0059a2);
    }
}
