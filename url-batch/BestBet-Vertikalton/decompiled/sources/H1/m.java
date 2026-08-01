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
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes.dex */
public final class m extends n {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f524c = new OpenJSSE();

    static {
        boolean z2 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, l.class.getClassLoader());
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
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f524c);
        k1.e.d(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // H1.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f524c);
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
