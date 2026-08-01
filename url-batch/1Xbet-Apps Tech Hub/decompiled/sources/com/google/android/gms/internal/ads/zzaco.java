package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaco {
    public static zzacq zzb(zzfj zzfjVar) {
        zzfjVar.zzH(1);
        int zzn = zzfjVar.zzn();
        long zzc = zzfjVar.zzc();
        long j = zzn;
        int i = zzn / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzs = zzfjVar.zzs();
            if (zzs == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzs;
            jArr2[i2] = zzfjVar.zzs();
            zzfjVar.zzH(2);
            i2++;
        }
        zzfjVar.zzH((int) ((zzc + j) - zzfjVar.zzc()));
        return new zzacq(jArr, jArr2);
    }

    public static zzcb zza(zzacf zzacfVar, boolean z) throws IOException {
        zzcb zza = new zzacw().zza(zzacfVar, z ? null : zzaga.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
