package a;

import android.window.OnBackInvokedCallback;
import f1.InterfaceC0099a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1290a = new t();

    public final OnBackInvokedCallback a(f1.l lVar, f1.l lVar2, InterfaceC0099a interfaceC0099a, InterfaceC0099a interfaceC0099a2) {
        g1.d.e(lVar, "onBackStarted");
        g1.d.e(lVar2, "onBackProgressed");
        g1.d.e(interfaceC0099a, "onBackInvoked");
        g1.d.e(interfaceC0099a2, "onBackCancelled");
        return new s(lVar, lVar2, interfaceC0099a, interfaceC0099a2);
    }
}
