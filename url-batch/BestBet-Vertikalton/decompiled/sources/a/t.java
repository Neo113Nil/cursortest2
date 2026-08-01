package a;

import android.window.OnBackInvokedCallback;
import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1609a = new t();

    public final OnBackInvokedCallback a(j1.l lVar, j1.l lVar2, InterfaceC0170a interfaceC0170a, InterfaceC0170a interfaceC0170a2) {
        k1.e.e(lVar, "onBackStarted");
        k1.e.e(lVar2, "onBackProgressed");
        k1.e.e(interfaceC0170a, "onBackInvoked");
        k1.e.e(interfaceC0170a2, "onBackCancelled");
        return new s(lVar, lVar2, interfaceC0170a, interfaceC0170a2);
    }
}
