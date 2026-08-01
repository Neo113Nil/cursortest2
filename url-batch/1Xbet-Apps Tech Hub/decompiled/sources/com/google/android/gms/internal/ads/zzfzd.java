package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfzd {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (((r7 == java.math.RoundingMode.HALF_EVEN ? 1 : 0) & (r6 & 1)) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r3 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r0 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r5 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r5 < 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        int i3 = i / 8;
        int i4 = i - (i3 * 8);
        if (i4 != 0) {
            boolean z = true;
            int i5 = ((i ^ 8) >> 31) | 1;
            switch (zzfzc.zza[roundingMode.ordinal()]) {
                case 1:
                    zzfzg.zzb(false);
                case 2:
                    return i3;
                case 3:
                    break;
                case 4:
                    return i3 + i5;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(8) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            break;
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return i3;
    }
}
