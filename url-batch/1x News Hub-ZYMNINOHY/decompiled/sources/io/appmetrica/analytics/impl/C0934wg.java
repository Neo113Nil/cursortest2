package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934wg {
    public static P7 a(String str) {
        HashMap hashMap;
        HashMap b3 = b(str);
        if (b3.isEmpty()) {
            b3 = b(Uri.decode(str));
        }
        String decode = Uri.decode((String) b3.get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(decode)) {
            hashMap = null;
        } else {
            HashMap b4 = b(decode);
            hashMap = new HashMap(b4.size());
            for (Map.Entry entry : b4.entrySet()) {
                hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new P7(decode, hashMap, str);
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
