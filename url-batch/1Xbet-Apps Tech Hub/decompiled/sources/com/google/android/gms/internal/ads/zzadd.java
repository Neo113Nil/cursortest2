package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzadd implements zzade {
    private final long zza;
    private final zzadc zzb;

    public zzadd(long j, long j2) {
        this.zza = j;
        zzadf zzadfVar = j2 == 0 ? zzadf.zza : new zzadf(0L, j2);
        this.zzb = new zzadc(zzadfVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return false;
    }
}
