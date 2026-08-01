package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFi1nSDK extends AFi1qSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1nSDK(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String AFAdRevenueData() {
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager != null) {
            if (AFi1qSDK.v_(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (AFi1qSDK.v_(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final boolean getMediationNetwork() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            networkInterfaces.getClass();
            ArrayList list = Collections.list(networkInterfaces);
            list.getClass();
            if (list != null && list.isEmpty()) {
                return false;
            }
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = list.get(i3);
                i3++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.isUp() && Intrinsics.a(networkInterface.getName(), "tun0")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Failed collecting ivc data", e2);
            return false;
        }
    }
}
