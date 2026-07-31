package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class n20 implements kv3<m20> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f8883a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f8884b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<o20> f8885c;

    public n20(yv3<Context> yv3Var, yv3<ScheduledExecutorService> yv3Var2, yv3<o20> yv3Var3) {
        this.f8883a = yv3Var;
        this.f8884b = yv3Var2;
        this.f8885c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* synthetic */ Object a() {
        return new m20(((nt2) this.f8883a).b(), this.f8884b.a(), new o20(), null);
    }
}
