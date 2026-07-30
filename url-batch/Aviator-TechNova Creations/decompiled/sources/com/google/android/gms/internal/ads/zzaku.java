package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzaku implements zzafy {
    private final long zza;
    private final zzakv[] zzb;
    private final int zzc;

    public zzaku(long j, zzakv[] zzakvVarArr, int i) {
        this.zza = j;
        this.zzb = zzakvVarArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzafw zzc(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int zzl;
        int zzb;
        zzakv[] zzakvVarArr = this.zzb;
        if (zzakvVarArr.length == 0) {
            zzafz zzafzVar = zzafz.zza;
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i2 = this.zzc;
        if (i2 != -1) {
            zzalf zzalfVar = zzakvVarArr[i2].zzb;
            zzl = zzakw.zzl(zzalfVar, j);
            if (zzl == -1) {
                zzafz zzafzVar2 = zzafz.zza;
                return new zzafw(zzafzVar2, zzafzVar2);
            }
            long[] jArr = zzalfVar.zzf;
            j3 = jArr[zzl];
            long[] jArr2 = zzalfVar.zzc;
            j2 = jArr2[zzl];
            if (j3 < j && zzl < zzalfVar.zzb - 1 && (zzb = zzalfVar.zzb(j)) != -1 && zzb != zzl) {
                j4 = jArr[zzb];
                j5 = jArr2[zzb];
                long j6 = j2;
                long j7 = j5;
                for (i = 0; i < zzakvVarArr.length; i++) {
                    if (i != i2) {
                        zzalf zzalfVar2 = zzakvVarArr[i].zzb;
                        j6 = zzakw.zzh(zzalfVar2, j3, j6);
                        if (j4 != -9223372036854775807L) {
                            j7 = zzakw.zzh(zzalfVar2, j4, j7);
                        }
                    }
                }
                zzafz zzafzVar3 = new zzafz(j3, j6);
                return j4 != -9223372036854775807L ? new zzafw(zzafzVar3, zzafzVar3) : new zzafw(zzafzVar3, new zzafz(j4, j7));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -9223372036854775807L;
        j5 = -1;
        long j62 = j2;
        long j72 = j5;
        while (i < zzakvVarArr.length) {
        }
        zzafz zzafzVar32 = new zzafz(j3, j62);
        if (j4 != -9223372036854775807L) {
        }
    }
}
