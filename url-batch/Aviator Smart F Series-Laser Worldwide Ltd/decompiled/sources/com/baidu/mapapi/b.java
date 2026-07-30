package com.baidu.mapapi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.baidu.mapsdkplatform.comapi.util.g;
import com.baidu.platform.comapi.util.SysOSUtil;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    private Context f5356a;

    public b(Context context) {
        this.f5356a = context;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        if (network == null) {
            return;
        }
        super.onAvailable(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (network == null || networkCapabilities == null) {
            return;
        }
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (networkCapabilities.hasCapability(16)) {
            String str = networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(0) ? "CELLULAR" : networkCapabilities.hasTransport(3) ? "ETHERNET" : networkCapabilities.hasTransport(6) ? "LoWPAN" : networkCapabilities.hasTransport(4) ? "VPN" : networkCapabilities.hasTransport(5) ? "WifiAware" : "mobile";
            if (str.equals(g.f())) {
                return;
            }
            g.a(str);
            Context context = this.f5356a;
            if (context != null) {
                NetworkUtil.updateNetworkProxy(context);
            }
            NetworkUtil.updateNetworkInfo2Map();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        if (network == null) {
            return;
        }
        super.onLost(network);
        SysOSUtil.getInstance().updateNetType("mobile");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        super.onUnavailable();
        SysOSUtil.getInstance().updateNetType("mobile");
    }
}
