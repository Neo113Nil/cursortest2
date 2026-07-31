package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class mw {
    private static boolean fb;
    private static String fs;
    private static String zmn;
    private static String zn;

    private static Context fb(Context context) {
        return context == null ? kgc.zmn() : context;
    }

    public static String zmn(Context context) {
        if (!TextUtils.isEmpty(zmn)) {
            return zmn;
        }
        hhw(context);
        return zmn;
    }

    public static String fs(Context context) {
        if (fs == null && !fb) {
            synchronized (mw.class) {
                try {
                    if (!fb) {
                        btk(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    public static String zn(Context context) {
        if (TextUtils.isEmpty(zn) && !fb) {
            synchronized (mw.class) {
                try {
                    if (!fb) {
                        btk(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zn;
    }

    public static void zmn(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(zmn)) {
                zmn = str;
            }
            zmn();
        }
        if (TextUtils.isEmpty(zmn)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.klz.zn.fs(zmn);
        klz.zmn(zmn);
    }

    @RequiresPermission
    @SuppressLint({"HardwareIds"})
    private static void btk(Context context) {
        if (fb || fb(context) == null) {
            return;
        }
        fs = String.valueOf(Build.TIME);
        zn = zn.zmn().fs(CommonUrlParts.UUID, (String) null);
        fb = true;
    }

    private static void hhw(Context context) {
        if (fb(context) == null) {
            return;
        }
        String fs2 = zn.zmn().fs("abcd", (String) null);
        if (TextUtils.isEmpty(fs2)) {
            return;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(fs2);
            int optInt = jsonObjectInit.optInt("cypher", -1);
            String optString = jsonObjectInit.optString("message");
            if (optInt == 3) {
                String zn2 = com.bytedance.sdk.component.utils.zmn.zn(optString);
                if (TextUtils.isEmpty(zn2)) {
                    return;
                }
                zmn = PangleNetworkBridge.jsonObjectInit(zn2).optString("abcd");
                zmn();
            }
        } catch (Throwable unused) {
        }
    }

    public static void zmn() {
        if (TextUtils.isEmpty(zmn)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("update_did") { // from class: com.bytedance.sdk.openadsdk.core.mw.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", mw.zmn);
                    zn.zmn().zmn("abcd", com.bytedance.sdk.component.utils.zmn.zmn(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static String fs() {
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
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(locale2)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
