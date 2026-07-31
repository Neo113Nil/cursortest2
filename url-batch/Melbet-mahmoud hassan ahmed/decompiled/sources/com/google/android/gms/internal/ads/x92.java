package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x92 implements kv3<w92> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f14096a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f14097b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ms1> f14098c;

    public x92(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<ms1> yv3Var3) {
        this.f14096a = yv3Var;
        this.f14097b = yv3Var2;
        this.f14098c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new w92(this.f14096a.a(), this.f14097b.a(), this.f14098c.a());
    }
}
