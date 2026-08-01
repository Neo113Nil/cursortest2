package q1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f3937a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3938b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3937a = x509TrustManager;
        this.f3938b = method;
    }

    @Override // u1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f3938b.invoke(this.f3937a, x509Certificate);
            X0.f.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return X0.f.a(this.f3937a, bVar.f3937a) && X0.f.a(this.f3938b, bVar.f3938b);
    }

    public final int hashCode() {
        return this.f3938b.hashCode() + (this.f3937a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3937a + ", findByIssuerAndSignatureMethod=" + this.f3938b + ')';
    }
}
