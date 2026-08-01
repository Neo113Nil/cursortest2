package com.bykv.vk.openvk.component.video.pvs.icD;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: SkipProxySelector.java */
/* loaded from: classes.dex */
class Wyp extends ProxySelector {
    private static final List<Proxy> pvs = Collections.singletonList(Proxy.NO_PROXY);
    private final int Jd;
    private final ProxySelector icD = ProxySelector.getDefault();
    private final String vG;

    private Wyp(String str, int i) {
        this.vG = str;
        this.Jd = i;
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return (this.vG.equalsIgnoreCase(uri.getHost()) && this.Jd == uri.getPort()) ? pvs : this.icD.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.icD.connectFailed(uri, socketAddress, iOException);
    }

    static void pvs(String str, int i) {
        ProxySelector.setDefault(new Wyp(str, i));
    }
}
