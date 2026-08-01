package k3;

import android.util.Log;
import c3.q;
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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f2841a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f2842b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (java.lang.Integer.parseInt(r1) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    static {
        o lVar;
        if (g2.f.o()) {
            for (Map.Entry entry : l3.c.f2886b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (l3.c.f2885a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(l3.d.f2887a);
                }
            }
            lVar = a.f2820d ? new a() : null;
            if (lVar == null) {
                r2 = c.f2823e ? new c() : null;
                u2.c.b(r2);
                lVar = r2;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                lVar = h.f2831d ? new h() : null;
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                lVar = e.f2829d ? new e() : null;
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                lVar = n.f2840d ? new n() : null;
            }
            lVar = l.c ? new l() : null;
            if (lVar == null) {
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    u2.c.d(property, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
        }
        f2841a = lVar;
        f2842b = Logger.getLogger(q.class.getName());
        if (r2 == null) {
            lVar = new o();
            f2841a = lVar;
            f2842b = Logger.getLogger(q.class.getName());
        }
        lVar = r2;
        f2841a = lVar;
        f2842b = Logger.getLogger(q.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method method = cls.getMethod("put", SSLSocket.class, cls2);
            Method method2 = cls.getMethod("get", SSLSocket.class);
            Method method3 = cls.getMethod("remove", SSLSocket.class);
            u2.c.d(method, "putMethod");
            u2.c.d(method2, "getMethod");
            u2.c.d(method3, "removeMethod");
            u2.c.d(cls3, "clientProviderClass");
            u2.c.d(cls4, "serverProviderClass");
            r2 = new j(method, method2, method3, cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r2 == null) {
        }
        lVar = r2;
        f2841a = lVar;
        f2842b = Logger.getLogger(q.class.getName());
    }

    public static void i(String str, int i4, Throwable th) {
        u2.c.e(str, "message");
        f2842b.log(i4 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public l0.g b(X509TrustManager x509TrustManager) {
        return new o3.a(c(x509TrustManager));
    }

    public o3.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        u2.c.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new o3.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        u2.c.e(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i4) {
        u2.c.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i4);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f2842b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        u2.c.e(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        u2.c.e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        u2.c.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k4 = k();
            k4.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k4.getSocketFactory();
            u2.c.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError("No System TLS: " + e4, e4);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        u2.c.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                u2.c.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        u2.c.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
