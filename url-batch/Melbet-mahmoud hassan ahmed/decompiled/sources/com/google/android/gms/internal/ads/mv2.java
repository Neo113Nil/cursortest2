package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class mv2 implements kv3<ScheduledExecutorService> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ThreadFactory> f8735a;

    public mv2(yv3<ThreadFactory> yv3Var) {
        this.f8735a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ThreadFactory a7 = this.f8735a.a();
        r33.a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, a7));
        sv3.b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
