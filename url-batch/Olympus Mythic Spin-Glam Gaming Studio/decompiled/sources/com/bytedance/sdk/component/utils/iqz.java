package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;

/* loaded from: classes4.dex */
public class iqz {
    private static String fs = "";
    private static boolean zmn;

    public static void zmn() {
        zmn = true;
    }

    public static void fs() {
        zmn = false;
    }

    public static void zmn(String str, String str2) {
        if (zmn && str2 != null) {
            Log.d(fs(str), str2);
        }
    }

    public static void zmn(String str, Object... objArr) {
        if (zmn && objArr != null) {
            Log.d(fs(str), zmn(objArr));
        }
    }

    public static void fs(String str, String str2) {
        if (zmn && str2 != null) {
            Log.i(fs(str), str2);
        }
    }

    public static void fs(String str, Object... objArr) {
        if (zmn && objArr != null) {
            Log.i(fs(str), zmn(objArr));
        }
    }

    public static void zn(String str, String str2) {
        if (zmn && str2 != null) {
            Log.e(fs(str), str2);
        }
    }

    public static void zn(String str, Object... objArr) {
        if (zmn && objArr != null) {
            Log.e(fs(str), zmn(objArr));
        }
    }

    public static void zmn(String str, String str2, Throwable th) {
        if (zmn) {
            if (str2 == null && th == null) {
                return;
            }
            Log.e(fs(str), str2, th);
        }
    }

    public static void zmn(String str) {
        fs = str;
    }

    private static String fs(String str) {
        if (TextUtils.isEmpty(fs)) {
            return str;
        }
        return zmn(X3.j.d + fs + "]-[" + str + X3.j.e);
    }

    private static String zmn(Object... objArr) {
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
