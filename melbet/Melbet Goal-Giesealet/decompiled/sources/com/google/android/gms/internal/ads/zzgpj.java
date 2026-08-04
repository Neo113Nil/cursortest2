package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgpj extends zzgpf implements zzgpe {
    final ScheduledExecutorService zza;

    zzgpj(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd */
    public final zzgpc schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgps zze = zzgps.zze(runnable, null);
        return new zzgph(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze */
    public final zzgpc schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgps zzgpsVar = new zzgps(callable);
        return new zzgph(zzgpsVar, this.zza.schedule(zzgpsVar, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf */
    public final zzgpc scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgpi zzgpiVar = new zzgpi(runnable);
        return new zzgph(zzgpiVar, this.zza.scheduleAtFixedRate(zzgpiVar, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg */
    public final zzgpc scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgpi zzgpiVar = new zzgpi(runnable);
        return new zzgph(zzgpiVar, this.zza.scheduleWithFixedDelay(zzgpiVar, j, j2, timeUnit));
    }
}
