package com.adjust.sdk.network;

import com.adjust.sdk.network.UtilNetworking;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnalyticsPhantomHyperionBlaze2174 implements UtilNetworking.IConnectionOptions {
    @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
    public final void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i) {
        httpsURLConnection.setRequestProperty("Client-SDK", str);
        httpsURLConnection.setConnectTimeout(i);
        httpsURLConnection.setReadTimeout(i);
    }
}
