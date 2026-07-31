package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class a8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f166a;

    static {
        String[] a2 = a("[k1]{v1|v2}[k2]{v1|v2}");
        WeakHashMap weakHashMap = zh.f528a;
        a2.getClass();
        f166a = a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap a(int i, Map map, HttpClientConfig httpClientConfig) {
        String str;
        Set d;
        HashMap hashMap = new HashMap(2);
        hashMap.put(mh.F, String.valueOf(i));
        if (map != null && !map.isEmpty() && (d = httpClientConfig.d()) != null && !d.isEmpty()) {
            ArrayList arrayList = new ArrayList(d.size());
            for (Map.Entry entry : map.entrySet()) {
                if (d.contains(entry.getKey()) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    arrayList.add(entry);
                }
            }
            if (!arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                String[] a2 = a(httpClientConfig.a());
                if (a2 == null) {
                    a2 = f166a;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = (String) ((Map.Entry) arrayList.get(i2)).getKey();
                    List list = (List) ((Map.Entry) arrayList.get(i2)).getValue();
                    if (i2 == 0) {
                        sb.append(a2[0]);
                    } else {
                        sb.append(a2[3]);
                    }
                    sb.append(str2);
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (i2 == 0) {
                            if (i3 == 0) {
                                sb.append(a2[1]);
                            } else {
                                sb.append(a2[2]);
                            }
                        } else if (i3 == 0) {
                            sb.append(a2[4]);
                        } else {
                            sb.append(a2[5]);
                        }
                        sb.append((String) list.get(i3));
                    }
                }
                sb.append(a2[6]);
                str = sb.toString();
                if (str != null) {
                    hashMap.put(mh.G, str);
                }
                return hashMap;
            }
        }
        str = null;
        if (str != null) {
        }
        return hashMap;
    }

    public static String[] a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile("^(.*)k1(.*)v1(.*)v2(.*)k2(.*)v1(.*)v2(.*)$").matcher(str);
            if (matcher.matches()) {
                return new String[]{matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5), matcher.group(6), matcher.group(7)};
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
