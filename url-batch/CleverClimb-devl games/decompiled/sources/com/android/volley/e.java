package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* loaded from: classes.dex */
public class e implements o {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f2273a;

    public e(final Handler handler) {
        this.f2273a = new Executor() { // from class: com.android.volley.e.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.android.volley.o
    public void a(l<?> lVar, n<?> nVar) {
        a(lVar, nVar, null);
    }

    @Override // com.android.volley.o
    public void a(l<?> lVar, n<?> nVar, Runnable runnable) {
        lVar.u();
        lVar.a("post-response");
        this.f2273a.execute(new a(lVar, nVar, runnable));
    }

    @Override // com.android.volley.o
    public void a(l<?> lVar, s sVar) {
        lVar.a("post-error");
        this.f2273a.execute(new a(lVar, n.a(sVar), null));
    }

    /* compiled from: ExecutorDelivery.java */
    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final l f2277b;

        /* renamed from: c, reason: collision with root package name */
        private final n f2278c;

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f2279d;

        public a(l lVar, n nVar, Runnable runnable) {
            this.f2277b = lVar;
            this.f2278c = nVar;
            this.f2279d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2277b.g()) {
                this.f2277b.b("canceled-at-delivery");
                return;
            }
            if (this.f2278c.a()) {
                this.f2277b.a((l) this.f2278c.f2303a);
            } else {
                this.f2277b.b(this.f2278c.f2305c);
            }
            if (this.f2278c.f2306d) {
                this.f2277b.a("intermediate-response");
            } else {
                this.f2277b.b("done");
            }
            if (this.f2279d != null) {
                this.f2279d.run();
            }
        }
    }
}
