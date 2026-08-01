package d;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3215a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.q f3216b = hd.h.b(new a1.b(7, this));

    public c0(Runnable runnable) {
        this.f3215a = runnable;
    }

    public final a0 a() {
        return (a0) this.f3216b.getValue();
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        a().f3209c.c(new s4.j(onBackInvokedDispatcher, 0), 1);
        a().f3209c.c(new s4.j(onBackInvokedDispatcher, 1000000), 0);
    }
}
