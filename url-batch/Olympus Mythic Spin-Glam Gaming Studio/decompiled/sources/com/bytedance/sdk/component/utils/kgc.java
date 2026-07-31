package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.T3;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;

/* loaded from: classes5.dex */
public class kgc {
    public static boolean zmn(Context context) {
        return zn(context) != 0;
    }

    public static int fs(Context context) {
        int zn = zn(context);
        if (zn == 1) {
            return 0;
        }
        if (zn == 4) {
            return 1;
        }
        if (zn == 5) {
            return 4;
        }
        if (zn != 6) {
            return zn;
        }
        return 6;
    }

    public static int zn(Context context) {
        return rp.zmn(context, 60000L);
    }

    public static boolean fb(Context context) {
        return zn(context) == 4;
    }

    public static boolean btk(Context context) {
        return zn(context) == 5;
    }

    public static boolean hhw(Context context) {
        return zn(context) == 6;
    }

    public static String nps(Context context) {
        int zn = zn(context);
        if (zn == 2) {
            return "2g";
        }
        if (zn == 3) {
            return T3.a;
        }
        if (zn == 4) {
            return T3.b;
        }
        if (zn == 5) {
            return "4g";
        }
        if (zn == 6) {
            return "5g";
        }
        return "mobile";
    }

    public static boolean zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(d.v) || str.startsWith(d.u);
    }

    public static boolean zg(Context context) {
        if (context == null) {
            return false;
        }
        int zn = zn(context);
        return zn == 2 || zn == 3 || zn == 4 || zn == 5 || zn == 6;
    }
}
