package h6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements l6.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f4350a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4351b;

    public b(X509TrustManager trustManager, Method method) {
        i.e(trustManager, "trustManager");
        this.f4350a = trustManager;
        this.f4351b = method;
    }

    @Override // l6.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f4351b.invoke(this.f4350a, x509Certificate);
            i.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return i.a(this.f4350a, bVar.f4350a) && i.a(this.f4351b, bVar.f4351b);
    }

    public final int hashCode() {
        return this.f4351b.hashCode() + (this.f4350a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f4350a + ", findByIssuerAndSignatureMethod=" + this.f4351b + ')';
    }
}
