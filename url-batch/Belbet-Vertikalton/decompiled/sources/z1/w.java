package z1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f4954a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f4955b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f4956c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        j1.h.e(inetSocketAddress, "socketAddress");
        this.f4954a = aVar;
        this.f4955b = proxy;
        this.f4956c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (j1.h.a(wVar.f4954a, this.f4954a) && j1.h.a(wVar.f4955b, this.f4955b) && j1.h.a(wVar.f4956c, this.f4956c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4956c.hashCode() + ((this.f4955b.hashCode() + ((this.f4954a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f4956c + '}';
    }
}
