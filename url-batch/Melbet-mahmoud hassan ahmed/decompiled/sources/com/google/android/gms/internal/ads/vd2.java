package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vd2 implements kv3<ud2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<cc3<String>> f13303a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f13304b;

    public vd2(yv3<cc3<String>> yv3Var, yv3<Executor> yv3Var2) {
        this.f13303a = yv3Var;
        this.f13304b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        cc3<String> a7 = this.f13303a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new ud2(a7, dc3Var);
    }
}
