package m1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final a f3262a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3263b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3264c;

    public u(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        b1.d.e(inetSocketAddress, "socketAddress");
        this.f3262a = aVar;
        this.f3263b = proxy;
        this.f3264c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (b1.d.a(uVar.f3262a, this.f3262a) && b1.d.a(uVar.f3263b, this.f3263b) && b1.d.a(uVar.f3264c, this.f3264c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3264c.hashCode() + ((this.f3263b.hashCode() + ((this.f3262a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3264c + '}';
    }
}
