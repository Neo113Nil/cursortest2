package T4;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final C0151a f2805a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2806b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2807c;

    public C(C0151a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(socketAddress, "socketAddress");
        this.f2805a = address;
        this.f2806b = proxy;
        this.f2807c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            C c2 = (C) obj;
            if (kotlin.jvm.internal.i.a(c2.f2805a, this.f2805a) && kotlin.jvm.internal.i.a(c2.f2806b, this.f2806b) && kotlin.jvm.internal.i.a(c2.f2807c, this.f2807c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2807c.hashCode() + ((this.f2806b.hashCode() + ((this.f2805a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C0151a c0151a = this.f2805a;
        String str = c0151a.f2824h.f2926d;
        InetSocketAddress inetSocketAddress = this.f2807c;
        InetAddress address = inetSocketAddress.getAddress();
        String b6 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : U4.b.b(hostAddress);
        if (B4.k.S(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        q qVar = c0151a.f2824h;
        if (qVar.f2927e != inetSocketAddress.getPort() || str.equals(b6)) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(qVar.f2927e);
        }
        if (!str.equals(b6)) {
            if (this.f2806b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b6 == null) {
                sb.append("<unresolved>");
            } else if (B4.k.S(b6, ':')) {
                sb.append("[");
                sb.append(b6);
                sb.append("]");
            } else {
                sb.append(b6);
            }
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
