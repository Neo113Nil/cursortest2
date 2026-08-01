package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.mnm;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.jlb;

/* compiled from: AppInfo.java */
/* loaded from: classes2.dex */
public class pvs {
    private static String pvs;

    public static String icD() {
        return "1371";
    }

    public static String pvs() {
        return "open_news";
    }

    public static String vG() {
        return BuildConfig.VERSION_NAME;
    }

    public static String Jd() {
        return jlb.yiw();
    }

    public static String NB() {
        return com.bytedance.sdk.openadsdk.core.so.icD().NB();
    }

    public static String sUS() {
        return mnm.yiw(com.bytedance.sdk.openadsdk.core.mnm.pvs());
    }

    public static String pvs(Context context) {
        return com.bytedance.sdk.openadsdk.core.qh.pvs(context);
    }

    public static String yiw() {
        if (!TextUtils.isEmpty(pvs)) {
            return pvs;
        }
        String pvs2 = com.bytedance.sdk.openadsdk.core.so.pvs("sdk_app_sha1", 259200000L);
        pvs = pvs2;
        if (pvs(pvs2)) {
            return pvs;
        }
        String pvs3 = com.bytedance.sdk.component.utils.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs());
        pvs = pvs3;
        if (pvs(pvs3)) {
            String upperCase = pvs.toUpperCase();
            pvs = upperCase;
            com.bytedance.sdk.openadsdk.core.so.pvs("sdk_app_sha1", upperCase);
            return pvs;
        }
        return "";
    }

    private static boolean pvs(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(":")) == null || split.length < 20) {
            return false;
        }
        for (String str2 : split) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
