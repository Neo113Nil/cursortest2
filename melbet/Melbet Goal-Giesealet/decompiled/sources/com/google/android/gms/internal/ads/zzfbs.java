package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfbs implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzfbv zzd;
    final /* synthetic */ zzfbw zze;

    zzfbs(zzfbw zzfbwVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzfbv zzfbvVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzfbvVar;
        Objects.requireNonNull(zzfbwVar);
        this.zze = zzfbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfbw zzfbwVar = this.zze;
        zzdor zzdorVar = (zzdor) zzfbwVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdorVar == null ? zzfee.zzb(th, null) : zzdorVar.zza().zzg(th);
        synchronized (zzfbwVar) {
            if (zzdorVar != null) {
                zzdorVar.zze().zzdN(zzb);
                zzfbwVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfbs.this.zze.zzg().zzdN(zzb);
                    }
                });
            } else {
                zzfbwVar.zzg().zzdN(zzb);
                zzfbwVar.zze(this.zzd).zzh().zza().zzd().zzo();
            }
            zzfdz.zza(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzi = zzfbwVar.zzi();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzh(zzb);
                zzfhrVar.zzj(th);
                zzfhrVar.zzd(false);
                zzi.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zzf(zzb);
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzj(th);
                zzfhrVar2.zzd(false);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfib zzfibVar;
        zzfbw zzfbwVar = this.zze;
        zzdom zzdomVar = (zzdom) obj;
        synchronized (zzfbwVar) {
            if (zzdomVar != null) {
                zzdomVar.zzt();
            }
            zzdomVar.zzq().zzd(zzfbwVar.zzg());
            this.zza.zzb(zzdomVar);
            Executor zzf = zzfbwVar.zzf();
            final zzfbn zzg = zzfbwVar.zzg();
            Objects.requireNonNull(zzg);
            zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfbn.this.zzg();
                }
            });
            zzfbwVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzi = zzfbwVar.zzi();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzdomVar.zzr().zzb);
                zzfhrVar.zzi(zzdomVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzi.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzdomVar.zzr().zzb);
                zzfibVar.zzg(zzdomVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
