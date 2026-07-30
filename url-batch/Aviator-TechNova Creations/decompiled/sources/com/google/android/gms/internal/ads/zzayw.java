package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzayw implements zzfwf {
    final /* synthetic */ zzfvh zza;

    zzayw(zzfvh zzfvhVar) {
        this.zza = zzfvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zza(int i, long j) {
        this.zza.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zzb(int i, long j, String str) {
        this.zza.zzf(i, System.currentTimeMillis() - j, str);
    }
}
