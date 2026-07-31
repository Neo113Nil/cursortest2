package G2;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f2311a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2312b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2313c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        f2.j.f(inetSocketAddress, "socketAddress");
        this.f2311a = aVar;
        this.f2312b = proxy;
        this.f2313c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (f2.j.a(wVar.f2311a, this.f2311a) && f2.j.a(wVar.f2312b, this.f2312b) && f2.j.a(wVar.f2313c, this.f2313c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2313c.hashCode() + ((this.f2312b.hashCode() + ((this.f2311a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2313c + '}';
    }
}
