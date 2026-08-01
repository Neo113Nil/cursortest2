package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcxe implements zzcyh, zzdfj, zzdcz, zzcyx, zzavq {
    private final zzcyz zza;
    private final zzfdu zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzgbt zze = zzgbt.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    zzcxe(zzcyz zzcyzVar, zzfdu zzfduVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcyzVar;
        this.zzb = zzfduVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzbu(zzavp zzavpVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkC)).booleanValue() && zzm() && zzavpVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zzf != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzbx(zzbwq zzbwqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzc() {
        zzfdu zzfduVar = this.zzb;
        if (zzfduVar.zzf == 3) {
            return;
        }
        int i = zzfduVar.zzZ;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkC)).booleanValue() && zzm()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzf() {
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzk() {
        if (this.zzb.zzf == 3) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbu)).booleanValue()) {
            zzfdu zzfduVar = this.zzb;
            if (zzfduVar.zzZ == 2) {
                if (zzfduVar.zzr == 0) {
                    this.zza.zza();
                } else {
                    zzgbb.zzr(this.zze, new zzcxd(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcxe.this.zzh();
                        }
                    }, this.zzb.zzr, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final synchronized void zzp(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }
}
