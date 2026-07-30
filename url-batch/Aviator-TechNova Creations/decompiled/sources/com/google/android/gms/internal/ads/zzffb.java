package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzffb implements zzgzl {
    final /* synthetic */ zzfoo zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ zzcvc zzc;
    final /* synthetic */ zzfff zzd;

    zzffb(zzfff zzfffVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzcvc zzcvcVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = zzcvcVar;
        Objects.requireNonNull(zzfffVar);
        this.zzd = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzfff zzfffVar = this.zzd;
        synchronized (zzfffVar) {
            zzcvc zzcvcVar = this.zzc;
            com.google.android.gms.ads.internal.client.zze zzg = zzcvcVar.zzc().zzg(th);
            zzfffVar.zzs(zzg);
            zzcvcVar.zzb().zzdI(zzg);
            zzfkh.zza(zzg.zza, th, "BannerAdLoader.onFailure");
            if (zzfffVar.zzr()) {
                zzfffVar.zzn();
                zzfffVar.zzo().zzd(zzfffVar.zzq().zzc());
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                zzfor zzp = zzfffVar.zzp();
                zzfoe zzfoeVar = this.zzb;
                zzfoeVar.zzh(zzg);
                zzfoeVar.zzj(th);
                zzfoeVar.zzd(false);
                zzp.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zzf(zzg);
                zzfoe zzfoeVar2 = this.zzb;
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
        zzfff zzfffVar = this.zzd;
        zzctx zzctxVar = (zzctx) obj;
        synchronized (zzfffVar) {
            if (zzctxVar != null) {
                zzctxVar.zzt();
            }
            if (zzfffVar.zzr()) {
                zzfffVar.zzc();
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                zzfor zzp = zzfffVar.zzp();
                zzfoe zzfoeVar = this.zzb;
                zzfoeVar.zzg(zzctxVar.zzr().zzb);
                zzfoeVar.zzi(zzctxVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzp.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzctxVar.zzr().zzb);
                zzfooVar.zzg(zzctxVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzb;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
