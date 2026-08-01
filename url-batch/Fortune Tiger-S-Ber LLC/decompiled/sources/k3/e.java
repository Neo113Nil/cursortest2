package k3;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2829d;
    public final Provider c = new BouncyCastleJsseProvider();

    static {
        boolean z3 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, d.class.getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f2829d = z3;
    }

    @Override // k3.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        u2.c.e(list, "protocols");
    }

    @Override // k3.o
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // k3.o
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.c);
        u2.c.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // k3.o
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        u2.c.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                u2.c.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        u2.c.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
