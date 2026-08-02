package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fae {
    public static final Object a = new Object();
    public static final String b = fak.class.getName();
    public static final String c = faj.class.getName();
    public static fai d;
    public fah e;

    public fae(fah fahVar) {
        this.e = fahVar;
    }

    public static final void a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new fal()}, null);
            SSLContext.setDefault(sSLContext);
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private fae() {
    }
}
