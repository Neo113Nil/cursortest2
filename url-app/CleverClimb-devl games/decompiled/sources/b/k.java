package b;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpec.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    final boolean f2102d;
    final boolean e;
    final String[] f;
    final String[] g;
    private static final h[] h = {h.aX, h.bb, h.aY, h.bc, h.bi, h.bh, h.ay, h.aI, h.az, h.aJ, h.ag, h.ah, h.E, h.I, h.i};

    /* renamed from: a, reason: collision with root package name */
    public static final k f2099a = new a(true).a(h).a(af.TLS_1_3, af.TLS_1_2, af.TLS_1_1, af.TLS_1_0).a(true).a();

    /* renamed from: b, reason: collision with root package name */
    public static final k f2100b = new a(f2099a).a(af.TLS_1_0).a(true).a();

    /* renamed from: c, reason: collision with root package name */
    public static final k f2101c = new a(false).a();

    k(a aVar) {
        this.f2102d = aVar.f2103a;
        this.f = aVar.f2104b;
        this.g = aVar.f2105c;
        this.e = aVar.f2106d;
    }

    public boolean a() {
        return this.f2102d;
    }

    public List<h> b() {
        if (this.f != null) {
            return h.a(this.f);
        }
        return null;
    }

    public List<af> c() {
        if (this.g != null) {
            return af.a(this.g);
        }
        return null;
    }

    public boolean d() {
        return this.e;
    }

    void a(SSLSocket sSLSocket, boolean z) {
        k b2 = b(sSLSocket, z);
        if (b2.g != null) {
            sSLSocket.setEnabledProtocols(b2.g);
        }
        if (b2.f != null) {
            sSLSocket.setEnabledCipherSuites(b2.f);
        }
    }

    private k b(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f != null) {
            enabledCipherSuites = b.a.c.a(h.f2090a, sSLSocket.getEnabledCipherSuites(), this.f);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.g != null) {
            enabledProtocols = b.a.c.a(b.a.c.g, sSLSocket.getEnabledProtocols(), this.g);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a2 = b.a.c.a(h.f2090a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a2 != -1) {
            enabledCipherSuites = b.a.c.a(enabledCipherSuites, supportedCipherSuites[a2]);
        }
        return new a(this).a(enabledCipherSuites).b(enabledProtocols).a();
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f2102d) {
            return false;
        }
        if (this.g == null || b.a.c.b(b.a.c.g, this.g, sSLSocket.getEnabledProtocols())) {
            return this.f == null || b.a.c.b(h.f2090a, this.f, sSLSocket.getEnabledCipherSuites());
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        if (this.f2102d != kVar.f2102d) {
            return false;
        }
        return !this.f2102d || (Arrays.equals(this.f, kVar.f) && Arrays.equals(this.g, kVar.g) && this.e == kVar.e);
    }

    public int hashCode() {
        if (this.f2102d) {
            return ((((527 + Arrays.hashCode(this.f)) * 31) + Arrays.hashCode(this.g)) * 31) + (!this.e ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f2102d) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f != null ? b().toString() : "[all enabled]") + ", tlsVersions=" + (this.g != null ? c().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.e + ")";
    }

    /* compiled from: ConnectionSpec.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f2103a;

        /* renamed from: b, reason: collision with root package name */
        String[] f2104b;

        /* renamed from: c, reason: collision with root package name */
        String[] f2105c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2106d;

        a(boolean z) {
            this.f2103a = z;
        }

        public a(k kVar) {
            this.f2103a = kVar.f2102d;
            this.f2104b = kVar.f;
            this.f2105c = kVar.g;
            this.f2106d = kVar.e;
        }

        public a a(h... hVarArr) {
            if (!this.f2103a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[hVarArr.length];
            for (int i = 0; i < hVarArr.length; i++) {
                strArr[i] = hVarArr[i].bj;
            }
            return a(strArr);
        }

        public a a(String... strArr) {
            if (!this.f2103a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f2104b = (String[]) strArr.clone();
            return this;
        }

        public a a(af... afVarArr) {
            if (!this.f2103a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[afVarArr.length];
            for (int i = 0; i < afVarArr.length; i++) {
                strArr[i] = afVarArr[i].f;
            }
            return b(strArr);
        }

        public a b(String... strArr) {
            if (!this.f2103a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f2105c = (String[]) strArr.clone();
            return this;
        }

        public a a(boolean z) {
            if (!this.f2103a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f2106d = z;
            return this;
        }

        public k a() {
            return new k(this);
        }
    }
}
