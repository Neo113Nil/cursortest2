package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzary implements zzfow {
    final /* synthetic */ zzfnt zza;

    zzary(zzfnt zzfntVar) {
        this.zza = zzfntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
