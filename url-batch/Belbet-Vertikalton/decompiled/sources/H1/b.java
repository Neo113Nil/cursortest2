package H1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements L1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f546a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f547b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f546a = x509TrustManager;
        this.f547b = method;
    }

    @Override // L1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f547b.invoke(this.f546a, x509Certificate);
            j1.h.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
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
        return j1.h.a(this.f546a, bVar.f546a) && j1.h.a(this.f547b, bVar.f547b);
    }

    public final int hashCode() {
        return this.f547b.hashCode() + (this.f546a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f546a + ", findByIssuerAndSignatureMethod=" + this.f547b + ')';
    }
}
