package U0;

import V0.d;
import V0.f;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public class a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            f.e("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            c.a(str, x509Certificate, true);
            d.b();
            return true;
        } catch (SSLException e4) {
            f.d("", "SSLException : " + e4.getMessage());
            return false;
        }
    }
}
