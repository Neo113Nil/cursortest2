package u1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements y1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f3885a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3886b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3885a = x509TrustManager;
        this.f3886b = method;
    }

    @Override // y1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f3886b.invoke(this.f3885a, x509Certificate);
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
        return b1.d.a(this.f3885a, bVar.f3885a) && b1.d.a(this.f3886b, bVar.f3886b);
    }

    public final int hashCode() {
        return this.f3886b.hashCode() + (this.f3885a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3885a + ", findByIssuerAndSignatureMethod=" + this.f3886b + ')';
    }
}
