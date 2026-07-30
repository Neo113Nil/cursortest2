package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AFa1iSDK {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1vSDK {
        public final String AFInAppEventType;
        public final String AFKeystoreWrapper;
        public final String values;

        public AFa1vSDK(String str, String str2, String str3) {
            this.AFKeystoreWrapper = str;
            this.AFInAppEventType = str2;
            this.values = str3;
        }
    }

    private static boolean values(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public final AFa1vSDK valueOf(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (!values(networkInfo)) {
                        i++;
                    } else if (1 == networkInfo.getType()) {
                        str3 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str3 = "MOBILE";
                    }
                }
            }
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
            try {
                str4 = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                th = th;
                str = str4;
                str4 = str2;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str5 = str;
                str2 = str4;
                str4 = str5;
                return new AFa1vSDK(str3, str4, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        if (str4 != null) {
            if (str4.isEmpty()) {
            }
            return new AFa1vSDK(str3, str4, str2);
        }
        if (2 == telephonyManager.getPhoneType()) {
            str4 = "CDMA";
        }
        return new AFa1vSDK(str3, str4, str2);
    }
}
