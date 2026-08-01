package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzetg implements zzeuy {
    private final zzeuy zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzetg(zzeuy zzeuyVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeuyVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzb = zzgbb.zzo(zzb, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgbb.zzf(zzb, Throwable.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzetf
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzh(null);
            }
        }, zzcca.zzf);
    }
}
