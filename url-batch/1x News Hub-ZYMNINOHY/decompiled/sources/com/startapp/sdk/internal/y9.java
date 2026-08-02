package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;

/* loaded from: classes.dex */
public final class y9 extends w9 {

    /* renamed from: d, reason: collision with root package name */
    public final ib f4811d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f4812e;

    public y9(ib ibVar, ib ibVar2, d9 d9Var, g9 g9Var, n9 n9Var) {
        super(d9Var, g9Var, n9Var);
        this.f4811d = ibVar;
        this.f4812e = ibVar2;
    }

    @Override // com.startapp.sdk.internal.w9
    public final int a() {
        String str = this.f4672a.f3681e;
        if (str == null) {
            return 3;
        }
        ef efVar = (ef) this.f4812e.a();
        o8 o8Var = (o8) this.f4811d.a();
        hi hiVar = new hi();
        hiVar.f4749J = efVar.a(hiVar);
        n8 n8Var = new n8(o8Var, hiVar.a(str));
        n8Var.f4196e = null;
        n8Var.f4195d = ((HttpClientConfig) o8Var.f.a()).a(hiVar.f4764Z);
        return n8Var.a() != null ? 1 : 0;
    }
}
