package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeyz implements zzgax {
    final /* synthetic */ zzeob zza;
    final /* synthetic */ zzfkh zzb;
    final /* synthetic */ zzfjw zzc;
    final /* synthetic */ zzezb zzd;
    final /* synthetic */ zzezc zze;

    zzeyz(zzezc zzezcVar, zzeob zzeobVar, zzfkh zzfkhVar, zzfjw zzfjwVar, zzezb zzezbVar) {
        this.zze = zzezcVar;
        this.zza = zzeobVar;
        this.zzb = zzfkhVar;
        this.zzc = zzfjwVar;
        this.zzd = zzezbVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcqz, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzfbl zzfblVar;
        zzezs zzezsVar;
        zzcxn zzm;
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        Executor executor;
        zzfblVar = this.zze.zze;
        zzcqz zzcqzVar = (zzcqz) zzfblVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcqzVar == null ? zzffr.zzb(th, null) : zzcqzVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcqzVar != null) {
                zzcqzVar.zzc().zzbG(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhZ)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyy
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzezs zzezsVar2;
                            zzezsVar2 = zzeyz.this.zze.zzd;
                            zzezsVar2.zzbG(zzb);
                        }
                    });
                }
            } else {
                zzezsVar = this.zze.zzd;
                zzezsVar.zzbG(zzb);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzh();
            }
            zzffl.zzb(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zzh;
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
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        zzezs zzezsVar;
        zzctr zzctrVar = (zzctr) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhZ)).booleanValue()) {
                zzdcm zzn = zzctrVar.zzn();
                zzezsVar = this.zze.zzd;
                zzn.zzb(zzezsVar);
            }
            this.zza.zzb(zzctrVar);
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zzh;
                zzfjw zzfjwVar = this.zzc;
                zzfjwVar.zzb(zzctrVar.zzp().zzb);
                zzfjwVar.zzd(zzctrVar.zzl().zzg());
                zzfjwVar.zzf(true);
                zzfkkVar.zzb(zzfjwVar.zzl());
            } else {
                zzfkhVar.zzf(zzctrVar.zzp().zzb);
                zzfkhVar.zze(zzctrVar.zzl().zzg());
                zzfjw zzfjwVar2 = this.zzc;
                zzfjwVar2.zzf(true);
                zzfkhVar.zza(zzfjwVar2);
                zzfkhVar.zzg();
            }
        }
    }
}
