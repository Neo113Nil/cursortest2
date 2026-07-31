package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class il2 implements kv3<gl2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<dh0> f6678a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f6679b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Context> f6680c;

    public il2(yv3<dh0> yv3Var, yv3<ScheduledExecutorService> yv3Var2, yv3<Context> yv3Var3) {
        this.f6678a = yv3Var;
        this.f6679b = yv3Var2;
        this.f6680c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new gl2(new dh0(), this.f6679b.a(), ((gw0) this.f6680c).b(), null);
    }
}
