package b;

import android.window.OnBackInvokedCallback;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;

/* renamed from: b.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298B {

    /* renamed from: a, reason: collision with root package name */
    public static final C0298B f5260a = new C0298B();

    public final OnBackInvokedCallback a(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, InterfaceC0422a interfaceC0422a, InterfaceC0422a interfaceC0422a2) {
        f2.j.f(interfaceC0424c, "onBackStarted");
        f2.j.f(interfaceC0424c2, "onBackProgressed");
        f2.j.f(interfaceC0422a, "onBackInvoked");
        f2.j.f(interfaceC0422a2, "onBackCancelled");
        return new C0297A(interfaceC0424c, interfaceC0424c2, interfaceC0422a, interfaceC0422a2);
    }
}
