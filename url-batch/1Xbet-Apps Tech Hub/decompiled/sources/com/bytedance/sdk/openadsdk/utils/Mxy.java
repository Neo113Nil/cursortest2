package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: ExternalSpUtils.java */
/* loaded from: classes2.dex */
public class Mxy {
    public static void pvs(String str) {
        pvs("any_door_id", str);
    }

    public static String pvs() {
        return icD("any_door_id", null);
    }

    private static void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }

    private static String icD(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
