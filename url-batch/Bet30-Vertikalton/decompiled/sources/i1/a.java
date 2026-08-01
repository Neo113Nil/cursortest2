package i1;

import X.V;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f2384a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2385b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2386c;
    public final u1.c d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2387e;

    /* renamed from: f, reason: collision with root package name */
    public final b f2388f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2389g;
    public final m h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2390j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, u1.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        X0.d.e(str, "uriHost");
        X0.d.e(bVar, "dns");
        X0.d.e(socketFactory, "socketFactory");
        X0.d.e(bVar2, "proxyAuthenticator");
        X0.d.e(list, "protocols");
        X0.d.e(list2, "connectionSpecs");
        X0.d.e(proxySelector, "proxySelector");
        this.f2384a = bVar;
        this.f2385b = socketFactory;
        this.f2386c = sSLSocketFactory;
        this.d = cVar;
        this.f2387e = dVar;
        this.f2388f = bVar2;
        this.f2389g = proxySelector;
        l lVar = new l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            lVar.f2447a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            lVar.f2447a = "https";
        }
        String k2 = q.k(b.e(str, 0, 0, false, 7));
        if (k2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        lVar.d = k2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.d("unexpected port: ", i).toString());
        }
        lVar.f2450e = i;
        this.h = lVar.a();
        this.i = j1.b.u(list);
        this.f2390j = j1.b.u(list2);
    }

    public final boolean a(a aVar) {
        X0.d.e(aVar, "that");
        return X0.d.a(this.f2384a, aVar.f2384a) && X0.d.a(this.f2388f, aVar.f2388f) && X0.d.a(this.i, aVar.i) && X0.d.a(this.f2390j, aVar.f2390j) && X0.d.a(this.f2389g, aVar.f2389g) && X0.d.a(null, null) && X0.d.a(this.f2386c, aVar.f2386c) && X0.d.a(this.d, aVar.d) && X0.d.a(this.f2387e, aVar.f2387e) && this.h.f2457e == aVar.h.f2457e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (X0.d.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2387e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f2386c) + ((this.f2389g.hashCode() + ((this.f2390j.hashCode() + ((this.i.hashCode() + ((this.f2388f.hashCode() + ((this.f2384a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.h;
        sb.append(mVar.d);
        sb.append(':');
        sb.append(mVar.f2457e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2389g);
        sb.append('}');
        return sb.toString();
    }
}
