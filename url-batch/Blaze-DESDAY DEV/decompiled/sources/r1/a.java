package r1;

import Y.V;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import k0.AbstractC0180a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f3395a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3396b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f3397c;
    public final D1.c d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3398e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3399f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f3400g;
    public final m h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3401j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, D1.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        g1.d.e(str, "uriHost");
        g1.d.e(bVar, "dns");
        g1.d.e(socketFactory, "socketFactory");
        g1.d.e(bVar2, "proxyAuthenticator");
        g1.d.e(list, "protocols");
        g1.d.e(list2, "connectionSpecs");
        g1.d.e(proxySelector, "proxySelector");
        this.f3395a = bVar;
        this.f3396b = socketFactory;
        this.f3397c = sSLSocketFactory;
        this.d = cVar;
        this.f3398e = dVar;
        this.f3399f = bVar2;
        this.f3400g = proxySelector;
        l lVar = new l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            lVar.f3456a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            lVar.f3456a = "https";
        }
        String s2 = AbstractC0180a.s(b.e(str, 0, 0, false, 7));
        if (s2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        lVar.d = s2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.e("unexpected port: ", i).toString());
        }
        lVar.f3459e = i;
        this.h = lVar.a();
        this.i = s1.b.v(list);
        this.f3401j = s1.b.v(list2);
    }

    public final boolean a(a aVar) {
        g1.d.e(aVar, "that");
        return g1.d.a(this.f3395a, aVar.f3395a) && g1.d.a(this.f3399f, aVar.f3399f) && g1.d.a(this.i, aVar.i) && g1.d.a(this.f3401j, aVar.f3401j) && g1.d.a(this.f3400g, aVar.f3400g) && g1.d.a(null, null) && g1.d.a(this.f3397c, aVar.f3397c) && g1.d.a(this.d, aVar.d) && g1.d.a(this.f3398e, aVar.f3398e) && this.h.f3466e == aVar.h.f3466e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (g1.d.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3398e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f3397c) + ((this.f3400g.hashCode() + ((this.f3401j.hashCode() + ((this.i.hashCode() + ((this.f3399f.hashCode() + ((this.f3395a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.h;
        sb.append(mVar.d);
        sb.append(':');
        sb.append(mVar.f3466e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f3400g);
        sb.append('}');
        return sb.toString();
    }
}
