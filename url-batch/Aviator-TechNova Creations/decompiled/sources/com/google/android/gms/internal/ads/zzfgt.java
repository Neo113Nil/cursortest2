package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfgt implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzdlu zzd;
    final /* synthetic */ zzfgv zze;

    zzfgt(zzfgv zzfgvVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdlu zzdluVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdluVar;
        Objects.requireNonNull(zzfgvVar);
        this.zze = zzfgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdlu zzdluVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdluVar.zzb().zzg(th);
        zzfgv zzfgvVar = this.zze;
        synchronized (zzfgvVar) {
            zzfgvVar.zzi(null);
            zzdluVar.zza().zzdI(zzg);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjy)).booleanValue()) {
                zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfgt.this.zze.zzf().zzdI(zzg);
                    }
                });
                zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfgt.this.zze.zzg().zzdI(zzg);
                    }
                });
            }
            zzfkh.zza(zzg.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzh = zzfgvVar.zzh();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzh(zzg);
                zzfoeVar.zzj(th);
                zzfoeVar.zzd(false);
                zzh.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zzf(zzg);
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzj(th);
                zzfoeVar2.zzd(false);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzfgv zzfgvVar = this.zze;
        zzdkn zzdknVar = (zzdkn) obj;
        synchronized (zzfgvVar) {
            if (zzdknVar != null) {
                zzdknVar.zzt();
            }
            zzfgvVar.zzi(null);
            zzbgv zzbgvVar = zzbhe.zzjy;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzdev zzq = zzdknVar.zzq();
                zzq.zza(zzfgvVar.zzf());
                zzq.zzd(zzfgvVar.zzg());
            }
            this.zza.zzb(zzdknVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfgt.this.zze.zzf().zzg();
                    }
                });
                zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfgt.this.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzh = zzfgvVar.zzh();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzdknVar.zzr().zzb);
                zzfoeVar.zzi(zzdknVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzh.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzdknVar.zzr().zzb);
                zzfooVar.zzg(zzdknVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
