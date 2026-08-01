package o1;

import Y.V;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import m.C0260a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f3250a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3251b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f3252c;
    public final A1.c d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3253e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3254f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f3255g;
    public final l h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3256j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, A1.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        d1.d.e(str, "uriHost");
        d1.d.e(bVar, "dns");
        d1.d.e(socketFactory, "socketFactory");
        d1.d.e(bVar2, "proxyAuthenticator");
        d1.d.e(list, "protocols");
        d1.d.e(list2, "connectionSpecs");
        d1.d.e(proxySelector, "proxySelector");
        this.f3250a = bVar;
        this.f3251b = socketFactory;
        this.f3252c = sSLSocketFactory;
        this.d = cVar;
        this.f3253e = dVar;
        this.f3254f = bVar2;
        this.f3255g = proxySelector;
        k kVar = new k();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            kVar.f3310a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            kVar.f3310a = "https";
        }
        String t2 = C0260a.t(b.e(str, 0, 0, false, 7));
        if (t2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        kVar.d = t2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.e("unexpected port: ", i).toString());
        }
        kVar.f3313e = i;
        this.h = kVar.a();
        this.i = p1.b.v(list);
        this.f3256j = p1.b.v(list2);
    }

    public final boolean a(a aVar) {
        d1.d.e(aVar, "that");
        return d1.d.a(this.f3250a, aVar.f3250a) && d1.d.a(this.f3254f, aVar.f3254f) && d1.d.a(this.i, aVar.i) && d1.d.a(this.f3256j, aVar.f3256j) && d1.d.a(this.f3255g, aVar.f3255g) && d1.d.a(null, null) && d1.d.a(this.f3252c, aVar.f3252c) && d1.d.a(this.d, aVar.d) && d1.d.a(this.f3253e, aVar.f3253e) && this.h.f3320e == aVar.h.f3320e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (d1.d.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3253e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f3252c) + ((this.f3255g.hashCode() + ((this.f3256j.hashCode() + ((this.i.hashCode() + ((this.f3254f.hashCode() + ((this.f3250a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.h;
        sb.append(lVar.d);
        sb.append(':');
        sb.append(lVar.f3320e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f3255g);
        sb.append('}');
        return sb.toString();
    }
}
