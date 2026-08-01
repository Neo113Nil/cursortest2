package H1;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes.dex */
public final class e extends n {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f513c = new BouncyCastleJsseProvider();

    static {
        boolean z2 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, d.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        d = z2;
    }

    @Override // H1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k1.e.e(list, "protocols");
        super.d(sSLSocket, str, list);
    }

    @Override // H1.n
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // H1.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f513c);
        k1.e.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // H1.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        k1.e.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                k1.e.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        k1.e.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
