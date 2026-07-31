package com.apm.insight.l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.apm.insight.k.e;
import com.ironsource.T3;

/* compiled from: Net.java */
/* loaded from: classes3.dex */
public final class k {
    public static String a(Context context) {
        return a(c(context));
    }

    private static String a(e.b bVar) {
        try {
            switch (AnonymousClass1.a[bVar.ordinal()]) {
                case 1:
                    return T3.b;
                case 2:
                    return "2g";
                case 3:
                    return T3.a;
                case 4:
                    return "4g";
                case 5:
                    return "mobile";
                case 6:
                    return "5g";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* compiled from: Net.java */
    /* renamed from: com.apm.insight.l.k$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.b.values().length];
            a = iArr;
            try {
                iArr[e.b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.b.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static e.b c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return e.b.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return e.b.WIFI;
                }
                if (type == 0) {
                    int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    if (networkType != 3) {
                        if (networkType == 20) {
                            return e.b.MOBILE_5G;
                        }
                        if (networkType != 5 && networkType != 6) {
                            switch (networkType) {
                                case 8:
                                case 9:
                                case 10:
                                    break;
                                default:
                                    switch (networkType) {
                                        case 12:
                                        case 14:
                                        case 15:
                                            break;
                                        case 13:
                                            return e.b.MOBILE_4G;
                                        default:
                                            return e.b.MOBILE;
                                    }
                            }
                        }
                    }
                    return e.b.MOBILE_3G;
                }
                return e.b.MOBILE;
            }
            return e.b.NONE;
        } catch (Throwable unused) {
            return e.b.MOBILE;
        }
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
