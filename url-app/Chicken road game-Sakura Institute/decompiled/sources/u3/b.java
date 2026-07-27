package u3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements y3.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f10933a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f10934b;

    public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f10933a = trustManager;
        this.f10934b = findByIssuerAndSignatureMethod;
    }

    @Override // y3.d
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object invoke = this.f10934b.invoke(this.f10933a, cert);
            Intrinsics.d(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return Intrinsics.a(this.f10933a, bVar.f10933a) && Intrinsics.a(this.f10934b, bVar.f10934b);
    }

    public final int hashCode() {
        return this.f10934b.hashCode() + (this.f10933a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f10933a + ", findByIssuerAndSignatureMethod=" + this.f10934b + ')';
    }
}
