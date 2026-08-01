package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeoi implements zzgax {
    final /* synthetic */ zzeob zza;
    final /* synthetic */ zzfkh zzb;
    final /* synthetic */ zzfjw zzc;
    final /* synthetic */ zzdiu zzd;
    final /* synthetic */ zzeoj zze;

    zzeoi(zzeoj zzeojVar, zzeob zzeobVar, zzfkh zzfkhVar, zzfjw zzfjwVar, zzdiu zzdiuVar) {
        this.zze = zzeojVar;
        this.zza = zzeobVar;
        this.zzb = zzfkhVar;
        this.zzc = zzfjwVar;
        this.zzd = zzdiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzciq zzciqVar;
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzbG(zza);
        zzciqVar = this.zze.zzb;
        zzciqVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoh
            @Override // java.lang.Runnable
            public final void run() {
                zzenz zzenzVar;
                zzenzVar = zzeoi.this.zze.zzd;
                zzenzVar.zza().zzbG(zza);
            }
        });
        zzffl.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbeo.zzc.zze()).booleanValue() && (zzfkhVar = this.zzb) != null) {
            zzfkhVar.zzc(zza);
            zzfjw zzfjwVar = this.zzc;
            zzfjwVar.zzg(th);
            zzfjwVar.zzf(false);
            zzfkhVar.zza(zzfjwVar);
            zzfkhVar.zzg();
            return;
        }
        zzeoj zzeojVar = this.zze;
        zzfjw zzfjwVar2 = this.zzc;
        zzfkkVar = zzeojVar.zze;
        zzfjwVar2.zza(zza);
        zzfjwVar2.zzg(th);
        zzfjwVar2.zzf(false);
        zzfkkVar.zzb(zzfjwVar2.zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzenz zzenzVar;
        zzciq zzciqVar;
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        zzctr zzctrVar = (zzctr) obj;
        synchronized (this.zze) {
            zzdcm zzn = zzctrVar.zzn();
            zzenzVar = this.zze.zzd;
            zzn.zza(zzenzVar.zzd());
            this.zza.zzb(zzctrVar);
            zzciqVar = this.zze.zzb;
            zzciqVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeog
                @Override // java.lang.Runnable
                public final void run() {
                    zzenz zzenzVar2;
                    zzenzVar2 = zzeoi.this.zze.zzd;
                    zzenzVar2.zzb().zzr();
                }
            });
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zze;
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
