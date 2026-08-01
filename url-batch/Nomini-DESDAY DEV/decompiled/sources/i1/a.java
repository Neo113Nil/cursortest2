package i1;

import X.V;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f2379a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2380b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2381c;
    public final HostnameVerifier d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2382e;

    /* renamed from: f, reason: collision with root package name */
    public final b f2383f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2384g;
    public final m h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2385j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        X0.e.e(str, "uriHost");
        X0.e.e(bVar, "dns");
        X0.e.e(socketFactory, "socketFactory");
        X0.e.e(bVar2, "proxyAuthenticator");
        X0.e.e(list, "protocols");
        X0.e.e(list2, "connectionSpecs");
        X0.e.e(proxySelector, "proxySelector");
        this.f2379a = bVar;
        this.f2380b = socketFactory;
        this.f2381c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.f2382e = dVar;
        this.f2383f = bVar2;
        this.f2384g = proxySelector;
        l lVar = new l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            lVar.f2442a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            lVar.f2442a = "https";
        }
        String k2 = p.k(b.e(str, 0, 0, false, 7));
        if (k2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        lVar.d = k2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.d("unexpected port: ", i).toString());
        }
        lVar.f2445e = i;
        this.h = lVar.a();
        this.i = j1.b.u(list);
        this.f2385j = j1.b.u(list2);
    }

    public final boolean a(a aVar) {
        X0.e.e(aVar, "that");
        return X0.e.a(this.f2379a, aVar.f2379a) && X0.e.a(this.f2383f, aVar.f2383f) && X0.e.a(this.i, aVar.i) && X0.e.a(this.f2385j, aVar.f2385j) && X0.e.a(this.f2384g, aVar.f2384g) && X0.e.a(null, null) && X0.e.a(this.f2381c, aVar.f2381c) && X0.e.a(this.d, aVar.d) && X0.e.a(this.f2382e, aVar.f2382e) && this.h.f2452e == aVar.h.f2452e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (X0.e.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2382e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f2381c) + ((this.f2384g.hashCode() + ((this.f2385j.hashCode() + ((this.i.hashCode() + ((this.f2383f.hashCode() + ((this.f2379a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.h;
        sb.append(mVar.d);
        sb.append(':');
        sb.append(mVar.f2452e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2384g);
        sb.append('}');
        return sb.toString();
    }
}
