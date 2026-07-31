package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
abstract class zzpl {
    private static volatile int zza = 100;

    zzpl() {
    }

    abstract Object zza(Object obj);

    abstract Object zzb();

    abstract Object zzc(Object obj);

    abstract void zzd(Object obj, int i4, int i5);

    abstract void zze(Object obj, int i4, long j4);

    abstract void zzf(Object obj, int i4, Object obj2);

    abstract void zzg(Object obj, int i4, zzle zzleVar);

    abstract void zzh(Object obj, int i4, long j4);

    abstract void zzi(Object obj);

    abstract void zzj(Object obj, Object obj2);

    final boolean zzk(Object obj, zzov zzovVar, int i4) {
        int zzd = zzovVar.zzd();
        int i5 = zzd >>> 3;
        int i6 = zzd & 7;
        if (i6 == 0) {
            zzh(obj, i5, zzovVar.zzl());
            return true;
        }
        if (i6 == 1) {
            zze(obj, i5, zzovVar.zzk());
            return true;
        }
        if (i6 == 2) {
            zzg(obj, i5, zzovVar.zzp());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i5, zzovVar.zzf());
            return true;
        }
        Object zzb = zzb();
        int i7 = i5 << 3;
        int i8 = i4 + 1;
        if (i8 >= zza) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzovVar, i8)) {
        }
        if ((i7 | 4) != zzovVar.zzd()) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i5, zzc(zzb));
        return true;
    }
}
