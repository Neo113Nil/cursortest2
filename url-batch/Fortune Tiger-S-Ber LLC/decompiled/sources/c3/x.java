package c3;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final a f1153a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f1154b;
    public final InetSocketAddress c;

    public x(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        u2.c.e(inetSocketAddress, "socketAddress");
        this.f1153a = aVar;
        this.f1154b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return u2.c.a(xVar.f1153a, this.f1153a) && u2.c.a(xVar.f1154b, this.f1154b) && u2.c.a(xVar.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f1154b.hashCode() + ((this.f1153a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
