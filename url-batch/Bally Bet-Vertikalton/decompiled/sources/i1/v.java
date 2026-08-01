package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f2519a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2520b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2521c;

    public v(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.d.e(inetSocketAddress, "socketAddress");
        this.f2519a = aVar;
        this.f2520b = proxy;
        this.f2521c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (X0.d.a(vVar.f2519a, this.f2519a) && X0.d.a(vVar.f2520b, this.f2520b) && X0.d.a(vVar.f2521c, this.f2521c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2521c.hashCode() + ((this.f2520b.hashCode() + ((this.f2519a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2521c + '}';
    }
}
