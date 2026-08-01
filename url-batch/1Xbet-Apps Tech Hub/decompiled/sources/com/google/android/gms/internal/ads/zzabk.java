package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzabk implements zzade {
    private final zzabn zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzabk(zzabn zzabnVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzabnVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j) {
        return this.zza.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        zzadf zzadfVar = new zzadf(j, zzabm.zzf(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzadc(zzadfVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return true;
    }
}
