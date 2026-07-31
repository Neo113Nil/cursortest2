package okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class Address {

    /* renamed from: a, reason: collision with root package name */
    private final Dns f42114a;

    /* renamed from: b, reason: collision with root package name */
    private final SocketFactory f42115b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f42116c;

    /* renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f42117d;

    /* renamed from: e, reason: collision with root package name */
    private final CertificatePinner f42118e;

    /* renamed from: f, reason: collision with root package name */
    private final Authenticator f42119f;

    /* renamed from: g, reason: collision with root package name */
    private final Proxy f42120g;

    /* renamed from: h, reason: collision with root package name */
    private final ProxySelector f42121h;

    /* renamed from: i, reason: collision with root package name */
    private final HttpUrl f42122i;

    /* renamed from: j, reason: collision with root package name */
    private final List f42123j;

    /* renamed from: k, reason: collision with root package name */
    private final List f42124k;

    public Address(String uriHost, int i4, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f42114a = dns;
        this.f42115b = socketFactory;
        this.f42116c = sSLSocketFactory;
        this.f42117d = hostnameVerifier;
        this.f42118e = certificatePinner;
        this.f42119f = proxyAuthenticator;
        this.f42120g = proxy;
        this.f42121h = proxySelector;
        this.f42122i = new HttpUrl.Builder().o(sSLSocketFactory != null ? "https" : "http").e(uriHost).k(i4).a();
        this.f42123j = Util.U(protocols);
        this.f42124k = Util.U(connectionSpecs);
    }

    public final CertificatePinner a() {
        return this.f42118e;
    }

    public final List b() {
        return this.f42124k;
    }

    public final Dns c() {
        return this.f42114a;
    }

    public final boolean d(Address that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f42114a, that.f42114a) && Intrinsics.areEqual(this.f42119f, that.f42119f) && Intrinsics.areEqual(this.f42123j, that.f42123j) && Intrinsics.areEqual(this.f42124k, that.f42124k) && Intrinsics.areEqual(this.f42121h, that.f42121h) && Intrinsics.areEqual(this.f42120g, that.f42120g) && Intrinsics.areEqual(this.f42116c, that.f42116c) && Intrinsics.areEqual(this.f42117d, that.f42117d) && Intrinsics.areEqual(this.f42118e, that.f42118e) && this.f42122i.l() == that.f42122i.l();
    }

    public final HostnameVerifier e() {
        return this.f42117d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual(this.f42122i, address.f42122i) && d(address);
    }

    public final List f() {
        return this.f42123j;
    }

    public final Proxy g() {
        return this.f42120g;
    }

    public final Authenticator h() {
        return this.f42119f;
    }

    public int hashCode() {
        return ((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f42122i.hashCode()) * 31) + this.f42114a.hashCode()) * 31) + this.f42119f.hashCode()) * 31) + this.f42123j.hashCode()) * 31) + this.f42124k.hashCode()) * 31) + this.f42121h.hashCode()) * 31) + Objects.hashCode(this.f42120g)) * 31) + Objects.hashCode(this.f42116c)) * 31) + Objects.hashCode(this.f42117d)) * 31) + Objects.hashCode(this.f42118e);
    }

    public final ProxySelector i() {
        return this.f42121h;
    }

    public final SocketFactory j() {
        return this.f42115b;
    }

    public final SSLSocketFactory k() {
        return this.f42116c;
    }

    public final HttpUrl l() {
        return this.f42122i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f42122i.h());
        sb2.append(':');
        sb2.append(this.f42122i.l());
        sb2.append(", ");
        if (this.f42120g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f42120g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f42121h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
