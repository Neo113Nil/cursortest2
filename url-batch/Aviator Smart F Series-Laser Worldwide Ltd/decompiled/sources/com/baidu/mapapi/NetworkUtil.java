package com.baidu.mapapi;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable;

/* loaded from: classes2.dex */
public class NetworkUtil {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f5309a = false;

    /* renamed from: b, reason: collision with root package name */
    private static ConnectivityManager f5310b;

    /* renamed from: c, reason: collision with root package name */
    private static TelephonyManager f5311c;

    /* renamed from: d, reason: collision with root package name */
    private static b f5312d;

    /* renamed from: e, reason: collision with root package name */
    private static c f5313e;

    private static void a(Context context) {
        if (f5310b == null) {
            f5310b = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        }
        if (f5311c == null) {
            f5311c = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        }
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return null;
        }
        a(context);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                NetworkRequest build = new NetworkRequest.Builder().build();
                ConnectivityManager connectivityManager = f5310b;
                if (connectivityManager == null) {
                    return null;
                }
                if (!f5309a) {
                    b bVar = new b(context);
                    f5312d = bVar;
                    f5310b.registerNetworkCallback(build, bVar);
                    f5309a = true;
                    return null;
                }
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                activeNetworkInfo = f5310b.getActiveNetworkInfo();
            }
            return activeNetworkInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getCurrentNetMode(Context context) {
        Network activeNetwork;
        if (context == null) {
            return null;
        }
        a(context);
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        int i8 = 0;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() != 1) {
                if (Build.VERSION.SDK_INT <= 29) {
                    TelephonyManager telephonyManager = f5311c;
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
                            case 7:
                            case 12:
                                i8 = 7;
                                break;
                            case 8:
                                i8 = 8;
                                break;
                            case 11:
                                i8 = 2;
                                break;
                            case 13:
                                i8 = 4;
                                break;
                            case 14:
                                i8 = 10;
                                break;
                        }
                    } else {
                        return Integer.toString(0);
                    }
                } else {
                    ConnectivityManager connectivityManager = f5310b;
                    if (connectivityManager == null) {
                        return "mobile";
                    }
                    activeNetwork = connectivityManager.getActiveNetwork();
                    NetworkCapabilities networkCapabilities = f5310b.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities != null) {
                        boolean hasTransport = networkCapabilities.hasTransport(1);
                        boolean hasTransport2 = networkCapabilities.hasTransport(0);
                        boolean hasTransport3 = networkCapabilities.hasTransport(3);
                        boolean hasTransport4 = networkCapabilities.hasTransport(6);
                        boolean hasTransport5 = networkCapabilities.hasTransport(4);
                        boolean hasTransport6 = networkCapabilities.hasTransport(5);
                        if (hasTransport) {
                            return "WIFI";
                        }
                        if (hasTransport2) {
                            return "CELLULAR";
                        }
                        if (hasTransport3) {
                            return "ETHERNET";
                        }
                        if (hasTransport4) {
                            return "LoWPAN";
                        }
                        if (hasTransport5) {
                            return "VPN";
                        }
                        if (hasTransport6) {
                            return "WifiAware";
                        }
                    }
                    return "mobile";
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

    public static boolean initConnectState() {
        return true;
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        a(context);
        try {
            if (isWifiConnected(context)) {
                return true;
            }
            ConnectivityManager connectivityManager = f5310b;
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isWifiConnected(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return false;
        }
        try {
            if (1 == networkInfo.getType()) {
                return networkInfo.isConnected();
            }
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static void setNetworkUpdate2MapListener(c cVar) {
        f5313e = cVar;
    }

    public static void unregisterNetworkCallback() {
        ConnectivityManager connectivityManager;
        b bVar;
        if (Build.VERSION.SDK_INT < 29 || (connectivityManager = f5310b) == null || (bVar = f5312d) == null || !f5309a) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(bVar);
        f5312d = null;
        f5309a = false;
    }

    public static void updateNetworkInfo2Map() {
        c cVar = f5313e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public static void updateNetworkProxy(Context context) {
        SysUpdateObservable.getInstance().updateNetworkProxy(context);
    }

    public static boolean isWifiConnected(Context context) {
        if (context == null) {
            return false;
        }
        a(context);
        ConnectivityManager connectivityManager = f5310b;
        if (connectivityManager == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || 1 != activeNetworkInfo.getType()) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }
}
