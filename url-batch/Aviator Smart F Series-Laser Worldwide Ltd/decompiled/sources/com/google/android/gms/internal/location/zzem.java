package com.google.android.gms.internal.location;

import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzem {
    public static void zza(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z7, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static int zzc(int i8, int i9, String str) {
        String zza;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            zza = zzen.zza("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 15);
                sb.append("negative size: ");
                sb.append(i9);
                throw new IllegalArgumentException(sb.toString());
            }
            zza = zzen.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzd(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(zzf(i8, i9, "index"));
        }
        return i8;
    }

    public static void zze(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException((i8 < 0 || i8 > i10) ? zzf(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? zzf(i9, i10, "end index") : zzen.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }

    private static String zzf(int i8, int i9, String str) {
        if (i8 < 0) {
            return zzen.zza("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return zzen.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 15);
        sb.append("negative size: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }
}
