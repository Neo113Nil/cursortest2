package h6;

import W4.o;
import X5.s;
import a1.AbstractC0223a;
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
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile e f4355a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f4356b;

    static {
        try {
            for (Map.Entry entry : i6.c.f4435b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (i6.c.f4434a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(i6.d.f4436a);
                }
            }
        } catch (RuntimeException e4) {
            System.err.println("Possibly running android unit test without robolectric");
            e4.printStackTrace();
        }
        e aVar = a.f4347e ? new a() : null;
        if (aVar == null) {
            aVar = c.f4352e ? new c() : null;
        }
        if (aVar == null) {
            throw new IllegalStateException(o.c("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT));
        }
        f4355a = aVar;
        f4356b = Logger.getLogger(s.class.getName());
    }

    public AbstractC0223a c(X509TrustManager trustManager) {
        i.e(trustManager, "trustManager");
        return new l6.a(d(trustManager));
    }

    public l6.d d(X509TrustManager trustManager) {
        i.e(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new l6.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress address, int i7) {
        i.e(address, "address");
        socket.connect(address, i7);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (f4356b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(String str, int i7, Throwable th);

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
