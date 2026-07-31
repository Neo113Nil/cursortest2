package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class dd {
    public static String a(Context context) {
        NetworkCapabilities networkCapabilities;
        int dataNetworkType;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                if (!m0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return "e105";
                }
                int i = Build.VERSION.SDK_INT;
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return "WIFI";
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager != null) {
                            if (i < 30) {
                                dataNetworkType = telephonyManager.getNetworkType();
                            } else {
                                dataNetworkType = telephonyManager.getDataNetworkType();
                            }
                            return Integer.toString(dataNetworkType);
                        }
                        return "e101";
                    }
                }
                return "e102";
            }
            return "e100";
        } catch (Exception unused) {
            return "e105";
        }
    }
}
