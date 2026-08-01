package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbjr implements zzgax {
    final /* synthetic */ zzcgv zza;

    zzbjr(zzcgv zzcgvVar) {
        this.zza = zzcgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcgv zzcgvVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzca(zzcgvVar.getContext(), zzcgvVar.zzn().zza, (String) obj).zzb();
    }
}
