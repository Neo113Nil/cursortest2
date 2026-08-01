package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzehp implements zzefv {
    private final zzcsm zza;
    private final zzegw zzb;
    private final zzgbl zzc;
    private final zzcyj zzd;
    private final ScheduledExecutorService zze;

    public zzehp(zzcsm zzcsmVar, zzegw zzegwVar, zzcyj zzcyjVar, ScheduledExecutorService scheduledExecutorService, zzgbl zzgblVar) {
        this.zza = zzcsmVar;
        this.zzb = zzegwVar;
        this.zzd = zzcyjVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzgblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(final zzfeh zzfehVar, final zzfdu zzfduVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzehp.this.zzc(zzfehVar, zzfduVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        return zzfehVar.zza.zza.zza() != null && this.zzb.zzb(zzfehVar, zzfduVar);
    }

    final /* synthetic */ zzcrp zzc(final zzfeh zzfehVar, final zzfdu zzfduVar) throws Exception {
        return this.zza.zzb(new zzcuh(zzfehVar, zzfduVar, null), new zzcsz(zzfehVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // java.lang.Runnable
            public final void run() {
                zzehp.this.zzf(zzfehVar, zzfduVar);
            }
        })).zza();
    }

    final /* synthetic */ void zzf(zzfeh zzfehVar, zzfdu zzfduVar) {
        zzgbb.zzr(zzgbb.zzo(this.zzb.zza(zzfehVar, zzfduVar), zzfduVar.zzS, TimeUnit.SECONDS, this.zze), new zzeho(this), this.zzc);
    }
}
