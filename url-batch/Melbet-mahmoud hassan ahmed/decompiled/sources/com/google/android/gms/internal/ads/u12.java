package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class u12 {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f12564a;

    /* renamed from: b, reason: collision with root package name */
    private final a12 f12565b;

    /* renamed from: c, reason: collision with root package name */
    private final ev3<m22> f12566c;

    public u12(dc3 dc3Var, a12 a12Var, ev3<m22> ev3Var) {
        this.f12564a = dc3Var;
        this.f12565b = a12Var;
        this.f12566c = ev3Var;
    }

    private final <RetT> cc3<RetT> g(final vi0 vi0Var, t12<InputStream> t12Var, final t12<InputStream> t12Var2, final xa3<InputStream, RetT> xa3Var) {
        String str = vi0Var.f13404i;
        y2.t.q();
        return rb3.g(rb3.n(ib3.E(a3.g2.g(str) ? rb3.h(new k12(1)) : rb3.g(t12Var.a(vi0Var), ExecutionException.class, new xa3() { // from class: com.google.android.gms.internal.ads.s12
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rb3.h(((ExecutionException) obj).getCause());
            }
        }, this.f12564a)), xa3Var, this.f12564a), k12.class, new xa3() { // from class: com.google.android.gms.internal.ads.q12
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return u12.this.b(t12Var2, vi0Var, xa3Var, (k12) obj);
            }
        }, this.f12564a);
    }

    public final cc3<vi0> a(final vi0 vi0Var) {
        xa3 xa3Var = new xa3() { // from class: com.google.android.gms.internal.ads.p12
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                vi0 vi0Var2 = vi0.this;
                vi0Var2.f13410o = new String(k93.a((InputStream) obj), c43.f3729c);
                return rb3.i(vi0Var2);
            }
        };
        final a12 a12Var = this.f12565b;
        return g(vi0Var, new t12() { // from class: com.google.android.gms.internal.ads.l12
            @Override // com.google.android.gms.internal.ads.t12
            public final cc3 a(vi0 vi0Var2) {
                return a12.this.b(vi0Var2);
            }
        }, new t12() { // from class: com.google.android.gms.internal.ads.m12
            @Override // com.google.android.gms.internal.ads.t12
            public final cc3 a(vi0 vi0Var2) {
                return u12.this.c(vi0Var2);
            }
        }, xa3Var);
    }

    final /* synthetic */ cc3 b(t12 t12Var, vi0 vi0Var, xa3 xa3Var, k12 k12Var) {
        return rb3.n(t12Var.a(vi0Var), xa3Var, this.f12564a);
    }

    final /* synthetic */ cc3 c(vi0 vi0Var) {
        return this.f12566c.a().s6(vi0Var, Binder.getCallingUid());
    }

    final /* synthetic */ cc3 d(vi0 vi0Var) {
        return this.f12565b.c(h30.f6057d.e().booleanValue() ? vi0Var.f13408m : vi0Var.f13410o);
    }

    final /* synthetic */ cc3 e(vi0 vi0Var) {
        return this.f12566c.a().v6(h30.f6057d.e().booleanValue() ? vi0Var.f13408m : vi0Var.f13410o);
    }

    public final cc3<Void> f(vi0 vi0Var) {
        if (jc.g(vi0Var.f13410o)) {
            return rb3.h(new fz1(2, "Pool key missing from removeUrl call."));
        }
        return g(vi0Var, new t12() { // from class: com.google.android.gms.internal.ads.n12
            @Override // com.google.android.gms.internal.ads.t12
            public final cc3 a(vi0 vi0Var2) {
                return u12.this.d(vi0Var2);
            }
        }, new t12() { // from class: com.google.android.gms.internal.ads.o12
            @Override // com.google.android.gms.internal.ads.t12
            public final cc3 a(vi0 vi0Var2) {
                return u12.this.e(vi0Var2);
            }
        }, new xa3() { // from class: com.google.android.gms.internal.ads.r12
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rb3.i(null);
            }
        });
    }
}
