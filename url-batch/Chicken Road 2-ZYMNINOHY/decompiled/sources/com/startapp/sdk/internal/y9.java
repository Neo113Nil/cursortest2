package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;

/* loaded from: classes.dex */
public final class y9 extends w9 {

    /* renamed from: d, reason: collision with root package name */
    public final ib f7959d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f7960e;

    public y9(ib ibVar, ib ibVar2, d9 d9Var, g9 g9Var, n9 n9Var) {
        super(d9Var, g9Var, n9Var);
        this.f7959d = ibVar;
        this.f7960e = ibVar2;
    }

    @Override // com.startapp.sdk.internal.w9
    public final int a() {
        String str = this.f7817a.f6793e;
        if (str == null) {
            return 3;
        }
        ef efVar = (ef) this.f7960e.a();
        o8 o8Var = (o8) this.f7959d.a();
        hi hiVar = new hi();
        hiVar.f7895J = efVar.a(hiVar);
        n8 n8Var = new n8(o8Var, hiVar.a(str));
        n8Var.f7329e = null;
        n8Var.f7328d = ((HttpClientConfig) o8Var.f7374f.a()).a(hiVar.f7910Z);
        return n8Var.a() != null ? 1 : 0;
    }
}
