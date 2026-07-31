package I2;

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

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2498d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f2499c = new BouncyCastleJsseProvider();

    static {
        boolean z3 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, d.class.getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f2498d = z3;
    }

    @Override // I2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z1.i.f(list, "protocols");
        super.d(sSLSocket, str, list);
    }

    @Override // I2.n
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // I2.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f2499c);
        Z1.i.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // I2.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Z1.i.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Z1.i.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        Z1.i.e(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
