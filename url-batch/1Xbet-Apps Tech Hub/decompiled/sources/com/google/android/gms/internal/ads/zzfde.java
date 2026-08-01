package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfde implements zzgax {
    final /* synthetic */ zzeob zza;
    final /* synthetic */ zzfkh zzb;
    final /* synthetic */ zzfjw zzc;
    final /* synthetic */ zzfdg zzd;
    final /* synthetic */ zzfdh zze;

    zzfde(zzfdh zzfdhVar, zzeob zzeobVar, zzfkh zzfkhVar, zzfjw zzfjwVar, zzfdg zzfdgVar) {
        this.zze = zzfdhVar;
        this.zza = zzeobVar;
        this.zzb = zzfkhVar;
        this.zzc = zzfjwVar;
        this.zzd = zzfdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzfbl zzfblVar;
        zzfcx zzfcxVar;
        zzdqc zzk;
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        Executor executor;
        zzfblVar = this.zze.zze;
        zzdqd zzdqdVar = (zzdqd) zzfblVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdqdVar == null ? zzffr.zzb(th, null) : zzdqdVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzdqdVar != null) {
                zzdqdVar.zza().zzbG(zzb);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfcx zzfcxVar2;
                        zzfcxVar2 = zzfde.this.zze.zzd;
                        zzfcxVar2.zzbG(zzb);
                    }
                });
            } else {
                zzfcxVar = this.zze.zzd;
                zzfcxVar.zzbG(zzb);
                zzk = this.zze.zzk(this.zzd);
                zzk.zzh().zzb().zzc().zzh();
            }
            zzffl.zzb(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zzg;
                zzfjw zzfjwVar = this.zzc;
                zzfjwVar.zza(zzb);
                zzfjwVar.zzg(th);
                zzfjwVar.zzf(false);
                zzfkkVar.zzb(zzfjwVar.zzl());
            } else {
                zzfkhVar.zzc(zzb);
                zzfjw zzfjwVar2 = this.zzc;
                zzfjwVar2.zzg(th);
                zzfjwVar2.zzf(false);
                zzfkhVar.zza(zzfjwVar2);
                zzfkhVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcx zzfcxVar;
        Executor executor;
        final zzfcx zzfcxVar2;
        zzfcx zzfcxVar3;
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        zzdpy zzdpyVar = (zzdpy) obj;
        synchronized (this.zze) {
            zzdcm zzn = zzdpyVar.zzn();
            zzfcxVar = this.zze.zzd;
            zzn.zzd(zzfcxVar);
            this.zza.zzb(zzdpyVar);
            zzfdh zzfdhVar = this.zze;
            executor = zzfdhVar.zzb;
            zzfcxVar2 = zzfdhVar.zzd;
            zzfcxVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdd
                @Override // java.lang.Runnable
                public final void run() {
                    zzfcx.this.zzr();
                }
            });
            zzfcxVar3 = this.zze.zzd;
            zzfcxVar3.onAdMetadataChanged();
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zzg;
                zzfjw zzfjwVar = this.zzc;
                zzfjwVar.zzb(zzdpyVar.zzp().zzb);
                zzfjwVar.zzd(zzdpyVar.zzl().zzg());
                zzfjwVar.zzf(true);
                zzfkkVar.zzb(zzfjwVar.zzl());
            } else {
                zzfkhVar.zzf(zzdpyVar.zzp().zzb);
                zzfkhVar.zze(zzdpyVar.zzl().zzg());
                zzfjw zzfjwVar2 = this.zzc;
                zzfjwVar2.zzf(true);
                zzfkhVar.zza(zzfjwVar2);
                zzfkhVar.zzg();
            }
        }
    }
}
