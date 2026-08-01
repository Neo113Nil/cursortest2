package H1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements L1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f506a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f507b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f506a = x509TrustManager;
        this.f507b = method;
    }

    @Override // L1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f507b.invoke(this.f506a, x509Certificate);
            k1.e.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k1.e.a(this.f506a, bVar.f506a) && k1.e.a(this.f507b, bVar.f507b);
    }

    public final int hashCode() {
        return this.f507b.hashCode() + (this.f506a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f506a + ", findByIssuerAndSignatureMethod=" + this.f507b + ')';
    }
}
