package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ew {
    public final Runnable a;
    public final x40 b = new x40(new xb(2, this));

    public ew(Runnable runnable) {
        this.a = runnable;
    }

    public final we a() {
        return ((cw) this.b.a()).c;
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        x40 x40Var = this.b;
        ((cw) x40Var.a()).c.c(new xv(onBackInvokedDispatcher, 0), 1);
        ((cw) x40Var.a()).c.c(new xv(onBackInvokedDispatcher, 1000000), 0);
    }
}
