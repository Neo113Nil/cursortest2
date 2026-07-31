package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class e92 implements kv3<d92> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f4529a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ms1> f4530b;

    public e92(yv3<Context> yv3Var, yv3<ms1> yv3Var2) {
        this.f4529a = yv3Var;
        this.f4530b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d92 a() {
        return new d92(this.f4529a.a(), this.f4530b.a());
    }
}
