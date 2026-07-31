package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class pf2 implements ij2<qf2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f10224a;

    /* renamed from: b, reason: collision with root package name */
    private final xt1 f10225b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10226c;

    /* renamed from: d, reason: collision with root package name */
    private final ks2 f10227d;

    public pf2(dc3 dc3Var, xt1 xt1Var, ks2 ks2Var, String str) {
        this.f10224a = dc3Var;
        this.f10225b = xt1Var;
        this.f10227d = ks2Var;
        this.f10226c = str;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<qf2> a() {
        return this.f10224a.E(new Callable() { // from class: com.google.android.gms.internal.ads.of2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pf2.this.b();
            }
        });
    }

    final /* synthetic */ qf2 b() {
        return new qf2(this.f10225b.b(this.f10227d.f7620f, this.f10226c), this.f10225b.a());
    }
}
