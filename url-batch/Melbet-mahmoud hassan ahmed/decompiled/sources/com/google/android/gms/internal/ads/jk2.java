package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class jk2 implements kv3<hk2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<xi0> f7156a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f7157b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<String> f7158c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<dc3> f7159d;

    public jk2(yv3<xi0> yv3Var, yv3<Context> yv3Var2, yv3<String> yv3Var3, yv3<dc3> yv3Var4) {
        this.f7156a = yv3Var;
        this.f7157b = yv3Var2;
        this.f7158c = yv3Var3;
        this.f7159d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Context b7 = ((gw0) this.f7157b).b();
        String b8 = ((kl2) this.f7158c).b();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hk2(null, b7, b8, dc3Var);
    }
}
