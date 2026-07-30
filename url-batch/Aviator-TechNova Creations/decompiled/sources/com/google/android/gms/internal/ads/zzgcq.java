package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgcq implements zzgcl {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    zzgcq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zza(Runnable runnable, long j) {
        this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zzb() {
    }
}
