package b;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f4125a = new C();

    public final OnBackInvokedCallback a(Y1.c cVar, Y1.c cVar2, Y1.a aVar, Y1.a aVar2) {
        Z1.i.f(cVar, "onBackStarted");
        Z1.i.f(cVar2, "onBackProgressed");
        Z1.i.f(aVar, "onBackInvoked");
        Z1.i.f(aVar2, "onBackCancelled");
        return new B(cVar, cVar2, aVar, aVar2);
    }
}
