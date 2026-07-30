package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ht1 extends ProxySelector {
    public static final ht1 a = new ht1();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return pv.c(Proxy.NO_PROXY);
        }
        lh.e("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
