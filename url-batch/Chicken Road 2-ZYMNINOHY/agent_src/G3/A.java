package G3;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final C0050a f846a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f847b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f848c;

    public A(C0050a c0050a, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.i.e(socketAddress, "socketAddress");
        this.f846a = c0050a;
        this.f847b = proxy;
        this.f848c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a3 = (A) obj;
        return kotlin.jvm.internal.i.a(a3.f846a, this.f846a) && kotlin.jvm.internal.i.a(a3.f847b, this.f847b) && kotlin.jvm.internal.i.a(a3.f848c, this.f848c);
    }

    public final int hashCode() {
        return this.f848c.hashCode() + ((this.f847b.hashCode() + ((this.f846a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f848c + '}';
    }
}
