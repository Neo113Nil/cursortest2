package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class dw2<O> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4363a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4364b;

    /* renamed from: c, reason: collision with root package name */
    private final cc3<?> f4365c;

    /* renamed from: d, reason: collision with root package name */
    private final List<cc3<?>> f4366d;

    /* renamed from: e, reason: collision with root package name */
    private final cc3<O> f4367e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ew2 f4368f;

    private dw2(ew2 ew2Var, ew2 ew2Var2, String str, cc3 cc3Var, List<cc3> list, cc3<O> cc3Var2) {
        this.f4368f = ew2Var;
        this.f4363a = ew2Var2;
        this.f4364b = str;
        this.f4365c = cc3Var;
        this.f4366d = list;
        this.f4367e = cc3Var2;
    }

    public final rv2 a() {
        fw2 fw2Var;
        Object obj = this.f4363a;
        String str = this.f4364b;
        if (str == null) {
            str = this.f4368f.f(obj);
        }
        final rv2 rv2Var = new rv2(obj, str, this.f4367e);
        fw2Var = this.f4368f.f4793c;
        fw2Var.T(rv2Var);
        cc3<?> cc3Var = this.f4365c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.aw2
            @Override // java.lang.Runnable
            public final void run() {
                fw2 fw2Var2;
                dw2 dw2Var = dw2.this;
                rv2 rv2Var2 = rv2Var;
                fw2Var2 = dw2Var.f4368f.f4793c;
                fw2Var2.e(rv2Var2);
            }
        };
        dc3 dc3Var = wo0.f13899f;
        cc3Var.b(runnable, dc3Var);
        rb3.r(rv2Var, new bw2(this, rv2Var), dc3Var);
        return rv2Var;
    }

    public final dw2<O> b(Object obj) {
        return this.f4368f.b(obj, a());
    }

    public final <T extends Throwable> dw2<O> c(Class<T> cls, xa3<T, O> xa3Var) {
        dc3 dc3Var;
        ew2 ew2Var = this.f4368f;
        Object obj = this.f4363a;
        String str = this.f4364b;
        cc3<?> cc3Var = this.f4365c;
        List<cc3<?>> list = this.f4366d;
        cc3<O> cc3Var2 = this.f4367e;
        dc3Var = ew2Var.f4791a;
        return new dw2<>(ew2Var, obj, str, cc3Var, list, rb3.g(cc3Var2, cls, xa3Var, dc3Var));
    }

    public final <O2> dw2<O2> d(final cc3<O2> cc3Var) {
        return g(new xa3() { // from class: com.google.android.gms.internal.ads.zv2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return cc3.this;
            }
        }, wo0.f13899f);
    }

    public final <O2> dw2<O2> e(final pv2<O, O2> pv2Var) {
        return f(new xa3() { // from class: com.google.android.gms.internal.ads.xv2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rb3.i(pv2.this.c(obj));
            }
        });
    }

    public final <O2> dw2<O2> f(xa3<O, O2> xa3Var) {
        dc3 dc3Var;
        dc3Var = this.f4368f.f4791a;
        return g(xa3Var, dc3Var);
    }

    public final <O2> dw2<O2> g(xa3<O, O2> xa3Var, Executor executor) {
        return new dw2<>(this.f4368f, this.f4363a, this.f4364b, this.f4365c, this.f4366d, rb3.n(this.f4367e, xa3Var, executor));
    }

    public final dw2<O> h(String str) {
        return new dw2<>(this.f4368f, this.f4363a, str, this.f4365c, this.f4366d, this.f4367e);
    }

    public final dw2<O> i(long j7, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        ew2 ew2Var = this.f4368f;
        Object obj = this.f4363a;
        String str = this.f4364b;
        cc3<?> cc3Var = this.f4365c;
        List<cc3<?>> list = this.f4366d;
        cc3<O> cc3Var2 = this.f4367e;
        scheduledExecutorService = ew2Var.f4792b;
        return new dw2<>(ew2Var, obj, str, cc3Var, list, rb3.o(cc3Var2, j7, timeUnit, scheduledExecutorService));
    }
}
