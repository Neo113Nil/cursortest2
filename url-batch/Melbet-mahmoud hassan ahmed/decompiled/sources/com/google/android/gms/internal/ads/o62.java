package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class o62 implements kv3<n62> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f9539a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<r51> f9540b;

    public o62(yv3<Context> yv3Var, yv3<r51> yv3Var2) {
        this.f9539a = yv3Var;
        this.f9540b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n62 a() {
        return new n62(this.f9539a.a(), this.f9540b.a());
    }
}
