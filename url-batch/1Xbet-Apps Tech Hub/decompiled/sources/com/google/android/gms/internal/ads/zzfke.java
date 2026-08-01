package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfke implements zzgax {
    final /* synthetic */ zzfkh zza;
    final /* synthetic */ zzfjw zzb;
    final /* synthetic */ boolean zzc;

    zzfke(zzfkh zzfkhVar, zzfjw zzfjwVar, boolean z) {
        this.zza = zzfkhVar;
        this.zzb = zzfjwVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzfjw zzfjwVar = this.zzb;
        if (zzfjwVar.zzj()) {
            zzfkh zzfkhVar = this.zza;
            zzfjwVar.zzg(th);
            zzfjwVar.zzf(false);
            zzfkhVar.zza(zzfjwVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb(Object obj) {
        zzfjw zzfjwVar = this.zzb;
        zzfjwVar.zzf(true);
        this.zza.zza(zzfjwVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
