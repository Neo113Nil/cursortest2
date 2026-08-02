package okhttp3;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal._HostnamesCommonKt;

/* loaded from: classes3.dex */
public final class Route {
    public final Address address;
    public final Proxy proxy;
    public final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return route.address.equals(this.address) && route.proxy.equals(this.proxy) && Intrinsics.areEqual(route.socketAddress, this.socketAddress);
    }

    public final int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        HttpUrl httpUrl = this.address.url;
        String str = httpUrl.host;
        InetSocketAddress inetSocketAddress = this.socketAddress;
        InetAddress address = inetSocketAddress.getAddress();
        String canonicalHost = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : _HostnamesCommonKt.toCanonicalHost(hostAddress);
        if (StringsKt.contains((CharSequence) str, ':', false)) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (httpUrl.port != inetSocketAddress.getPort() || str.equals(canonicalHost)) {
            sb.append(":");
            sb.append(httpUrl.port);
        }
        if (!str.equals(canonicalHost)) {
            if (this.proxy.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (canonicalHost == null) {
                sb.append("<unresolved>");
            } else if (StringsKt.contains((CharSequence) canonicalHost, ':', false)) {
                sb.append("[");
                sb.append(canonicalHost);
                sb.append("]");
            } else {
                sb.append(canonicalHost);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
