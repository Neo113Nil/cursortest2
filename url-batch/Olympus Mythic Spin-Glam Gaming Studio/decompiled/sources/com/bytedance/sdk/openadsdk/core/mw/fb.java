package com.bytedance.sdk.openadsdk.core.mw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;

/* loaded from: classes5.dex */
public class fb {
    public static String zmn(String str) {
        return TextUtils.isEmpty(str) ? str : zmn(rc.fs().kw(), str);
    }

    public static String zmn(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith(d.v) || str2.startsWith(d.u)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return str + "/static/" + str2;
        }
        return str + "static/" + str2;
    }
}
