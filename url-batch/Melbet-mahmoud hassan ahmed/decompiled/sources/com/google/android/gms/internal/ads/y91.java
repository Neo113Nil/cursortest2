package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class y91 implements kv3<x91> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f14583a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<rr2> f14584b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<eh0> f14585c;

    public y91(yv3<Context> yv3Var, yv3<rr2> yv3Var2, yv3<eh0> yv3Var3) {
        this.f14583a = yv3Var;
        this.f14584b = yv3Var2;
        this.f14585c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* synthetic */ Object a() {
        return new x91(this.f14583a.a(), ((m71) this.f14584b).b(), new eh0(), null);
    }
}
