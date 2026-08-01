package i1;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167a {

    /* renamed from: a, reason: collision with root package name */
    public final C0168b f2637a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2638b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2639c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f2640d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2641e;

    /* renamed from: f, reason: collision with root package name */
    public final C0168b f2642f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2643g;
    public final p h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2644j;

    public C0167a(String str, int i, C0168b c0168b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, C0168b c0168b2, List list, List list2, ProxySelector proxySelector) {
        X0.f.e(str, "uriHost");
        X0.f.e(c0168b, "dns");
        X0.f.e(socketFactory, "socketFactory");
        X0.f.e(c0168b2, "proxyAuthenticator");
        X0.f.e(list, "protocols");
        X0.f.e(list2, "connectionSpecs");
        X0.f.e(proxySelector, "proxySelector");
        this.f2637a = c0168b;
        this.f2638b = socketFactory;
        this.f2639c = sSLSocketFactory;
        this.f2640d = hostnameVerifier;
        this.f2641e = fVar;
        this.f2642f = c0168b2;
        this.f2643g = proxySelector;
        o oVar = new o();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            oVar.f2708a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            oVar.f2708a = "https";
        }
        String p2 = m.p(C0168b.e(str, 0, 0, false, 7));
        if (p2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        oVar.f2711d = p2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(X0.e.d("unexpected port: ", i).toString());
        }
        oVar.f2712e = i;
        this.h = oVar.a();
        this.i = j1.b.v(list);
        this.f2644j = j1.b.v(list2);
    }

    public final boolean a(C0167a c0167a) {
        X0.f.e(c0167a, "that");
        return X0.f.a(this.f2637a, c0167a.f2637a) && X0.f.a(this.f2642f, c0167a.f2642f) && X0.f.a(this.i, c0167a.i) && X0.f.a(this.f2644j, c0167a.f2644j) && X0.f.a(this.f2643g, c0167a.f2643g) && X0.f.a(null, null) && X0.f.a(this.f2639c, c0167a.f2639c) && X0.f.a(this.f2640d, c0167a.f2640d) && X0.f.a(this.f2641e, c0167a.f2641e) && this.h.f2720e == c0167a.h.f2720e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0167a) {
            C0167a c0167a = (C0167a) obj;
            if (X0.f.a(this.h, c0167a.h) && a(c0167a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2641e) + ((Objects.hashCode(this.f2640d) + ((Objects.hashCode(this.f2639c) + ((this.f2643g.hashCode() + ((this.f2644j.hashCode() + ((this.i.hashCode() + ((this.f2642f.hashCode() + ((this.f2637a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        p pVar = this.h;
        sb.append(pVar.f2719d);
        sb.append(':');
        sb.append(pVar.f2720e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2643g);
        sb.append('}');
        return sb.toString();
    }
}
