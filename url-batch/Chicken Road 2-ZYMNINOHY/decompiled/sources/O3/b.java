package O3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements S3.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f2058a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2059b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f2058a = x509TrustManager;
        this.f2059b = method;
    }

    @Override // S3.d
    public final X509Certificate a(X509Certificate cert) {
        kotlin.jvm.internal.i.e(cert, "cert");
        try {
            Object invoke = this.f2059b.invoke(this.f2058a, cert);
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e4) {
            throw new AssertionError("unable to get issues and signature", e4);
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
        return kotlin.jvm.internal.i.a(this.f2058a, bVar.f2058a) && kotlin.jvm.internal.i.a(this.f2059b, bVar.f2059b);
    }

    public final int hashCode() {
        return this.f2059b.hashCode() + (this.f2058a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f2058a + ", findByIssuerAndSignatureMethod=" + this.f2059b + ')';
    }
}
