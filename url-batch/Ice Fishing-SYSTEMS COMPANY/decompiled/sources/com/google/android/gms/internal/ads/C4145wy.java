package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.wy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4145wy implements InterfaceC3929sy {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f35101a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.InterfaceC3929sy
    public final void a(Runnable runnable, long j9) {
        this.f35101a.schedule(runnable, j9, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3929sy
    public final void d() {
    }
}
