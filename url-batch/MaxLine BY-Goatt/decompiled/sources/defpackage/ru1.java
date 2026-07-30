package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ru1 {
    public final Runnable a;
    public final y91 b = ya1.b(new dj(6, this));

    public ru1(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(tm tmVar, id1 id1Var) {
        tmVar.getClass();
        final ad1 lifecycle = id1Var.getLifecycle();
        if (lifecycle.b() == zc1.m) {
            return;
        }
        mu1 mu1Var = new mu1(tmVar, new nu1(tmVar, id1Var));
        tmVar.a.add(mu1Var);
        mu1Var.g(false);
        tq1.a(b().c, mu1Var);
        final n80 n80Var = new n80(mu1Var, this, lifecycle);
        lifecycle.a(n80Var);
        tmVar.c.add(new AutoCloseable() { // from class: ou1
            @Override // java.lang.AutoCloseable
            public final void close() {
                ad1.this.c(n80Var);
            }
        });
    }

    public final pu1 b() {
        return (pu1) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        b().c.c(new ju1(onBackInvokedDispatcher, 0), 1);
        b().c.c(new ju1(onBackInvokedDispatcher, 1000000), 0);
    }
}
