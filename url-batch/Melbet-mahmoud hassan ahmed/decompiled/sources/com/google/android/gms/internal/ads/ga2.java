package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hc1;

/* loaded from: classes.dex */
public final class ga2<AdT, AdapterT, ListenerT extends hc1> implements kv3<fa2<AdT, AdapterT, ListenerT>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<nw2> f5512a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dc3> f5513b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<c52<AdapterT, ListenerT>> f5514c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<j52<AdT, AdapterT, ListenerT>> f5515d;

    public ga2(yv3<nw2> yv3Var, yv3<dc3> yv3Var2, yv3<c52<AdapterT, ListenerT>> yv3Var3, yv3<j52<AdT, AdapterT, ListenerT>> yv3Var4) {
        this.f5512a = yv3Var;
        this.f5513b = yv3Var2;
        this.f5514c = yv3Var3;
        this.f5515d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fa2<AdT, AdapterT, ListenerT> a() {
        return new fa2<>(this.f5512a.a(), this.f5513b.a(), this.f5514c.a(), this.f5515d.a());
    }
}
