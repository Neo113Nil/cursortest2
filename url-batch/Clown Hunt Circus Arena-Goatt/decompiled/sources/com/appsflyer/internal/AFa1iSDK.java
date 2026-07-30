package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public class AFa1iSDK {
    private static boolean values(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public final AFa1vSDK valueOf(Context context) {
        String str;
        String str2;
        String str3 = EnvironmentCompat.MEDIA_UNKNOWN;
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
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
            try {
                str4 = telephonyManager.getNetworkOperatorName();
                if (str4 == null || str4.isEmpty()) {
                    if (2 == telephonyManager.getPhoneType()) {
                        str4 = "CDMA";
                    }
                }
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
        return new AFa1vSDK(str3, str4, str2);
    }

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
}
