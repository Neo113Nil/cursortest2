package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfdx implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzfdy zzd;
    final /* synthetic */ zzfeb zze;

    zzfdx(zzfeb zzfebVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfdy zzfdyVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfdyVar;
        Objects.requireNonNull(zzfebVar);
        this.zze = zzfebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzfeb zzfebVar = this.zze;
        zzcth zzcthVar = (zzcth) zzfebVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcthVar == null ? zzfkm.zzb(th, null) : zzcthVar.zza().zzg(th);
        synchronized (zzfebVar) {
            zzfebVar.zzl(null);
            if (zzcthVar != null) {
                zzcthVar.zze().zzdI(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
                    zzfebVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfdx.this.zze.zzi().zzdI(zzb);
                        }
                    });
                }
            } else {
                zzfebVar.zzi().zzdI(zzb);
                ((zzcth) zzfebVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
            }
            zzfkh.zza(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzk = zzfebVar.zzk();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzh(zzb);
                zzfoeVar.zzj(th);
                zzfoeVar.zzd(false);
                zzk.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zzf(zzb);
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
        zzfeb zzfebVar = this.zze;
        zzcwf zzcwfVar = (zzcwf) obj;
        synchronized (zzfebVar) {
            if (zzcwfVar != null) {
                zzcwfVar.zzt();
            }
            zzfebVar.zzl(null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
                zzcwfVar.zzq().zzc(zzfebVar.zzi());
            }
            this.zza.zzb(zzcwfVar);
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzk = zzfebVar.zzk();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzcwfVar.zzr().zzb);
                zzfoeVar.zzi(zzcwfVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzk.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzcwfVar.zzr().zzb);
                zzfooVar.zzg(zzcwfVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
