package com.appsflyer;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.os.EnvironmentCompat;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
final class v {

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final v f3507a = new v();
    }

    v() {
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3504a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3505b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3506c;

        a(String str, String str2, String str3) {
            this.f3504a = str;
            this.f3505b = str2;
            this.f3506c = str3;
        }

        final String a() {
            return this.f3504a;
        }

        final String b() {
            return this.f3505b;
        }

        final String c() {
            return this.f3506c;
        }

        a() {
        }

        static boolean a(Context context, String str) {
            int checkSelfPermission = ContextCompat.checkSelfPermission(context, str);
            StringBuilder sb = new StringBuilder("is Permission Available: ");
            sb.append(str);
            sb.append("; res: ");
            sb.append(checkSelfPermission);
            d.a(sb.toString());
            return checkSelfPermission == 0;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:2|3)|(11:5|(2:7|(1:(2:47|48)(3:9|(1:46)(1:13)|(3:16|17|(1:19)(2:42|(1:44)(1:45)))(1:15))))(3:49|(1:76)(1:53)|(1:55)(3:56|(1:75)(1:60)|(1:62)(3:63|(1:67)|(2:69|(1:71)(2:72|(1:74))))))|20|21|22|(6:35|36|(1:38)|30|27|28)|24|(3:26|27|28)|30|27|28)|77|20|21|22|(0)|24|(0)|30|27|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static a a(Context context) {
        String str;
        String str2;
        ConnectivityManager connectivityManager;
        String str3;
        TelephonyManager telephonyManager;
        String networkOperatorName;
        String str4 = EnvironmentCompat.MEDIA_UNKNOWN;
        String str5 = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        if (connectivityManager != null) {
            boolean z = false;
            if (21 <= Build.VERSION.SDK_INT) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str3 = EnvironmentCompat.MEDIA_UNKNOWN;
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (!(networkInfo != null && networkInfo.isConnectedOrConnecting())) {
                        i++;
                    } else if (1 == networkInfo.getType()) {
                        str3 = "WIFI";
                    } else {
                        str3 = networkInfo.getType() == 0 ? "MOBILE" : EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                }
            } else {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo2 != null && networkInfo2.isConnectedOrConnecting()) {
                    str3 = "WIFI";
                } else {
                    NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
                    if (networkInfo3 != null && networkInfo3.isConnectedOrConnecting()) {
                        str3 = "MOBILE";
                    } else {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                            z = true;
                        }
                        if (z) {
                            if (1 == activeNetworkInfo.getType()) {
                                str3 = "WIFI";
                            } else if (activeNetworkInfo.getType() == 0) {
                                str3 = "MOBILE";
                            }
                        }
                    }
                }
            }
            str4 = str3;
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str = telephonyManager.getSimOperatorName();
            networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null) {
                try {
                    if (networkOperatorName.isEmpty()) {
                    }
                    str2 = networkOperatorName;
                } catch (Throwable th2) {
                    th = th2;
                    str5 = networkOperatorName;
                    d.a("Exception while collecting network info. ", th);
                    str2 = str5;
                    return new a(str4, str2, str);
                }
                return new a(str4, str2, str);
            }
            if (2 == telephonyManager.getPhoneType()) {
                str2 = "CDMA";
                return new a(str4, str2, str);
            }
            str2 = networkOperatorName;
            return new a(str4, str2, str);
        }
        str3 = EnvironmentCompat.MEDIA_UNKNOWN;
        str4 = str3;
        telephonyManager = (TelephonyManager) context.getSystemService("phone");
        str = telephonyManager.getSimOperatorName();
        networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (networkOperatorName != null) {
        }
        if (2 == telephonyManager.getPhoneType()) {
        }
        str2 = networkOperatorName;
        return new a(str4, str2, str);
    }
}
