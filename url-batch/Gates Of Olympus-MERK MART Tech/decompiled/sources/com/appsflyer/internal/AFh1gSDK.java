package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFLogger;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFh1gSDK extends AFh1hSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFh1gSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.appsflyer.internal.AFh1hSDK
    public final boolean values() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "");
            ArrayList list = Collections.list(networkInterfaces);
            Intrinsics.checkNotNullExpressionValue(list, "");
            ArrayList<NetworkInterface> arrayList = list;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                for (NetworkInterface networkInterface : arrayList) {
                    if (networkInterface.isUp() && Intrinsics.areEqual(networkInterface.getName(), "tun0")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFh1hSDK
    protected final String AFInAppEventType() {
        ConnectivityManager connectivityManager = this.valueOf;
        if (connectivityManager != null) {
            if (valueOf(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (valueOf(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                return type != 0 ? type != 1 ? EnvironmentCompat.MEDIA_UNKNOWN : "WIFI" : "MOBILE";
            }
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }
}
