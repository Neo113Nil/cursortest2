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
    public final b f4626a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f4627b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f4628c;
    public final HostnameVerifier d;

    /* renamed from: e, reason: collision with root package name */
    public final d f4629e;

    /* renamed from: f, reason: collision with root package name */
    public final b f4630f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f4631g;
    public final l h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f4632j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        k1.e.e(str, "uriHost");
        k1.e.e(bVar, "dns");
        k1.e.e(socketFactory, "socketFactory");
        k1.e.e(bVar2, "proxyAuthenticator");
        k1.e.e(list, "protocols");
        k1.e.e(list2, "connectionSpecs");
        k1.e.e(proxySelector, "proxySelector");
        this.f4626a = bVar;
        this.f4627b = socketFactory;
        this.f4628c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.f4629e = dVar;
        this.f4630f = bVar2;
        this.f4631g = proxySelector;
        k kVar = new k();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            kVar.f4686a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            kVar.f4686a = "https";
        }
        String u02 = H1.d.u0(b.e(str, 0, 0, false, 7));
        if (u02 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        kVar.d = u02;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC0001b.f("unexpected port: ", i).toString());
        }
        kVar.f4689e = i;
        this.h = kVar.a();
        this.i = A1.c.v(list);
        this.f4632j = A1.c.v(list2);
    }

    public final boolean a(a aVar) {
        k1.e.e(aVar, "that");
        return k1.e.a(this.f4626a, aVar.f4626a) && k1.e.a(this.f4630f, aVar.f4630f) && k1.e.a(this.i, aVar.i) && k1.e.a(this.f4632j, aVar.f4632j) && k1.e.a(this.f4631g, aVar.f4631g) && k1.e.a(null, null) && k1.e.a(this.f4628c, aVar.f4628c) && k1.e.a(this.d, aVar.d) && k1.e.a(this.f4629e, aVar.f4629e) && this.h.f4696e == aVar.h.f4696e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (k1.e.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f4629e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f4628c) + ((this.f4631g.hashCode() + ((this.f4632j.hashCode() + ((this.i.hashCode() + ((this.f4630f.hashCode() + ((this.f4626a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.h;
        sb.append(lVar.d);
        sb.append(':');
        sb.append(lVar.f4696e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f4631g);
        sb.append('}');
        return sb.toString();
    }
}
