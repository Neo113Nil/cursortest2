package x1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements B1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f4267a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4268b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f4267a = x509TrustManager;
        this.f4268b = method;
    }

    @Override // B1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f4268b.invoke(this.f4267a, x509Certificate);
            e1.d.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return e1.d.a(this.f4267a, bVar.f4267a) && e1.d.a(this.f4268b, bVar.f4268b);
    }

    public final int hashCode() {
        return this.f4268b.hashCode() + (this.f4267a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f4267a + ", findByIssuerAndSignatureMethod=" + this.f4268b + ')';
    }
}
