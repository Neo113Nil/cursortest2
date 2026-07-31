package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class tg2 implements ij2<ug2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f12205a;

    /* renamed from: b, reason: collision with root package name */
    private final uy1 f12206b;

    tg2(dc3 dc3Var, uy1 uy1Var) {
        this.f12205a = dc3Var;
        this.f12206b = uy1Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ug2> a() {
        return this.f12205a.E(new Callable() { // from class: com.google.android.gms.internal.ads.rg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tg2.this.b();
            }
        });
    }

    final /* synthetic */ ug2 b() {
        return new ug2(this.f12206b.b(), this.f12206b.n(), y2.t.t().l());
    }
}
