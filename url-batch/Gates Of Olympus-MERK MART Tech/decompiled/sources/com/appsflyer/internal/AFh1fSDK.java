package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.core.os.EnvironmentCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFh1fSDK extends AFh1hSDK {
    private String AFInAppEventType;
    private Network AFKeystoreWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFh1fSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AFInAppEventType = EnvironmentCompat.MEDIA_UNKNOWN;
        AFa1zSDK aFa1zSDK = new AFa1zSDK();
        ConnectivityManager connectivityManager = this.valueOf;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1zSDK);
        }
    }

    public static final class AFa1zSDK extends ConnectivityManager.NetworkCallback {
        AFa1zSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFh1fSDK.this.AFKeystoreWrapper = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFh1fSDK.this.AFKeystoreWrapper = network;
            AFh1fSDK.this.AFInAppEventType = "NetworkLost";
        }
    }

    @Override // com.appsflyer.internal.AFh1hSDK
    protected final String AFInAppEventType() {
        Network network = this.AFKeystoreWrapper;
        if (network != null) {
            ConnectivityManager connectivityManager = this.valueOf;
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

    @Override // com.appsflyer.internal.AFh1hSDK
    public final boolean values() {
        Network network = this.AFKeystoreWrapper;
        if (network == null) {
            return false;
        }
        if (Intrinsics.areEqual(this.AFInAppEventType, "NetworkLost")) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.valueOf;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return AFInAppEventType(networkCapabilities);
        }
        return false;
    }

    private static boolean AFInAppEventType(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }
}
