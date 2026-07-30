package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaea implements zzafy {
    private final zzaed zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaea(zzaed zzaedVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzaedVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzafz zzafzVar = new zzafz(j, zzaec.zza(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzafw(zzafzVar, zzafzVar);
    }

    public final long zzd(long j) {
        return this.zza.zza(j);
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zze;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }
}
