package t3;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f3533a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3534b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3535c;

    public v(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        i3.d.e(inetSocketAddress, "socketAddress");
        this.f3533a = aVar;
        this.f3534b = proxy;
        this.f3535c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i3.d.a(vVar.f3533a, this.f3533a) && i3.d.a(vVar.f3534b, this.f3534b) && i3.d.a(vVar.f3535c, this.f3535c);
    }

    public final int hashCode() {
        return this.f3535c.hashCode() + ((this.f3534b.hashCode() + ((this.f3533a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3535c + '}';
    }
}
