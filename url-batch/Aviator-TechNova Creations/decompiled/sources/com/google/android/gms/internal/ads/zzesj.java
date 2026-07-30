package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzesj implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzdmq zzd;
    final /* synthetic */ zzesm zze;

    zzesj(zzesm zzesmVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdmq zzdmqVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdmqVar;
        Objects.requireNonNull(zzesmVar);
        this.zze = zzesmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdmq zzdmqVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdmqVar.zza().zzg(th);
        zzdmqVar.zzb().zzdI(zzg);
        zzesm zzesmVar = this.zze;
        zzesmVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzesj.this.zze.zzf().zze().zzdI(zzg);
            }
        });
        zzfkh.zza(zzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
            zzfor zzg2 = zzesmVar.zzg();
            zzfoe zzfoeVar = this.zzc;
            zzfoeVar.zzh(zzg);
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            zzg2.zzb(zzfoeVar.zzm());
            return;
        }
        zzfooVar.zzf(zzg);
        zzfoe zzfoeVar2 = this.zzc;
        zzfoeVar2.zzj(th);
        zzfoeVar2.zzd(false);
        zzfooVar.zza(zzfoeVar2);
        zzfooVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzesm zzesmVar = this.zze;
        zzcwf zzcwfVar = (zzcwf) obj;
        synchronized (zzesmVar) {
            if (zzcwfVar != null) {
                zzcwfVar.zzt();
            }
            zzcwfVar.zzq().zza(zzesmVar.zzf().zzc());
            this.zza.zzb(zzcwfVar);
            zzesmVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzesj.this.zze.zzf().zzd().zzg();
                }
            });
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzg = zzesmVar.zzg();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzcwfVar.zzr().zzb);
                zzfoeVar.zzi(zzcwfVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzg.zzb(zzfoeVar.zzm());
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
