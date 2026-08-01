package com.bytedance.sdk.component.pvs;

import android.text.TextUtils;

/* compiled from: SerializeHelper.java */
/* loaded from: classes.dex */
class ZhG {
    private static boolean pvs;

    static String pvs() {
        return "";
    }

    static String pvs(Throwable th) {
        return "{\"code\":" + (th instanceof cR ? ((cR) th).pvs : 0) + "}";
    }

    static String pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String substring = pvs ? str.substring(1, str.length() - 1) : "";
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!substring.isEmpty()) {
            return concat + "," + substring + "}";
        }
        return concat + "}";
    }

    static void pvs(boolean z) {
        pvs = z;
    }
}
