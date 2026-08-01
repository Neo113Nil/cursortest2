package c3;

import androidx.fragment.app.w0;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f1008a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f1009b;
    public final SSLSocketFactory c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f1010d;

    /* renamed from: e, reason: collision with root package name */
    public final d f1011e;

    /* renamed from: f, reason: collision with root package name */
    public final b f1012f;
    public final ProxySelector g;
    public final m h;

    /* renamed from: i, reason: collision with root package name */
    public final List f1013i;

    /* renamed from: j, reason: collision with root package name */
    public final List f1014j;

    public a(String str, int i4, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        u2.c.e(str, "uriHost");
        u2.c.e(bVar, "dns");
        u2.c.e(socketFactory, "socketFactory");
        u2.c.e(bVar2, "proxyAuthenticator");
        u2.c.e(list, "protocols");
        u2.c.e(list2, "connectionSpecs");
        u2.c.e(proxySelector, "proxySelector");
        this.f1008a = bVar;
        this.f1009b = socketFactory;
        this.c = sSLSocketFactory;
        this.f1010d = hostnameVerifier;
        this.f1011e = dVar;
        this.f1012f = bVar2;
        this.g = proxySelector;
        l lVar = new l(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            lVar.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            lVar.c = "https";
        }
        String i02 = k3.d.i0(b.e(str, 0, 0, 7));
        if (i02 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        lVar.f1073f = i02;
        if (1 > i4 || i4 >= 65536) {
            throw new IllegalArgumentException(w0.e("unexpected port: ", i4).toString());
        }
        lVar.f1070b = i4;
        this.h = lVar.b();
        this.f1013i = d3.c.u(list);
        this.f1014j = d3.c.u(list2);
    }

    public final boolean a(a aVar) {
        u2.c.e(aVar, "that");
        return u2.c.a(this.f1008a, aVar.f1008a) && u2.c.a(this.f1012f, aVar.f1012f) && u2.c.a(this.f1013i, aVar.f1013i) && u2.c.a(this.f1014j, aVar.f1014j) && u2.c.a(this.g, aVar.g) && u2.c.a(this.c, aVar.c) && u2.c.a(this.f1010d, aVar.f1010d) && u2.c.a(this.f1011e, aVar.f1011e) && this.h.f1079e == aVar.h.f1079e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return u2.c.a(this.h, aVar.h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f1011e) + ((Objects.hashCode(this.f1010d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.f1014j.hashCode() + ((this.f1013i.hashCode() + ((this.f1012f.hashCode() + ((this.f1008a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.h;
        sb.append(mVar.f1078d);
        sb.append(':');
        sb.append(mVar.f1079e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
