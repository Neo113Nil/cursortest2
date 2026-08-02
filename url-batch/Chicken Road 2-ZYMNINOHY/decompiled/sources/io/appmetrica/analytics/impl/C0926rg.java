package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926rg {
    public static J7 a(String str) {
        HashMap hashMap;
        HashMap b4 = b(str);
        if (b4.isEmpty()) {
            b4 = b(Uri.decode(str));
        }
        String decode = Uri.decode((String) b4.get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(decode)) {
            hashMap = null;
        } else {
            HashMap b5 = b(decode);
            hashMap = new HashMap(b5.size());
            for (Map.Entry entry : b5.entrySet()) {
                hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new J7(decode, hashMap, str);
    }

    public static HashMap b(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf >= 0) {
                str = str.substring(lastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (String str2 : str.split("&")) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf >= 0) {
                        hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } else {
                        hashMap.put(str2, "");
                    }
                }
            }
        }
        return hashMap;
    }
}
