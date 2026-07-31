package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hj2;

/* loaded from: classes.dex */
final class mf2<S extends hj2<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final cc3<S> f8514a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8515b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.d f8516c;

    public mf2(cc3<S> cc3Var, long j7, v3.d dVar) {
        this.f8514a = cc3Var;
        this.f8516c = dVar;
        this.f8515b = dVar.a() + j7;
    }

    public final boolean a() {
        return this.f8515b < this.f8516c.a();
    }
}
