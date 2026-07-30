package a8;

import android.util.Log;
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
import s7.p;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f570a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f571b;

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
        if (j4.i.p()) {
            for (Map.Entry entry : b8.c.f1404b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (b8.c.f1403a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(b8.d.f1405a);
                }
            }
            lVar = a.f537d ? new a() : null;
            if (lVar == null) {
                r2 = c.f541e ? new c() : null;
                r6.k.c(r2);
                lVar = r2;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                lVar = h.f551d ? new h() : null;
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                lVar = e.f548d ? new e() : null;
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                lVar = n.f568d ? new n() : null;
            }
            lVar = l.f561c ? new l() : null;
            if (lVar == null) {
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    r6.k.e(property, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
        }
        f570a = lVar;
        f571b = Logger.getLogger(p.class.getName());
        if (r2 == null) {
            lVar = new o();
            f570a = lVar;
            f571b = Logger.getLogger(p.class.getName());
        }
        lVar = r2;
        f570a = lVar;
        f571b = Logger.getLogger(p.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method method = cls.getMethod("put", SSLSocket.class, cls2);
            Method method2 = cls.getMethod("get", SSLSocket.class);
            Method method3 = cls.getMethod("remove", SSLSocket.class);
            r6.k.e(method, "putMethod");
            r6.k.e(method2, "getMethod");
            r6.k.e(method3, "removeMethod");
            r6.k.e(cls3, "clientProviderClass");
            r6.k.e(cls4, "serverProviderClass");
            r2 = new j(method, method2, method3, cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r2 == null) {
        }
        lVar = r2;
        f570a = lVar;
        f571b = Logger.getLogger(p.class.getName());
    }

    public static void i(String str, int i7, Throwable th) {
        r6.k.f(str, "message");
        f571b.log(i7 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public t6.a b(X509TrustManager x509TrustManager) {
        return new e8.a(c(x509TrustManager));
    }

    public e8.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        r6.k.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new e8.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        r6.k.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i7) {
        r6.k.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i7);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f571b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        r6.k.f(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        r6.k.f(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        r6.k.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k8 = k();
            k8.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k8.getSocketFactory();
            r6.k.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e9) {
            throw new AssertionError("No System TLS: " + e9, e9);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        r6.k.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                r6.k.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        r6.k.e(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
