package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qz1 implements kv3<hi1<td1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<c12> f10925a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f10926b;

    public qz1(yv3<c12> yv3Var, yv3<Executor> yv3Var2) {
        this.f10925a = yv3Var;
        this.f10926b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        c12 a7 = ((e12) this.f10925a).a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
