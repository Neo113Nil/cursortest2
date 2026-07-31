package A2;

import H2.AbstractC0080b;
import a.AbstractC0157a;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: A2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002a {

    /* renamed from: a, reason: collision with root package name */
    public final C0003b f33a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f34b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f35c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f36d;

    /* renamed from: e, reason: collision with root package name */
    public final d f37e;

    /* renamed from: f, reason: collision with root package name */
    public final C0003b f38f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f39g;

    /* renamed from: h, reason: collision with root package name */
    public final q f40h;

    /* renamed from: i, reason: collision with root package name */
    public final List f41i;

    /* renamed from: j, reason: collision with root package name */
    public final List f42j;

    public C0002a(String str, int i3, C0003b c0003b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, C0003b c0003b2, List list, List list2, ProxySelector proxySelector) {
        Z1.i.f(str, "uriHost");
        Z1.i.f(c0003b, "dns");
        Z1.i.f(socketFactory, "socketFactory");
        Z1.i.f(c0003b2, "proxyAuthenticator");
        Z1.i.f(list, "protocols");
        Z1.i.f(list2, "connectionSpecs");
        Z1.i.f(proxySelector, "proxySelector");
        this.f33a = c0003b;
        this.f34b = socketFactory;
        this.f35c = sSLSocketFactory;
        this.f36d = hostnameVerifier;
        this.f37e = dVar;
        this.f38f = c0003b2;
        this.f39g = proxySelector;
        p pVar = new p();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            pVar.f120a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            pVar.f120a = "https";
        }
        String X2 = AbstractC0157a.X(C0003b.e(str, 0, 0, false, 7));
        if (X2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        pVar.f123d = X2;
        if (1 > i3 || i3 >= 65536) {
            throw new IllegalArgumentException(AbstractC0080b.h("unexpected port: ", i3).toString());
        }
        pVar.f124e = i3;
        this.f40h = pVar.a();
        this.f41i = B2.c.w(list);
        this.f42j = B2.c.w(list2);
    }

    public final boolean a(C0002a c0002a) {
        Z1.i.f(c0002a, "that");
        return Z1.i.a(this.f33a, c0002a.f33a) && Z1.i.a(this.f38f, c0002a.f38f) && Z1.i.a(this.f41i, c0002a.f41i) && Z1.i.a(this.f42j, c0002a.f42j) && Z1.i.a(this.f39g, c0002a.f39g) && Z1.i.a(null, null) && Z1.i.a(this.f35c, c0002a.f35c) && Z1.i.a(this.f36d, c0002a.f36d) && Z1.i.a(this.f37e, c0002a.f37e) && this.f40h.f133e == c0002a.f40h.f133e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0002a) {
            C0002a c0002a = (C0002a) obj;
            if (Z1.i.a(this.f40h, c0002a.f40h) && a(c0002a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37e) + ((Objects.hashCode(this.f36d) + ((Objects.hashCode(this.f35c) + ((this.f39g.hashCode() + ((this.f42j.hashCode() + ((this.f41i.hashCode() + ((this.f38f.hashCode() + ((this.f33a.hashCode() + AbstractC0080b.e(527, 31, this.f40h.f136h)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        q qVar = this.f40h;
        sb.append(qVar.f132d);
        sb.append(':');
        sb.append(qVar.f133e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f39g);
        sb.append('}');
        return sb.toString();
    }
}
