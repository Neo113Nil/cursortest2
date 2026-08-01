package m1;

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
    public final b f3148a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3149b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f3150c;
    public final HostnameVerifier d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3151e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3152f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f3153g;
    public final m h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3154j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        b1.d.e(str, "uriHost");
        b1.d.e(bVar, "dns");
        b1.d.e(socketFactory, "socketFactory");
        b1.d.e(bVar2, "proxyAuthenticator");
        b1.d.e(list, "protocols");
        b1.d.e(list2, "connectionSpecs");
        b1.d.e(proxySelector, "proxySelector");
        this.f3148a = bVar;
        this.f3149b = socketFactory;
        this.f3150c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.f3151e = dVar;
        this.f3152f = bVar2;
        this.f3153g = proxySelector;
        l lVar = new l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            lVar.f3209a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            lVar.f3209a = "https";
        }
        String s2 = k0.w.s(b.e(str, 0, 0, false, 7));
        if (s2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        lVar.d = s2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.d("unexpected port: ", i).toString());
        }
        lVar.f3212e = i;
        this.h = lVar.a();
        this.i = n1.b.v(list);
        this.f3154j = n1.b.v(list2);
    }

    public final boolean a(a aVar) {
        b1.d.e(aVar, "that");
        return b1.d.a(this.f3148a, aVar.f3148a) && b1.d.a(this.f3152f, aVar.f3152f) && b1.d.a(this.i, aVar.i) && b1.d.a(this.f3154j, aVar.f3154j) && b1.d.a(this.f3153g, aVar.f3153g) && b1.d.a(null, null) && b1.d.a(this.f3150c, aVar.f3150c) && b1.d.a(this.d, aVar.d) && b1.d.a(this.f3151e, aVar.f3151e) && this.h.f3219e == aVar.h.f3219e;
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
        return Objects.hashCode(this.f3151e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f3150c) + ((this.f3153g.hashCode() + ((this.f3154j.hashCode() + ((this.i.hashCode() + ((this.f3152f.hashCode() + ((this.f3148a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.h;
        sb.append(mVar.d);
        sb.append(':');
        sb.append(mVar.f3219e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f3153g);
        sb.append('}');
        return sb.toString();
    }
}
