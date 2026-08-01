package r1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f3542a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3543b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3544c;

    public v(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        g1.d.e(inetSocketAddress, "socketAddress");
        this.f3542a = aVar;
        this.f3543b = proxy;
        this.f3544c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (g1.d.a(vVar.f3542a, this.f3542a) && g1.d.a(vVar.f3543b, this.f3543b) && g1.d.a(vVar.f3544c, this.f3544c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3544c.hashCode() + ((this.f3543b.hashCode() + ((this.f3542a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3544c + '}';
    }
}
