package u3;

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
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10948d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f10949c;

    static {
        boolean z4 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z4 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f10948d = z4;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(newProvider, "newProvider()");
        this.f10949c = newProvider;
    }

    @Override // u3.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.d(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) H1.f.i(protocols).toArray(new String[0]));
        }
    }

    @Override // u3.n
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        super.f(sslSocket);
        return null;
    }

    @Override // u3.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f10949c);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // u3.n
    public final SSLSocketFactory l(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext k4 = k();
        k4.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = k4.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // u3.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f10947a);
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }
}
