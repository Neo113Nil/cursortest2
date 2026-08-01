package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzvj implements zzwa {
    final /* synthetic */ zzvm zza;
    private final int zzb;

    public zzvj(zzvm zzvmVar, int i) {
        this.zza = zzvmVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zza(zzkv zzkvVar, zzib zzibVar, int i) {
        return this.zza.zzf(this.zzb, zzkvVar, zzibVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zzb(long j) {
        return this.zza.zzh(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
