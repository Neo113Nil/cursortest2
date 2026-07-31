package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class h2 implements g2 {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;

    public h2(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.a.a(x4.T2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.a.a(x4.U2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int httpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        this.a.D().a("loadResource", str, httpUrlConnectionGetResponseCode, httpURLConnection.getResponseMessage());
        if (r0.a(httpUrlConnectionGetResponseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream urlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
        hashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", hashMap);
        this.a.g().d(d2.Q, hashMap);
        return urlConnectionGetInputStream;
    }
}
