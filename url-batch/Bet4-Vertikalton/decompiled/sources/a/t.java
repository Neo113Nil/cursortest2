package a;

import android.window.OnBackInvokedCallback;
import c1.InterfaceC0085a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1205a = new t();

    public final OnBackInvokedCallback a(c1.l lVar, c1.l lVar2, InterfaceC0085a interfaceC0085a, InterfaceC0085a interfaceC0085a2) {
        d1.d.e(lVar, "onBackStarted");
        d1.d.e(lVar2, "onBackProgressed");
        d1.d.e(interfaceC0085a, "onBackInvoked");
        d1.d.e(interfaceC0085a2, "onBackCancelled");
        return new s(lVar, lVar2, interfaceC0085a, interfaceC0085a2);
    }
}
