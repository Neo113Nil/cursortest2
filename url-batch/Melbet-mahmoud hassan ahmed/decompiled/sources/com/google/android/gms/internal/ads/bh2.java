package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class bh2 implements ij2<ch2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f3429a;

    /* renamed from: b, reason: collision with root package name */
    private final qr2 f3430b;

    public bh2(dc3 dc3Var, qr2 qr2Var) {
        this.f3429a = dc3Var;
        this.f3430b = qr2Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ch2> a() {
        return this.f3429a.E(new Callable() { // from class: com.google.android.gms.internal.ads.ah2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bh2.this.b();
            }
        });
    }

    final /* synthetic */ ch2 b() {
        return new ch2(this.f3430b);
    }
}
