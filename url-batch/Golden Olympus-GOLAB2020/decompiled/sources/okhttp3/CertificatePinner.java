package okhttp3;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.text.StringsKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class CertificatePinner {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f42188c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final CertificatePinner f42189d = new Builder().a();

    /* renamed from: a, reason: collision with root package name */
    private final Set f42190a;

    /* renamed from: b, reason: collision with root package name */
    private final CertificateChainCleaner f42191b;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final List f42192a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner a() {
            return new CertificatePinner(CollectionsKt.toSet(this.f42192a), null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).c();
        }

        public final h b(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            h.a aVar = h.f43270e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return h.a.f(aVar, encoded, 0, 0, 3, null).t();
        }

        public final h c(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            h.a aVar = h.f43270e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return h.a.f(aVar, encoded, 0, 0, 3, null).u();
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Pin {

        /* renamed from: a, reason: collision with root package name */
        private final String f42193a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42194b;

        /* renamed from: c, reason: collision with root package name */
        private final h f42195c;

        public final h a() {
            return this.f42195c;
        }

        public final String b() {
            return this.f42194b;
        }

        public final boolean c(String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (StringsKt.K(this.f42193a, "**.", false, 2, null)) {
                int length = this.f42193a.length() - 3;
                int length2 = hostname.length() - length;
                return StringsKt.B(hostname, hostname.length() - length, this.f42193a, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!StringsKt.K(this.f42193a, "*.", false, 2, null)) {
                return Intrinsics.areEqual(hostname, this.f42193a);
            }
            int length3 = this.f42193a.length() - 1;
            return StringsKt.B(hostname, hostname.length() - length3, this.f42193a, 1, length3, false, 16, null) && StringsKt.g0(hostname, JwtParser.SEPARATOR_CHAR, (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return Intrinsics.areEqual(this.f42193a, pin.f42193a) && Intrinsics.areEqual(this.f42194b, pin.f42194b) && Intrinsics.areEqual(this.f42195c, pin.f42195c);
        }

        public int hashCode() {
            return (((this.f42193a.hashCode() * 31) + this.f42194b.hashCode()) * 31) + this.f42195c.hashCode();
        }

        public String toString() {
            return this.f42194b + '/' + this.f42195c.c();
        }
    }

    public CertificatePinner(Set pins, CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f42190a = pins;
        this.f42191b = certificateChainCleaner;
    }

    public final void a(String hostname, List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        b(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    public final void b(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> c4 = c(hostname);
        if (c4.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            h hVar = null;
            h hVar2 = null;
            for (Pin pin : c4) {
                String b4 = pin.b();
                if (Intrinsics.areEqual(b4, "sha256")) {
                    if (hVar == null) {
                        hVar = f42188c.c(x509Certificate);
                    }
                    if (Intrinsics.areEqual(pin.a(), hVar)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.areEqual(b4, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.b());
                    }
                    if (hVar2 == null) {
                        hVar2 = f42188c.b(x509Certificate);
                    }
                    if (Intrinsics.areEqual(pin.a(), hVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f42188c.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        for (Pin pin2 : c4) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public final List c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f42190a;
        List emptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((Pin) obj).c(hostname)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                M.c(emptyList).add(obj);
            }
        }
        return emptyList;
    }

    public final CertificateChainCleaner d() {
        return this.f42191b;
    }

    public final CertificatePinner e(CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f42191b, certificateChainCleaner) ? this : new CertificatePinner(this.f42190a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return Intrinsics.areEqual(certificatePinner.f42190a, this.f42190a) && Intrinsics.areEqual(certificatePinner.f42191b, this.f42191b);
    }

    public int hashCode() {
        int hashCode = (1517 + this.f42190a.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f42191b;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i4 & 2) != 0 ? null : certificateChainCleaner);
    }
}
