package e8;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final C4483a f37540a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f37541b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f37542c;

    public z(C4483a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(socketAddress, "socketAddress");
        this.f37540a = address;
        this.f37541b = proxy;
        this.f37542c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.h.a(zVar.f37540a, this.f37540a) && kotlin.jvm.internal.h.a(zVar.f37541b, this.f37541b) && kotlin.jvm.internal.h.a(zVar.f37542c, this.f37542c);
    }

    public final int hashCode() {
        return this.f37542c.hashCode() + ((this.f37541b.hashCode() + ((this.f37540a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C4483a c4483a = this.f37540a;
        String str = c4483a.f37351h.f37440d;
        InetSocketAddress inetSocketAddress = this.f37542c;
        InetAddress address = inetSocketAddress.getAddress();
        String b9 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : f8.b.b(hostAddress);
        if (M7.j.M(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        o oVar = c4483a.f37351h;
        if (oVar.f37441e != inetSocketAddress.getPort() || str.equals(b9)) {
            sb.append(":");
            sb.append(oVar.f37441e);
        }
        if (!str.equals(b9)) {
            if (this.f37541b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b9 == null) {
                sb.append("<unresolved>");
            } else if (M7.j.M(b9, ':')) {
                sb.append("[");
                sb.append(b9);
                sb.append("]");
            } else {
                sb.append(b9);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
