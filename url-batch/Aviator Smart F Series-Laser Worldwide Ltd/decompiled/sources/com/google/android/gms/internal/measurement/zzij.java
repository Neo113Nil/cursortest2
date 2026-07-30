package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzij {
    public static int zza(int i8, int i9, String str) {
        String zza;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            zza = zzil.zza("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            zza = zzil.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(zzd(i8, i9, "index"));
        }
        return i8;
    }

    public static void zzc(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException((i8 < 0 || i8 > i10) ? zzd(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? zzd(i9, i10, "end index") : zzil.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }

    private static String zzd(int i8, int i9, String str) {
        if (i8 < 0) {
            return zzil.zza("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return zzil.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }
}
