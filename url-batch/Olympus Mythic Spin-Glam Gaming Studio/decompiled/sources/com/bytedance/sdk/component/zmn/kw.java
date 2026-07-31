package com.bytedance.sdk.component.zmn;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes5.dex */
class kw {
    private static boolean zmn;

    static String zmn(Throwable th) {
        StringBuilder sb = new StringBuilder("{\"code\":");
        sb.append(th instanceof cyb ? ((cyb) th).zmn : 0);
        sb.append("}");
        return sb.toString();
    }

    static String zmn(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (zmn && !z) {
            str2 = str.substring(1, str.length() - 1);
        } else {
            str2 = "";
        }
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!str2.isEmpty()) {
            return concat + StringUtils.COMMA + str2 + "}";
        }
        return concat + "}";
    }

    static String zmn() {
        return "";
    }

    static void zmn(boolean z) {
        zmn = z;
    }
}
