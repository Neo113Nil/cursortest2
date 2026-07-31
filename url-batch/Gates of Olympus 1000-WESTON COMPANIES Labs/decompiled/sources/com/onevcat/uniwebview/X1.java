package com.onevcat.uniwebview;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class X1 {
    public static Y1 a(String str, int i, String str2) {
        HashMap hashMap;
        if (str != null) {
            hashMap = new HashMap();
            hashMap.put("failingURL", str);
        } else {
            hashMap = null;
        }
        String valueOf = String.valueOf(i);
        if (str2 == null) {
            str2 = "";
        }
        return new Y1("", valueOf, str2, hashMap);
    }
}
