package com.baidu.mshield.b.d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mshield.ac.F;
import com.baidu.mshield.b.a.g;
import com.baidu.mshield.b.f.e;
import com.crrepa.ble.sifli.dfu.constants.Timeout;
import com.google.common.net.HttpHeaders;
import com.yanzhenjie.kalle.i;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, SSLSocketFactory> f8317a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Context f8318b;

    /* renamed from: d, reason: collision with root package name */
    public HttpURLConnection f8320d;

    /* renamed from: e, reason: collision with root package name */
    public String f8321e;

    /* renamed from: f, reason: collision with root package name */
    public String f8322f;

    /* renamed from: g, reason: collision with root package name */
    public String f8323g;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8319c = new byte[1024];

    /* renamed from: h, reason: collision with root package name */
    public int f8324h = Timeout.SIFLI_DFU_COMMAND_TIMEOUT;

    /* renamed from: i, reason: collision with root package name */
    public int f8325i = Timeout.SIFLI_DFU_COMMAND_TIMEOUT;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8326j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8327k = false;

    /* renamed from: l, reason: collision with root package name */
    public String f8328l = "";

    public class a implements HostnameVerifier {
        public a(b bVar) {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return "mshield.baidu.com".equals(str);
        }
    }

    /* renamed from: com.baidu.mshield.b.d.b$b, reason: collision with other inner class name */
    public class C0083b implements X509TrustManager {

        /* renamed from: a, reason: collision with root package name */
        public X509TrustManager f8329a;

        /* renamed from: b, reason: collision with root package name */
        public X509TrustManagerExtensions f8330b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f8331c;

        public C0083b(b bVar, X509TrustManager x509TrustManager, String str) {
            this.f8329a = x509TrustManager;
            this.f8331c = str;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.f8329a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            com.baidu.mshield.b.c.a.b("... checkServerTrusted ...");
            try {
                if (Build.VERSION.SDK_INT < 24) {
                    this.f8329a.checkServerTrusted(x509CertificateArr, str);
                    return;
                }
                com.baidu.mshield.b.c.a.b("checkServerTrusted host=" + this.f8331c);
                if (this.f8330b == null) {
                    this.f8330b = new X509TrustManagerExtensions(this.f8329a);
                }
                this.f8330b.checkServerTrusted(x509CertificateArr, str, this.f8331c);
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.b("... checkServerTrusted .error ...");
                com.baidu.mshield.b.c.a.a(th);
                for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                    if ((th2 instanceof CertificateExpiredException) || (th2 instanceof CertificateNotYetValidException)) {
                        return;
                    }
                }
                if (th instanceof CertificateException) {
                    com.baidu.mshield.b.c.a.b("  throw e;");
                    throw th;
                }
                com.baidu.mshield.b.c.a.b("  throw new CertificateException();...");
                throw new CertificateException();
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.f8329a.getAcceptedIssuers();
        }
    }

    public b(Context context, Handler handler) {
        this.f8318b = context.getApplicationContext();
    }

    public String a() {
        return this.f8323g;
    }

    public final String b() {
        try {
            Method declaredMethod = F.class.getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = F.class.getDeclaredMethod("gzd", Context.class);
            declaredMethod2.setAccessible(true);
            return (String) declaredMethod2.invoke(invoke, this.f8318b);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public final InputStream c(String str, String str2) {
        if (!com.baidu.mshield.b.a.d.b(this.f8318b)) {
            throw new NetworkErrorException("requestFromServerStream no network");
        }
        HttpURLConnection a8 = a((Map<String, String>) null, str2);
        this.f8320d = a8;
        if (a8 == null || a8.getResponseCode() != 200) {
            return null;
        }
        if (str == null) {
            if ("gzip".equalsIgnoreCase(this.f8320d.getContentEncoding())) {
                this.f8326j = true;
            } else {
                this.f8326j = false;
            }
            return this.f8320d.getInputStream();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f8320d.getOutputStream());
        bufferedOutputStream.write(com.baidu.mshield.b.a.c.a(str.getBytes()));
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        if ("gzip".equalsIgnoreCase(this.f8320d.getContentEncoding())) {
            this.f8326j = true;
        } else {
            this.f8326j = false;
        }
        return this.f8320d.getInputStream();
    }

    public final void a(String str, String str2) {
        this.f8321e = str;
        this.f8322f = str2;
        try {
            this.f8328l = new URL(str2).getHost();
        } catch (MalformedURLException e8) {
            com.baidu.mshield.b.c.a.a(e8);
        }
    }

    public final void a(HttpsURLConnection httpsURLConnection, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f8328l = str;
            }
            Map<String, SSLSocketFactory> map = f8317a;
            SSLSocketFactory sSLSocketFactory = map.get(this.f8328l);
            if (sSLSocketFactory != null) {
                httpsURLConnection.setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                return;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length >= 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    sSLContext.init(null, new TrustManager[]{new C0083b(this, (X509TrustManager) trustManager, this.f8328l)}, new SecureRandom());
                    SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                    if (!TextUtils.isEmpty(this.f8328l)) {
                        map.put(this.f8328l, socketFactory);
                        httpsURLConnection.setHostnameVerifier(new a(this));
                    } else {
                        httpsURLConnection.setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                    }
                    httpsURLConnection.setSSLSocketFactory(socketFactory);
                    return;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
    }

    public final String b(InputStream inputStream) {
        byte[] a8;
        if (inputStream == null || (a8 = a(inputStream)) == null) {
            return null;
        }
        if (this.f8326j) {
            a8 = com.baidu.mshield.b.a.c.b(a8);
        }
        if (a8 == null) {
            return null;
        }
        return new String(a8);
    }

    public String b(String str, String str2) {
        InputStream inputStream;
        d.b();
        try {
            try {
                try {
                    a(HttpManager.HTTP_GET, str);
                    inputStream = c(null, str2);
                    if (inputStream == null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th) {
                                com.baidu.mshield.b.c.a.a(th);
                            }
                        }
                        HttpURLConnection httpURLConnection = this.f8320d;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            this.f8320d = null;
                        }
                        return null;
                    }
                    try {
                        String b8 = b(inputStream);
                        try {
                            inputStream.close();
                            HttpURLConnection httpURLConnection2 = this.f8320d;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                                this.f8320d = null;
                            }
                        } catch (Throwable th2) {
                            com.baidu.mshield.b.c.a.a(th2);
                        }
                        return b8;
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                com.baidu.mshield.b.c.a.a(th4);
                                throw th;
                            }
                        }
                        HttpURLConnection httpURLConnection3 = this.f8320d;
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                            this.f8320d = null;
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                }
            } catch (Throwable th6) {
                com.baidu.mshield.b.c.a.a(th6);
                d.a();
                return "";
            }
            com.baidu.mshield.b.c.a.a(th6);
            d.a();
            return "";
        } finally {
            d.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.net.HttpURLConnection] */
    public final HttpURLConnection a(Map<String, String> map, String str) {
        int i8;
        HttpsURLConnection httpsURLConnection = null;
        String str2 = null;
        httpsURLConnection = null;
        if (this.f8327k) {
            return null;
        }
        if (!TextUtils.isEmpty(this.f8321e) && !TextUtils.isEmpty(this.f8322f)) {
            if (!this.f8321e.equals(HttpManager.HTTP_POST) && !this.f8321e.equals(HttpManager.HTTP_GET)) {
                this.f8321e = HttpManager.HTTP_POST;
            }
            URL url = new URL(this.f8322f);
            if (com.baidu.mshield.b.a.d.c(this.f8318b)) {
                i8 = 80;
            } else {
                str2 = System.getProperties().getProperty("http.proxyHost");
                String property = System.getProperties().getProperty("http.proxyPort");
                if (!TextUtils.isEmpty(property)) {
                    try {
                        i8 = Integer.parseInt(property);
                    } catch (Throwable unused) {
                    }
                }
                i8 = -1;
            }
            if (str2 != null && i8 > 0) {
                httpsURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str2, i8)));
            } else {
                httpsURLConnection = (HttpURLConnection) url.openConnection();
            }
            if ("https".equals(url.getProtocol())) {
                a(httpsURLConnection, str);
            }
            httpsURLConnection.setRequestMethod(this.f8321e);
            httpsURLConnection.setDoInput(true);
            if (HttpManager.HTTP_POST.equals(this.f8321e)) {
                httpsURLConnection.setDoOutput(true);
            }
            this.f8323g = e.a(b());
            com.baidu.mshield.b.c.a.a("sdkhttputilcuid====" + this.f8323g);
            httpsURLConnection.setInstanceFollowRedirects(true);
            httpsURLConnection.setConnectTimeout(this.f8324h);
            httpsURLConnection.setReadTimeout(this.f8325i);
            httpsURLConnection.setRequestProperty("x-device-id", this.f8323g);
            String str3 = com.baidu.mshield.b.a.a.f8309a;
            String a8 = com.baidu.mshield.b.a.d.a(this.f8318b);
            if (!TextUtils.isEmpty(str)) {
                httpsURLConnection.setRequestProperty("Host", str);
            }
            String str4 = "mshield/" + str3 + "/" + a8 + "/4.2.6";
            com.baidu.mshield.b.c.a.a("useragent==" + str4);
            httpsURLConnection.setRequestProperty("User-Agent", str4);
            httpsURLConnection.setRequestProperty(HttpHeaders.PRAGMA, "no-cache");
            httpsURLConnection.setRequestProperty("Accept", i.VALUE_ACCEPT_ALL);
            httpsURLConnection.setRequestProperty("Content-Type", i.VALUE_APPLICATION_URLENCODED);
            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            httpsURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().getLanguage());
            httpsURLConnection.setRequestProperty("x-sdk-ver", "mshield/4.2.6");
            httpsURLConnection.setRequestProperty("x-plu-ver", "x0/4.2.6");
            httpsURLConnection.setRequestProperty("x-app-ver", this.f8318b.getPackageName() + "/" + a8);
            StringBuilder sb = new StringBuilder();
            sb.append("android/");
            sb.append(g.b());
            httpsURLConnection.setRequestProperty("x-sys-ver", sb.toString());
            httpsURLConnection.setRequestProperty("x-sys-dev", g.a(this.f8318b) + "/" + g.a());
            httpsURLConnection.setRequestProperty("x-api-ver", String.valueOf(Build.VERSION.SDK_INT));
            if (map != null) {
                for (String str5 : map.keySet()) {
                    httpsURLConnection.setRequestProperty(str5, map.get(str5));
                }
            }
        }
        return httpsURLConnection;
    }

    public String a(String str) {
        return b(str, "");
    }

    public String a(String str, byte[] bArr) {
        return a(str, "", bArr);
    }

    public String a(String str, String str2, byte[] bArr) {
        InputStream inputStream;
        d.b();
        try {
            a(HttpManager.HTTP_POST, str);
            try {
                inputStream = a(bArr, str2);
                if (inputStream == null) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    HttpURLConnection httpURLConnection = this.f8320d;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        this.f8320d = null;
                    }
                    d.a();
                    return null;
                }
                try {
                    String b8 = b(inputStream);
                    inputStream.close();
                    HttpURLConnection httpURLConnection2 = this.f8320d;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                        this.f8320d = null;
                    }
                    d.a();
                    return b8;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    HttpURLConnection httpURLConnection3 = this.f8320d;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                        this.f8320d = null;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            d.a();
            throw th3;
        }
    }

    public final InputStream a(byte[] bArr, String str) {
        if (com.baidu.mshield.b.a.d.b(this.f8318b)) {
            HttpURLConnection a8 = a((Map<String, String>) null, str);
            this.f8320d = a8;
            if (a8 == null) {
                return null;
            }
            if (bArr == null) {
                if ("gzip".equalsIgnoreCase(a8.getContentEncoding())) {
                    this.f8326j = true;
                } else {
                    this.f8326j = false;
                }
                return this.f8320d.getInputStream();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f8320d.getOutputStream());
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            int responseCode = this.f8320d.getResponseCode();
            try {
                com.baidu.mshield.b.c.a.b("httpcode:" + responseCode);
                com.baidu.mshield.b.c.a.b("httpcontent:" + this.f8320d.getContent());
                com.baidu.mshield.b.c.a.b("httpresponse:" + this.f8320d.getResponseMessage());
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.a(th);
            }
            if ("gzip".equalsIgnoreCase(this.f8320d.getContentEncoding())) {
                this.f8326j = true;
            } else {
                this.f8326j = false;
            }
            if (responseCode == 200) {
                return this.f8320d.getInputStream();
            }
            throw new c(responseCode);
        }
        throw new NetworkErrorException("requestFromServerStreamByte no network");
    }

    public final byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(this.f8319c);
            if (read != -1) {
                byteArrayOutputStream.write(this.f8319c, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }
}
