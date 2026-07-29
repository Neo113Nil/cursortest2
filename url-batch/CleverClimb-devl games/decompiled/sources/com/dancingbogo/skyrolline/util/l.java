package com.dancingbogo.skyrolline.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.dancingbogo.skyrolline.GameApp;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* compiled from: NetUtil.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static Uri f4622a = Uri.parse("content://telephony/carriers/preferapn");

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
                } else if (c(subtype)) {
                    i = 5;
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
            b.a("NetUtil", e);
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
                        b.b("NetUtil", "isNetworkAvailable");
                        return true;
                    }
                    b.b("NetUtil", "isNetworkAvailable fail");
                    return false;
                }
            } catch (Exception e) {
                b.a("NetUtil", e);
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

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || !c(GameApp.f4485a)) {
            return null;
        }
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName != null) {
                return byName.getHostAddress();
            }
            return null;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
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
