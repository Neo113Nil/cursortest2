package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class nd2 implements kv3<ld2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<dc3> f9052a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f9053b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f9054c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ViewGroup> f9055d;

    public nd2(yv3<dc3> yv3Var, yv3<Context> yv3Var2, yv3<ks2> yv3Var3, yv3<ViewGroup> yv3Var4) {
        this.f9052a = yv3Var;
        this.f9053b = yv3Var2;
        this.f9054c = yv3Var3;
        this.f9055d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new ld2(this.f9052a.a(), ((nt2) this.f9053b).b(), ((ma1) this.f9054c).b(), ((r41) this.f9055d).b());
    }
}
