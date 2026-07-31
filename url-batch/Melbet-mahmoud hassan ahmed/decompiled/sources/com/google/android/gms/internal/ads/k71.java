package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k71 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7401a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f7402b;

    /* renamed from: c, reason: collision with root package name */
    private final cc3<d71> f7403c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f7404d = true;

    public k71(Executor executor, ScheduledExecutorService scheduledExecutorService, cc3<d71> cc3Var) {
        this.f7401a = executor;
        this.f7402b = scheduledExecutorService;
        this.f7403c = cc3Var;
    }

    static /* bridge */ /* synthetic */ void b(final k71 k71Var, List list, final nb3 nb3Var) {
        if (list == null || list.isEmpty()) {
            k71Var.f7401a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.h71
                @Override // java.lang.Runnable
                public final void run() {
                    nb3.this.b(new fz1(3));
                }
            });
            return;
        }
        cc3 i7 = rb3.i(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final cc3 cc3Var = (cc3) it.next();
            i7 = rb3.n(rb3.g(i7, Throwable.class, new xa3() { // from class: com.google.android.gms.internal.ads.f71
                @Override // com.google.android.gms.internal.ads.xa3
                public final cc3 c(Object obj) {
                    nb3.this.b((Throwable) obj);
                    return rb3.i(null);
                }
            }, k71Var.f7401a), new xa3() { // from class: com.google.android.gms.internal.ads.e71
                @Override // com.google.android.gms.internal.ads.xa3
                public final cc3 c(Object obj) {
                    return k71.this.a(nb3Var, cc3Var, (v61) obj);
                }
            }, k71Var.f7401a);
        }
        rb3.r(i7, new j71(k71Var, nb3Var), k71Var.f7401a);
    }

    final /* synthetic */ cc3 a(nb3 nb3Var, cc3 cc3Var, v61 v61Var) {
        if (v61Var != null) {
            nb3Var.a(v61Var);
        }
        return rb3.o(cc3Var, n30.f8907b.e().longValue(), TimeUnit.MILLISECONDS, this.f7402b);
    }

    final /* synthetic */ void d() {
        this.f7404d = false;
    }

    public final void e(nb3<v61> nb3Var) {
        rb3.r(this.f7403c, new i71(this, nb3Var), this.f7401a);
    }

    public final boolean f() {
        return this.f7404d;
    }
}
