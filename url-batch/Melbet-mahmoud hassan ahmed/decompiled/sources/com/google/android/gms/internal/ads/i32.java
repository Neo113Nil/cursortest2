package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i32 implements kv3<hi1<ow2>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<u32> f6521a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f6522b;

    public i32(yv3<u32> yv3Var, yv3<Executor> yv3Var2) {
        this.f6521a = yv3Var;
        this.f6522b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        u32 a7 = ((v32) this.f6521a).a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
