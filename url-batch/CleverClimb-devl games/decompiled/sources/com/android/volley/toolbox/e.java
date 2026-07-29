package com.android.volley.toolbox;

import com.aiming.mdt.utils.Constants;
import com.android.volley.b;
import java.util.Map;
import org.apache.a.f.d.p;
import org.apache.a.f.d.q;

/* compiled from: HttpHeaderParser.java */
/* loaded from: classes.dex */
public class e {
    public static b.a a(com.android.volley.i iVar) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = iVar.f2286c;
        String str = map.get("Date");
        long a2 = str != null ? a(str) : 0L;
        String str2 = map.get(Constants.KEY_CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",");
            j = 0;
            int i2 = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j = 0;
            j2 = 0;
            z = false;
        }
        String str3 = map.get("Expires");
        long a3 = str3 != null ? a(str3) : 0L;
        String str4 = map.get(Constants.KEY_LAST_MODIFIED);
        long a4 = str4 != null ? a(str4) : 0L;
        String str5 = map.get(Constants.KEY_ETAG);
        if (z) {
            j3 = currentTimeMillis + (j * 1000);
            if (i == 0) {
                j4 = (j2 * 1000) + j3;
            }
            j4 = j3;
        } else if (a2 <= 0 || a3 < a2) {
            j3 = 0;
            j4 = j3;
        } else {
            j4 = (a3 - a2) + currentTimeMillis;
            j3 = j4;
        }
        b.a aVar = new b.a();
        aVar.f2259a = iVar.f2285b;
        aVar.f2260b = str5;
        aVar.f = j3;
        aVar.e = j4;
        aVar.f2261c = a2;
        aVar.f2262d = a4;
        aVar.g = map;
        return aVar;
    }

    public static long a(String str) {
        try {
            return q.a(str).getTime();
        } catch (p unused) {
            return 0L;
        }
    }

    public static String a(Map<String, String> map, String str) {
        String str2 = map.get(Constants.KEY_CONTENT_TYPE);
        if (str2 != null) {
            String[] split = str2.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static String a(Map<String, String> map) {
        return a(map, "ISO-8859-1");
    }
}
