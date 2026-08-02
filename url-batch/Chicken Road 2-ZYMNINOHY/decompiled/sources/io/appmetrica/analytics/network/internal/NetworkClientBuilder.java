package io.appmetrica.analytics.network.internal;

import android.os.Bundle;
import d3.g;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class NetworkClientBuilder extends NetworkClient.Builder {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [io.appmetrica.analytics.networkapi.NetworkClient$Builder] */
    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    public NetworkClient build() {
        NetworkClientSettings settings = getSettings();
        Bundle applicationMetaData = NetworkClientServiceLocator.getInstance().getApplicationMetaData();
        c cVar = null;
        ArrayList T4 = g.T(new String[]{applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.network.custom") : null, "io.appmetrica.analytics.networkokhttp.internal.OkHttpNetworkClientBuilder", "io.appmetrica.analytics.networklegacy.internal.LegacyNetworkClientBuilder"});
        int size = T4.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            Object obj = T4.get(i4);
            i4++;
            ?? r6 = (NetworkClient.Builder) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) obj, NetworkClient.Builder.class);
            if (r6 != 0) {
                cVar = r6;
                break;
            }
        }
        if (cVar == null) {
            cVar = new c();
        }
        PublicLogger.Companion.getAnonymousInstance().info("Created " + cVar, new Object[0]);
        return cVar.withSettings(settings).build();
    }
}
