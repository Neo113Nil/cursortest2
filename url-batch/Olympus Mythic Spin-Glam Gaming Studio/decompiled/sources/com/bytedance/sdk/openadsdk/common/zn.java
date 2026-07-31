package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.oub;

/* loaded from: classes5.dex */
public class zn {
    private static String zmn;

    public static int fb() {
        return BuildConfig.VERSION_CODE;
    }

    public static String zmn() {
        return "open_news";
    }

    public static String fs() {
        return "1371";
    }

    public static String zn() {
        return BuildConfig.VERSION_NAME;
    }

    public static long btk() {
        return oub.iv(BuildConfig.VERSION_NAME);
    }

    public static String hhw() {
        return oub.zg();
    }

    public static String nps() {
        return com.bytedance.sdk.openadsdk.core.iv.fs().zg();
    }

    public static String zg() {
        return com.bytedance.sdk.component.utils.kgc.nps(com.bytedance.sdk.openadsdk.core.kgc.zmn());
    }

    public static String zmn(Context context) {
        return com.bytedance.sdk.openadsdk.core.mw.zmn(context);
    }

    public static String bvs() {
        try {
            if (!TextUtils.isEmpty(zmn)) {
                return zmn;
            }
            String zmn2 = com.bytedance.sdk.openadsdk.core.iv.zmn("sdk_app_sha1", 259200000L);
            zmn = zmn2;
            if (zmn(zmn2)) {
                return zmn;
            }
            String zmn3 = com.bytedance.sdk.component.utils.zn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
            zmn = zmn3;
            if (!zmn(zmn3)) {
                return "";
            }
            String upperCase = zmn.toUpperCase();
            zmn = upperCase;
            com.bytedance.sdk.openadsdk.core.iv.zmn("sdk_app_sha1", upperCase);
            return zmn;
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean zmn(String str) {
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
