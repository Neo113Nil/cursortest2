package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
abstract class zzamv<T, B> {
    private static volatile int zza = 100;

    zzamv() {
    }

    abstract int zza(T t4);

    abstract B zza();

    abstract T zza(T t4, T t5);

    abstract void zza(B b4, int i4, int i5);

    abstract void zza(B b4, int i4, long j4);

    abstract void zza(B b4, int i4, zzaiw zzaiwVar);

    abstract void zza(B b4, int i4, T t4);

    abstract void zza(T t4, zzanm zzanmVar);

    abstract boolean zza(zzamd zzamdVar);

    final boolean zza(B b4, zzamd zzamdVar, int i4) {
        int zzd = zzamdVar.zzd();
        int i5 = zzd >>> 3;
        int i6 = zzd & 7;
        if (i6 == 0) {
            zzb(b4, i5, zzamdVar.zzl());
            return true;
        }
        if (i6 == 1) {
            zza((zzamv<T, B>) b4, i5, zzamdVar.zzk());
            return true;
        }
        if (i6 == 2) {
            zza((zzamv<T, B>) b4, i5, zzamdVar.zzp());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                if (i4 != 0) {
                    return false;
                }
                throw zzakm.zzb();
            }
            if (i6 != 5) {
                throw zzakm.zza();
            }
            zza((zzamv<T, B>) b4, i5, zzamdVar.zzf());
            return true;
        }
        B zza2 = zza();
        int i7 = 4 | (i5 << 3);
        int i8 = i4 + 1;
        if (i8 >= zza) {
            throw zzakm.zzh();
        }
        while (zzamdVar.zzc() != Integer.MAX_VALUE && zza((zzamv<T, B>) zza2, zzamdVar, i8)) {
        }
        if (i7 != zzamdVar.zzd()) {
            throw zzakm.zzb();
        }
        zza((zzamv<T, B>) b4, i5, (int) zze(zza2));
        return true;
    }

    abstract int zzb(T t4);

    abstract void zzb(B b4, int i4, long j4);

    abstract void zzb(T t4, zzanm zzanmVar);

    abstract void zzb(Object obj, B b4);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t4);

    abstract T zzd(Object obj);

    abstract T zze(B b4);

    abstract void zzf(Object obj);
}
