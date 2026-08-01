package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaiw implements zzajc {
    private final zzacr zza;
    private final zzacq zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaiw(zzacr zzacrVar, zzacq zzacqVar) {
        this.zza = zzacrVar;
        this.zzb = zzacqVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final long zzd(zzacf zzacfVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final zzade zze() {
        zzef.zzf(this.zzc != -1);
        return new zzacp(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfs.zzc(jArr, j, true, true)];
    }
}
