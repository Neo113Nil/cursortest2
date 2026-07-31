package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class me2 implements ij2<ne2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f8506a;

    /* renamed from: b, reason: collision with root package name */
    private final ks2 f8507b;

    /* renamed from: c, reason: collision with root package name */
    private final po0 f8508c;

    /* renamed from: d, reason: collision with root package name */
    private final xn0 f8509d;

    public me2(dc3 dc3Var, ks2 ks2Var, po0 po0Var, xn0 xn0Var) {
        this.f8506a = dc3Var;
        this.f8507b = ks2Var;
        this.f8508c = po0Var;
        this.f8509d = xn0Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ne2> a() {
        return this.f8506a.E(new Callable() { // from class: com.google.android.gms.internal.ads.le2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return me2.this.b();
            }
        });
    }

    final /* synthetic */ ne2 b() {
        return new ne2(this.f8507b.f7624j, this.f8508c, this.f8509d.j());
    }
}
