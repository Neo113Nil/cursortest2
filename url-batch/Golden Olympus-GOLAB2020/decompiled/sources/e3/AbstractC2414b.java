package e3;

import android.content.Context;
import android.content.res.Resources;
import b3.AbstractC1374a;
import f2.AbstractC2420c;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2414b {
    private static final X509TrustManager a() {
        return e(null);
    }

    private static final KeyStore b(Context context, int i4) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream openRawResource = resources.openRawResource(i4);
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X509").generateCertificate(openRawResource);
            AbstractC2420c.a(openRawResource, null);
            Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            String resourceEntryName = resources.getResourceEntryName(i4);
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setCertificateEntry(resourceEntryName, (X509Certificate) generateCertificate);
            Intrinsics.checkNotNullExpressionValue(keyStore, "getInstance(KeyStore.get…certName, cert)\n        }");
            return keyStore;
        } finally {
        }
    }

    public static final SSLSocketFactory c(TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        sSLContext.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getInstance(\"SSL\")\n     … }\n        .socketFactory");
        return socketFactory;
    }

    public static final X509TrustManager d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f(a(), e(b(context, AbstractC1374a.f13306a)));
    }

    private static final X509TrustManager e(KeyStore keyStore) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNullExpressionValue(trustManagers, "getInstance(KeyManagerFa… }\n        .trustManagers");
        Object G3 = AbstractC3219i.G(trustManagers);
        Intrinsics.checkNotNull(G3, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        return (X509TrustManager) G3;
    }

    private static final X509TrustManager f(X509TrustManager... x509TrustManagerArr) {
        return new C2413a(x509TrustManagerArr);
    }
}
