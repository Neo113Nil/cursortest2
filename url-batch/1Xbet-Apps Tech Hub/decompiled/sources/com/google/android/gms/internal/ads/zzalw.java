package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzalw implements zzade {
    private final zzalt zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzalw(zzalt zzaltVar, int i, long j, long j2) {
        this.zza = zzaltVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzaltVar.zzd;
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return zzfs.zzs(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzadf zzadfVar = new zzadf(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb >= j || max == this.zzd - 1) {
            return new zzadc(zzadfVar, zzadfVar);
        }
        long j2 = max + 1;
        return new zzadc(zzadfVar, new zzadf(zzb(j2), this.zzc + (j2 * this.zza.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return true;
    }
}
