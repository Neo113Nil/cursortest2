package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzwh implements zzwa {
    private final zzwa zza;
    private final long zzb;

    public zzwh(zzwa zzwaVar, long j) {
        this.zza = zzwaVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zza(zzkv zzkvVar, zzib zzibVar, int i) {
        int zza = this.zza.zza(zzkvVar, zzibVar, i);
        if (zza != -4) {
            return zza;
        }
        zzibVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzwa zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zze() {
        return this.zza.zze();
    }
}
