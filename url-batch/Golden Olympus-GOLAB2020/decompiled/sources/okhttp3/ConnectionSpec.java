package okhttp3;

import Z1.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class ConnectionSpec {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f42325e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final CipherSuite[] f42326f;

    /* renamed from: g, reason: collision with root package name */
    private static final CipherSuite[] f42327g;

    /* renamed from: h, reason: collision with root package name */
    public static final ConnectionSpec f42328h;

    /* renamed from: i, reason: collision with root package name */
    public static final ConnectionSpec f42329i;

    /* renamed from: j, reason: collision with root package name */
    public static final ConnectionSpec f42330j;

    /* renamed from: k, reason: collision with root package name */
    public static final ConnectionSpec f42331k;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42332a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42333b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f42334c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f42335d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.f42296o1;
        CipherSuite cipherSuite2 = CipherSuite.f42299p1;
        CipherSuite cipherSuite3 = CipherSuite.f42302q1;
        CipherSuite cipherSuite4 = CipherSuite.f42254a1;
        CipherSuite cipherSuite5 = CipherSuite.f42266e1;
        CipherSuite cipherSuite6 = CipherSuite.f42257b1;
        CipherSuite cipherSuite7 = CipherSuite.f42269f1;
        CipherSuite cipherSuite8 = CipherSuite.f42287l1;
        CipherSuite cipherSuite9 = CipherSuite.f42284k1;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        f42326f = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f42224L0, CipherSuite.f42226M0, CipherSuite.f42280j0, CipherSuite.f42283k0, CipherSuite.f42215H, CipherSuite.f42223L, CipherSuite.f42285l};
        f42327g = cipherSuiteArr2;
        Builder c4 = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f42328h = c4.f(tlsVersion, tlsVersion2).d(true).a();
        f42329i = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).f(tlsVersion, tlsVersion2).d(true).a();
        f42330j = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).d(true).a();
        f42331k = new Builder(false).a();
    }

    public ConnectionSpec(boolean z4, boolean z5, String[] strArr, String[] strArr2) {
        this.f42332a = z4;
        this.f42333b = z5;
        this.f42334c = strArr;
        this.f42335d = strArr2;
    }

    private final ConnectionSpec g(SSLSocket sSLSocket, boolean z4) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f42334c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Util.D(enabledCipherSuites, this.f42334c, CipherSuite.f42255b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f42335d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.D(enabledProtocols, this.f42335d, a.g());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int w4 = Util.w(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.f42255b.c());
        if (z4 && w4 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[w4];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Util.n(cipherSuitesIntersection, str);
        }
        Builder builder = new Builder(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        Builder b4 = builder.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return b4.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z4) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ConnectionSpec g4 = g(sslSocket, z4);
        if (g4.i() != null) {
            sslSocket.setEnabledProtocols(g4.f42335d);
        }
        if (g4.d() != null) {
            sslSocket.setEnabledCipherSuites(g4.f42334c);
        }
    }

    public final List d() {
        String[] strArr = this.f42334c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f42255b.b(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f42332a) {
            return false;
        }
        String[] strArr = this.f42335d;
        if (strArr != null && !Util.t(strArr, socket.getEnabledProtocols(), a.g())) {
            return false;
        }
        String[] strArr2 = this.f42334c;
        return strArr2 == null || Util.t(strArr2, socket.getEnabledCipherSuites(), CipherSuite.f42255b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z4 = this.f42332a;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z4 != connectionSpec.f42332a) {
            return false;
        }
        return !z4 || (Arrays.equals(this.f42334c, connectionSpec.f42334c) && Arrays.equals(this.f42335d, connectionSpec.f42335d) && this.f42333b == connectionSpec.f42333b);
    }

    public final boolean f() {
        return this.f42332a;
    }

    public final boolean h() {
        return this.f42333b;
    }

    public int hashCode() {
        if (!this.f42332a) {
            return 17;
        }
        String[] strArr = this.f42334c;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f42335d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f42333b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f42335d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.f42581c.a(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public String toString() {
        if (!this.f42332a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f42333b + ')';
    }

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private boolean f42336a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f42337b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f42338c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f42339d;

        public Builder(boolean z4) {
            this.f42336a = z4;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f42336a, this.f42339d, this.f42337b, this.f42338c);
        }

        public final Builder b(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f42336a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f42337b = (String[]) cipherSuites.clone();
            return this;
        }

        public final Builder c(CipherSuite... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f42336a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Builder d(boolean z4) {
            if (!this.f42336a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f42339d = z4;
            return this;
        }

        public final Builder e(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f42336a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f42338c = (String[]) tlsVersions.clone();
            return this;
        }

        public final Builder f(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f42336a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.d());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public Builder(ConnectionSpec connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f42336a = connectionSpec.f();
            this.f42337b = connectionSpec.f42334c;
            this.f42338c = connectionSpec.f42335d;
            this.f42339d = connectionSpec.h();
        }
    }
}
