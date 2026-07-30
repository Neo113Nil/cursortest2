package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFi1uSDK extends AFi1xSDK {
    private Network AFKeystoreWrapper;
    private String valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1uSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = EnvironmentCompat.MEDIA_UNKNOWN;
        AFa1tSDK aFa1tSDK = new AFa1tSDK();
        try {
            ConnectivityManager connectivityManager = this.AFInAppEventParameterName;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1tSDK);
            }
        } catch (Throwable th) {
            AFg1fSDK.e$default(AFLogger.INSTANCE, AFg1aSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    public static final class AFa1tSDK extends ConnectivityManager.NetworkCallback {
        AFa1tSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1uSDK.this.AFKeystoreWrapper = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1uSDK.this.AFKeystoreWrapper = network;
            AFi1uSDK.this.valueOf = "NetworkLost";
        }
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    protected final String valueOf() {
        Network network = this.AFKeystoreWrapper;
        if (network != null) {
            ConnectivityManager connectivityManager = this.AFInAppEventParameterName;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null && networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean values() {
        Network network = this.AFKeystoreWrapper;
        if (network == null) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.valueOf, "NetworkLost"))) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.AFInAppEventParameterName;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return AFKeystoreWrapper(networkCapabilities);
        }
        return false;
    }

    private static boolean AFKeystoreWrapper(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }
}
