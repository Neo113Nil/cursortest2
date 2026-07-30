package D6;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final C0093a f444a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f445b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f446c;

    public F(C0093a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f444a = address;
        this.f445b = proxy;
        this.f446c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f7 = (F) obj;
        return Intrinsics.a(f7.f444a, this.f444a) && Intrinsics.a(f7.f445b, this.f445b) && Intrinsics.a(f7.f446c, this.f446c);
    }

    public final int hashCode() {
        return this.f446c.hashCode() + ((this.f445b.hashCode() + ((this.f444a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C0093a c0093a = this.f444a;
        s sVar = c0093a.f463h;
        s sVar2 = c0093a.f463h;
        String str = sVar.f565d;
        InetSocketAddress inetSocketAddress = this.f446c;
        InetAddress address = inetSocketAddress.getAddress();
        String b7 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : E6.b.b(hostAddress);
        if (StringsKt.v(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (sVar2.f566e != inetSocketAddress.getPort() || str.equals(b7)) {
            sb.append(":");
            sb.append(sVar2.f566e);
        }
        if (!str.equals(b7)) {
            if (this.f445b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b7 == null) {
                sb.append("<unresolved>");
            } else if (StringsKt.v(b7, ':')) {
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
