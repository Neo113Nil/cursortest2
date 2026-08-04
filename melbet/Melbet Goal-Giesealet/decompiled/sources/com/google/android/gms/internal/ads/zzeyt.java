package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzeyt implements zzgoq {
    final /* synthetic */ zzfib zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzcpp zzc;
    final /* synthetic */ zzeyx zzd;

    zzeyt(zzeyx zzeyxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzcpp zzcppVar) {
        this.zza = zzfibVar;
        this.zzb = zzfhrVar;
        this.zzc = zzcppVar;
        Objects.requireNonNull(zzeyxVar);
        this.zzd = zzeyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzeyx zzeyxVar = this.zzd;
        synchronized (zzeyxVar) {
            zzcpp zzcppVar = this.zzc;
            com.google.android.gms.ads.internal.client.zze zzg = zzcppVar.zzc().zzg(th);
            zzeyxVar.zzs(zzg);
            zzcppVar.zzb().zzdN(zzg);
            zzfdz.zza(zzg.zza, th, "BannerAdLoader.onFailure");
            if (zzeyxVar.zzr()) {
                zzeyxVar.zzn();
                zzeyxVar.zzo().zzd(zzeyxVar.zzq().zzc());
            }
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zza) == null) {
                zzfie zzp = zzeyxVar.zzp();
                zzfhr zzfhrVar = this.zzb;
                zzfhrVar.zzh(zzg);
                zzfhrVar.zzj(th);
                zzfhrVar.zzd(false);
                zzp.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zzf(zzg);
                zzfhr zzfhrVar2 = this.zzb;
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
        zzeyx zzeyxVar = this.zzd;
        zzcok zzcokVar = (zzcok) obj;
        synchronized (zzeyxVar) {
            if (zzcokVar != null) {
                zzcokVar.zzt();
            }
            if (zzeyxVar.zzr()) {
                zzeyxVar.zzc();
            }
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zza) == null) {
                zzfie zzp = zzeyxVar.zzp();
                zzfhr zzfhrVar = this.zzb;
                zzfhrVar.zzg(zzcokVar.zzr().zzb);
                zzfhrVar.zzi(zzcokVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzp.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzcokVar.zzr().zzb);
                zzfibVar.zzg(zzcokVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzb;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
