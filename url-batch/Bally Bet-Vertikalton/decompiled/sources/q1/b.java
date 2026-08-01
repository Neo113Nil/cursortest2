package q1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f3536a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3537b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3536a = x509TrustManager;
        this.f3537b = method;
    }

    @Override // u1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f3537b.invoke(this.f3536a, x509Certificate);
            X0.d.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return X0.d.a(this.f3536a, bVar.f3536a) && X0.d.a(this.f3537b, bVar.f3537b);
    }

    public final int hashCode() {
        return this.f3537b.hashCode() + (this.f3536a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3536a + ", findByIssuerAndSignatureMethod=" + this.f3537b + ')';
    }
}
