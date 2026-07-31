package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* loaded from: classes5.dex */
public class klz {
    public static void zmn(String str) {
        zmn("any_door_id", str);
    }

    public static String zmn() {
        return fs("any_door_id", null);
    }

    private static void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }

    private static String fs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.kw.fb.zmn.fs((String) null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
