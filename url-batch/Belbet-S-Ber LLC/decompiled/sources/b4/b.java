package b4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements f4.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f829a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f830b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f829a = x509TrustManager;
        this.f830b = method;
    }

    @Override // f4.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f830b.invoke(this.f829a, x509Certificate);
            i3.d.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return i3.d.a(this.f829a, bVar.f829a) && i3.d.a(this.f830b, bVar.f830b);
    }

    public final int hashCode() {
        return this.f830b.hashCode() + (this.f829a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f829a + ", findByIssuerAndSignatureMethod=" + this.f830b + ')';
    }
}
