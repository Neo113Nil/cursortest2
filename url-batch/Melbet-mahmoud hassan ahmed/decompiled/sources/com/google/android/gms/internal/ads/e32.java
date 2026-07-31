package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class e32 implements kv3<d32> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Set<c32>> f4485a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ww2> f4486b;

    public e32(yv3<Set<c32>> yv3Var, yv3<ww2> yv3Var2) {
        this.f4485a = yv3Var;
        this.f4486b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new d32(((wv3) this.f4485a).a(), this.f4486b.a());
    }
}
