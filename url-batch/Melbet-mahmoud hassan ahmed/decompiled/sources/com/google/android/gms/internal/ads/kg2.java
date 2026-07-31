package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class kg2 implements ij2<lg2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f7511a;

    /* renamed from: b, reason: collision with root package name */
    private final ks2 f7512b;

    kg2(dc3 dc3Var, ks2 ks2Var) {
        this.f7511a = dc3Var;
        this.f7512b = ks2Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<lg2> a() {
        return this.f7511a.E(new Callable() { // from class: com.google.android.gms.internal.ads.jg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kg2.this.b();
            }
        });
    }

    final /* synthetic */ lg2 b() {
        return new lg2("requester_type_2".equals(g3.o.c(this.f7512b)));
    }
}
