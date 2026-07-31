package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1861cm;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class ch0 {
    static Map<String, String> a(InterfaceC1861cm.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f24247b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j4 = aVar.f24249d;
        if (j4 > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j4)));
        }
        return hashMap;
    }

    public static InterfaceC1861cm.a a(lc1 lc1Var) {
        long j4;
        boolean z4;
        long j5;
        long j6;
        long j7;
        long j8;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = lc1Var.f28507c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a4 = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i4 = 0;
        if (str2 != null) {
            String[] split = str2.split(StringUtils.COMMA, 0);
            z4 = false;
            j5 = 0;
            j6 = 0;
            while (i4 < split.length) {
                String trim = split[i4].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j5 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j6 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z4 = true;
                }
                i4++;
            }
            j4 = 0;
            i4 = 1;
        } else {
            j4 = 0;
            z4 = false;
            j5 = 0;
            j6 = 0;
        }
        String str3 = map.get("Expires");
        long a5 = str3 != null ? a(str3) : j4;
        String str4 = map.get("Last-Modified");
        long a6 = str4 != null ? a(str4) : j4;
        String str5 = map.get("ETag");
        if (i4 != 0) {
            j8 = (j5 * 1000) + currentTimeMillis;
            j7 = z4 ? j8 : (j6 * 1000) + j8;
        } else {
            j7 = (a4 <= j4 || a5 < a4) ? j4 : (a5 - a4) + currentTimeMillis;
            j8 = j7;
        }
        InterfaceC1861cm.a aVar = new InterfaceC1861cm.a();
        aVar.f24246a = lc1Var.f28506b;
        aVar.f24247b = str5;
        aVar.f24251f = j8;
        aVar.f24250e = j7;
        aVar.f24248c = a4;
        aVar.f24249d = a6;
        aVar.f24252g = map;
        aVar.f24253h = lc1Var.f28508d;
        return aVar;
    }

    public static String a(Map<String, String> map) {
        String str;
        if (map == null || (str = map.get(com.ironsource.cc.f15718K)) == null) {
            return "ISO-8859-1";
        }
        String[] split = str.split(";", 0);
        for (int i4 = 1; i4 < split.length; i4++) {
            String[] split2 = split[i4].trim().split("=", 0);
            if (split2.length == 2 && split2[0].equals(com.ironsource.cc.f15720M)) {
                return split2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                boolean z4 = ii2.f27214a;
                ap0.c(str);
                return 0L;
            }
            boolean z5 = ii2.f27214a;
            ap0.e(str);
            return 0L;
        }
    }
}
