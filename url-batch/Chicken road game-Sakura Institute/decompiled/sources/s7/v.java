package s7;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f8698a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f8699b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f8700c;

    public v(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        r6.k.f(inetSocketAddress, "socketAddress");
        this.f8698a = aVar;
        this.f8699b = proxy;
        this.f8700c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return r6.k.a(vVar.f8698a, this.f8698a) && r6.k.a(vVar.f8699b, this.f8699b) && r6.k.a(vVar.f8700c, this.f8700c);
    }

    public final int hashCode() {
        return this.f8700c.hashCode() + ((this.f8699b.hashCode() + ((this.f8698a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f8700c + '}';
    }
}
