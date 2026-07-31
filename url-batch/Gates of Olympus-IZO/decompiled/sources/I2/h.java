package I2;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2501d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f2502c;

    static {
        boolean z3 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z3 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f2501d = z3;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        Z1.i.e(newProvider, "newProvider()");
        this.f2502c = newProvider;
    }

    @Override // I2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z1.i.f(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.d(sSLSocket, str, list);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) F0.a.e(list).toArray(new String[0]));
        }
    }

    @Override // I2.n
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // I2.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f2502c);
        Z1.i.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // I2.n
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k3 = k();
        k3.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k3.getSocketFactory();
        Z1.i.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // I2.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Z1.i.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Z1.i.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f2500a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        Z1.i.e(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
