package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class y40 {
    public final Runnable a;
    public final wg0 b = new wg0(new h2(5, this));

    public y40(Runnable runnable) {
        this.a = runnable;
    }

    public final w40 a() {
        return (w40) this.b.getValue();
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().c.b(new r40(onBackInvokedDispatcher, 0), 1);
        a().c.b(new r40(onBackInvokedDispatcher, 1000000), 0);
    }
}
