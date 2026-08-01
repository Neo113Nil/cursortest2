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
    public final b f2385a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2386b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2387c;
    public final HostnameVerifier d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2388e;

    /* renamed from: f, reason: collision with root package name */
    public final b f2389f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2390g;
    public final m h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2391j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        X0.d.e(str, "uriHost");
        X0.d.e(bVar, "dns");
        X0.d.e(socketFactory, "socketFactory");
        X0.d.e(bVar2, "proxyAuthenticator");
        X0.d.e(list, "protocols");
        X0.d.e(list2, "connectionSpecs");
        X0.d.e(proxySelector, "proxySelector");
        this.f2385a = bVar;
        this.f2386b = socketFactory;
        this.f2387c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.f2388e = dVar;
        this.f2389f = bVar2;
        this.f2390g = proxySelector;
        l lVar = new l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            lVar.f2448a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            lVar.f2448a = "https";
        }
        String k2 = p.k(b.e(str, 0, 0, false, 7));
        if (k2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        lVar.d = k2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.d("unexpected port: ", i).toString());
        }
        lVar.f2451e = i;
        this.h = lVar.a();
        this.i = j1.b.u(list);
        this.f2391j = j1.b.u(list2);
    }

    public final boolean a(a aVar) {
        X0.d.e(aVar, "that");
        return X0.d.a(this.f2385a, aVar.f2385a) && X0.d.a(this.f2389f, aVar.f2389f) && X0.d.a(this.i, aVar.i) && X0.d.a(this.f2391j, aVar.f2391j) && X0.d.a(this.f2390g, aVar.f2390g) && X0.d.a(null, null) && X0.d.a(this.f2387c, aVar.f2387c) && X0.d.a(this.d, aVar.d) && X0.d.a(this.f2388e, aVar.f2388e) && this.h.f2458e == aVar.h.f2458e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (X0.d.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2388e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f2387c) + ((this.f2390g.hashCode() + ((this.f2391j.hashCode() + ((this.i.hashCode() + ((this.f2389f.hashCode() + ((this.f2385a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.h;
        sb.append(mVar.d);
        sb.append(':');
        sb.append(mVar.f2458e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2390g);
        sb.append('}');
        return sb.toString();
    }
}
