package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcyu extends zzddv implements zzcyl {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcyu(zzcyt zzcytVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzcytVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzcym
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzcyl) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzb() {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzcyn
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzcyl) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzc(final zzdif zzdifVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzcyp
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzcyl) obj).zzc(zzdif.this);
            }
        });
    }

    final /* synthetic */ void zzd() {
        synchronized (this) {
            zzcbn.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdif("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyo
            @Override // java.lang.Runnable
            public final void run() {
                zzcyu.this.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjY)).intValue(), TimeUnit.MILLISECONDS);
    }
}
