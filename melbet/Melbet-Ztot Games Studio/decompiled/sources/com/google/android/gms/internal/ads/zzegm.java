package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzegm implements zzgcf {
    final /* synthetic */ zzegn zza;

    zzegm(zzegn zzegnVar) {
        this.zza = zzegnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        zzcql zzcqlVar;
        zzcws zzcwsVar;
        zzcqlVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcqlVar.zzd().zza(th);
        zzcwsVar = this.zza.zzd;
        zzcwsVar.zzdB(zza);
        zzfgd.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcpk) obj).zzk();
    }
}
