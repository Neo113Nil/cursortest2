package z1;

import G1.AbstractC0001b;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f4807a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f4808b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f4809c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f4810d;
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final b f4811f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f4812g;

    /* renamed from: h, reason: collision with root package name */
    public final o f4813h;
    public final List i;
    public final List j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        j1.h.e(str, "uriHost");
        j1.h.e(bVar, "dns");
        j1.h.e(socketFactory, "socketFactory");
        j1.h.e(bVar2, "proxyAuthenticator");
        j1.h.e(list, "protocols");
        j1.h.e(list2, "connectionSpecs");
        j1.h.e(proxySelector, "proxySelector");
        this.f4807a = bVar;
        this.f4808b = socketFactory;
        this.f4809c = sSLSocketFactory;
        this.f4810d = hostnameVerifier;
        this.e = fVar;
        this.f4811f = bVar2;
        this.f4812g = proxySelector;
        n nVar = new n();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            nVar.f4868a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            nVar.f4868a = "https";
        }
        String j02 = H1.d.j0(b.e(str, 0, 0, false, 7));
        if (j02 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        nVar.f4871d = j02;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC0001b.e("unexpected port: ", i).toString());
        }
        nVar.e = i;
        this.f4813h = nVar.a();
        this.i = A1.c.v(list);
        this.j = A1.c.v(list2);
    }

    public final boolean a(a aVar) {
        j1.h.e(aVar, "that");
        return j1.h.a(this.f4807a, aVar.f4807a) && j1.h.a(this.f4811f, aVar.f4811f) && j1.h.a(this.i, aVar.i) && j1.h.a(this.j, aVar.j) && j1.h.a(this.f4812g, aVar.f4812g) && j1.h.a(null, null) && j1.h.a(this.f4809c, aVar.f4809c) && j1.h.a(this.f4810d, aVar.f4810d) && j1.h.a(this.e, aVar.e) && this.f4813h.e == aVar.f4813h.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (j1.h.a(this.f4813h, aVar.f4813h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.f4810d) + ((Objects.hashCode(this.f4809c) + ((this.f4812g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f4811f.hashCode() + ((this.f4807a.hashCode() + ((this.f4813h.f4881h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.f4813h;
        sb.append(oVar.f4878d);
        sb.append(':');
        sb.append(oVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f4812g);
        sb.append('}');
        return sb.toString();
    }
}
