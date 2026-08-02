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

/* loaded from: classes.dex */
public abstract class p8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7440a;

    static {
        String[] a3 = a("[k1]{v1|v2}[k2]{v1|v2}");
        WeakHashMap weakHashMap = si.f7575a;
        a3.getClass();
        f7440a = a3;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap a(int i4, Map map, HttpClientConfig httpClientConfig) {
        String str;
        Set d4;
        HashMap hashMap = new HashMap(2);
        hashMap.put(fi.f6927I, String.valueOf(i4));
        if (map != null && !map.isEmpty() && (d4 = httpClientConfig.d()) != null && !d4.isEmpty()) {
            ArrayList arrayList = new ArrayList(d4.size());
            for (Map.Entry entry : map.entrySet()) {
                if (d4.contains(entry.getKey()) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    arrayList.add(entry);
                }
            }
            if (!arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                String[] a3 = a(httpClientConfig.a());
                if (a3 == null) {
                    a3 = f7440a;
                }
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    String str2 = (String) ((Map.Entry) arrayList.get(i5)).getKey();
                    List list = (List) ((Map.Entry) arrayList.get(i5)).getValue();
                    if (i5 == 0) {
                        sb.append(a3[0]);
                    } else {
                        sb.append(a3[3]);
                    }
                    sb.append(str2);
                    int size2 = list.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (i5 == 0) {
                            if (i6 == 0) {
                                sb.append(a3[1]);
                            } else {
                                sb.append(a3[2]);
                            }
                        } else if (i6 == 0) {
                            sb.append(a3[4]);
                        } else {
                            sb.append(a3[5]);
                        }
                        sb.append((String) list.get(i6));
                    }
                }
                sb.append(a3[6]);
                str = sb.toString();
                if (str != null) {
                    hashMap.put(fi.f6928J, str);
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
