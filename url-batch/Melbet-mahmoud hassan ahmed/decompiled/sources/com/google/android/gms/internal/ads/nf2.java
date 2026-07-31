package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hj2;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nf2<S extends hj2> implements ij2<S> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<mf2<S>> f9071a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final v3.d f9072b;

    /* renamed from: c, reason: collision with root package name */
    private final ij2<S> f9073c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9074d;

    public nf2(ij2<S> ij2Var, long j7, v3.d dVar) {
        this.f9072b = dVar;
        this.f9073c = ij2Var;
        this.f9074d = j7;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<S> a() {
        mf2<S> mf2Var = this.f9071a.get();
        if (mf2Var == null || mf2Var.a()) {
            mf2Var = new mf2<>(this.f9073c.a(), this.f9074d, this.f9072b);
            this.f9071a.set(mf2Var);
        }
        return mf2Var.f8514a;
    }
}
