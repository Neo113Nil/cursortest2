package o1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final a f3396a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3397b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3398c;

    public u(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        d1.d.e(inetSocketAddress, "socketAddress");
        this.f3396a = aVar;
        this.f3397b = proxy;
        this.f3398c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (d1.d.a(uVar.f3396a, this.f3396a) && d1.d.a(uVar.f3397b, this.f3397b) && d1.d.a(uVar.f3398c, this.f3398c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3398c.hashCode() + ((this.f3397b.hashCode() + ((this.f3396a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3398c + '}';
    }
}
