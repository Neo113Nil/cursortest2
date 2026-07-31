package h1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f36720a;

    /* renamed from: b, reason: collision with root package name */
    public int f36721b;

    /* renamed from: c, reason: collision with root package name */
    public final U f36722c;

    public V(Context context) {
        NetworkCapabilities networkCapabilities;
        int i4 = 0;
        this.f36721b = 0;
        U u4 = new U(this);
        this.f36722c = u4;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f36720a = connectivityManager;
        if (connectivityManager == null) {
            T.a(6, "NetworkConnectivity: ConnectivityManager not found");
            return;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            i4 = networkCapabilities.hasTransport(0) ? 1 : 2;
        }
        this.f36721b = i4;
        connectivityManager.registerDefaultNetworkCallback(u4);
    }

    public final void a() {
        ConnectivityManager connectivityManager = this.f36720a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.f36722c);
    }
}
