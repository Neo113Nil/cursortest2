package O2;

import G2.r;
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

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f3910a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f3911b;

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
    
        if (java.lang.Integer.parseInt(r2) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    static {
        n kVar;
        if (A1.i.o()) {
            for (Map.Entry entry : P2.c.f3927b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (P2.c.f3926a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(P2.d.f3928a);
                }
            }
            kVar = a.f3883d ? new a() : null;
            if (kVar == null) {
                r1 = c.f3887e ? new c() : null;
                f2.j.c(r1);
                kVar = r1;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                kVar = h.f3894d ? new h() : null;
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                kVar = e.f3891d ? new e() : null;
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                kVar = m.f3908d ? new m() : null;
            }
            kVar = k.f3904c ? new k() : null;
            if (kVar == null) {
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    f2.j.e(property, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
        }
        f3910a = kVar;
        f3911b = Logger.getLogger(r.class.getName());
        if (r1 == null) {
            kVar = new n();
            f3910a = kVar;
            f3911b = Logger.getLogger(r.class.getName());
        }
        kVar = r1;
        f3910a = kVar;
        f3911b = Logger.getLogger(r.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method method = cls.getMethod("put", SSLSocket.class, cls2);
            Method method2 = cls.getMethod("get", SSLSocket.class);
            Method method3 = cls.getMethod("remove", SSLSocket.class);
            f2.j.e(method, "putMethod");
            f2.j.e(method2, "getMethod");
            f2.j.e(method3, "removeMethod");
            f2.j.e(cls3, "clientProviderClass");
            f2.j.e(cls4, "serverProviderClass");
            r1 = new j(method, method2, method3, cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r1 == null) {
        }
        kVar = r1;
        f3910a = kVar;
        f3911b = Logger.getLogger(r.class.getName());
    }

    public static void i(String str, int i3, Throwable th) {
        f2.j.f(str, "message");
        f3911b.log(i3 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public l0.c b(X509TrustManager x509TrustManager) {
        return new S2.a(c(x509TrustManager));
    }

    public S2.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        f2.j.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new S2.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        f2.j.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i3) {
        f2.j.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i3);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f3911b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        f2.j.f(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        f2.j.f(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        f2.j.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k3 = k();
            k3.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k3.getSocketFactory();
            f2.j.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e3) {
            throw new AssertionError("No System TLS: " + e3, e3);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        f2.j.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                f2.j.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        f2.j.e(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
