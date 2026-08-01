package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f2535a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2536b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2537c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.d.e(inetSocketAddress, "socketAddress");
        this.f2535a = aVar;
        this.f2536b = proxy;
        this.f2537c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (X0.d.a(wVar.f2535a, this.f2535a) && X0.d.a(wVar.f2536b, this.f2536b) && X0.d.a(wVar.f2537c, this.f2537c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2537c.hashCode() + ((this.f2536b.hashCode() + ((this.f2535a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2537c + '}';
    }
}
