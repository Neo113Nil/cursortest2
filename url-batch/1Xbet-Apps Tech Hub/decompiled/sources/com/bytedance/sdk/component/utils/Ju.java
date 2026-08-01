package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class Ju {
    private static String Jd = "";
    private static int icD = 4;
    private static boolean pvs = false;
    private static com.bytedance.sdk.component.pvs vG;

    public static void pvs(String str) {
        Jd = str;
    }

    public static void pvs(int i) {
        icD = i;
    }

    public static boolean pvs() {
        return icD <= 3;
    }

    public static void icD() {
        pvs = true;
        pvs(3);
    }

    public static void vG() {
        pvs = false;
        pvs(7);
    }

    public static boolean Jd() {
        return pvs;
    }

    public static void icD(String str) {
        if (pvs) {
            pvs("Logger", str);
        }
    }

    public static void pvs(String str, String str2) {
        if (vG != null) {
            vG(str);
        }
        if (pvs && str2 != null && icD <= 6) {
            Log.e(vG(str), str2);
        }
    }

    public static void pvs(String str, String str2, String str3, Throwable th) {
        if (pvs) {
            pvs(icD(str, str2), str3, th);
        }
    }

    public static void pvs(String str, String str2, Throwable th) {
        if (vG != null) {
            vG(str);
        }
        if (pvs) {
            if (!(str2 == null && th == null) && icD <= 6) {
                Log.e(vG(str), str2, th);
            }
        }
    }

    public static void pvs(String str, Object... objArr) {
        if (vG != null) {
            vG(str);
            pvs(objArr);
        }
        if (pvs && objArr != null && icD <= 6) {
            Log.e(vG(str), pvs(objArr));
        }
    }

    private static String pvs(Object... objArr) {
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

    public static String vG(String str) {
        return TextUtils.isEmpty(Jd) ? str : pvs("[" + Jd + "]-[" + str + "]");
    }

    public static String icD(String str, String str2) {
        return TextUtils.isEmpty(Jd) ? str : pvs(str2 + "]-[" + str);
    }
}
