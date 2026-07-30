package N6;

import C4.p;
import D6.w;
import a.AbstractC0169a;
import android.os.Build;
import android.util.Log;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import r4.f;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile e f1879a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f1880b;

    static {
        try {
            for (Map.Entry entry : O6.c.f1934b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (O6.c.f1933a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(O6.d.f1935a);
                }
            }
        } catch (RuntimeException e7) {
            System.err.println("Possibly running android unit test without robolectric");
            e7.printStackTrace();
        }
        e aVar = a.f1871e ? new a() : null;
        if (aVar == null) {
            aVar = c.f1876e ? new c() : null;
        }
        if (aVar == null) {
            throw new IllegalStateException(p.g(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f1879a = aVar;
        f1880b = Logger.getLogger(w.class.getName());
    }

    public AbstractC0169a c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new R6.a(d(trustManager));
    }

    public R6.d d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new R6.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress address, int i2) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i2);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f1880b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(String str, int i2, Throwable th);

    public void k(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = f.c(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(message, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
