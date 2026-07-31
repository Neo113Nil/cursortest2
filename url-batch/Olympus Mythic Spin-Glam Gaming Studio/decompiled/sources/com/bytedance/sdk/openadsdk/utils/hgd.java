package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ironsource.C4913ua;

/* loaded from: classes6.dex */
public class hgd {
    private static String zmn;

    public static boolean zn() {
        return false;
    }

    public static boolean zmn() {
        return com.bytedance.sdk.component.utils.cn.zn() && com.bytedance.sdk.openadsdk.core.iv.fs().cn() && com.bytedance.sdk.openadsdk.core.iv.fs().olo();
    }

    public static String zmn(String str) {
        try {
            if (!zmn()) {
                return str;
            }
            String kgc = com.bytedance.sdk.openadsdk.core.iv.fs().kgc();
            if (TextUtils.isEmpty(kgc)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(kgc)));
            return Uri.parse(str).buildUpon().appendQueryParameter(fs(), kgc).appendQueryParameter(C4913ua.b, "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String fs() {
        if (TextUtils.isEmpty(zmn)) {
            zmn = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return zmn;
    }
}
