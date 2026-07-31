package okhttp3;

import W1.h;
import W1.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class Handshake {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f42379e = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final TlsVersion f42380a;

    /* renamed from: b, reason: collision with root package name */
    private final CipherSuite f42381b;

    /* renamed from: c, reason: collision with root package name */
    private final List f42382c;

    /* renamed from: d, reason: collision with root package name */
    private final h f42383d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List c(Certificate[] certificateArr) {
            return certificateArr != null ? Util.v(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.emptyList();
        }

        public final Handshake a(SSLSession sSLSession) {
            List emptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            CipherSuite b4 = CipherSuite.f42255b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion a4 = TlsVersion.f42581c.a(protocol);
            try {
                emptyList = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                emptyList = CollectionsKt.emptyList();
            }
            return new Handshake(a4, b4, c(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(emptyList));
        }

        public final Handshake b(TlsVersion tlsVersion, CipherSuite cipherSuite, List peerCertificates, List localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.U(localCertificates), new Handshake$Companion$get$1(Util.U(peerCertificates)));
        }

        private Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f42380a = tlsVersion;
        this.f42381b = cipherSuite;
        this.f42382c = localCertificates;
        this.f42383d = i.b(new Handshake$peerCertificates$2(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    public final CipherSuite a() {
        return this.f42381b;
    }

    public final List c() {
        return this.f42382c;
    }

    public final List d() {
        return (List) this.f42383d.getValue();
    }

    public final TlsVersion e() {
        return this.f42380a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f42380a == this.f42380a && Intrinsics.areEqual(handshake.f42381b, this.f42381b) && Intrinsics.areEqual(handshake.d(), d()) && Intrinsics.areEqual(handshake.f42382c, this.f42382c);
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f42380a.hashCode()) * 31) + this.f42381b.hashCode()) * 31) + d().hashCode()) * 31) + this.f42382c.hashCode();
    }

    public String toString() {
        List d4 = d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(d4, 10));
        Iterator it = d4.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f42380a);
        sb.append(" cipherSuite=");
        sb.append(this.f42381b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List list = this.f42382c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
