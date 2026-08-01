package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzacx implements zzade {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzacx(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzef.zzd(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            long[] jArr4 = new long[i];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        if (!this.zzd) {
            zzadf zzadfVar = zzadf.zza;
            return new zzadc(zzadfVar, zzadfVar);
        }
        int zzc = zzfs.zzc(this.zzb, j, true, true);
        zzadf zzadfVar2 = new zzadf(this.zzb[zzc], this.zza[zzc]);
        if (zzadfVar2.zzb != j) {
            long[] jArr = this.zzb;
            if (zzc != jArr.length - 1) {
                int i = zzc + 1;
                return new zzadc(zzadfVar2, new zzadf(jArr[i], this.zza[i]));
            }
        }
        return new zzadc(zzadfVar2, zzadfVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return this.zzd;
    }
}
