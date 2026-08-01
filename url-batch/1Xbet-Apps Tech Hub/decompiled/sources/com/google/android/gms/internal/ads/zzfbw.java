package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfbw implements zzgax {
    final /* synthetic */ zzeob zza;
    final /* synthetic */ zzfkh zzb;
    final /* synthetic */ zzfjw zzc;
    final /* synthetic */ zzdhy zzd;
    final /* synthetic */ zzfbx zze;

    zzfbw(zzfbx zzfbxVar, zzeob zzeobVar, zzfkh zzfkhVar, zzfjw zzfjwVar, zzdhy zzdhyVar) {
        this.zze = zzfbxVar;
        this.zza = zzeobVar;
        this.zzb = zzfkhVar;
        this.zzc = zzfjwVar;
        this.zzd = zzdhyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzfkk zzfkkVar;
        zzfkh zzfkhVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzbG(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzia)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzenm zzenmVar;
                        zzenmVar = zzfbw.this.zze.zzd;
                        zzenmVar.zzbG(zza);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfcx zzfcxVar;
                        zzfcxVar = zzfbw.this.zze.zze;
                        zzfcxVar.zzbG(zza);
                    }
                });
            }
            zzffl.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zzg;
                zzfjw zzfjwVar = this.zzc;
                zzfjwVar.zza(zza);
                zzfjwVar.zzg(th);
                zzfjwVar.zzf(false);
                zzfkkVar.zzb(zzfjwVar.zzl());
            } else {
                zzfkhVar.zzc(zza);
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
        Executor executor;
        Executor executor2;
        zzenm zzenmVar;
        zzfcx zzfcxVar;
        zzdgx zzdgxVar = (zzdgx) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzia)).booleanValue()) {
                zzdcm zzn = zzdgxVar.zzn();
                zzenmVar = this.zze.zzd;
                zzn.zza(zzenmVar);
                zzfcxVar = this.zze.zze;
                zzn.zzd(zzfcxVar);
            }
            this.zza.zzb(zzdgxVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzia)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzenm zzenmVar2;
                        zzenmVar2 = zzfbw.this.zze.zzd;
                        zzenmVar2.zzr();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfcx zzfcxVar2;
                        zzfcxVar2 = zzfbw.this.zze.zze;
                        zzfcxVar2.zzr();
                    }
                });
            }
            if (!((Boolean) zzbeo.zzc.zze()).booleanValue() || (zzfkhVar = this.zzb) == null) {
                zzfkkVar = this.zze.zzg;
                zzfjw zzfjwVar = this.zzc;
                zzfjwVar.zzb(zzdgxVar.zzp().zzb);
                zzfjwVar.zzd(zzdgxVar.zzl().zzg());
                zzfjwVar.zzf(true);
                zzfkkVar.zzb(zzfjwVar.zzl());
            } else {
                zzfkhVar.zzf(zzdgxVar.zzp().zzb);
                zzfkhVar.zze(zzdgxVar.zzl().zzg());
                zzfjw zzfjwVar2 = this.zzc;
                zzfjwVar2.zzf(true);
                zzfkhVar.zza(zzfjwVar2);
                zzfkhVar.zzg();
            }
        }
    }
}
