package D6;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: D6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093a {

    /* renamed from: a, reason: collision with root package name */
    public final l f456a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f457b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f458c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f459d;

    /* renamed from: e, reason: collision with root package name */
    public final C0097e f460e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0094b f461f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f462g;

    /* renamed from: h, reason: collision with root package name */
    public final s f463h;

    /* renamed from: i, reason: collision with root package name */
    public final List f464i;
    public final List j;

    public C0093a(String host, int i2, l dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, R6.c cVar, C0097e c0097e, l proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f456a = dns;
        this.f457b = socketFactory;
        this.f458c = sSLSocketFactory;
        this.f459d = cVar;
        this.f460e = c0097e;
        this.f461f = proxyAuthenticator;
        this.f462g = proxySelector;
        r rVar = new r();
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (scheme.equalsIgnoreCase("http")) {
            rVar.f554a = "http";
        } else {
            if (!scheme.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            rVar.f554a = "https";
        }
        Intrinsics.checkNotNullParameter(host, "host");
        String b7 = E6.b.b(S6.a.c(0, 0, 7, host));
        if (b7 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }
        rVar.f557d = b7;
        if (1 > i2 || i2 >= 65536) {
            throw new IllegalArgumentException(C4.p.g(i2, "unexpected port: ").toString());
        }
        rVar.f558e = i2;
        this.f463h = rVar.a();
        this.f464i = E6.e.i(protocols);
        this.j = E6.e.i(connectionSpecs);
    }

    public final boolean a(C0093a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.a(this.f456a, that.f456a) && Intrinsics.a(this.f461f, that.f461f) && Intrinsics.a(this.f464i, that.f464i) && Intrinsics.a(this.j, that.j) && Intrinsics.a(this.f462g, that.f462g) && Intrinsics.a(this.f458c, that.f458c) && Intrinsics.a(this.f459d, that.f459d) && Intrinsics.a(this.f460e, that.f460e) && this.f463h.f566e == that.f463h.f566e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0093a)) {
            return false;
        }
        C0093a c0093a = (C0093a) obj;
        return Intrinsics.a(this.f463h, c0093a.f463h) && a(c0093a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f460e) + ((Objects.hashCode(this.f459d) + ((Objects.hashCode(this.f458c) + ((this.f462g.hashCode() + ((this.j.hashCode() + ((this.f464i.hashCode() + ((this.f461f.hashCode() + ((this.f456a.hashCode() + C4.p.e(this.f463h.f569h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        s sVar = this.f463h;
        sb.append(sVar.f565d);
        sb.append(':');
        sb.append(sVar.f566e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f462g);
        sb.append('}');
        return sb.toString();
    }
}
