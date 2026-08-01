package a;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1229a = new t();

    public final OnBackInvokedCallback a(f1.l lVar, f1.l lVar2, f1.a aVar, f1.a aVar2) {
        g1.f.e(lVar, "onBackStarted");
        g1.f.e(lVar2, "onBackProgressed");
        g1.f.e(aVar, "onBackInvoked");
        g1.f.e(aVar2, "onBackCancelled");
        return new s(lVar, lVar2, aVar, aVar2);
    }
}
