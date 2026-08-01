package r1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final a f3558a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3559b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3560c;

    public t(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        g1.d.e(inetSocketAddress, "socketAddress");
        this.f3558a = aVar;
        this.f3559b = proxy;
        this.f3560c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (g1.d.a(tVar.f3558a, this.f3558a) && g1.d.a(tVar.f3559b, this.f3559b) && g1.d.a(tVar.f3560c, this.f3560c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3560c.hashCode() + ((this.f3559b.hashCode() + ((this.f3558a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3560c + '}';
    }
}
