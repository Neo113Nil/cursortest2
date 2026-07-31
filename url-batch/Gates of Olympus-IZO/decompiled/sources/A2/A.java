package A2;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final C0002a f23a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f24b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f25c;

    public A(C0002a c0002a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Z1.i.f(inetSocketAddress, "socketAddress");
        this.f23a = c0002a;
        this.f24b = proxy;
        this.f25c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a3 = (A) obj;
            if (Z1.i.a(a3.f23a, this.f23a) && Z1.i.a(a3.f24b, this.f24b) && Z1.i.a(a3.f25c, this.f25c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f25c.hashCode() + ((this.f24b.hashCode() + ((this.f23a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f25c + '}';
    }
}
