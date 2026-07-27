package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public abstract class AFi1xSDK {
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    private final TelephonyManager AFInAppEventParameterName;
    ConnectivityManager AFInAppEventType;

    @Metadata
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFi1xSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        this.AFInAppEventType = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.AFInAppEventParameterName = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    public static boolean AFInAppEventParameterName(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    public final AFi1wSDK AFInAppEventType() {
        Throwable th;
        String str;
        String str2;
        String str3 = null;
        try {
            TelephonyManager telephonyManager = this.AFInAppEventParameterName;
            if (telephonyManager != null) {
                str2 = telephonyManager.getSimOperatorName();
                try {
                    str3 = telephonyManager.getNetworkOperatorName();
                    if (str3 != null) {
                        if (str3.length() == 0) {
                        }
                    }
                    if (telephonyManager.getPhoneType() == 2) {
                        str3 = "CDMA";
                    }
                } catch (Throwable th2) {
                    str = str3;
                    str3 = str2;
                    th = th2;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th);
                    str2 = str3;
                    str3 = str;
                    return new AFi1wSDK(valueOf(), str3, str2, values());
                }
            } else {
                str2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        return new AFi1wSDK(valueOf(), str3, str2, values());
    }

    public abstract String valueOf();

    public abstract boolean values();
}
