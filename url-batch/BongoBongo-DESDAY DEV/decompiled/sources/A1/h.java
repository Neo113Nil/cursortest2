package A1;

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
public final class h extends o {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f29c;

    static {
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        d = z2;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        h1.d.d(newProvider, "newProvider()");
        this.f29c = newProvider;
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h1.d.e(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.d(sSLSocket, str, list);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) K0.e.c(list).toArray(new String[0]));
        }
    }

    @Override // A1.o
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // A1.o
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f29c);
        h1.d.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // A1.o
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k2 = k();
        k2.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k2.getSocketFactory();
        h1.d.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // A1.o
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        h1.d.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                h1.d.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f28a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        h1.d.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
