package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v4 implements jm2 {
    public final X509TrustManager PxuCJdSBwIXG;
    public final Method lS5Rgt96tfkO;

    public v4(X509TrustManager x509TrustManager, Method method) {
        this.PxuCJdSBwIXG = x509TrustManager;
        this.lS5Rgt96tfkO = method;
    }

    @Override // defpackage.jm2
    public final X509Certificate PxuCJdSBwIXG(X509Certificate x509Certificate) {
        try {
            Object invoke = this.lS5Rgt96tfkO.invoke(this.PxuCJdSBwIXG, x509Certificate);
            invoke.getClass();
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
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return this.PxuCJdSBwIXG.equals(v4Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(v4Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.PxuCJdSBwIXG + ", findByIssuerAndSignatureMethod=" + this.lS5Rgt96tfkO + ')';
    }
}
