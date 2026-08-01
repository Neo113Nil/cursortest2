package q1;

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

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3958d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f3959c = new OpenJSSE();

    static {
        boolean z2 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, l.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f3958d = z2;
    }

    @Override // q1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.f.e(list, "protocols");
        super.d(sSLSocket, str, list);
    }

    @Override // q1.n
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // q1.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f3959c);
        X0.f.d(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // q1.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f3959c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        X0.f.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X0.f.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        X0.f.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
