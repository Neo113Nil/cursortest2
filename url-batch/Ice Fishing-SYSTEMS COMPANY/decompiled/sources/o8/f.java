package o8;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.ads.CL;
import e8.s;
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
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static volatile f f39739a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f39740b;

    static {
        try {
            for (Map.Entry entry : p8.c.f39838b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (p8.c.f39837a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(p8.d.f39839a);
                }
            }
        } catch (RuntimeException e6) {
            System.err.println("Possibly running android unit test without robolectric");
            e6.printStackTrace();
        }
        f bVar = b.f39731e ? new b() : null;
        if (bVar == null) {
            bVar = d.f39736e ? new d() : null;
        }
        if (bVar == null) {
            throw new IllegalStateException(CL.i(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f39739a = bVar;
        f39740b = Logger.getLogger(s.class.getName());
    }

    public com.bumptech.glide.d c(X509TrustManager trustManager) {
        h.e(trustManager, "trustManager");
        return new s8.a(d(trustManager));
    }

    public s8.d d(X509TrustManager trustManager) {
        h.e(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new s8.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress address, int i) {
        h.e(address, "address");
        socket.connect(address, i);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (f39740b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(int i, String str, Throwable th);

    public void k(Object obj, String message) {
        h.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(5, message, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        h.d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
