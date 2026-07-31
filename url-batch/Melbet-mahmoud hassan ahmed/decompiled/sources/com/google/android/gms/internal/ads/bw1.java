package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class bw1 implements kv3<aw1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<sv1> f3552a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Set<zv1>> f3553b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<v3.d> f3554c;

    public bw1(yv3<sv1> yv3Var, yv3<Set<zv1>> yv3Var2, yv3<v3.d> yv3Var3) {
        this.f3552a = yv3Var;
        this.f3553b = yv3Var2;
        this.f3554c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new aw1(this.f3552a.a(), ((wv3) this.f3553b).a(), this.f3554c.a());
    }
}
