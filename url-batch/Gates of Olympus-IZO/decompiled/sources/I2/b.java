package I2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements M2.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f2490a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2491b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f2490a = x509TrustManager;
        this.f2491b = method;
    }

    @Override // M2.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f2491b.invoke(this.f2490a, x509Certificate);
            Z1.i.d(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e3) {
            throw new AssertionError("unable to get issues and signature", e3);
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
        return Z1.i.a(this.f2490a, bVar.f2490a) && Z1.i.a(this.f2491b, bVar.f2491b);
    }

    public final int hashCode() {
        return this.f2491b.hashCode() + (this.f2490a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f2490a + ", findByIssuerAndSignatureMethod=" + this.f2491b + ')';
    }
}
