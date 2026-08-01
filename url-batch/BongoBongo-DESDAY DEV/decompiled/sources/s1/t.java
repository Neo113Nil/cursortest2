package s1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final a f3716a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3717b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3718c;

    public t(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        h1.d.e(inetSocketAddress, "socketAddress");
        this.f3716a = aVar;
        this.f3717b = proxy;
        this.f3718c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (h1.d.a(tVar.f3716a, this.f3716a) && h1.d.a(tVar.f3717b, this.f3717b) && h1.d.a(tVar.f3718c, this.f3718c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3718c.hashCode() + ((this.f3717b.hashCode() + ((this.f3716a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3718c + '}';
    }
}
