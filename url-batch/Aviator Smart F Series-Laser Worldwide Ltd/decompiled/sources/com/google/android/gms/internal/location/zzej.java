package com.google.android.gms.internal.location;

import androidx.annotation.GuardedBy;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzej {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;

    @GuardedBy("sharedStringBuilder")
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j8) {
        return j8 >= 0 ? zza.format(new Date(j8)) : Long.toString(j8);
    }

    public static String zzb(long j8) {
        String sb;
        StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzc(j8, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public static StringBuilder zzc(long j8, StringBuilder sb) {
        if (j8 == 0) {
            sb.append("0s");
            return sb;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z7 = false;
        if (j8 < 0) {
            sb.append("-");
            if (j8 != Long.MIN_VALUE) {
                j8 = -j8;
            } else {
                j8 = Long.MAX_VALUE;
                z7 = true;
            }
        }
        if (j8 >= 86400000) {
            sb.append(j8 / 86400000);
            sb.append("d");
            j8 %= 86400000;
        }
        if (true == z7) {
            j8 = 25975808;
        }
        if (j8 >= 3600000) {
            sb.append(j8 / 3600000);
            sb.append(CmcdHeadersFactory.STREAMING_FORMAT_HLS);
            j8 %= 3600000;
        }
        if (j8 >= 60000) {
            sb.append(j8 / 60000);
            sb.append("m");
            j8 %= 60000;
        }
        if (j8 >= 1000) {
            sb.append(j8 / 1000);
            sb.append("s");
            j8 %= 1000;
        }
        if (j8 > 0) {
            sb.append(j8);
            sb.append("ms");
        }
        return sb;
    }
}
