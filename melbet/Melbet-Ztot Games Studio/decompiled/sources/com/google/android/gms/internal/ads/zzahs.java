package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzahs implements zzahr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahs(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
    }

    public static zzahs zzb(long j, long j2, zzadc zzadcVar, zzek zzekVar) {
        int zzm;
        zzekVar.zzL(10);
        int zzg = zzekVar.zzg();
        if (zzg <= 0) {
            return null;
        }
        int i = zzadcVar.zzd;
        long zzt = zzet.zzt(zzg, (i >= 32000 ? 1152 : 576) * 1000000, i, RoundingMode.FLOOR);
        int zzq = zzekVar.zzq();
        int zzq2 = zzekVar.zzq();
        int zzq3 = zzekVar.zzq();
        zzekVar.zzL(2);
        long j3 = j2 + zzadcVar.zzc;
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        long j4 = j2;
        int i2 = 0;
        while (i2 < zzq) {
            long j5 = zzt;
            jArr[i2] = (i2 * zzt) / zzq;
            jArr2[i2] = Math.max(j4, j3);
            if (zzq3 == 1) {
                zzm = zzekVar.zzm();
            } else if (zzq3 == 2) {
                zzm = zzekVar.zzq();
            } else if (zzq3 == 3) {
                zzm = zzekVar.zzo();
            } else {
                if (zzq3 != 4) {
                    return null;
                }
                zzm = zzekVar.zzp();
            }
            j4 += zzm * zzq2;
            i2++;
            zzt = j5;
        }
        long j6 = zzt;
        if (j != -1 && j != j4) {
            zzea.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzahs(jArr, jArr2, j6, j4, zzadcVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zze(long j) {
        return this.zza[zzet.zzc(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j) {
        long[] jArr = this.zza;
        int zzc = zzet.zzc(jArr, j, true, true);
        zzadj zzadjVar = new zzadj(jArr[zzc], this.zzb[zzc]);
        if (zzadjVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (zzc != jArr2.length - 1) {
                int i = zzc + 1;
                return new zzadg(zzadjVar, new zzadj(jArr2[i], this.zzb[i]));
            }
        }
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
