package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzalu {
    public final int zza;
    public final long zzb;

    private zzalu(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzalu zza(zzacf zzacfVar, zzfj zzfjVar) throws IOException {
        ((zzabu) zzacfVar).zzm(zzfjVar.zzI(), 0, 8, false);
        zzfjVar.zzG(0);
        return new zzalu(zzfjVar.zzf(), zzfjVar.zzr());
    }
}
