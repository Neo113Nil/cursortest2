package e8;

import com.google.android.gms.internal.ads.CL;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import t0.AbstractC5051n;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4483a {

    /* renamed from: a, reason: collision with root package name */
    public final C4484b f37344a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f37345b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f37346c;

    /* renamed from: d, reason: collision with root package name */
    public final s8.c f37347d;

    /* renamed from: e, reason: collision with root package name */
    public final d f37348e;

    /* renamed from: f, reason: collision with root package name */
    public final C4484b f37349f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f37350g;

    /* renamed from: h, reason: collision with root package name */
    public final o f37351h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f37352j;

    public C4483a(String uriHost, int i, C4484b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, s8.c cVar, d dVar, C4484b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.h.e(uriHost, "uriHost");
        kotlin.jvm.internal.h.e(dns, "dns");
        kotlin.jvm.internal.h.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.h.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.h.e(protocols, "protocols");
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.h.e(proxySelector, "proxySelector");
        this.f37344a = dns;
        this.f37345b = socketFactory;
        this.f37346c = sSLSocketFactory;
        this.f37347d = cVar;
        this.f37348e = dVar;
        this.f37349f = proxyAuthenticator;
        this.f37350g = proxySelector;
        n nVar = new n();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            nVar.f37429a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            nVar.f37429a = "https";
        }
        String b9 = f8.b.b(t8.a.c(0, uriHost, 0, 7));
        if (b9 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        nVar.f37432d = b9;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(CL.i(i, "unexpected port: ").toString());
        }
        nVar.f37433e = i;
        this.f37351h = nVar.a();
        this.i = f8.d.j(protocols);
        this.f37352j = f8.d.j(connectionSpecs);
    }

    public final boolean a(C4483a that) {
        kotlin.jvm.internal.h.e(that, "that");
        return kotlin.jvm.internal.h.a(this.f37344a, that.f37344a) && kotlin.jvm.internal.h.a(this.f37349f, that.f37349f) && kotlin.jvm.internal.h.a(this.i, that.i) && kotlin.jvm.internal.h.a(this.f37352j, that.f37352j) && kotlin.jvm.internal.h.a(this.f37350g, that.f37350g) && kotlin.jvm.internal.h.a(this.f37346c, that.f37346c) && kotlin.jvm.internal.h.a(this.f37347d, that.f37347d) && kotlin.jvm.internal.h.a(this.f37348e, that.f37348e) && this.f37351h.f37441e == that.f37351h.f37441e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4483a)) {
            return false;
        }
        C4483a c4483a = (C4483a) obj;
        return kotlin.jvm.internal.h.a(this.f37351h, c4483a.f37351h) && a(c4483a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37348e) + ((Objects.hashCode(this.f37347d) + ((Objects.hashCode(this.f37346c) + ((this.f37350g.hashCode() + ((this.f37352j.hashCode() + ((this.i.hashCode() + ((this.f37349f.hashCode() + ((this.f37344a.hashCode() + AbstractC5051n.k(527, 31, this.f37351h.f37444h)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.f37351h;
        sb.append(oVar.f37440d);
        sb.append(':');
        sb.append(oVar.f37441e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f37350g);
        sb.append('}');
        return sb.toString();
    }
}
