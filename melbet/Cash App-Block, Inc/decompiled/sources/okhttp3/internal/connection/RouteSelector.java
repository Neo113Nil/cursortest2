package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes3.dex */
public final class RouteSelector {
    public final Address address;
    public final RealCall call;
    public final boolean fastFallback;
    public List inetSocketAddresses;
    public int nextProxyIndex;
    public final ArrayList postponedRoutes;
    public final List proxies;
    public final ConnectionPool routeDatabase;

    public RouteSelector(Address address, ConnectionPool connectionPool, RealCall realCall, boolean z) {
        List immutableList;
        connectionPool.getClass();
        this.address = address;
        this.routeDatabase = connectionPool;
        this.call = realCall;
        this.fastFallback = z;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.proxies = emptyList;
        this.inetSocketAddresses = emptyList;
        this.postponedRoutes = new ArrayList();
        HttpUrl httpUrl = address.url;
        realCall.eventListener.proxySelectStart(realCall, httpUrl);
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            immutableList = _UtilJvmKt.toImmutableList(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = address.proxySelector.select(uri);
            List<Proxy> list = select;
            immutableList = (list == null || list.isEmpty()) ? _UtilJvmKt.toImmutableList(new Proxy[]{Proxy.NO_PROXY}) : _UtilJvmKt.toImmutableList(select);
        }
        this.proxies = immutableList;
        this.nextProxyIndex = 0;
        realCall.eventListener.proxySelectEnd(realCall, httpUrl, this.proxies);
    }

    public final boolean hasNext() {
        return this.nextProxyIndex < this.proxies.size() || !this.postponedRoutes.isEmpty();
    }
}
