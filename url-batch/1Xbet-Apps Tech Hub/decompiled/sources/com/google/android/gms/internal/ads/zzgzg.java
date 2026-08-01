package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzgzg {
    zzgzg() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    abstract void zzk(Object obj, int i, zzgve zzgveVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract boolean zzq(zzgyh zzgyhVar);

    abstract void zzr(Object obj, zzgvu zzgvuVar) throws IOException;

    final boolean zzp(Object obj, zzgyh zzgyhVar) throws IOException {
        int zzd = zzgyhVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzgyhVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzgyhVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzgyhVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzgwy.zza();
            }
            zzh(obj, i, zzgyhVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i3 = i << 3;
        while (zzgyhVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzgyhVar)) {
        }
        if ((4 | i3) != zzgyhVar.zzd()) {
            throw zzgwy.zzb();
        }
        zzg(zzf);
        zzj(obj, i, zzf);
        return true;
    }
}
