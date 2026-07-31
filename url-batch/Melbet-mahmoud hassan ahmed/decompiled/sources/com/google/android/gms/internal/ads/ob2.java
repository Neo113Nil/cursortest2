package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ob2 implements kv3<mb2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f9594a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<zw> f9595b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f9596c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<t41> f9597d;

    public ob2(yv3<Context> yv3Var, yv3<zw> yv3Var2, yv3<ks2> yv3Var3, yv3<t41> yv3Var4) {
        this.f9594a = yv3Var;
        this.f9595b = yv3Var2;
        this.f9596c = yv3Var3;
        this.f9597d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new mb2(this.f9594a.a(), ((zk1) this.f9595b).b(), ((ma1) this.f9596c).b(), ((g51) this.f9597d).b());
    }
}
