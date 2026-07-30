package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaff implements zzafy {
    private final zzafh zza;
    private final long zzb;

    public zzaff(zzafh zzafhVar, long j) {
        this.zza = zzafhVar;
        this.zzb = j;
    }

    private final zzafz zzd(long j, long j2) {
        return new zzafz((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzafh zzafhVar = this.zza;
        zzafg zzafgVar = zzafhVar.zzk;
        zzafgVar.getClass();
        long zzb = zzafhVar.zzb(j);
        long[] jArr = zzafgVar.zza;
        int zzm = zzfj.zzm(jArr, zzb, true, false);
        long j2 = zzm == -1 ? 0L : jArr[zzm];
        long[] jArr2 = zzafgVar.zzb;
        zzafz zzd = zzd(j2, zzm != -1 ? jArr2[zzm] : 0L);
        if (zzd.zzb == j || zzm == jArr.length - 1) {
            return new zzafw(zzd, zzd);
        }
        int i = zzm + 1;
        return new zzafw(zzd, zzd(jArr[i], jArr2[i]));
    }
}
