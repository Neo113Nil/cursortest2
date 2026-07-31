package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class y6 {
    public static long a(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e7) {
            if ("0".equals(str) || "-1".equals(str)) {
                n6.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            n6.c(e7, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static j5 b(w5 w5Var) {
        boolean z6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = w5Var.f13718c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a7 = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i7 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i8 = 0;
            j7 = 0;
            j8 = 0;
            while (i7 < split.length) {
                String trim = split[i7].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j7 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j8 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i8 = 1;
                }
                i7++;
            }
            i7 = i8;
            z6 = true;
        } else {
            z6 = false;
            j7 = 0;
            j8 = 0;
        }
        String str3 = map.get("Expires");
        long a8 = str3 != null ? a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long a9 = str4 != null ? a(str4) : 0L;
        String str5 = map.get("ETag");
        if (z6) {
            j10 = currentTimeMillis + (j7 * 1000);
            if (i7 != 0) {
                j11 = j10;
            } else {
                Long.signum(j8);
                j11 = (j8 * 1000) + j10;
            }
            j9 = j11;
        } else {
            j9 = 0;
            if (a7 <= 0 || a8 < a7) {
                j10 = 0;
            } else {
                j10 = currentTimeMillis + (a8 - a7);
                j9 = j10;
            }
        }
        j5 j5Var = new j5();
        j5Var.f6970a = w5Var.f13717b;
        j5Var.f6971b = str5;
        j5Var.f6975f = j10;
        j5Var.f6974e = j9;
        j5Var.f6972c = a7;
        j5Var.f6973d = a9;
        j5Var.f6976g = map;
        j5Var.f6977h = w5Var.f13719d;
        return j5Var;
    }

    static String c(long j7) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j7));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
