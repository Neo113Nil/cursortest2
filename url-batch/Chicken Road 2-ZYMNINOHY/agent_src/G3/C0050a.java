package G3;

import E.AbstractC0005f;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: G3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050a {

    /* renamed from: a, reason: collision with root package name */
    public final C0051b f856a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f857b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f858c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f859d;

    /* renamed from: e, reason: collision with root package name */
    public final e f860e;

    /* renamed from: f, reason: collision with root package name */
    public final C0051b f861f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f862g;

    /* renamed from: h, reason: collision with root package name */
    public final p f863h;

    /* renamed from: i, reason: collision with root package name */
    public final List f864i;

    /* renamed from: j, reason: collision with root package name */
    public final List f865j;

    public C0050a(String uriHost, int i4, C0051b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e eVar, C0051b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.i.e(uriHost, "uriHost");
        kotlin.jvm.internal.i.e(dns, "dns");
        kotlin.jvm.internal.i.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.i.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.i.e(protocols, "protocols");
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.i.e(proxySelector, "proxySelector");
        this.f856a = dns;
        this.f857b = socketFactory;
        this.f858c = sSLSocketFactory;
        this.f859d = hostnameVerifier;
        this.f860e = eVar;
        this.f861f = proxyAuthenticator;
        this.f862g = proxySelector;
        o oVar = new o();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            oVar.f938a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.h(str, "unexpected scheme: "));
            }
            oVar.f938a = "https";
        }
        String x4 = O3.l.x(C0051b.f(uriHost, 0, 0, 7));
        if (x4 == null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(uriHost, "unexpected host: "));
        }
        oVar.f941d = x4;
        if (1 > i4 || i4 >= 65536) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(Integer.valueOf(i4), "unexpected port: ").toString());
        }
        oVar.f942e = i4;
        this.f863h = oVar.a();
        this.f864i = H3.b.u(protocols);
        this.f865j = H3.b.u(connectionSpecs);
    }

    public final boolean a(C0050a that) {
        kotlin.jvm.internal.i.e(that, "that");
        return kotlin.jvm.internal.i.a(this.f856a, that.f856a) && kotlin.jvm.internal.i.a(this.f861f, that.f861f) && kotlin.jvm.internal.i.a(this.f864i, that.f864i) && kotlin.jvm.internal.i.a(this.f865j, that.f865j) && kotlin.jvm.internal.i.a(this.f862g, that.f862g) && kotlin.jvm.internal.i.a(this.f858c, that.f858c) && kotlin.jvm.internal.i.a(this.f859d, that.f859d) && kotlin.jvm.internal.i.a(this.f860e, that.f860e) && this.f863h.f951e == that.f863h.f951e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0050a)) {
            return false;
        }
        C0050a c0050a = (C0050a) obj;
        return kotlin.jvm.internal.i.a(this.f863h, c0050a.f863h) && a(c0050a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f860e) + ((Objects.hashCode(this.f859d) + ((Objects.hashCode(this.f858c) + ((this.f862g.hashCode() + ((this.f865j.hashCode() + ((this.f864i.hashCode() + ((this.f861f.hashCode() + ((this.f856a.hashCode() + AbstractC0005f.f(527, 31, this.f863h.f954h)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        p pVar = this.f863h;
        sb.append(pVar.f950d);
        sb.append(':');
        sb.append(pVar.f951e);
        sb.append(", ");
        sb.append(kotlin.jvm.internal.i.h(this.f862g, "proxySelector="));
        sb.append('}');
        return sb.toString();
    }
}
