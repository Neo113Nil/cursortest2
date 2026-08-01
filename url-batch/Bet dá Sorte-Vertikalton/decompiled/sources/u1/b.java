package u1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements y1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f3945a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3946b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3945a = x509TrustManager;
        this.f3946b = method;
    }

    @Override // y1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f3946b.invoke(this.f3945a, x509Certificate);
            b1.d.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return b1.d.a(this.f3945a, bVar.f3945a) && b1.d.a(this.f3946b, bVar.f3946b);
    }

    public final int hashCode() {
        return this.f3946b.hashCode() + (this.f3945a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3945a + ", findByIssuerAndSignatureMethod=" + this.f3946b + ')';
    }
}
