package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* compiled from: TestHelperUtils.java */
/* loaded from: classes2.dex */
public class Gp {
    private static String pvs;

    public static boolean vG() {
        return false;
    }

    public static boolean pvs() {
        return com.bytedance.sdk.component.utils.Ju.Jd() && com.bytedance.sdk.openadsdk.core.so.icD().vA() && com.bytedance.sdk.openadsdk.core.so.icD().cR();
    }

    public static String pvs(String str) {
        try {
            if (!pvs()) {
                return str;
            }
            String zM = com.bytedance.sdk.openadsdk.core.so.icD().zM();
            if (TextUtils.isEmpty(zM)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(zM)));
            return Uri.parse(str).buildUpon().appendQueryParameter(icD(), zM).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String icD() {
        if (TextUtils.isEmpty(pvs)) {
            pvs = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return pvs;
    }
}
