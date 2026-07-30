package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
abstract class zzief {
    private static volatile int zza = 100;

    zzief() {
    }

    abstract void zza(Object obj, int i, long j);

    abstract void zzb(Object obj, int i, int i2);

    abstract void zzc(Object obj, int i, long j);

    abstract void zzd(Object obj, int i, zzian zzianVar);

    abstract void zze(Object obj, int i, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzidp zzidpVar, int i) throws IOException {
        int zzc = zzidpVar.zzc();
        int i2 = zzc >>> 3;
        int i3 = zzc & 7;
        if (i3 == 0) {
            zza(obj, i2, zzidpVar.zzh());
            return true;
        }
        if (i3 == 1) {
            zzc(obj, i2, zzidpVar.zzj());
            return true;
        }
        if (i3 == 2) {
            zzd(obj, i2, zzidpVar.zzq());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzicg("Protocol message end-group tag did not match expected tag.");
            }
            if (i3 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i2, zzidpVar.zzk());
            return true;
        }
        Object zzf = zzf();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzidpVar.zzb() != Integer.MAX_VALUE && zzk(zzf, zzidpVar, i5)) {
        }
        if ((i4 | 4) != zzidpVar.zzc()) {
            throw new zzicg("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i2, zzg(zzf));
        return true;
    }
}
