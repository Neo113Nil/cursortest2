package k3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f2821a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2822b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f2821a = x509TrustManager;
        this.f2822b = method;
    }

    @Override // o3.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f2822b.invoke(this.f2821a, x509Certificate);
            u2.c.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
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
        return u2.c.a(this.f2821a, bVar.f2821a) && u2.c.a(this.f2822b, bVar.f2822b);
    }

    public final int hashCode() {
        return this.f2822b.hashCode() + (this.f2821a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f2821a + ", findByIssuerAndSignatureMethod=" + this.f2822b + ')';
    }
}
