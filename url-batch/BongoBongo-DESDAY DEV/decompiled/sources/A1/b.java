package A1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements E1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f20a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f21b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f20a = x509TrustManager;
        this.f21b = method;
    }

    @Override // E1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f21b.invoke(this.f20a, x509Certificate);
            h1.d.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return h1.d.a(this.f20a, bVar.f20a) && h1.d.a(this.f21b, bVar.f21b);
    }

    public final int hashCode() {
        return this.f21b.hashCode() + (this.f20a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f20a + ", findByIssuerAndSignatureMethod=" + this.f21b + ')';
    }
}
