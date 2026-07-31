package com.onevcat.uniwebview;

import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b5 {
    public static c5 a(String str, int i, String str2) {
        HashMap hashMap;
        if (str != null) {
            hashMap = new HashMap();
            hashMap.put("failingURL", str);
        } else {
            hashMap = null;
        }
        String valueOf = String.valueOf(i);
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        return new c5(BuildConfig.FLAVOR, valueOf, str2, hashMap);
    }
}
