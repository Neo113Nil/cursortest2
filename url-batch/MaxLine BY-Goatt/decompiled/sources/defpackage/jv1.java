package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jv1 extends r12 {
    public static final boolean d;
    public final Provider c = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, iv1.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        d = z;
    }

    @Override // defpackage.r12
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
    }

    @Override // defpackage.r12
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // defpackage.r12
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.c);
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // defpackage.r12
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        trustManagers.getClass();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                trustManager.getClass();
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        arrays.getClass();
        b71.u(arrays, "Unexpected default trust managers: ");
        return null;
    }
}
