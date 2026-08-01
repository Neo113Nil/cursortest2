package z1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements D1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f4346a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4347b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f4346a = x509TrustManager;
        this.f4347b = method;
    }

    @Override // D1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f4347b.invoke(this.f4346a, x509Certificate);
            g1.d.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return g1.d.a(this.f4346a, bVar.f4346a) && g1.d.a(this.f4347b, bVar.f4347b);
    }

    public final int hashCode() {
        return this.f4347b.hashCode() + (this.f4346a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f4346a + ", findByIssuerAndSignatureMethod=" + this.f4347b + ')';
    }
}
