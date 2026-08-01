package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final C0167a f2627a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2628b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2629c;

    public A(C0167a c0167a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.f.e(inetSocketAddress, "socketAddress");
        this.f2627a = c0167a;
        this.f2628b = proxy;
        this.f2629c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a2 = (A) obj;
            if (X0.f.a(a2.f2627a, this.f2627a) && X0.f.a(a2.f2628b, this.f2628b) && X0.f.a(a2.f2629c, this.f2629c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2629c.hashCode() + ((this.f2628b.hashCode() + ((this.f2627a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2629c + '}';
    }
}
