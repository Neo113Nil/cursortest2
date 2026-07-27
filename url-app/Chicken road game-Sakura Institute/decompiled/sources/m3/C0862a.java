package m3;

import A.AbstractC0017m;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import r0.B;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862a {

    /* renamed from: a, reason: collision with root package name */
    public final j f8313a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f8314b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f8315c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f8316d;

    /* renamed from: e, reason: collision with root package name */
    public final d f8317e;

    /* renamed from: f, reason: collision with root package name */
    public final j f8318f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f8319g;

    /* renamed from: h, reason: collision with root package name */
    public final m f8320h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8321i;

    /* renamed from: j, reason: collision with root package name */
    public final List f8322j;

    public C0862a(String host, int i2, j dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, j proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f8313a = dns;
        this.f8314b = socketFactory;
        this.f8315c = sSLSocketFactory;
        this.f8316d = hostnameVerifier;
        this.f8317e = dVar;
        this.f8318f = proxyAuthenticator;
        this.f8319g = proxySelector;
        m1.k kVar = new m1.k(1);
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (scheme.equalsIgnoreCase("http")) {
            kVar.f8283e = "http";
        } else {
            if (!scheme.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            kVar.f8283e = "https";
        }
        Intrinsics.checkNotNullParameter(host, "host");
        String j4 = u.j(j.e(host, 0, 0, false, 7));
        if (j4 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }
        kVar.f8286h = j4;
        if (1 > i2 || i2 >= 65536) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "unexpected port: ").toString());
        }
        kVar.f8280b = i2;
        this.f8320h = kVar.b();
        this.f8321i = n3.b.w(protocols);
        this.f8322j = n3.b.w(connectionSpecs);
    }

    public final boolean a(C0862a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.a(this.f8313a, that.f8313a) && Intrinsics.a(this.f8318f, that.f8318f) && Intrinsics.a(this.f8321i, that.f8321i) && Intrinsics.a(this.f8322j, that.f8322j) && Intrinsics.a(this.f8319g, that.f8319g) && Intrinsics.a(null, null) && Intrinsics.a(this.f8315c, that.f8315c) && Intrinsics.a(this.f8316d, that.f8316d) && Intrinsics.a(this.f8317e, that.f8317e) && this.f8320h.f8397e == that.f8320h.f8397e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0862a) {
            C0862a c0862a = (C0862a) obj;
            if (Intrinsics.a(this.f8320h, c0862a.f8320h) && a(c0862a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f8317e) + ((Objects.hashCode(this.f8316d) + ((Objects.hashCode(this.f8315c) + ((this.f8319g.hashCode() + ((this.f8322j.hashCode() + ((this.f8321i.hashCode() + ((this.f8318f.hashCode() + ((this.f8313a.hashCode() + B.a(this.f8320h.f8400h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.f8320h;
        sb.append(mVar.f8396d);
        sb.append(':');
        sb.append(mVar.f8397e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f8319g);
        sb.append('}');
        return sb.toString();
    }
}
