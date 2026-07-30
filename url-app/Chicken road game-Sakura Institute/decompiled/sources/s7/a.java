package s7;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f8529a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f8530b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f8531c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f8532d;

    /* renamed from: e, reason: collision with root package name */
    public final d f8533e;

    /* renamed from: f, reason: collision with root package name */
    public final b f8534f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f8535g;

    /* renamed from: h, reason: collision with root package name */
    public final l f8536h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8537i;

    /* renamed from: j, reason: collision with root package name */
    public final List f8538j;

    public a(String str, int i7, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        r6.k.f(str, "uriHost");
        r6.k.f(bVar, "dns");
        r6.k.f(socketFactory, "socketFactory");
        r6.k.f(bVar2, "proxyAuthenticator");
        r6.k.f(list, "protocols");
        r6.k.f(list2, "connectionSpecs");
        r6.k.f(proxySelector, "proxySelector");
        this.f8529a = bVar;
        this.f8530b = socketFactory;
        this.f8531c = sSLSocketFactory;
        this.f8532d = hostnameVerifier;
        this.f8533e = dVar;
        this.f8534f = bVar2;
        this.f8535g = proxySelector;
        n3.k kVar = new n3.k(1);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            kVar.f6539e = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            kVar.f6539e = "https";
        }
        String S = r4.a.S(b.e(str, 0, 0, 7));
        if (S == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        kVar.f6542h = S;
        if (1 > i7 || i7 >= 65536) {
            throw new IllegalArgumentException(a0.m.i("unexpected port: ", i7).toString());
        }
        kVar.f6536b = i7;
        this.f8536h = kVar.b();
        this.f8537i = t7.b.v(list);
        this.f8538j = t7.b.v(list2);
    }

    public final boolean a(a aVar) {
        r6.k.f(aVar, "that");
        return r6.k.a(this.f8529a, aVar.f8529a) && r6.k.a(this.f8534f, aVar.f8534f) && r6.k.a(this.f8537i, aVar.f8537i) && r6.k.a(this.f8538j, aVar.f8538j) && r6.k.a(this.f8535g, aVar.f8535g) && r6.k.a(this.f8531c, aVar.f8531c) && r6.k.a(this.f8532d, aVar.f8532d) && r6.k.a(this.f8533e, aVar.f8533e) && this.f8536h.f8612e == aVar.f8536h.f8612e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r6.k.a(this.f8536h, aVar.f8536h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f8533e) + ((Objects.hashCode(this.f8532d) + ((Objects.hashCode(this.f8531c) + ((this.f8535g.hashCode() + ((this.f8538j.hashCode() + ((this.f8537i.hashCode() + ((this.f8534f.hashCode() + ((this.f8529a.hashCode() + r6.i.a(527, 31, this.f8536h.f8615h)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.f8536h;
        sb.append(lVar.f8611d);
        sb.append(':');
        sb.append(lVar.f8612e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f8535g);
        sb.append('}');
        return sb.toString();
    }
}
