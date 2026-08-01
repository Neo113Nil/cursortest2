package a;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f941a = new x();

    public final OnBackInvokedCallback a(W0.l lVar, W0.l lVar2, W0.a aVar, W0.a aVar2) {
        X0.f.e(lVar, "onBackStarted");
        X0.f.e(lVar2, "onBackProgressed");
        X0.f.e(aVar, "onBackInvoked");
        X0.f.e(aVar2, "onBackCancelled");
        return new w(lVar, lVar2, aVar, aVar2);
    }
}
