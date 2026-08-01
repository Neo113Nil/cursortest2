package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfkf implements zzgax {
    final /* synthetic */ zzfkh zza;
    final /* synthetic */ zzfjw zzb;

    zzfkf(zzfkh zzfkhVar, zzfjw zzfjwVar) {
        this.zza = zzfkhVar;
        this.zzb = zzfjwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzfjw zzfjwVar = this.zzb;
        zzfjwVar.zzg(th);
        zzfjwVar.zzf(false);
        this.zza.zza(zzfjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb(Object obj) {
    }
}
