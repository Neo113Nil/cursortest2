package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzabs implements zzade {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzabs(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        return "ChunkIndex(length=" + this.zza + ", sizes=" + Arrays.toString(this.zzb) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        long[] jArr = this.zze;
        int zzc = zzfs.zzc(jArr, j, true, true);
        zzadf zzadfVar = new zzadf(jArr[zzc], this.zzc[zzc]);
        if (zzadfVar.zzb >= j || zzc == this.zza - 1) {
            return new zzadc(zzadfVar, zzadfVar);
        }
        int i = zzc + 1;
        return new zzadc(zzadfVar, new zzadf(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return true;
    }
}
