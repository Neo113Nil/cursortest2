package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfmy implements zzbdy {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Map zzc = new HashMap();
    private boolean zzd = false;

    zzfmy(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = scheduledExecutorService;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        Map map = this.zzc;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
            zzfmx zzfmxVar = (zzfmx) map.get(scheduledFuture);
            if (zzfmxVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                zzb(zzfmxVar.zza, Math.max(0L, zzfmxVar.zzb - com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z) {
        if (z) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfmy.this.zzc();
                }
            });
        }
    }

    public final synchronized void zzb(Runnable runnable, long j, TimeUnit timeUnit) {
        if (!this.zzd) {
            com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            this.zzd = true;
        }
        final zzfmx zzfmxVar = new zzfmx(this, runnable, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + timeUnit.toMillis(j));
        ScheduledExecutorService scheduledExecutorService = this.zza;
        Objects.requireNonNull(zzfmxVar);
        zzfmxVar.zzc = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfmx zzfmxVar2;
                zzfmx zzfmxVar3 = zzfmx.this;
                zzfmy zzfmyVar = zzfmxVar3.zzd;
                synchronized (zzfmyVar) {
                    ScheduledFuture scheduledFuture = zzfmxVar3.zzc;
                    zzfmxVar2 = scheduledFuture != null ? (zzfmx) zzfmyVar.zze().remove(scheduledFuture) : null;
                }
                if (zzfmxVar2 != null) {
                    zzfmxVar3.zzd.zzd().execute(zzfmxVar3.zza);
                }
            }
        }, j, timeUnit);
        this.zzc.put(zzfmxVar.zzc, zzfmxVar);
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
