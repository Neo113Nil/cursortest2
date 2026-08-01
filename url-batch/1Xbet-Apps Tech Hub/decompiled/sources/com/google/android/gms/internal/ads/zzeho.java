package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeho implements zzgax {
    final /* synthetic */ zzehp zza;

    zzeho(zzehp zzehpVar) {
        this.zza = zzehpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzcsm zzcsmVar;
        zzcyj zzcyjVar;
        zzcsmVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcsmVar.zzd().zza(th);
        zzcyjVar = this.zza.zzd;
        zzcyjVar.zzbG(zza);
        zzffl.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcrp) obj).zzj();
    }
}
