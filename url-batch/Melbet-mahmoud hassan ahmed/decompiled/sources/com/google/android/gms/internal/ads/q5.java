package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class q5 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final a6 f10579f;

    /* renamed from: g, reason: collision with root package name */
    private final g6 f10580g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f10581h;

    public q5(a6 a6Var, g6 g6Var, Runnable runnable) {
        this.f10579f = a6Var;
        this.f10580g = g6Var;
        this.f10581h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10579f.x();
        if (this.f10580g.c()) {
            this.f10579f.p(this.f10580g.f5461a);
        } else {
            this.f10579f.o(this.f10580g.f5463c);
        }
        if (this.f10580g.f5464d) {
            this.f10579f.n("intermediate-response");
        } else {
            this.f10579f.q("done");
        }
        Runnable runnable = this.f10581h;
        if (runnable != null) {
            runnable.run();
        }
    }
}
