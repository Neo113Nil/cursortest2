package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f2531a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2532b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2533c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.e.e(inetSocketAddress, "socketAddress");
        this.f2531a = aVar;
        this.f2532b = proxy;
        this.f2533c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (X0.e.a(wVar.f2531a, this.f2531a) && X0.e.a(wVar.f2532b, this.f2532b) && X0.e.a(wVar.f2533c, this.f2533c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2533c.hashCode() + ((this.f2532b.hashCode() + ((this.f2531a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2533c + '}';
    }
}
