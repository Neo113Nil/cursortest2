package t3;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o2.b0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f3394a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3395b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f3396c;
    public final HostnameVerifier d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3397e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3398f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f3399g;
    public final k h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3400j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, f4.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        i3.d.e(str, "uriHost");
        i3.d.e(bVar, "dns");
        i3.d.e(socketFactory, "socketFactory");
        i3.d.e(bVar2, "proxyAuthenticator");
        i3.d.e(list, "protocols");
        i3.d.e(list2, "connectionSpecs");
        i3.d.e(proxySelector, "proxySelector");
        this.f3394a = bVar;
        this.f3395b = socketFactory;
        this.f3396c = sSLSocketFactory;
        this.d = cVar;
        this.f3397e = dVar;
        this.f3398f = bVar2;
        this.f3399g = proxySelector;
        b0 b0Var = new b0(1);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            b0Var.f2922c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            b0Var.f2922c = "https";
        }
        String z4 = s.a.z(b.e(str, 0, 0, 7));
        if (z4 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        b0Var.f2924f = z4;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(a4.b.f("unexpected port: ", i).toString());
        }
        b0Var.f2921b = i;
        this.h = b0Var.c();
        this.i = u3.b.u(list);
        this.f3400j = u3.b.u(list2);
    }

    public final boolean a(a aVar) {
        i3.d.e(aVar, "that");
        return i3.d.a(this.f3394a, aVar.f3394a) && i3.d.a(this.f3398f, aVar.f3398f) && i3.d.a(this.i, aVar.i) && i3.d.a(this.f3400j, aVar.f3400j) && i3.d.a(this.f3399g, aVar.f3399g) && i3.d.a(this.f3396c, aVar.f3396c) && i3.d.a(this.d, aVar.d) && i3.d.a(this.f3397e, aVar.f3397e) && this.h.f3458e == aVar.h.f3458e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i3.d.a(this.h, aVar.h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3397e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f3396c) + ((this.f3399g.hashCode() + ((this.f3400j.hashCode() + ((this.i.hashCode() + ((this.f3398f.hashCode() + ((this.f3394a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        k kVar = this.h;
        sb.append(kVar.d);
        sb.append(':');
        sb.append(kVar.f3458e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f3399g);
        sb.append('}');
        return sb.toString();
    }
}
