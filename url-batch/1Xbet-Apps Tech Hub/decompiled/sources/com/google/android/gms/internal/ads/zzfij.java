package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfij implements zzgax {
    final /* synthetic */ zzfhz zza;
    final /* synthetic */ zzfil zzb;

    zzfij(zzfil zzfilVar, zzfhz zzfhzVar) {
        this.zzb = zzfilVar;
        this.zza = zzfhzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzfin zzfinVar;
        zzfinVar = this.zzb.zza.zzd;
        zzfinVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb(Object obj) {
        zzfin zzfinVar;
        zzfinVar = this.zzb.zza.zzd;
        zzfinVar.zzd(this.zza);
    }
}
