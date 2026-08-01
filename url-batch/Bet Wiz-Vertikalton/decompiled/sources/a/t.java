package a;

import android.window.OnBackInvokedCallback;
import d1.InterfaceC0081a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1192a = new t();

    public final OnBackInvokedCallback a(d1.l lVar, d1.l lVar2, InterfaceC0081a interfaceC0081a, InterfaceC0081a interfaceC0081a2) {
        e1.d.e(lVar, "onBackStarted");
        e1.d.e(lVar2, "onBackProgressed");
        e1.d.e(interfaceC0081a, "onBackInvoked");
        e1.d.e(interfaceC0081a2, "onBackCancelled");
        return new s(lVar, lVar2, interfaceC0081a, interfaceC0081a2);
    }
}
