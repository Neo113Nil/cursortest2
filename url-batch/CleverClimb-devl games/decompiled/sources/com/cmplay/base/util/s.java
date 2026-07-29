package com.cmplay.base.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;

/* compiled from: NetUtil.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static Uri f4059a = Uri.parse("content://telephony/carriers/preferapn");

    private static boolean a(int i) {
        if (i != 4 && i != 7 && i != 11) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private static boolean b(int i) {
        switch (i) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            case 13:
            default:
                return false;
        }
    }

    private static boolean c(int i) {
        return i == 13;
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            int i = 4;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 4;
            }
            if (activeNetworkInfo.getType() == 1) {
                if (b(context)) {
                    i = 3;
                }
            } else {
                int subtype = activeNetworkInfo.getSubtype();
                if (a(subtype)) {
                    i = 1;
                } else if (b(subtype)) {
                    i = 2;
                } else {
                    i = c(subtype) ? 5 : 6;
                }
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return activeNetworkInfo.getType() == 1;
        } catch (Exception e) {
            h.a("NetUtil", e);
            return false;
        }
    }

    public static boolean c(Context context) {
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                        h.c("NetUtil", "isNetworkAvailable");
                        return true;
                    }
                    h.c("NetUtil", "isNetworkAvailable fail");
                    return false;
                }
            } catch (Exception e) {
                h.a("NetUtil", e);
            }
        }
        return false;
    }

    public static String d(Context context) {
        String simOperator;
        if (context == null || (simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator()) == null || simOperator.length() < 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 0, 3);
        return sb.toString();
    }

    public static boolean e(Context context) {
        for (NetworkInfo networkInfo : ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo()) {
            if (networkInfo.getTypeName().equalsIgnoreCase("WIFI") && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        for (NetworkInfo networkInfo : ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo()) {
            if (networkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                if (networkInfo.isConnected()) {
                    return true;
                }
            } else if (networkInfo.getTypeName().equalsIgnoreCase("MOBILE") && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }
}
