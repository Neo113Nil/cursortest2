package w1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements A1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4172b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f4171a = x509TrustManager;
        this.f4172b = method;
    }

    @Override // A1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f4172b.invoke(this.f4171a, x509Certificate);
            d1.d.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return d1.d.a(this.f4171a, bVar.f4171a) && d1.d.a(this.f4172b, bVar.f4172b);
    }

    public final int hashCode() {
        return this.f4172b.hashCode() + (this.f4171a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f4171a + ", findByIssuerAndSignatureMethod=" + this.f4172b + ')';
    }
}
