package N6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements R6.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f1874a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1875b;

    public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f1874a = trustManager;
        this.f1875b = findByIssuerAndSignatureMethod;
    }

    @Override // R6.d
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object invoke = this.f1875b.invoke(this.f1874a, cert);
            Intrinsics.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e7) {
            throw new AssertionError("unable to get issues and signature", e7);
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
        return Intrinsics.a(this.f1874a, bVar.f1874a) && Intrinsics.a(this.f1875b, bVar.f1875b);
    }

    public final int hashCode() {
        return this.f1875b.hashCode() + (this.f1874a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f1874a + ", findByIssuerAndSignatureMethod=" + this.f1875b + ')';
    }
}
