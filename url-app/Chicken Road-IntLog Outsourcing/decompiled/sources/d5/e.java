package d5;

import T4.u;
import a.AbstractC0169a;
import android.os.Build;
import android.util.Log;
import b2.AbstractC0279e;
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
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile e f5492a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f5493b;

    static {
        try {
            for (Map.Entry entry : e5.c.f5531b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (e5.c.f5530a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(e5.d.f5532a);
                }
            }
        } catch (RuntimeException e3) {
            System.err.println("Possibly running android unit test without robolectric");
            e3.printStackTrace();
        }
        e aVar = a.f5484e ? new a() : null;
        if (aVar == null) {
            aVar = c.f5489e ? new c() : null;
        }
        if (aVar == null) {
            throw new IllegalStateException(AbstractC0279e.d(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f5492a = aVar;
        f5493b = Logger.getLogger(u.class.getName());
    }

    public AbstractC0169a c(X509TrustManager trustManager) {
        i.e(trustManager, "trustManager");
        return new h5.a(d(trustManager));
    }

    public h5.d d(X509TrustManager trustManager) {
        i.e(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new h5.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress address, int i2) {
        i.e(address, "address");
        socket.connect(address, i2);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (f5493b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(String str, int i2, Throwable th);

    public void k(Object obj, String message) {
        i.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(message, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        i.d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
