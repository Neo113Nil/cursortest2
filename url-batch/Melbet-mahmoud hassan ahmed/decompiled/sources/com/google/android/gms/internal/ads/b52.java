package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b52<DelegateT, AdapterT> implements a52<AdapterT> {

    /* renamed from: a, reason: collision with root package name */
    public final a52<DelegateT> f3257a;

    /* renamed from: b, reason: collision with root package name */
    private final e43<DelegateT, AdapterT> f3258b;

    public b52(a52<DelegateT> a52Var, e43<DelegateT, AdapterT> e43Var) {
        this.f3257a = a52Var;
        this.f3258b = e43Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<AdapterT> a(ds2 ds2Var, rr2 rr2Var) {
        return rb3.m(this.f3257a.a(ds2Var, rr2Var), this.f3258b, wo0.f13894a);
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        return this.f3257a.b(ds2Var, rr2Var);
    }
}
