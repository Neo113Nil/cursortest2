package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f2514a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2515b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2516c;

    public v(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.e.e(inetSocketAddress, "socketAddress");
        this.f2514a = aVar;
        this.f2515b = proxy;
        this.f2516c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (X0.e.a(vVar.f2514a, this.f2514a) && X0.e.a(vVar.f2515b, this.f2515b) && X0.e.a(vVar.f2516c, this.f2516c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2516c.hashCode() + ((this.f2515b.hashCode() + ((this.f2514a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2516c + '}';
    }
}
