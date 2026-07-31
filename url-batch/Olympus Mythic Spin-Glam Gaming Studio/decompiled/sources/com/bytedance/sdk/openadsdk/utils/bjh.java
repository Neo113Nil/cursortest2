package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes3.dex */
public class bjh {
    public static boolean zmn() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            return i >= 32 && zmn("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean zmn(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
