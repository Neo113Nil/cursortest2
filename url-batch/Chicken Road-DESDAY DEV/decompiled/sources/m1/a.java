package m1;

import X.V;
import j0.AbstractC0143a;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f3116a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3117b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f3118c;
    public final HostnameVerifier d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3119e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3120f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f3121g;
    public final l h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3122j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        b1.d.e(str, "uriHost");
        b1.d.e(bVar, "dns");
        b1.d.e(socketFactory, "socketFactory");
        b1.d.e(bVar2, "proxyAuthenticator");
        b1.d.e(list, "protocols");
        b1.d.e(list2, "connectionSpecs");
        b1.d.e(proxySelector, "proxySelector");
        this.f3116a = bVar;
        this.f3117b = socketFactory;
        this.f3118c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.f3119e = dVar;
        this.f3120f = bVar2;
        this.f3121g = proxySelector;
        k kVar = new k();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            kVar.f3176a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            kVar.f3176a = "https";
        }
        String r2 = AbstractC0143a.r(b.e(str, 0, 0, false, 7));
        if (r2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        kVar.d = r2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.d("unexpected port: ", i).toString());
        }
        kVar.f3179e = i;
        this.h = kVar.a();
        this.i = n1.b.v(list);
        this.f3122j = n1.b.v(list2);
    }

    public final boolean a(a aVar) {
        b1.d.e(aVar, "that");
        return b1.d.a(this.f3116a, aVar.f3116a) && b1.d.a(this.f3120f, aVar.f3120f) && b1.d.a(this.i, aVar.i) && b1.d.a(this.f3122j, aVar.f3122j) && b1.d.a(this.f3121g, aVar.f3121g) && b1.d.a(null, null) && b1.d.a(this.f3118c, aVar.f3118c) && b1.d.a(this.d, aVar.d) && b1.d.a(this.f3119e, aVar.f3119e) && this.h.f3186e == aVar.h.f3186e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (b1.d.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3119e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f3118c) + ((this.f3121g.hashCode() + ((this.f3122j.hashCode() + ((this.i.hashCode() + ((this.f3120f.hashCode() + ((this.f3116a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.h;
        sb.append(lVar.d);
        sb.append(':');
        sb.append(lVar.f3186e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f3121g);
        sb.append('}');
        return sb.toString();
    }
}
