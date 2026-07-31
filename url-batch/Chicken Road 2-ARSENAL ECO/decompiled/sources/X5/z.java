package X5;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final C0217a f3079a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3080b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3081c;

    public z(C0217a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(socketAddress, "socketAddress");
        this.f3079a = address;
        this.f3080b = proxy;
        this.f3081c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.i.a(zVar.f3079a, this.f3079a) && kotlin.jvm.internal.i.a(zVar.f3080b, this.f3080b) && kotlin.jvm.internal.i.a(zVar.f3081c, this.f3081c);
    }

    public final int hashCode() {
        return this.f3081c.hashCode() + ((this.f3080b.hashCode() + ((this.f3079a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C0217a c0217a = this.f3079a;
        o oVar = c0217a.f2885h;
        o oVar2 = c0217a.f2885h;
        String str = oVar.f2977d;
        InetSocketAddress inetSocketAddress = this.f3081c;
        InetAddress address = inetSocketAddress.getAddress();
        String b7 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : Y5.b.b(hostAddress);
        if (F5.j.M(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (oVar2.f2978e != inetSocketAddress.getPort() || str.equals(b7)) {
            sb.append(":");
            sb.append(oVar2.f2978e);
        }
        if (!str.equals(b7)) {
            if (this.f3080b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b7 == null) {
                sb.append("<unresolved>");
            } else if (F5.j.M(b7, ':')) {
                sb.append("[");
                sb.append(b7);
                sb.append("]");
            } else {
                sb.append(b7);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
