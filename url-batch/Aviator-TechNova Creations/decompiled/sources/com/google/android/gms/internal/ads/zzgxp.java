package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgxp {
    public static final /* synthetic */ int zza = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (java.lang.Math.abs(r8 - r4) == 0.5d) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zza(double d, RoundingMode roundingMode) {
        double d2;
        long j;
        long j2;
        if (!zzgxq.zzb(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzgxo.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(zzd(d));
                d2 = d;
                if (!((-9.223372036854776E18d) - d2 >= 1.0d) || !(d2 < 9.223372036854776E18d)) {
                    return (long) d2;
                }
                String valueOf = String.valueOf(roundingMode);
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 59 + String.valueOf(valueOf).length());
                sb.append("rounded value is out of range for input ");
                sb.append(d);
                sb.append(" and rounding mode ");
                sb.append(valueOf);
                throw new ArithmeticException(sb.toString());
            case 2:
                if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && !zzd(d)) {
                    j = (long) d;
                    j2 = -1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && !zzd(d)) {
                    j = (long) d;
                    j2 = 1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!zzd(d)) {
                    j = (long) d;
                    j2 = d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d2 = Math.rint(d);
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d2 = Math.rint(d);
                if (Math.abs(d - d2) == 0.5d) {
                    d2 = d + Math.copySign(0.5d, d);
                }
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d2 = Math.rint(d);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzb(double d) {
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && zzgxq.zzb(d)) {
            long zza2 = zzgxq.zza(d);
            if ((zza2 & ((-1) + zza2)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(double d, RoundingMode roundingMode) {
        boolean zzb;
        zzgrc.zzb(d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && zzgxq.zzb(d), "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return zzc(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (zzgxo.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(zzb(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                r1 = !zzb(d);
                return !r1 ? exponent + 1 : exponent;
            case 4:
                r1 = exponent < 0;
                zzb = zzb(d);
                r1 &= !zzb;
                if (!r1) {
                }
                break;
            case 5:
                r1 = exponent >= 0;
                zzb = zzb(d);
                r1 &= !zzb;
                if (!r1) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r1 = true;
                }
                if (!r1) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzd(double d) {
        if (zzgxq.zzb(d)) {
            return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || 52 - Long.numberOfTrailingZeros(zzgxq.zza(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
