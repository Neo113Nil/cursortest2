package k1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f2910a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2911b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2912c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Z0.d.e(inetSocketAddress, "socketAddress");
        this.f2910a = aVar;
        this.f2911b = proxy;
        this.f2912c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (Z0.d.a(wVar.f2910a, this.f2910a) && Z0.d.a(wVar.f2911b, this.f2911b) && Z0.d.a(wVar.f2912c, this.f2912c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2912c.hashCode() + ((this.f2911b.hashCode() + ((this.f2910a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2912c + '}';
    }
}
