package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhzd {
    public static BigDecimal zza(String str) throws NumberFormatException {
        zzc(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < WorkRequest.MIN_BACKOFF_MILLIS) {
            return bigDecimal;
        }
        String.valueOf(str);
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger zzb(String str) throws NumberFormatException {
        zzc(str);
        return new BigInteger(str);
    }

    private static void zzc(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 28);
        sb.append("Number string too large: ");
        sb.append(substring);
        sb.append("...");
        throw new NumberFormatException(sb.toString());
    }
}
