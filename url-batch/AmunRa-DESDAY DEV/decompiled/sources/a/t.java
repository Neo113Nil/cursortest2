package a;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1123a = new t();

    public final OnBackInvokedCallback a(Y0.l lVar, Y0.l lVar2, Y0.a aVar, Y0.a aVar2) {
        Z0.d.e(lVar, "onBackStarted");
        Z0.d.e(lVar2, "onBackProgressed");
        Z0.d.e(aVar, "onBackInvoked");
        Z0.d.e(aVar2, "onBackCancelled");
        return new s(lVar, lVar2, aVar, aVar2);
    }
}
