package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final class zzw {
    public static int zza(int i4, int i5) {
        String zza;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        if (i4 < 0) {
            zza = zzae.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i4));
        } else {
            if (i5 < 0) {
                throw new IllegalArgumentException("negative size: " + i5);
            }
            zza = zzae.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(zzb(i4, i5, FirebaseAnalytics.Param.INDEX));
        }
        return i4;
    }

    private static String zzb(int i4, int i5, String str) {
        if (i4 < 0) {
            return zzae.zza("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return zzae.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException("negative size: " + i5);
    }

    public static int zza(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(zzb(i4, i5, str));
        }
        return i4;
    }

    public static <T> T zza(T t4) {
        t4.getClass();
        return t4;
    }

    public static void zza(int i4, int i5, int i6) {
        String zzb;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                zzb = zzb(i4, i6, "start index");
            } else if (i5 >= 0 && i5 <= i6) {
                zzb = zzae.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                zzb = zzb(i5, i6, "end index");
            }
            throw new IndexOutOfBoundsException(zzb);
        }
    }
}
