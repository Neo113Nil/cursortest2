package b;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f1149a = new e0();

    public final OnBackInvokedCallback a(q6.c cVar, q6.c cVar2, q6.a aVar, q6.a aVar2) {
        r6.k.f(cVar, "onBackStarted");
        r6.k.f(cVar2, "onBackProgressed");
        r6.k.f(aVar, "onBackInvoked");
        r6.k.f(aVar2, "onBackCancelled");
        return new d0(cVar, cVar2, aVar, aVar2);
    }
}
