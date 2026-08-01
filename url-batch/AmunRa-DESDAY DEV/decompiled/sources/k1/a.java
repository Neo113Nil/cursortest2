package k1;

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
    public final b f2761a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2762b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2763c;
    public final HostnameVerifier d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2764e;

    /* renamed from: f, reason: collision with root package name */
    public final b f2765f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2766g;
    public final n h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2767j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e eVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        Z0.d.e(str, "uriHost");
        Z0.d.e(bVar, "dns");
        Z0.d.e(socketFactory, "socketFactory");
        Z0.d.e(bVar2, "proxyAuthenticator");
        Z0.d.e(list, "protocols");
        Z0.d.e(list2, "connectionSpecs");
        Z0.d.e(proxySelector, "proxySelector");
        this.f2761a = bVar;
        this.f2762b = socketFactory;
        this.f2763c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.f2764e = eVar;
        this.f2765f = bVar2;
        this.f2766g = proxySelector;
        m mVar = new m();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            mVar.f2824a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            mVar.f2824a = "https";
        }
        String y2 = c.y(b.e(str, 0, 0, false, 7));
        if (y2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        mVar.d = y2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.d("unexpected port: ", i).toString());
        }
        mVar.f2827e = i;
        this.h = mVar.a();
        this.i = l1.b.v(list);
        this.f2767j = l1.b.v(list2);
    }

    public final boolean a(a aVar) {
        Z0.d.e(aVar, "that");
        return Z0.d.a(this.f2761a, aVar.f2761a) && Z0.d.a(this.f2765f, aVar.f2765f) && Z0.d.a(this.i, aVar.i) && Z0.d.a(this.f2767j, aVar.f2767j) && Z0.d.a(this.f2766g, aVar.f2766g) && Z0.d.a(null, null) && Z0.d.a(this.f2763c, aVar.f2763c) && Z0.d.a(this.d, aVar.d) && Z0.d.a(this.f2764e, aVar.f2764e) && this.h.f2834e == aVar.h.f2834e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Z0.d.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2764e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f2763c) + ((this.f2766g.hashCode() + ((this.f2767j.hashCode() + ((this.i.hashCode() + ((this.f2765f.hashCode() + ((this.f2761a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        n nVar = this.h;
        sb.append(nVar.d);
        sb.append(':');
        sb.append(nVar.f2834e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2766g);
        sb.append('}');
        return sb.toString();
    }
}
