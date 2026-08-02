package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzacs {
    public static zzacu zzb(zzek zzekVar) {
        zzekVar.zzL(1);
        int zzo = zzekVar.zzo();
        long zzd = zzekVar.zzd();
        long j = zzo;
        int i = zzo / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzt = zzekVar.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzt;
            jArr2[i2] = zzekVar.zzt();
            zzekVar.zzL(2);
            i2++;
        }
        zzekVar.zzL((int) ((zzd + j) - zzekVar.zzd()));
        return new zzacu(jArr, jArr2);
    }

    public static zzbk zza(zzacl zzaclVar, boolean z) throws IOException {
        zzbk zza = new zzada().zza(zzaclVar, z ? null : zzagc.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
