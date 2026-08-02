package okhttp3.internal.proxy;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes4.dex */
public final class NullProxySelector extends ProxySelector {
    public static final NullProxySelector INSTANCE = new NullProxySelector();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return CollectionsKt__CollectionsJVMKt.listOf(Proxy.NO_PROXY);
        }
        a$$ExternalSyntheticBUOutline0.m$3("uri must not be null");
        return null;
    }
}
