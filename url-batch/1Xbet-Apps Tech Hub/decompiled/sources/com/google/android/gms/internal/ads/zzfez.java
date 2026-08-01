package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfez implements zzgax {
    final /* synthetic */ zzffa zza;
    final /* synthetic */ int zzb;

    zzfez(zzffa zzffaVar, int i) {
        this.zza = zzffaVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = this.zzb;
        this.zza.zzb((String) obj, i);
    }
}
