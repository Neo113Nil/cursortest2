package a;

import android.window.OnBackInvokedCallback;
import g1.InterfaceC0110a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1281a = new t();

    public final OnBackInvokedCallback a(g1.l lVar, g1.l lVar2, InterfaceC0110a interfaceC0110a, InterfaceC0110a interfaceC0110a2) {
        h1.d.e(lVar, "onBackStarted");
        h1.d.e(lVar2, "onBackProgressed");
        h1.d.e(interfaceC0110a, "onBackInvoked");
        h1.d.e(interfaceC0110a2, "onBackCancelled");
        return new s(lVar, lVar2, interfaceC0110a, interfaceC0110a2);
    }
}
