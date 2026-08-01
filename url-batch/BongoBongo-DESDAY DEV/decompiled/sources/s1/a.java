package s1;

import Z.V;
import h0.d0;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f3577a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3578b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f3579c;
    public final E1.c d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3580e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3581f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f3582g;

    /* renamed from: h, reason: collision with root package name */
    public final l f3583h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3584j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, E1.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        h1.d.e(str, "uriHost");
        h1.d.e(bVar, "dns");
        h1.d.e(socketFactory, "socketFactory");
        h1.d.e(bVar2, "proxyAuthenticator");
        h1.d.e(list, "protocols");
        h1.d.e(list2, "connectionSpecs");
        h1.d.e(proxySelector, "proxySelector");
        this.f3577a = bVar;
        this.f3578b = socketFactory;
        this.f3579c = sSLSocketFactory;
        this.d = cVar;
        this.f3580e = dVar;
        this.f3581f = bVar2;
        this.f3582g = proxySelector;
        k kVar = new k();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            kVar.f3641a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            kVar.f3641a = "https";
        }
        String r2 = d0.r(b.e(str, 0, 0, false, 7));
        if (r2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        kVar.d = r2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.e("unexpected port: ", i).toString());
        }
        kVar.f3644e = i;
        this.f3583h = kVar.a();
        this.i = t1.b.v(list);
        this.f3584j = t1.b.v(list2);
    }

    public final boolean a(a aVar) {
        h1.d.e(aVar, "that");
        return h1.d.a(this.f3577a, aVar.f3577a) && h1.d.a(this.f3581f, aVar.f3581f) && h1.d.a(this.i, aVar.i) && h1.d.a(this.f3584j, aVar.f3584j) && h1.d.a(this.f3582g, aVar.f3582g) && h1.d.a(null, null) && h1.d.a(this.f3579c, aVar.f3579c) && h1.d.a(this.d, aVar.d) && h1.d.a(this.f3580e, aVar.f3580e) && this.f3583h.f3652e == aVar.f3583h.f3652e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (h1.d.a(this.f3583h, aVar.f3583h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3580e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f3579c) + ((this.f3582g.hashCode() + ((this.f3584j.hashCode() + ((this.i.hashCode() + ((this.f3581f.hashCode() + ((this.f3577a.hashCode() + ((this.f3583h.f3655h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.f3583h;
        sb.append(lVar.d);
        sb.append(':');
        sb.append(lVar.f3652e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f3582g);
        sb.append('}');
        return sb.toString();
    }
}
