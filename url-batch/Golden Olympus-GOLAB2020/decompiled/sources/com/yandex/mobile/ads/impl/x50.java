package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class x50 implements yq1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34436a;

    final class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f34437a;

        a(Handler handler) {
            this.f34437a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f34437a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final op1 f34438b;

        /* renamed from: c, reason: collision with root package name */
        private final qq1 f34439c;

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f34440d;

        public b(op1 op1Var, qq1 qq1Var, Runnable runnable) {
            this.f34438b = op1Var;
            this.f34439c = qq1Var;
            this.f34440d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f34438b.n()) {
                this.f34438b.c("canceled-at-delivery");
                return;
            }
            qq1 qq1Var = this.f34439c;
            hi2 hi2Var = qq1Var.f30871c;
            if (hi2Var == null) {
                this.f34438b.a((op1) qq1Var.f30869a);
            } else {
                this.f34438b.a(hi2Var);
            }
            if (this.f34439c.f30872d) {
                this.f34438b.a("intermediate-response");
            } else {
                this.f34438b.c("done");
            }
            Runnable runnable = this.f34440d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public x50(Handler handler) {
        this.f34436a = new a(handler);
    }

    public final void a(op1<?> op1Var, hi2 hi2Var) {
        op1Var.a("post-error");
        qq1 a4 = qq1.a(hi2Var);
        Executor executor = this.f34436a;
        ((a) executor).f34437a.post(new b(op1Var, a4, null));
    }

    public final void a(op1<?> op1Var, qq1<?> qq1Var, Runnable runnable) {
        op1Var.o();
        op1Var.a("post-response");
        Executor executor = this.f34436a;
        ((a) executor).f34437a.post(new b(op1Var, qq1Var, runnable));
    }
}
