package O3;

import G3.t;
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

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2066d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f2067c;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f2066d = z;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        kotlin.jvm.internal.i.d(newProvider, "newProvider()");
        this.f2067c = newProvider;
    }

    @Override // O3.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((t) obj) != t.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(d3.k.Y(arrayList));
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                arrayList2.add(((t) obj2).f1006a);
            }
            Object[] array = arrayList2.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // O3.n
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // O3.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f2067c);
        kotlin.jvm.internal.i.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // O3.n
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k4 = k();
        k4.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k4.getSocketFactory();
        kotlin.jvm.internal.i.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // O3.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.i.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f2065a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.i.d(arrays, "toString(this)");
        throw new IllegalStateException(kotlin.jvm.internal.i.h(arrays, "Unexpected default trust managers: ").toString());
    }
}
