package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: IdUtils.java */
/* loaded from: classes2.dex */
public class qh {
    private static String Jd;
    private static boolean NB;
    private static String icD;
    private static String pvs;
    private static String vG;

    private static Context Jd(Context context) {
        return context == null ? mnm.pvs() : context;
    }

    public static String pvs(Context context) {
        if (!TextUtils.isEmpty(pvs)) {
            return pvs;
        }
        sUS(context);
        return pvs;
    }

    public static String icD(Context context) {
        if (vG == null && !NB) {
            synchronized (qh.class) {
                if (!NB) {
                    NB(context);
                }
            }
        }
        return vG;
    }

    public static String vG(Context context) {
        if (TextUtils.isEmpty(Jd) && !NB) {
            synchronized (qh.class) {
                if (!NB) {
                    NB(context);
                }
            }
        }
        return Jd;
    }

    public static void pvs(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(pvs)) {
            vG.pvs(context).pvs("did", str);
            pvs = str;
        }
        if (TextUtils.isEmpty(pvs)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.NB.vG.icD(pvs);
        Wyp.pvs(pvs);
    }

    private static void NB(Context context) {
        Context Jd2;
        if (NB || (Jd2 = Jd(context)) == null) {
            return;
        }
        icD = icD();
        vG = String.valueOf(Build.TIME);
        Jd = vG.pvs(Jd2).icD("uuid", (String) null);
        NB = true;
    }

    private static void sUS(Context context) {
        Context Jd2 = Jd(context);
        if (Jd2 == null) {
            return;
        }
        pvs = vG.pvs(Jd2).icD("did", (String) null);
    }

    private static String icD() {
        StringBuilder sb = new StringBuilder();
        try {
            if (com.bytedance.sdk.openadsdk.utils.ny.NB()) {
                sb.append("MIUI-");
            } else if (com.bytedance.sdk.openadsdk.utils.ny.icD()) {
                sb.append("FLYME-");
            } else {
                String IP = com.bytedance.sdk.openadsdk.utils.ny.IP();
                if (com.bytedance.sdk.openadsdk.utils.ny.pvs(IP)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(IP)) {
                    sb.append(IP).append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String pvs() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            return Locale.SIMPLIFIED_CHINESE.toString().equals(locale2) ? "zh" : "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
