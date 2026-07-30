package okhttp3;

import cn.hutool.core.io.file.c;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.x;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlin.text.t;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            s.checkNotNullParameter(pattern, "pattern");
            s.checkNotNullParameter(pins, "pins");
            int length = pins.length;
            int i8 = 0;
            while (i8 < length) {
                String str = pins[i8];
                i8++;
                getPins().add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            Set set;
            set = CollectionsKt___CollectionsKt.toSet(this.pins);
            return new CertificatePinner(set, null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            s.checkNotNullParameter(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return s.stringPlus("sha256/", sha256Hash((X509Certificate) certificate).base64());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            s.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.a aVar = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            s.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.a.of$default(aVar, encoded, 0, 0, 3, null).sha1();
        }

        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            s.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.a aVar = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            s.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.a.of$default(aVar, encoded, 0, 0, 3, null).sha256();
        }
    }

    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String pattern, String pin) {
            s.checkNotNullParameter(pattern, "pattern");
            s.checkNotNullParameter(pin, "pin");
            if ((!t.startsWith$default(pattern, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) pattern, "*", 1, false, 4, (Object) null) != -1) && ((!t.startsWith$default(pattern, "**.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) pattern, "*", 2, false, 4, (Object) null) != -1) && StringsKt__StringsKt.indexOf$default((CharSequence) pattern, "*", 0, false, 6, (Object) null) != -1)) {
                throw new IllegalArgumentException(s.stringPlus("Unexpected pattern: ", pattern).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(s.stringPlus("Invalid pattern: ", pattern));
            }
            this.pattern = canonicalHost;
            if (t.startsWith$default(pin, "sha1/", false, 2, null)) {
                this.hashAlgorithm = "sha1";
                ByteString.a aVar = ByteString.Companion;
                String substring = pin.substring(5);
                s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                ByteString decodeBase64 = aVar.decodeBase64(substring);
                if (decodeBase64 == null) {
                    throw new IllegalArgumentException(s.stringPlus("Invalid pin hash: ", pin));
                }
                this.hash = decodeBase64;
                return;
            }
            if (!t.startsWith$default(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException(s.stringPlus("pins must start with 'sha256/' or 'sha1/': ", pin));
            }
            this.hashAlgorithm = "sha256";
            ByteString.a aVar2 = ByteString.Companion;
            String substring2 = pin.substring(7);
            s.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            ByteString decodeBase642 = aVar2.decodeBase64(substring2);
            if (decodeBase642 == null) {
                throw new IllegalArgumentException(s.stringPlus("Invalid pin hash: ", pin));
            }
            this.hash = decodeBase642;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return s.areEqual(this.pattern, pin.pattern) && s.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && s.areEqual(this.hash, pin.hash);
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            s.checkNotNullParameter(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (s.areEqual(str, "sha256")) {
                return s.areEqual(this.hash, CertificatePinner.Companion.sha256Hash(certificate));
            }
            if (s.areEqual(str, "sha1")) {
                return s.areEqual(this.hash, CertificatePinner.Companion.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String hostname) {
            s.checkNotNullParameter(hostname, "hostname");
            if (t.startsWith$default(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (!l.regionMatches$default(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, (Object) null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!t.startsWith$default(this.pattern, "*.", false, 2, null)) {
                    return s.areEqual(hostname, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                if (!l.regionMatches$default(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, (Object) null) || StringsKt__StringsKt.lastIndexOf$default((CharSequence) hostname, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + c.UNIX_SEPARATOR + this.hash.base64();
        }
    }

    public CertificatePinner(Set<Pin> pins, CertificateChainCleaner certificateChainCleaner) {
        s.checkNotNullParameter(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(final String hostname, final List<? extends Certificate> peerCertificates) {
        s.checkNotNullParameter(hostname, "hostname");
        s.checkNotNullParameter(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new f6.a() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // f6.a
            public final List<X509Certificate> invoke() {
                CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
                List<Certificate> clean = certificateChainCleaner$okhttp == null ? null : certificateChainCleaner$okhttp.clean(peerCertificates, hostname);
                if (clean == null) {
                    clean = peerCertificates;
                }
                List<Certificate> list = clean;
                ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            }
        });
    }

    public final void check$okhttp(String hostname, f6.a cleanedPeerCertificatesFn) {
        s.checkNotNullParameter(hostname, "hostname");
        s.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(hostname);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (s.areEqual(hashAlgorithm, "sha256")) {
                    if (byteString == null) {
                        byteString = Companion.sha256Hash(x509Certificate);
                    }
                    if (s.areEqual(pin.getHash(), byteString)) {
                        return;
                    }
                } else {
                    if (!s.areEqual(hashAlgorithm, "sha1")) {
                        throw new AssertionError(s.stringPlus("unsupported hashAlgorithm: ", pin.getHashAlgorithm()));
                    }
                    if (byteString2 == null) {
                        byteString2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (s.areEqual(pin.getHash(), byteString2)) {
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
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (s.areEqual(certificatePinner.pins, this.pins) && s.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String hostname) {
        s.checkNotNullParameter(hostname, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> emptyList = CollectionsKt__CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                x.asMutableList(emptyList).add(obj);
            }
        }
        return emptyList;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        s.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return s.areEqual(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i8, o oVar) {
        this(set, (i8 & 2) != 0 ? null : certificateChainCleaner);
    }

    public final void check(String hostname, Certificate... peerCertificates) {
        s.checkNotNullParameter(hostname, "hostname");
        s.checkNotNullParameter(peerCertificates, "peerCertificates");
        check(hostname, ArraysKt___ArraysKt.toList(peerCertificates));
    }
}
