package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f2513a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2514b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2515c;

    public v(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.e.e(inetSocketAddress, "socketAddress");
        this.f2513a = aVar;
        this.f2514b = proxy;
        this.f2515c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (X0.e.a(vVar.f2513a, this.f2513a) && X0.e.a(vVar.f2514b, this.f2514b) && X0.e.a(vVar.f2515c, this.f2515c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2515c.hashCode() + ((this.f2514b.hashCode() + ((this.f2513a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2515c + '}';
    }
}
