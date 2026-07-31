package io.opentelemetry.sdk.common.export;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ProxyOptions {
    private final ProxySelector proxySelector;

    private ProxyOptions(ProxySelector proxySelector) {
        this.proxySelector = proxySelector;
    }

    public static ProxyOptions create(ProxySelector proxySelector) {
        return new ProxyOptions(proxySelector);
    }

    public static ProxyOptions create(InetSocketAddress inetSocketAddress) {
        return new ProxyOptions(new SimpleProxySelector(new Proxy(Proxy.Type.HTTP, inetSocketAddress)));
    }

    public ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public String toString() {
        return "ProxyOptions{proxySelector=" + this.proxySelector + "}";
    }

    private static final class SimpleProxySelector extends ProxySelector {
        private final List<Proxy> proxyList;

        @Override // java.net.ProxySelector
        public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        }

        private SimpleProxySelector(Proxy proxy) {
            this.proxyList = Collections.singletonList(proxy);
        }

        @Override // java.net.ProxySelector
        public List<Proxy> select(URI uri) {
            return this.proxyList;
        }

        public String toString() {
            return "SimpleProxySelector{proxy=" + this.proxyList.get(0).toString() + "}";
        }
    }
}
