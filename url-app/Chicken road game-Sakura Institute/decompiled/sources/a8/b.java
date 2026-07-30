package a8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements e8.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f539a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f540b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f539a = x509TrustManager;
        this.f540b = method;
    }

    @Override // e8.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f540b.invoke(this.f539a, x509Certificate);
            r6.k.d(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e9) {
            throw new AssertionError("unable to get issues and signature", e9);
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
        return r6.k.a(this.f539a, bVar.f539a) && r6.k.a(this.f540b, bVar.f540b);
    }

    public final int hashCode() {
        return this.f540b.hashCode() + (this.f539a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f539a + ", findByIssuerAndSignatureMethod=" + this.f540b + ')';
    }
}
