package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2061l7 {
    @Nullable
    public static HashMap a(@Nullable Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("&");
            sb.append(Uri.encode(str));
            sb.append("=");
            sb.append(Uri.encode(str2));
            if (sb.length() > 61440) {
                int i4 = um1.f33179b;
                um1.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return hashMap;
            }
            hashMap.put(str, str2);
        }
        return hashMap;
    }

    @Nullable
    public static String a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            int i4 = um1.f33179b;
            um1.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }
}
