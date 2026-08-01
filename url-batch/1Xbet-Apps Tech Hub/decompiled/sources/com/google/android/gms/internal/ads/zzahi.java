package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzahi implements zzahn {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahi(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfs.zzq(jArr2[jArr2.length - 1]) : j;
    }

    public static zzahi zzb(long j, zzagf zzagfVar, long j2) {
        int length = zzagfVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzagfVar.zzb + zzagfVar.zzd[i3];
            j3 += zzagfVar.zzc + zzagfVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzahi(jArr, jArr2, j2);
    }

    private static Pair zze(long j, long[] jArr, long[] jArr2) {
        int zzc = zzfs.zzc(jArr, j, true, true);
        long j2 = jArr[zzc];
        long j3 = jArr2[zzc];
        int i = zzc + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final long zzc() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final long zzd(long j) {
        return zzfs.zzq(((Long) zze(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        Pair zze = zze(zzfs.zzt(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzadf zzadfVar = new zzadf(zzfs.zzq(((Long) zze.first).longValue()), ((Long) zze.second).longValue());
        return new zzadc(zzadfVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return true;
    }
}
