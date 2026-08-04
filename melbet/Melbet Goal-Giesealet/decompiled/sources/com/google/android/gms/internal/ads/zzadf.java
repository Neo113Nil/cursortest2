package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzadf implements zzadv {
    private final zzadh zza;
    private final long zzb;

    public zzadf(zzadh zzadhVar, long j) {
        this.zza = zzadhVar;
        this.zzb = j;
    }

    private final zzadw zzd(long j, long j2) {
        return new zzadw((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzadh zzadhVar = this.zza;
        zzadg zzadgVar = zzadhVar.zzk;
        zzadgVar.getClass();
        long zzb = zzadhVar.zzb(j);
        long[] jArr = zzadgVar.zza;
        int zzm = zzeo.zzm(jArr, zzb, true, false);
        long j2 = zzm == -1 ? 0L : jArr[zzm];
        long[] jArr2 = zzadgVar.zzb;
        zzadw zzd = zzd(j2, zzm != -1 ? jArr2[zzm] : 0L);
        if (zzd.zzb == j || zzm == jArr.length - 1) {
            return new zzadt(zzd, zzd);
        }
        int i = zzm + 1;
        return new zzadt(zzd, zzd(jArr[i], jArr2[i]));
    }
}
