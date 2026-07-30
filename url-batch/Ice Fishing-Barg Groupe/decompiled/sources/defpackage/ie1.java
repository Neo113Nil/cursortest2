package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ie1 extends ProxySelector {
    public static final ie1 PxuCJdSBwIXG = new ie1();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return fx1.jJwa0q7P5wHq(Proxy.NO_PROXY);
        }
        u9.XL4ISE6Oc65B("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
