package com.baidu.platform.comapi.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class NetworkUtil {
    public static final int NETYPE_2G = 2;
    public static final int NETYPE_3G = 3;
    public static final int NETYPE_4G = 4;
    public static final int NETYPE_4G_UNKNOWN = 10;
    public static final int NETYPE_MOBILE_3G = 8;
    public static final int NETYPE_MOBILE_UNICOM_2G = 6;
    public static final int NETYPE_NOCON = -1;
    public static final int NETYPE_TELECOM_2G = 5;
    public static final int NETYPE_TELECOM_3G = 7;
    public static final int NETYPE_UNICOM_3G = 9;
    public static final int NETYPE_UNKNOWN = 0;
    public static final int NETYPE_WIFI = 1;

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f9813a = null;

    /* renamed from: b, reason: collision with root package name */
    private static k f9814b = null;
    public static String mProxyHost = "";
    public static int mProxyPort = 0;
    public static boolean mUseProxy = false;

    @SuppressLint({"NewApi"})
    private static String a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return "mobile";
        }
        return networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(0) ? "CELLULAR" : networkCapabilities.hasTransport(3) ? "ETHERNET" : networkCapabilities.hasTransport(6) ? "LoWPAN" : networkCapabilities.hasTransport(4) ? "VPN" : networkCapabilities.hasTransport(5) ? "WifiAware" : "mobile";
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static NetworkInfo[] getAllNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getCurrentNetMode(Context context) {
        Network activeNetwork;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        int i8 = -1;
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type != 1) {
                if (type == 0 || type == 3 || type == 4 || type == 5) {
                    if (Build.VERSION.SDK_INT <= 29) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager != null) {
                            switch (telephonyManager.getNetworkType()) {
                                case 1:
                                case 2:
                                    i8 = 6;
                                    break;
                                case 3:
                                case 9:
                                case 10:
                                case 15:
                                    i8 = 9;
                                    break;
                                case 4:
                                    i8 = 5;
                                    break;
                                case 5:
                                case 6:
                                case 12:
                                    i8 = 7;
                                    break;
                                case 7:
                                case 11:
                                case 16:
                                    i8 = 2;
                                    break;
                                case 8:
                                case 17:
                                    i8 = 8;
                                    break;
                                case 13:
                                case 18:
                                    i8 = 4;
                                    break;
                                case 14:
                                    i8 = 3;
                                    break;
                                default:
                                    i8 = 0;
                                    break;
                            }
                        }
                    } else {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        if (connectivityManager == null) {
                            return "mobile";
                        }
                        activeNetwork = connectivityManager.getActiveNetwork();
                        return a(connectivityManager.getNetworkCapabilities(activeNetwork));
                    }
                }
            } else {
                if (Build.VERSION.SDK_INT > 29) {
                    return "WIFI";
                }
                i8 = 1;
            }
        }
        return Integer.toString(i8);
    }

    public static String getNetworkOperatorInfo(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                try {
                    StringBuilder sb = new StringBuilder(networkOperator);
                    sb.insert(3, ":");
                    return sb.toString();
                } catch (Exception unused) {
                }
            }
        }
        return "";
    }

    public static int getNetworkOperatorType(Context context) {
        String networkOperatorInfo = getNetworkOperatorInfo(context);
        if (TextUtils.isEmpty(networkOperatorInfo)) {
            return -1;
        }
        if (networkOperatorInfo.startsWith("460:00") || networkOperatorInfo.startsWith("460:02")) {
            return 0;
        }
        if (networkOperatorInfo.startsWith("460:01")) {
            return 1;
        }
        return networkOperatorInfo.startsWith("460:03") ? 2 : -1;
    }

    public static boolean initConnectState() {
        return true;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            if (isWifiConnected(context)) {
                return true;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isWifiConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || 1 != activeNetworkInfo.getType()) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isWifiState(Context context) {
        int wifiState;
        int checkSelfPermission;
        if (context == null) {
            return false;
        }
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                checkSelfPermission = context.checkSelfPermission("android.permission.ACCESS_WIFI_STATE");
                if (checkSelfPermission != 0) {
                    return false;
                }
                wifiState = wifiManager.getWifiState();
            } else {
                wifiState = wifiManager.getWifiState();
            }
            return wifiState == 3;
        } catch (Exception unused) {
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void registerNetwork(Context context) {
        if (context == null) {
            return;
        }
        f9813a = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().build();
        if (f9813a != null) {
            k kVar = new k();
            f9814b = kVar;
            f9813a.registerNetworkCallback(build, kVar);
        }
    }

    public static void unregisterNetworkCallback() {
        ConnectivityManager connectivityManager;
        k kVar;
        if (Build.VERSION.SDK_INT < 29 || (connectivityManager = f9813a) == null || (kVar = f9814b) == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(kVar);
    }

    public static void updateNetworkProxy(Context context) {
    }
}
