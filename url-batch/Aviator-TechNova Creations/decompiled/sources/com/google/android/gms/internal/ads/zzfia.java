package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfia implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzfid zzd;
    final /* synthetic */ zzfie zze;

    zzfia(zzfie zzfieVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfid zzfidVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfidVar;
        Objects.requireNonNull(zzfieVar);
        this.zze = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfie zzfieVar = this.zze;
        zzdue zzdueVar = (zzdue) zzfieVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdueVar == null ? zzfkm.zzb(th, null) : zzdueVar.zza().zzg(th);
        synchronized (zzfieVar) {
            if (zzdueVar != null) {
                zzdueVar.zze().zzdI(zzb);
                zzfieVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfia.this.zze.zzg().zzdI(zzb);
                    }
                });
            } else {
                zzfieVar.zzg().zzdI(zzb);
                zzfieVar.zze(this.zzd).zzh().zza().zzd().zzo();
            }
            zzfkh.zza(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzi = zzfieVar.zzi();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzh(zzb);
                zzfoeVar.zzj(th);
                zzfoeVar.zzd(false);
                zzi.zzb(zzfoeVar.zzm());
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
        zzfie zzfieVar = this.zze;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfieVar) {
            if (zzdtzVar != null) {
                zzdtzVar.zzt();
            }
            zzdtzVar.zzq().zzd(zzfieVar.zzg());
            this.zza.zzb(zzdtzVar);
            Executor zzf = zzfieVar.zzf();
            final zzfhv zzg = zzfieVar.zzg();
            Objects.requireNonNull(zzg);
            zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfhv.this.zzg();
                }
            });
            zzfieVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzi = zzfieVar.zzi();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzdtzVar.zzr().zzb);
                zzfoeVar.zzi(zzdtzVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzi.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzdtzVar.zzr().zzb);
                zzfooVar.zzg(zzdtzVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
