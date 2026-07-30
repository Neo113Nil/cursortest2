package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class zzbn {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (((r0 & 1) & (r7 != java.math.RoundingMode.HALF_EVEN ? 0 : 1)) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r1 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r5 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r5 < 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(int i8, int i9, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i9 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i10 = i8 / i9;
        int i11 = i8 - (i9 * i10);
        if (i11 == 0) {
            return i10;
        }
        int i12 = ((i8 ^ i9) >> 31) | 1;
        switch (zzbm.zza[roundingMode.ordinal()]) {
            case 1:
                zzbo.zza(false);
            case 2:
                return i10;
            case 3:
                break;
            case 4:
                return i10 + i12;
            case 5:
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i11);
                int abs2 = abs - (Math.abs(i9) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        break;
                    }
                    return i10 + i12;
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static int zzb(int i8, RoundingMode roundingMode) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzbm.zza[roundingMode.ordinal()]) {
            case 1:
                zzbo.zza(((i8 + (-1)) & i8) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i8 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i8);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i8) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i8);
    }
}
