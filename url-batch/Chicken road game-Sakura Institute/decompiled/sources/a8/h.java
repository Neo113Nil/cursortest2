package a8;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import s7.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f551d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f552c;

    static {
        boolean z8 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z8 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f551d = z8;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        r6.k.e(newProvider, "newProvider()");
        this.f552c = newProvider;
    }

    @Override // a8.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        r6.k.f(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((q) obj) != q.f8662g) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(e6.n.a0(arrayList, 10));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                arrayList2.add(((q) obj2).f8669f);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // a8.o
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // a8.o
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f552c);
        r6.k.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // a8.o
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k8 = k();
        k8.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k8.getSocketFactory();
        r6.k.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // a8.o
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        r6.k.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                r6.k.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f550a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        r6.k.e(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
