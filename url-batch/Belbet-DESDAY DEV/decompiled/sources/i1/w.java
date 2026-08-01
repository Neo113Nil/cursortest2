package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f2536a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2537b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2538c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.d.e(inetSocketAddress, "socketAddress");
        this.f2536a = aVar;
        this.f2537b = proxy;
        this.f2538c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (X0.d.a(wVar.f2536a, this.f2536a) && X0.d.a(wVar.f2537b, this.f2537b) && X0.d.a(wVar.f2538c, this.f2538c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2538c.hashCode() + ((this.f2537b.hashCode() + ((this.f2536a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2538c + '}';
    }
}
