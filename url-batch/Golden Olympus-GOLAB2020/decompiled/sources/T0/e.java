package T0;

import V0.f;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class e implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    protected List f9316a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private X509Certificate[] f9317b;

    public e(InputStream inputStream, String str) {
        a(inputStream, str);
    }

    private void a(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, str.toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f9316a.add((X509TrustManager) trustManager);
                    }
                }
                V0.e.b(inputStream);
            } finally {
                V0.e.b(inputStream);
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e4) {
            f.d("SX509TM", "loadInputStream: exception : " + e4.getMessage());
        }
        f.b("SX509TM", "loadInputStream: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public void b(X509Certificate[] x509CertificateArr) {
        this.f9317b = x509CertificateArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        f.e("SX509TM", "checkClientTrusted: ");
        Iterator it = this.f9316a.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e4) {
                f.d("SX509TM", "checkServerTrusted CertificateException" + e4.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        b(x509CertificateArr);
        f.e("SX509TM", "checkServerTrusted begin,size=" + x509CertificateArr.length + ",authType=" + str);
        long currentTimeMillis = System.currentTimeMillis();
        int size = this.f9316a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                f.e("SX509TM", "check server i=" + i4);
                X509TrustManager x509TrustManager = (X509TrustManager) this.f9316a.get(i4);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    f.e("SX509TM", "client root ca size=" + acceptedIssuers.length);
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                f.e("SX509TM", "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e4) {
                f.d("SX509TM", "checkServerTrusted error :" + e4.getMessage() + " , time : " + i4);
                if (i4 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        f.d("SX509TM", "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e4;
                }
            }
        }
        f.b("SX509TM", "checkServerTrusted: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f9316a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e4) {
            f.d("SX509TM", "getAcceptedIssuers exception : " + e4.getMessage());
            return new X509Certificate[0];
        }
    }
}
