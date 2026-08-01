package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final C0166a f2623a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2624b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2625c;

    public A(C0166a c0166a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.f.e(inetSocketAddress, "socketAddress");
        this.f2623a = c0166a;
        this.f2624b = proxy;
        this.f2625c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a2 = (A) obj;
            if (X0.f.a(a2.f2623a, this.f2623a) && X0.f.a(a2.f2624b, this.f2624b) && X0.f.a(a2.f2625c, this.f2625c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2625c.hashCode() + ((this.f2624b.hashCode() + ((this.f2623a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2625c + '}';
    }
}
