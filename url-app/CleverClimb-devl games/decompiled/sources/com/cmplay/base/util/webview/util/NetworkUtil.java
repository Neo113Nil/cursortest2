package com.cmplay.base.util.webview.util;

import com.mopub.common.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.a.b.a.a;
import org.apache.a.b.b.g;
import org.apache.a.c.c.e;
import org.apache.a.c.c.f;
import org.apache.a.f.b.h;
import org.apache.a.h.l;
import org.apache.a.i.b;
import org.apache.a.i.c;
import org.apache.a.j;
import org.apache.a.k.d;
import org.apache.a.r;

/* loaded from: classes.dex */
public class NetworkUtil {
    private static final int CONNECTION_TIMEOUT = 10000;
    public static final int NATIVE_ERROR = 600;
    public static final int SOCKET_TIMEOUT = 602;
    private static final int SO_SOCKET_TIMEOUT = 10000;
    public static final int UNKNOWN_HOST = 601;
    private static NetworkUtil sInstance;
    private ExecutorService mExecutorService = Executors.newFixedThreadPool(5);

    public static NetworkUtil getInstance() {
        if (sInstance == null) {
            synchronized (NetworkUtil.class) {
                if (sInstance == null) {
                    sInstance = new NetworkUtil();
                }
            }
        }
        return sInstance;
    }

    private NetworkUtil() {
    }

    public void post(final String str, final HashMap<String, String> hashMap) {
        final h httpClient = getHttpClient();
        this.mExecutorService.execute(new Runnable() { // from class: com.cmplay.base.util.webview.util.NetworkUtil.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
            @Override // java.lang.Runnable
            public void run() {
                int i;
                StringBuilder sb;
                j b2;
                int b3;
                String str2 = null;
                int i2 = NetworkUtil.NATIVE_ERROR;
                i2 = NetworkUtil.NATIVE_ERROR;
                try {
                    try {
                        g gVar = new g(str);
                        com.cmplay.base.util.h.a("feedback url is " + str);
                        NetworkUtil.this.addMultipartEntityToHttpPost(gVar, hashMap);
                        r execute = httpClient.execute(gVar);
                        b2 = execute.b();
                        b3 = execute.a().b();
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    ?? d2 = d.d(b2);
                    NetworkUtil.this.closeHttpClientConnection(httpClient);
                    ?? sb2 = new StringBuilder();
                    sb2.append("Report feedback,status is ");
                    sb2.append(b3);
                    sb2.append(",response msg is ");
                    sb2.append(d2);
                    sb = sb2;
                    i2 = d2;
                } catch (Exception e2) {
                    e = e2;
                    i2 = b3;
                    com.cmplay.base.util.h.b(e.getMessage());
                    String message = e.getMessage();
                    try {
                        if (e instanceof UnknownHostException) {
                            i = NetworkUtil.UNKNOWN_HOST;
                        } else {
                            i = i2;
                            if (e instanceof InterruptedIOException) {
                                i = NetworkUtil.SOCKET_TIMEOUT;
                            }
                        }
                        NetworkUtil.this.closeHttpClientConnection(httpClient);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Report feedback,status is ");
                        sb3.append(i);
                        sb3.append(",response msg is ");
                        sb3.append(message);
                        sb = sb3;
                        i2 = ",response msg is ";
                        str2 = sb.toString();
                        com.cmplay.base.util.h.a(str2);
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = message;
                        NetworkUtil.this.closeHttpClientConnection(httpClient);
                        com.cmplay.base.util.h.a("Report feedback,status is " + i2 + ",response msg is " + str2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i2 = b3;
                    NetworkUtil.this.closeHttpClientConnection(httpClient);
                    com.cmplay.base.util.h.a("Report feedback,status is " + i2 + ",response msg is " + str2);
                    throw th;
                }
                str2 = sb.toString();
                com.cmplay.base.util.h.a(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMultipartEntityToHttpPost(g gVar, HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            arrayList.add(new l(entry.getKey(), entry.getValue()));
        }
        try {
            gVar.setEntity(new a(arrayList, "UTF-8"));
        } catch (Exception e) {
            com.cmplay.base.util.h.b(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void closeHttpClientConnection(h hVar) {
        if (hVar != null) {
            hVar.q().b();
        }
    }

    public h getHttpClient() {
        b bVar = new b();
        c.c(bVar, 10000);
        c.a(bVar, 10000);
        org.apache.a.c.c.g gVar = new org.apache.a.c.c.g();
        gVar.a(new f(Constants.HTTP, e.a(), 80));
        gVar.a(new f(Constants.HTTPS, getSocketFactory(), 443));
        return new h(new org.apache.a.f.c.a.g(bVar, gVar), bVar);
    }

    public org.apache.a.c.d.d getSocketFactory() {
        org.apache.a.c.d.d dVar;
        org.apache.a.c.d.d socketFactory = org.apache.a.c.d.d.getSocketFactory();
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            dVar = new MySSLSocketFactory(keyStore);
        } catch (Exception e) {
            e = e;
            dVar = socketFactory;
        }
        try {
            dVar.setHostnameVerifier(org.apache.a.c.d.d.ALLOW_ALL_HOSTNAME_VERIFIER);
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return dVar;
        }
        return dVar;
    }

    public class MySSLSocketFactory extends org.apache.a.c.d.d {
        SSLContext sslContext;

        public MySSLSocketFactory(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
            super(keyStore);
            this.sslContext = SSLContext.getInstance(org.apache.a.c.d.d.TLS);
            this.sslContext.init(null, new TrustManager[]{new X509TrustManager() { // from class: com.cmplay.base.util.webview.util.NetworkUtil.MySSLSocketFactory.1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            }}, null);
        }

        @Override // org.apache.a.c.d.d, org.apache.a.c.c.d
        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
            return this.sslContext.getSocketFactory().createSocket(socket, str, i, z);
        }

        @Override // org.apache.a.c.d.d, org.apache.a.c.c.j
        public Socket createSocket() throws IOException {
            return this.sslContext.getSocketFactory().createSocket();
        }
    }
}
