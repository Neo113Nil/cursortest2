package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzkj {
    public static int zza(int i4, int i5, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i5 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i6 = i4 / i5;
        int i7 = i4 - (i5 * i6);
        if (i7 == 0) {
            return i6;
        }
        int i8 = ((i4 ^ i5) >> 31) | 1;
        switch (zzki.zza[roundingMode.ordinal()]) {
            case 1:
                zzkl.zzb(false);
                return i6;
            case 2:
                return i6;
            case 3:
                if (i8 >= 0) {
                    return i6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i7);
                int abs2 = abs - (Math.abs(i5) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i6 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i6;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i6 + i8;
    }

    public static int zzb(int i4, RoundingMode roundingMode) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzki.zza[roundingMode.ordinal()]) {
            case 1:
                zzkl.zzb(((i4 + (-1)) & i4) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i4 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i4);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i4) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i4);
    }
}
