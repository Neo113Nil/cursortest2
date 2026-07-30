package com.crrepa.g1;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class b {
    public static String a(String str) {
        if (str == null || !str.contains("-")) {
            return null;
        }
        return str.substring(4);
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(a4.a.f89v);
    }
}
