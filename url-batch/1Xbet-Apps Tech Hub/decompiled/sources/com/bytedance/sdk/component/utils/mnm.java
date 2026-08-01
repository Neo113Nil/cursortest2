package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: NetworkUtils.java */
/* loaded from: classes.dex */
public class mnm {
    public static boolean pvs(Context context) {
        return vG(context) != 0;
    }

    public static int icD(Context context) {
        int vG = vG(context);
        if (vG == 1) {
            return 0;
        }
        if (vG == 4) {
            return 1;
        }
        if (vG == 5) {
            return 4;
        }
        if (vG != 6) {
            return vG;
        }
        return 6;
    }

    public static int vG(Context context) {
        return ny.pvs(context, 60000L);
    }

    public static boolean Jd(Context context) {
        return vG(context) == 4;
    }

    public static boolean NB(Context context) {
        return vG(context) == 5;
    }

    public static boolean sUS(Context context) {
        return vG(context) == 6;
    }

    public static String yiw(Context context) {
        int vG = vG(context);
        return vG != 2 ? vG != 3 ? vG != 4 ? vG != 5 ? vG != 6 ? "mobile" : "5g" : "4g" : "wifi" : "3g" : "2g";
    }

    public static boolean pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean so(Context context) {
        if (context == null) {
            return false;
        }
        int vG = vG(context);
        char c = 2;
        if (vG != 2) {
            c = 3;
            if (vG != 3) {
                c = 4;
                if (vG == 4) {
                    c = 1;
                } else if (vG != 5) {
                    c = vG != 6 ? (char) 0 : (char) 5;
                }
            }
        }
        return c != 0;
    }
}
