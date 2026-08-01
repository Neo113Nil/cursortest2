package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: PAGLogger.java */
/* loaded from: classes2.dex */
public class zM {
    private static boolean pvs = false;

    public static void pvs() {
        pvs = true;
    }

    public static void icD() {
        pvs = false;
    }

    public static void pvs(String str, String str2, Object... objArr) {
        pvs(vG(str, str2), objArr);
    }

    public static void pvs(String str, String str2) {
        if (pvs && str2 != null) {
            Log.d(pvs(str), str2);
        }
    }

    public static void pvs(String str, Object... objArr) {
        if (pvs && objArr != null) {
            Log.d(pvs(str), pvs(objArr));
        }
    }

    public static void icD(String str, String str2, Object... objArr) {
        icD(vG(str, str2), objArr);
    }

    public static void icD(String str, String str2) {
        if (pvs && str2 != null) {
            Log.e(pvs(str), str2);
        }
    }

    public static void icD(String str, Object... objArr) {
        if (pvs && objArr != null) {
            Log.e(pvs(str), pvs(objArr));
        }
    }

    private static String pvs(String str) {
        return TextUtils.isEmpty("PangleSDK-6109") ? str : pvs("[PangleSDK-6109]-[" + str + "]");
    }

    private static String vG(String str, String str2) {
        return TextUtils.isEmpty("PangleSDK-6109") ? str : pvs(str2 + "]-[" + str);
    }

    private static String pvs(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
