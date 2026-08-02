package O3;

import G3.s;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f2081a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f2082b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fb, code lost:
    
        if (java.lang.Integer.parseInt(r2) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    static {
        n kVar;
        n nVar;
        if (a2.i.r()) {
            for (Map.Entry entry : P3.c.f2096b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (P3.c.f2095a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(P3.d.f2097a);
                }
            }
            nVar = a.f2056d ? new a() : null;
            if (nVar == null) {
                r3 = c.f2060e ? new c() : null;
                kotlin.jvm.internal.i.b(r3);
                nVar = r3;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                kVar = h.f2066d ? new h() : null;
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                kVar = e.f2063d ? new e() : null;
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                kVar = m.f2079d ? new m() : null;
            }
            kVar = k.f2076c ? new k() : null;
            if (kVar == null) {
                String jvmVersion = System.getProperty("java.specification.version", CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                try {
                    kotlin.jvm.internal.i.d(jvmVersion, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
            nVar = kVar;
        }
        f2081a = nVar;
        f2082b = Logger.getLogger(s.class.getName());
        if (r3 == null) {
            nVar = new n();
            f2081a = nVar;
            f2082b = Logger.getLogger(s.class.getName());
        }
        nVar = r3;
        f2081a = nVar;
        f2082b = Logger.getLogger(s.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName(kotlin.jvm.internal.i.h("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Class<?> clientProviderClass = Class.forName(kotlin.jvm.internal.i.h("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Class<?> serverProviderClass = Class.forName(kotlin.jvm.internal.i.h("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
            Method getMethod = cls.getMethod("get", SSLSocket.class);
            Method removeMethod = cls.getMethod("remove", SSLSocket.class);
            kotlin.jvm.internal.i.d(putMethod, "putMethod");
            kotlin.jvm.internal.i.d(getMethod, "getMethod");
            kotlin.jvm.internal.i.d(removeMethod, "removeMethod");
            kotlin.jvm.internal.i.d(clientProviderClass, "clientProviderClass");
            kotlin.jvm.internal.i.d(serverProviderClass, "serverProviderClass");
            r3 = new j(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r3 == null) {
        }
        nVar = r3;
        f2081a = nVar;
        f2082b = Logger.getLogger(s.class.getName());
    }

    public static void i(String message, int i4, Throwable th) {
        kotlin.jvm.internal.i.e(message, "message");
        f2082b.log(i4 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public l b(X509TrustManager x509TrustManager) {
        return new S3.a(c(x509TrustManager));
    }

    public S3.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.i.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new S3.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i4) {
        kotlin.jvm.internal.i.e(address, "address");
        socket.connect(address, i4);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f2082b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        if (obj == null) {
            message = kotlin.jvm.internal.i.h(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", message);
        }
        i(message, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.i.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k4 = k();
            k4.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k4.getSocketFactory();
            kotlin.jvm.internal.i.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError(kotlin.jvm.internal.i.h(e4, "No System TLS: "), e4);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.i.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.i.d(arrays, "toString(this)");
        throw new IllegalStateException(kotlin.jvm.internal.i.h(arrays, "Unexpected default trust managers: ").toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
