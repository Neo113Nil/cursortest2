package sqip.internal;

import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class NetworkMonitor_Factory implements Factory {
    private final Provider connectivityManagerProvider;

    private NetworkMonitor_Factory(Provider provider) {
        this.connectivityManagerProvider = provider;
    }

    public static NetworkMonitor_Factory create(Provider provider) {
        return new NetworkMonitor_Factory(provider);
    }

    public static NetworkMonitor newInstance(ConnectivityManager connectivityManager) {
        return new NetworkMonitor(connectivityManager);
    }

    @Override // javax.inject.Provider
    public NetworkMonitor get() {
        return newInstance((ConnectivityManager) this.connectivityManagerProvider.get());
    }
}
