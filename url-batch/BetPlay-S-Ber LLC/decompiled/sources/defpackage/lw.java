package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class lw {
    public final Runnable a;
    public final d50 b = new d50(new bc(2, this));

    public lw(Runnable runnable) {
        this.a = runnable;
    }

    public final jw a() {
        return (jw) this.b.a();
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().c.b(new ew(onBackInvokedDispatcher, 0), 1);
        a().c.b(new ew(onBackInvokedDispatcher, 1000000), 0);
    }
}
