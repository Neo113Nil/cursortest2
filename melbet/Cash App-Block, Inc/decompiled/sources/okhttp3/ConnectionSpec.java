package okhttp3;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.NaturalOrderComparator;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilCommonKt;

/* loaded from: classes3.dex */
public final class ConnectionSpec {
    public static final List APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec MODERN_TLS;
    public static final List RESTRICTED_CIPHER_SUITES;
    public static final ConnectionSpec RESTRICTED_TLS;
    public final String[] cipherSuitesAsString;
    public final boolean isTls;
    public final boolean supportsTlsExtensions;
    public final String[] tlsVersionsAsString;

    static {
        CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
        CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite7 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite8 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite9 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CipherSuite[]{cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9});
        RESTRICTED_CIPHER_SUITES = listOf;
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new CipherSuite[]{cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA});
        APPROVED_CIPHER_SUITES = listOf2;
        Builder builder = new Builder();
        CipherSuite[] cipherSuiteArr = (CipherSuite[]) listOf.toArray(new CipherSuite[0]);
        builder.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.tlsVersions(tlsVersion, tlsVersion2);
        builder.supportsTlsExtensions = true;
        RESTRICTED_TLS = builder.build();
        Builder builder2 = new Builder();
        List list = listOf2;
        CipherSuite[] cipherSuiteArr2 = (CipherSuite[]) list.toArray(new CipherSuite[0]);
        builder2.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length));
        builder2.tlsVersions(tlsVersion, tlsVersion2);
        builder2.supportsTlsExtensions = true;
        MODERN_TLS = builder2.build();
        Builder builder3 = new Builder();
        CipherSuite[] cipherSuiteArr3 = (CipherSuite[]) list.toArray(new CipherSuite[0]);
        builder3.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length));
        builder3.tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        builder3.supportsTlsExtensions = true;
        builder3.build();
        CLEARTEXT = new ConnectionSpec(false, false, null, null);
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    public final void apply$okhttp(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.cipherSuitesAsString;
        if (strArr != null) {
            enabledCipherSuites = _UtilCommonKt.intersect(strArr, enabledCipherSuites, CipherSuite.ORDER_BY_NAME);
        }
        String[] strArr2 = this.tlsVersionsAsString;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
            naturalOrderComparator.getClass();
            enabledProtocols = _UtilCommonKt.intersect(enabledProtocols2, strArr2, naturalOrderComparator);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 cipherSuite$Companion$ORDER_BY_NAME$1 = CipherSuite.ORDER_BY_NAME;
        byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (cipherSuite$Companion$ORDER_BY_NAME$1.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.isTls;
        if (!z2) {
            a$$ExternalSyntheticBUOutline0.m$3("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            a$$ExternalSyntheticBUOutline0.m$3("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("At least one TLS version is required");
            return;
        }
        ConnectionSpec connectionSpec = new ConnectionSpec(z2, this.supportsTlsExtensions, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (connectionSpec.tlsVersions() != null) {
            sSLSocket.setEnabledProtocols(connectionSpec.tlsVersionsAsString);
        }
        if (connectionSpec.cipherSuites() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpec.cipherSuitesAsString);
        }
    }

    public final ArrayList cipherSuites() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.Companion.m4320forJavaName(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = connectionSpec.isTls;
        boolean z2 = this.isTls;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public final ArrayList tlsVersions() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(HttpUrl.Companion.forJavaName(str));
        }
        return arrayList;
    }

    public final String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(cipherSuites(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(tlsVersions(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.supportsTlsExtensions, ')');
    }

    public final class Builder {
        public String[] cipherSuites;
        public boolean supportsTlsExtensions;
        public final boolean tls;
        public String[] tlsVersions;

        public Builder(ConnectionSpec connectionSpec) {
            connectionSpec.getClass();
            this.tls = connectionSpec.isTls;
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions;
        }

        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final void cipherSuites(CipherSuite... cipherSuiteArr) {
            boolean z = this.tls;
            if (!z) {
                a$$ExternalSyntheticBUOutline0.m$3("no cipher suites for cleartext connections");
                return;
            }
            ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
            for (CipherSuite cipherSuite : cipherSuiteArr) {
                arrayList.add(cipherSuite.javaName);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (!z) {
                a$$ExternalSyntheticBUOutline0.m$3("no cipher suites for cleartext connections");
            } else if (strArr2.length != 0) {
                this.cipherSuites = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("At least one cipher suite is required");
            }
        }

        public final void tlsVersions(TlsVersion... tlsVersionArr) {
            boolean z = this.tls;
            if (!z) {
                a$$ExternalSyntheticBUOutline0.m$3("no TLS versions for cleartext connections");
                return;
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.javaName);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (!z) {
                a$$ExternalSyntheticBUOutline0.m$3("no TLS versions for cleartext connections");
            } else if (strArr2.length != 0) {
                this.tlsVersions = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("At least one TLS version is required");
            }
        }

        public Builder() {
            this.tls = true;
        }
    }
}
