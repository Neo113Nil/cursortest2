package G2;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f2126a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2127b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2128c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f2129d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2130e;

    /* renamed from: f, reason: collision with root package name */
    public final b f2131f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2132g;

    /* renamed from: h, reason: collision with root package name */
    public final n f2133h;

    /* renamed from: i, reason: collision with root package name */
    public final List f2134i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2135j;

    public a(String str, int i3, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        f2.j.f(str, "uriHost");
        f2.j.f(bVar, "dns");
        f2.j.f(socketFactory, "socketFactory");
        f2.j.f(bVar2, "proxyAuthenticator");
        f2.j.f(list, "protocols");
        f2.j.f(list2, "connectionSpecs");
        f2.j.f(proxySelector, "proxySelector");
        this.f2126a = bVar;
        this.f2127b = socketFactory;
        this.f2128c = sSLSocketFactory;
        this.f2129d = hostnameVerifier;
        this.f2130e = dVar;
        this.f2131f = bVar2;
        this.f2132g = proxySelector;
        m mVar = new m();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            mVar.f2209e = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            mVar.f2209e = "https";
        }
        String w02 = O2.l.w0(b.e(str, 0, 0, false, 7));
        if (w02 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        mVar.f2212h = w02;
        if (1 > i3 || i3 >= 65536) {
            throw new IllegalArgumentException(A.k.h("unexpected port: ", i3).toString());
        }
        mVar.f2207c = i3;
        this.f2133h = mVar.a();
        this.f2134i = H2.b.w(list);
        this.f2135j = H2.b.w(list2);
    }

    public final boolean a(a aVar) {
        f2.j.f(aVar, "that");
        return f2.j.a(this.f2126a, aVar.f2126a) && f2.j.a(this.f2131f, aVar.f2131f) && f2.j.a(this.f2134i, aVar.f2134i) && f2.j.a(this.f2135j, aVar.f2135j) && f2.j.a(this.f2132g, aVar.f2132g) && f2.j.a(null, null) && f2.j.a(this.f2128c, aVar.f2128c) && f2.j.a(this.f2129d, aVar.f2129d) && f2.j.a(this.f2130e, aVar.f2130e) && this.f2133h.f2219e == aVar.f2133h.f2219e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (f2.j.a(this.f2133h, aVar.f2133h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2130e) + ((Objects.hashCode(this.f2129d) + ((Objects.hashCode(this.f2128c) + ((this.f2132g.hashCode() + ((this.f2135j.hashCode() + ((this.f2134i.hashCode() + ((this.f2131f.hashCode() + ((this.f2126a.hashCode() + A.k.d(527, 31, this.f2133h.f2222h)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        n nVar = this.f2133h;
        sb.append(nVar.f2218d);
        sb.append(':');
        sb.append(nVar.f2219e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2132g);
        sb.append('}');
        return sb.toString();
    }
}
