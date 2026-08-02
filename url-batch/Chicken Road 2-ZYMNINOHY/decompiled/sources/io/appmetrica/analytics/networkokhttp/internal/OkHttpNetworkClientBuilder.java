package io.appmetrica.analytics.networkokhttp.internal;

import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkokhttp.impl.e;

/* loaded from: classes.dex */
public final class OkHttpNetworkClientBuilder extends NetworkClient.Builder {
    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    public NetworkClient build() {
        return new e(getSettings(), null, 2, null);
    }

    public String toString() {
        return "OkHttp Network Client Builder";
    }
}
