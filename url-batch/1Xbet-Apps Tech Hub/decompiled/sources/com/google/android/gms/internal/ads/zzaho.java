package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaho implements zzahn {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaho(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaho zzb(long j, long j2, zzacy zzacyVar, zzfj zzfjVar) {
        int zzl;
        zzfjVar.zzH(10);
        int zzf = zzfjVar.zzf();
        if (zzf <= 0) {
            return null;
        }
        int i = zzacyVar.zzd;
        long zzs = zzfs.zzs(zzf, (i >= 32000 ? 1152 : 576) * 1000000, i, RoundingMode.FLOOR);
        int zzp = zzfjVar.zzp();
        int zzp2 = zzfjVar.zzp();
        int zzp3 = zzfjVar.zzp();
        zzfjVar.zzH(2);
        long j3 = j2 + zzacyVar.zzc;
        long[] jArr = new long[zzp];
        long[] jArr2 = new long[zzp];
        int i2 = 0;
        long j4 = j2;
        while (i2 < zzp) {
            long j5 = j3;
            long j6 = zzs;
            jArr[i2] = (i2 * zzs) / zzp;
            jArr2[i2] = Math.max(j4, j5);
            if (zzp3 == 1) {
                zzl = zzfjVar.zzl();
            } else if (zzp3 == 2) {
                zzl = zzfjVar.zzp();
            } else if (zzp3 == 3) {
                zzl = zzfjVar.zzn();
            } else {
                if (zzp3 != 4) {
                    return null;
                }
                zzl = zzfjVar.zzo();
            }
            j4 += zzl * zzp2;
            i2++;
            j3 = j5;
            zzp = zzp;
            zzs = j6;
        }
        long j7 = zzs;
        if (j != -1 && j != j4) {
            zzez.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzaho(jArr, jArr2, j7, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final long zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final long zzd(long j) {
        return this.zza[zzfs.zzc(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        long[] jArr = this.zza;
        int zzc = zzfs.zzc(jArr, j, true, true);
        zzadf zzadfVar = new zzadf(jArr[zzc], this.zzb[zzc]);
        if (zzadfVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (zzc != jArr2.length - 1) {
                int i = zzc + 1;
                return new zzadc(zzadfVar, new zzadf(jArr2[i], this.zzb[i]));
            }
        }
        return new zzadc(zzadfVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return true;
    }
}
