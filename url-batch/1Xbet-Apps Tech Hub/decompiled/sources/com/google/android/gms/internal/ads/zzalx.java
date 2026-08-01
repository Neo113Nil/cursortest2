package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzalx implements zzace {
    private final zzfj zza = new zzfj(4);
    private final zzadg zzb = new zzadg(-1, -1, "image/webp");

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
        this.zza.zzD(4);
        zzabu zzabuVar = (zzabu) zzacfVar;
        zzabuVar.zzm(this.zza.zzI(), 0, 4, false);
        if (this.zza.zzt() == 1380533830) {
            zzabuVar.zzl(4, false);
            this.zza.zzD(4);
            zzabuVar.zzm(this.zza.zzI(), 0, 4, false);
            if (this.zza.zzt() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
