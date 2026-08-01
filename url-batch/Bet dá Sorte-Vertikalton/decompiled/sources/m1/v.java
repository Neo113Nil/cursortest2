package m1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f3295a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f3296b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3297c;

    public v(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        b1.d.e(inetSocketAddress, "socketAddress");
        this.f3295a = aVar;
        this.f3296b = proxy;
        this.f3297c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (b1.d.a(vVar.f3295a, this.f3295a) && b1.d.a(vVar.f3296b, this.f3296b) && b1.d.a(vVar.f3297c, this.f3297c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3297c.hashCode() + ((this.f3296b.hashCode() + ((this.f3295a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3297c + '}';
    }
}
