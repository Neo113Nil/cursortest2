package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hz {
    public final Runnable a;
    public final a80 b = new a80(new a2(2, this));

    public hz(Runnable runnable) {
        this.a = runnable;
    }

    public final rg a() {
        return ((fz) this.b.a()).c;
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a80 a80Var = this.b;
        ((fz) a80Var.a()).c.c(new az(onBackInvokedDispatcher, 0), 1);
        ((fz) a80Var.a()).c.c(new az(onBackInvokedDispatcher, 1000000), 0);
    }
}
