package b;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: Route.java */
/* loaded from: classes.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    final a f2064a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f2065b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f2066c;

    public ae(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f2064a = aVar;
        this.f2065b = proxy;
        this.f2066c = inetSocketAddress;
    }

    public a a() {
        return this.f2064a;
    }

    public Proxy b() {
        return this.f2065b;
    }

    public InetSocketAddress c() {
        return this.f2066c;
    }

    public boolean d() {
        return this.f2064a.i != null && this.f2065b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return this.f2064a.equals(aeVar.f2064a) && this.f2065b.equals(aeVar.f2065b) && this.f2066c.equals(aeVar.f2066c);
    }

    public int hashCode() {
        return ((((527 + this.f2064a.hashCode()) * 31) + this.f2065b.hashCode()) * 31) + this.f2066c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f2066c + "}";
    }
}
