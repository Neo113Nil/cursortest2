package u3;

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
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import m3.s;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f10964a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f10965b;

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
        if (H1.f.o()) {
            for (Map.Entry entry : v3.c.f10996b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (v3.c.f10995a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(v3.d.f10997a);
                }
            }
            kVar = a.f10931d ? new a() : null;
            if (kVar == null) {
                r1 = c.f10935e ? new c() : null;
                Intrinsics.c(r1);
                kVar = r1;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                kVar = h.f10948d ? new h() : null;
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                kVar = e.f10945d ? new e() : null;
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                kVar = m.f10962d ? new m() : null;
            }
            kVar = k.f10958c ? new k() : null;
            if (kVar == null) {
                String jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
        }
        f10964a = kVar;
        f10965b = Logger.getLogger(r.class.getName());
        if (r1 == null) {
            kVar = new n();
            f10964a = kVar;
            f10965b = Logger.getLogger(r.class.getName());
        }
        kVar = r1;
        f10964a = kVar;
        f10965b = Logger.getLogger(r.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
            Method getMethod = cls.getMethod("get", SSLSocket.class);
            Method removeMethod = cls.getMethod("remove", SSLSocket.class);
            Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
            Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
            Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
            Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
            Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
            r1 = new j(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r1 == null) {
        }
        kVar = r1;
        f10964a = kVar;
        f10965b = Logger.getLogger(r.class.getName());
    }

    public static void i(String message, int i2, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f10965b.log(i2 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public s b(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new y3.a(c(trustManager));
    }

    public y3.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new y3.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i2) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i2);
    }

    public String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f10965b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        i(message, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext k4 = k();
            k4.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = k4.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError("No System TLS: " + e4, e4);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
