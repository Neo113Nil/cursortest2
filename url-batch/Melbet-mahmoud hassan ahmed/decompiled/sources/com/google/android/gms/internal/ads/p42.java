package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class p42 implements kv3<o42> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f10092a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dc3> f10093b;

    public p42(yv3<Context> yv3Var, yv3<dc3> yv3Var2) {
        this.f10092a = yv3Var;
        this.f10093b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Context b7 = ((gw0) this.f10092a).b();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new o42(b7, dc3Var);
    }
}
