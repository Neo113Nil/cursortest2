package okhttp3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class Address {
    public final CertificatePinner certificatePinner;
    public final List connectionSpecs;
    public final Dns dns;
    public final HostnameVerifier hostnameVerifier;
    public final List protocols;
    public final HttpUrl.Companion proxyAuthenticator;
    public final ProxySelector proxySelector;
    public final SocketFactory socketFactory;
    public final SSLSocketFactory sslSocketFactory;
    public final HttpUrl url;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, HttpUrl.Companion companion, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        dns.getClass();
        socketFactory.getClass();
        companion.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = companion;
        this.proxySelector = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.scheme(sSLSocketFactory != null ? "https" : "http");
        builder.host(str);
        if (1 > i || i >= 65536) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "unexpected port: "));
            throw null;
        }
        builder.port = i;
        this.url = builder.build();
        this.protocols = _UtilJvmKt.toImmutableList(list);
        this.connectionSpecs = _UtilJvmKt.toImmutableList(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public final boolean equalsNonHost$okhttp(Address address) {
        address.getClass();
        return Intrinsics.areEqual(this.dns, address.dns) && Intrinsics.areEqual(this.proxyAuthenticator, address.proxyAuthenticator) && Intrinsics.areEqual(this.protocols, address.protocols) && Intrinsics.areEqual(this.connectionSpecs, address.connectionSpecs) && Intrinsics.areEqual(this.proxySelector, address.proxySelector) && Intrinsics.areEqual(this.sslSocketFactory, address.sslSocketFactory) && Intrinsics.areEqual(this.hostnameVerifier, address.hostnameVerifier) && Intrinsics.areEqual(this.certificatePinner, address.certificatePinner) && this.url.port == address.url.port;
    }

    public final int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((this.proxySelector.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.url.url)) * 31)) * 31, 31, this.protocols), 31, this.connectionSpecs)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.url;
        sb.append(httpUrl.host);
        sb.append(':');
        sb.append(httpUrl.port);
        sb.append(", ");
        sb.append("proxySelector=" + this.proxySelector);
        sb.append('}');
        return sb.toString();
    }
}
