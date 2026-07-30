package com.baidu.ar;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public final class m9 {
    public static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static int b(Context context) {
        NetworkInfo a8 = a(context);
        if (a8 != null && a8.isAvailable() && a8.getType() == 0) {
            String subtypeName = a8.getSubtypeName();
            switch (a8.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 3;
                case 13:
                    return 4;
                default:
                    if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                        return 3;
                    }
                    break;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static String c(Context context) {
        if (!e(context) || context == null) {
            return "not_Reachable";
        }
        if (f(context)) {
            return "wifi";
        }
        int b8 = b(context);
        return b8 == 2 ? "2G" : b8 == 3 ? "3G" : b8 == 4 ? "4G" : "other_network";
    }

    public static boolean d(Context context) {
        NetworkInfo a8 = a(context);
        return a8 != null && a8.isAvailable() && a8.getType() == 0;
    }

    public static boolean e(Context context) {
        NetworkInfo a8 = a(context);
        return a8 != null && a8.isAvailable();
    }

    public static boolean f(Context context) {
        NetworkInfo a8 = a(context);
        return a8 != null && a8.isAvailable() && a8.getType() == 1;
    }
}
