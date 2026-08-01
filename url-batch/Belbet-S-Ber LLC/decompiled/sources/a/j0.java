package a;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f33a;

    /* renamed from: b, reason: collision with root package name */
    public final w2.c f34b = new w2.c(new e0(0, this));

    public j0(Runnable runnable) {
        this.f33a = runnable;
    }

    public final a0.k a() {
        return ((h0) this.f34b.a()).f28c;
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        w2.c cVar = this.f34b;
        ((h0) cVar.a()).f28c.c(new d1.j(onBackInvokedDispatcher, 0), 1);
        ((h0) cVar.a()).f28c.c(new d1.j(onBackInvokedDispatcher, 1000000), 0);
    }
}
