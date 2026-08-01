package i1;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166a {

    /* renamed from: a, reason: collision with root package name */
    public final C0167b f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2634b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2635c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f2636d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2637e;

    /* renamed from: f, reason: collision with root package name */
    public final C0167b f2638f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2639g;
    public final p h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2640j;

    public C0166a(String str, int i, C0167b c0167b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, C0167b c0167b2, List list, List list2, ProxySelector proxySelector) {
        X0.f.e(str, "uriHost");
        X0.f.e(c0167b, "dns");
        X0.f.e(socketFactory, "socketFactory");
        X0.f.e(c0167b2, "proxyAuthenticator");
        X0.f.e(list, "protocols");
        X0.f.e(list2, "connectionSpecs");
        X0.f.e(proxySelector, "proxySelector");
        this.f2633a = c0167b;
        this.f2634b = socketFactory;
        this.f2635c = sSLSocketFactory;
        this.f2636d = hostnameVerifier;
        this.f2637e = fVar;
        this.f2638f = c0167b2;
        this.f2639g = proxySelector;
        o oVar = new o();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            oVar.f2704a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            oVar.f2704a = "https";
        }
        String p2 = m.p(C0167b.e(str, 0, 0, false, 7));
        if (p2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        oVar.f2707d = p2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(X0.e.d("unexpected port: ", i).toString());
        }
        oVar.f2708e = i;
        this.h = oVar.a();
        this.i = j1.b.v(list);
        this.f2640j = j1.b.v(list2);
    }

    public final boolean a(C0166a c0166a) {
        X0.f.e(c0166a, "that");
        return X0.f.a(this.f2633a, c0166a.f2633a) && X0.f.a(this.f2638f, c0166a.f2638f) && X0.f.a(this.i, c0166a.i) && X0.f.a(this.f2640j, c0166a.f2640j) && X0.f.a(this.f2639g, c0166a.f2639g) && X0.f.a(null, null) && X0.f.a(this.f2635c, c0166a.f2635c) && X0.f.a(this.f2636d, c0166a.f2636d) && X0.f.a(this.f2637e, c0166a.f2637e) && this.h.f2716e == c0166a.h.f2716e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0166a) {
            C0166a c0166a = (C0166a) obj;
            if (X0.f.a(this.h, c0166a.h) && a(c0166a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2637e) + ((Objects.hashCode(this.f2636d) + ((Objects.hashCode(this.f2635c) + ((this.f2639g.hashCode() + ((this.f2640j.hashCode() + ((this.i.hashCode() + ((this.f2638f.hashCode() + ((this.f2633a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        p pVar = this.h;
        sb.append(pVar.f2715d);
        sb.append(':');
        sb.append(pVar.f2716e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2639g);
        sb.append('}');
        return sb.toString();
    }
}
