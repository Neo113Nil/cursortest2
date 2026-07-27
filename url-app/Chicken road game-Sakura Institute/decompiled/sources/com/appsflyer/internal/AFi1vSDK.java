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

/* loaded from: classes.dex */
public final class AFi1vSDK extends AFi1xSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1vSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final String valueOf() {
        ConnectivityManager connectivityManager = this.AFInAppEventType;
        if (connectivityManager != null) {
            if (AFi1xSDK.AFInAppEventParameterName(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (AFi1xSDK.AFInAppEventParameterName(connectivityManager.getNetworkInfo(0))) {
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

    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean values() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "");
            ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
            Intrinsics.checkNotNullExpressionValue(list, "");
            if (list != null) {
                if (!list.isEmpty()) {
                }
                return false;
            }
            for (NetworkInterface networkInterface : list) {
                if (networkInterface.isUp() && Intrinsics.a(networkInterface.getName(), "tun0")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Failed collecting ivc data", e4);
            return false;
        }
    }
}
