package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class gg2 implements ij2<hg2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f5627a;

    public gg2(dc3 dc3Var) {
        this.f5627a = dc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hg2> a() {
        return this.f5627a.E(new Callable() { // from class: com.google.android.gms.internal.ads.fg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new hg2(y2.t.t().b(), y2.t.t().m());
            }
        });
    }
}
