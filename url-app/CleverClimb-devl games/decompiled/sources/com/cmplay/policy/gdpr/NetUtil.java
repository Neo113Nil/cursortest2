package com.cmplay.policy.gdpr;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public class NetUtil {
    public static final int NETWORK_TYPE_2G = 1;
    public static final int NETWORK_TYPE_3G = 2;
    public static final int NETWORK_TYPE_4G = 5;
    public static final int NETWORK_TYPE_NONE = 4;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 3;
    private static final String TAG = "NetUtil";

    private static boolean isMobile2G(int i) {
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

    private static boolean isMobile3G(int i) {
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

    private static boolean isMobile4G(int i) {
        return i == 13;
    }

    public static int getNetworkState(Context context) {
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
                if (isWiFiActive(context)) {
                    i = 3;
                }
            } else {
                int subtype = activeNetworkInfo.getSubtype();
                if (isMobile2G(subtype)) {
                    i = 1;
                } else if (isMobile3G(subtype)) {
                    i = 2;
                } else if (isMobile4G(subtype)) {
                    i = 5;
                }
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean isWiFiActive(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return activeNetworkInfo.getType() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String getMCC(Context context) {
        String simOperator;
        if (context == null || (simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator()) == null || simOperator.length() < 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 0, 3);
        return sb.toString();
    }

    public static boolean isWifiNetworkUp(Context context) {
        for (NetworkInfo networkInfo : ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo()) {
            if (networkInfo.getTypeName().equalsIgnoreCase("WIFI") && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }
}
