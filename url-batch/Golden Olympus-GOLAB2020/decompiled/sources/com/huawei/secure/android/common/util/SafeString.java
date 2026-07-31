package com.huawei.secure.android.common.util;

import android.util.Log;

/* loaded from: classes.dex */
public class SafeString {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14499a = "SafeString";

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str != null && charSequence != null && charSequence2 != null) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e4) {
                Log.e(f14499a, "replace: " + e4.getMessage());
            }
        }
        return str;
    }

    public static String substring(String str, int i4) {
        if (str != null && str.length() >= i4 && i4 >= 0) {
            try {
                return str.substring(i4);
            } catch (Exception e4) {
                Log.e(f14499a, "substring exception: " + e4.getMessage());
            }
        }
        return "";
    }

    public static String substring(String str, int i4, int i5) {
        if (str != null && i4 >= 0 && i5 <= str.length() && i5 >= i4) {
            try {
                return str.substring(i4, i5);
            } catch (Exception e4) {
                Log.e(f14499a, "substring: " + e4.getMessage());
            }
        }
        return "";
    }
}
