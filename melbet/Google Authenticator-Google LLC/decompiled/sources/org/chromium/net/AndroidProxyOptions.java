package org.chromium.net;

import android.net.http.HttpEngine;
import android.os.Build;
import android.os.ext.SdkExtensions;
import defpackage.lhh;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AndroidProxyOptions {
    private AndroidProxyOptions() {
    }

    public static void apply(HttpEngine.Builder builder, ProxyOptions proxyOptions) {
        android.net.http.ProxyOptions fromProxyList;
        android.net.http.Proxy createHttpProxy;
        if (!areProxyApisEnabled()) {
            throw new UnsupportedOperationException("Proxy APIs are not supported");
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Proxy proxy : proxyOptions.getProxyList()) {
            int i2 = 1;
            if (proxy == null) {
                i = 1;
            } else {
                if (!areProxyApisEnabled()) {
                    throw new AssertionError("AndroidProxy requires the proxy APIs to be enabled");
                }
                int scheme = proxy.getScheme();
                if (!areProxyApisEnabled()) {
                    throw new AssertionError("AndroidProxy requires the proxy APIs to be enabled");
                }
                if (scheme == 0) {
                    i2 = 0;
                } else if (scheme != 1) {
                    throw new AssertionError(String.format("Unknown scheme %d", Integer.valueOf(scheme)));
                }
                createHttpProxy = android.net.http.Proxy.createHttpProxy(i2, proxy.getHost(), proxy.getPort(), proxy.getExecutor(), new lhh(proxy.getCallback()));
                arrayList.add(createHttpProxy);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        fromProxyList = android.net.http.ProxyOptions.fromProxyList(arrayList, i);
        builder.setProxyOptions(fromProxyList);
    }

    public static boolean areProxyApisEnabled() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(31);
        return extensionVersion >= 22;
    }
}
