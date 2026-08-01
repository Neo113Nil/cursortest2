package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaes implements zzace {
    private final zzfj zza = new zzfj(4);
    private final zzadg zzb = new zzadg(-1, -1, "image/heif");

    private final boolean zza(zzacf zzacfVar, int i) throws IOException {
        this.zza.zzD(4);
        ((zzabu) zzacfVar).zzm(this.zza.zzI(), 0, 4, false);
        return this.zza.zzt() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        return this.zzb.zzb(zzacfVar, zzadbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzb.zzc(zzachVar);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzb.zzd(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        ((zzabu) zzacfVar).zzl(4, false);
        return zza(zzacfVar, 1718909296) && zza(zzacfVar, 1751476579);
    }
}
