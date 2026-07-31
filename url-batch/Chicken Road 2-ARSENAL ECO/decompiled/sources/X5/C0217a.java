package X5;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217a {

    /* renamed from: a, reason: collision with root package name */
    public final C0218b f2878a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2879b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2880c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f2881d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2882e;

    /* renamed from: f, reason: collision with root package name */
    public final C0218b f2883f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2884g;

    /* renamed from: h, reason: collision with root package name */
    public final o f2885h;

    /* renamed from: i, reason: collision with root package name */
    public final List f2886i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2887j;

    public C0217a(String uriHost, int i7, C0218b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, l6.c cVar, d dVar, C0218b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.i.e(uriHost, "uriHost");
        kotlin.jvm.internal.i.e(dns, "dns");
        kotlin.jvm.internal.i.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.i.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.i.e(protocols, "protocols");
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.i.e(proxySelector, "proxySelector");
        this.f2878a = dns;
        this.f2879b = socketFactory;
        this.f2880c = sSLSocketFactory;
        this.f2881d = cVar;
        this.f2882e = dVar;
        this.f2883f = proxyAuthenticator;
        this.f2884g = proxySelector;
        F3.g gVar = new F3.g(2);
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            gVar.f734h = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            gVar.f734h = "https";
        }
        String b7 = Y5.b.b(m6.a.c(0, 0, 7, uriHost));
        if (b7 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        gVar.f737k = b7;
        if (1 > i7 || i7 >= 65536) {
            throw new IllegalArgumentException(W4.o.c("unexpected port: ", i7).toString());
        }
        gVar.f733g = i7;
        this.f2885h = gVar.a();
        this.f2886i = Y5.e.i(protocols);
        this.f2887j = Y5.e.i(connectionSpecs);
    }

    public final boolean a(C0217a that) {
        kotlin.jvm.internal.i.e(that, "that");
        return kotlin.jvm.internal.i.a(this.f2878a, that.f2878a) && kotlin.jvm.internal.i.a(this.f2883f, that.f2883f) && kotlin.jvm.internal.i.a(this.f2886i, that.f2886i) && kotlin.jvm.internal.i.a(this.f2887j, that.f2887j) && kotlin.jvm.internal.i.a(this.f2884g, that.f2884g) && kotlin.jvm.internal.i.a(this.f2880c, that.f2880c) && kotlin.jvm.internal.i.a(this.f2881d, that.f2881d) && kotlin.jvm.internal.i.a(this.f2882e, that.f2882e) && this.f2885h.f2978e == that.f2885h.f2978e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0217a)) {
            return false;
        }
        C0217a c0217a = (C0217a) obj;
        return kotlin.jvm.internal.i.a(this.f2885h, c0217a.f2885h) && a(c0217a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2882e) + ((Objects.hashCode(this.f2881d) + ((Objects.hashCode(this.f2880c) + ((this.f2884g.hashCode() + ((this.f2887j.hashCode() + ((this.f2886i.hashCode() + ((this.f2883f.hashCode() + ((this.f2878a.hashCode() + ((this.f2885h.f2981h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.f2885h;
        sb.append(oVar.f2977d);
        sb.append(':');
        sb.append(oVar.f2978e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2884g);
        sb.append('}');
        return sb.toString();
    }
}
