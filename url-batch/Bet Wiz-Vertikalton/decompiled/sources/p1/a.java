package p1;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f3295a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3296b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f3297c;
    public final B1.c d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3298e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3299f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f3300g;
    public final m h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3301j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, B1.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        e1.d.e(str, "uriHost");
        e1.d.e(bVar, "dns");
        e1.d.e(socketFactory, "socketFactory");
        e1.d.e(bVar2, "proxyAuthenticator");
        e1.d.e(list, "protocols");
        e1.d.e(list2, "connectionSpecs");
        e1.d.e(proxySelector, "proxySelector");
        this.f3295a = bVar;
        this.f3296b = socketFactory;
        this.f3297c = sSLSocketFactory;
        this.d = cVar;
        this.f3298e = dVar;
        this.f3299f = bVar2;
        this.f3300g = proxySelector;
        l lVar = new l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            lVar.f3356a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            lVar.f3356a = "https";
        }
        String t2 = k0.k.t(b.e(str, 0, 0, false, 7));
        if (t2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        lVar.d = t2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(T0.c.d("unexpected port: ", i).toString());
        }
        lVar.f3359e = i;
        this.h = lVar.a();
        this.i = q1.b.v(list);
        this.f3301j = q1.b.v(list2);
    }

    public final boolean a(a aVar) {
        e1.d.e(aVar, "that");
        return e1.d.a(this.f3295a, aVar.f3295a) && e1.d.a(this.f3299f, aVar.f3299f) && e1.d.a(this.i, aVar.i) && e1.d.a(this.f3301j, aVar.f3301j) && e1.d.a(this.f3300g, aVar.f3300g) && e1.d.a(null, null) && e1.d.a(this.f3297c, aVar.f3297c) && e1.d.a(this.d, aVar.d) && e1.d.a(this.f3298e, aVar.f3298e) && this.h.f3366e == aVar.h.f3366e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (e1.d.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3298e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f3297c) + ((this.f3300g.hashCode() + ((this.f3301j.hashCode() + ((this.i.hashCode() + ((this.f3299f.hashCode() + ((this.f3295a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.h;
        sb.append(mVar.d);
        sb.append(':');
        sb.append(mVar.f3366e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f3300g);
        sb.append('}');
        return sb.toString();
    }
}
