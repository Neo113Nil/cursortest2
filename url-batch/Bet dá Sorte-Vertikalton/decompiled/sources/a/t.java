package a;

import a1.InterfaceC0058a;
import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1162a = new t();

    public final OnBackInvokedCallback a(a1.l lVar, a1.l lVar2, InterfaceC0058a interfaceC0058a, InterfaceC0058a interfaceC0058a2) {
        b1.d.e(lVar, "onBackStarted");
        b1.d.e(lVar2, "onBackProgressed");
        b1.d.e(interfaceC0058a, "onBackInvoked");
        b1.d.e(interfaceC0058a2, "onBackCancelled");
        return new s(lVar, lVar2, interfaceC0058a, interfaceC0058a2);
    }
}
