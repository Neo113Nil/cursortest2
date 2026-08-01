package p1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f3442a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3443b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3444c;

    public v(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        e1.d.e(inetSocketAddress, "socketAddress");
        this.f3442a = aVar;
        this.f3443b = proxy;
        this.f3444c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (e1.d.a(vVar.f3442a, this.f3442a) && e1.d.a(vVar.f3443b, this.f3443b) && e1.d.a(vVar.f3444c, this.f3444c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3444c.hashCode() + ((this.f3443b.hashCode() + ((this.f3442a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3444c + '}';
    }
}
