package r1;

import h0.a0;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f3429a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3430b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f3431c;
    public final D1.c d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3432e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3433f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f3434g;
    public final l h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3435j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, D1.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        g1.d.e(str, "uriHost");
        g1.d.e(bVar, "dns");
        g1.d.e(socketFactory, "socketFactory");
        g1.d.e(bVar2, "proxyAuthenticator");
        g1.d.e(list, "protocols");
        g1.d.e(list2, "connectionSpecs");
        g1.d.e(proxySelector, "proxySelector");
        this.f3429a = bVar;
        this.f3430b = socketFactory;
        this.f3431c = sSLSocketFactory;
        this.d = cVar;
        this.f3432e = dVar;
        this.f3433f = bVar2;
        this.f3434g = proxySelector;
        k kVar = new k();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            kVar.f3489a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            kVar.f3489a = "https";
        }
        String u2 = a0.u(b.e(str, 0, 0, false, 7));
        if (u2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        kVar.d = u2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(X0.a.e("unexpected port: ", i).toString());
        }
        kVar.f3492e = i;
        this.h = kVar.a();
        this.i = s1.b.v(list);
        this.f3435j = s1.b.v(list2);
    }

    public final boolean a(a aVar) {
        g1.d.e(aVar, "that");
        return g1.d.a(this.f3429a, aVar.f3429a) && g1.d.a(this.f3433f, aVar.f3433f) && g1.d.a(this.i, aVar.i) && g1.d.a(this.f3435j, aVar.f3435j) && g1.d.a(this.f3434g, aVar.f3434g) && g1.d.a(null, null) && g1.d.a(this.f3431c, aVar.f3431c) && g1.d.a(this.d, aVar.d) && g1.d.a(this.f3432e, aVar.f3432e) && this.h.f3499e == aVar.h.f3499e;
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
        return Objects.hashCode(this.f3432e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f3431c) + ((this.f3434g.hashCode() + ((this.f3435j.hashCode() + ((this.i.hashCode() + ((this.f3433f.hashCode() + ((this.f3429a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.h;
        sb.append(lVar.d);
        sb.append(':');
        sb.append(lVar.f3499e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f3434g);
        sb.append('}');
        return sb.toString();
    }
}
