package z1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final a f4769a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f4770b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f4771c;

    public t(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        k1.e.e(inetSocketAddress, "socketAddress");
        this.f4769a = aVar;
        this.f4770b = proxy;
        this.f4771c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (k1.e.a(tVar.f4769a, this.f4769a) && k1.e.a(tVar.f4770b, this.f4770b) && k1.e.a(tVar.f4771c, this.f4771c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4771c.hashCode() + ((this.f4770b.hashCode() + ((this.f4769a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f4771c + '}';
    }
}
