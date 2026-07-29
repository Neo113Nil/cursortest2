package com.ironsource.environment;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.tapjoy.TapjoyConstants;

/* compiled from: ConnectivityService.java */
/* loaded from: classes2.dex */
public class b {
    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            String typeName = activeNetworkInfo.getTypeName();
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                sb.append("3g");
            } else if (type == 1) {
                sb.append(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
            } else {
                sb.append(typeName);
            }
        }
        return sb.toString();
    }

    public static boolean b(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean c(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(0);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static int e(Context context) {
        try {
            return context.getResources().getConfiguration().mcc;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int f(Context context) {
        try {
            return context.getResources().getConfiguration().mnc;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String g(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int h(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
